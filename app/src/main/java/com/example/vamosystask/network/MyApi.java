package com.example.vamosystask.network;


import com.example.vamosystask.model.Data;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyApi {
    @GET("getVehicleLocations?userId=OTTO&group=OTTO:SMP&macid=B0:47:BF:A3:25:E7&appid=com.gpsvts")
    //Call<List<Data>> getresponse(@Query("userId") String userId, @Query("group") String group, @Query("macid") String macid, @Query("appid") String appid);
    Call<List<Data>> getresponse();

}
