package com.example.ebsadmin.retrofitsample;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private List<Result> gameList;
    Button retofitRequestButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        retofitRequestButton = (Button) findViewById(R.id.retrofit_request);
        retofitRequestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                confirmRedeemTicket();
            }
        });

    }

    private void confirmRedeemTicket(){
        final ProgressDialog dialogUploadingImage1 = new ProgressDialog(getApplication());
        dialogUploadingImage1.setMessage("Loading...");
        dialogUploadingImage1.setCancelable(false);
        dialogUploadingImage1.show();

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(new Interceptor() {
            @Override
            public okhttp3.Response intercept(Chain chain) throws IOException {
                Request original = chain.request();
                //This value is set into header to get api data
                Request request = original.newBuilder()
                        .header("Content-Type", "application/json")
                        .header("AppToken", "00000000")
                        .method(original.method(), original.body())
                        .build();

                return chain.proceed(request);

            }
        });

        OkHttpClient client = httpClient.build();

        //Set time out in Retrofit
        httpClient.connectTimeout(20, TimeUnit.SECONDS).readTimeout(30, TimeUnit.SECONDS).build();

        // Set Base URl of API ---- Replace it from your base url
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://stage.abc.xyz.net/api/")
                .client(client)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        //Method to create json object

        //final ProductRequestBody suser = new ProductRequestBody("Android", "uyghaisud51245", 87236, 36828, "Identiv", "NFC Tags", "1234567812345678", "iueri73", "iohiuhf83476189");

        //To send json object in method to get API data
        //Call<GameListPojo> call = retrofit.create(WebApis.class).getGameList(suser);

        //To call method without json object in method to get API data
        Call<GameListPojo> call = retrofit.create(WebApis.class).getGameList();

        call.enqueue(new Callback<GameListPojo>() {
            @Override
            public void onResponse(Call<GameListPojo> call, Response<GameListPojo> response) {
                Log.d("TAG", "" + call + "" + response);
                if (response.message().equals("OK")){
                    //get Array list from POJO
                    gameList = ((GameListPojo) ((Response) response).body()).getResult();
                }

                dialogUploadingImage1.dismiss();
            }

            @Override
            public void onFailure(Call<GameListPojo> call, Throwable t) {
                dialogUploadingImage1.dismiss();
            }
        });

    }
}
