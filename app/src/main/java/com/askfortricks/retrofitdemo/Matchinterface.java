package com.askfortricks.retrofitdemo;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


public interface Matchinterface {

    /*
    Get request
    */
    @FormUrlEncoded
    @POST("suggestions.php")
    Call< MatchModel > postMatchDetails(@FieldMap Map<String,String> params);
}

