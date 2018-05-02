package com.example.ebsadmin.retrofitsample;

import retrofit2.Call;
import retrofit2.http.POST;

public interface WebApis {
    @POST("Warehouses/GetGame")
    Call<GameListPojo> getGameList();
}
