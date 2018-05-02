package com.example.ebsadmin.retrofitsample;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductRequestBody {
    @JsonProperty("DeviceType")
    private final String DeviceType;
    @JsonProperty("DeviceID")
    private final String DeviceID;
    @JsonProperty("Lat")
    private final double Lat;
    @JsonProperty("Lon")
    private final double Lon;
    @JsonProperty("TagProvider")
    private final String TagProvider;
    @JsonProperty("TagType")
    private final String TagType;
    @JsonProperty("TagUID")
    private final String TagUID;
    @JsonProperty("TagValue")
    private final String TagValue;

    @JsonProperty("TagCrypto")
    private final String TagCrypto;

    public ProductRequestBody(String DeviceType, String DeviceID, double Lat, double Lon, String TagProvider, String TagType, String TagValue, String TagUID, String TagCrypto) {
        this.DeviceType = DeviceType;
        this.DeviceID = DeviceID;
        this.Lat = Lat;
        this.Lon = Lon;
        this.TagProvider = TagProvider;
        this.TagType = TagType;
        this.TagUID = TagUID;
        this.TagValue = TagValue;
        this.TagCrypto = TagCrypto;

    }


}
