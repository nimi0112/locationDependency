package com.example.nimi_0112.newdagger.location;

import com.example.nimi_0112.newdagger.PicassoModule;
import com.example.nimi_0112.newdagger.UserApplicationScope;

import dagger.Component;

/**
 * @author nimi_0112
 * Created on 21-11-2018
 */

@UserApplicationScope
@Component(modules = {LocationModule.class,PicassoModule.class})

public interface LocationComponent {

   LocationApi getLocation();

}

