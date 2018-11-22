package com.example.nimi_0112.newdagger;

import com.example.nimi_0112.newdagger.model.RandomUsers;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @author nimi_0112
 * Created on 21-11-2018
 */
public interface RandomUsersApi {

    @GET("api")
    Call<RandomUsers> getRandomUsers(@Query("results") int size);

}