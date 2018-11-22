package com.example.nimi_0112.newdagger;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * @author nimi_0112
 * Created on 21-11-2018
 */
@Module
public class ContextModule {

    Context context;

    public ContextModule(Context context){
        this.context = context;
    }

    @ApplicationContext
    @RandomUserApplicationScope
    @Provides
    public Context context(){ return context.getApplicationContext(); }
}
