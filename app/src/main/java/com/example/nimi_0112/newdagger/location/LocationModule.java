package com.example.nimi_0112.newdagger.location;

import android.app.Activity;
import android.content.Context;

import com.example.nimi_0112.newdagger.ActivityModule;
import com.example.nimi_0112.newdagger.ContextModule;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;

import dagger.Module;
import dagger.Provides;

/**
 * @author nimi_0112
 * Created on 21-11-2018
 */
@Module(includes = {ContextModule.class,ActivityModule.class})

public abstract class LocationModule {

    @Provides
    public GoogleApiClient mGoogleApiClient(Context context){
        return   new GoogleApiClient.Builder(context)
                .addApi(LocationServices.API)
                .build();
    }

    @Provides
    public FusedLocationProviderClient mFusedLocationClient(Activity activity){
        return  LocationServices.getFusedLocationProviderClient(activity);
    }
}
