package com.example.nimi_0112.newdagger;

import android.app.Activity;
import android.content.Context;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * @author nimi_0112
 * Created on 22-11-2018
 */
@Module
public class ActivityModule {

    private final Context context;

    ActivityModule(Activity context){
        this.context = context;
    }

    @Named("activity_context")
    @UserApplicationScope
    @Provides
    public Context context(){ return context; }
}
