package com.example.nimi_0112.newdagger.location;

import com.example.nimi_0112.newdagger.PicassoModule;
import com.example.nimi_0112.newdagger.RandomUserApplicationScope;
import com.squareup.picasso.Picasso;

import dagger.Component;

/**
 * @author nimi_0112
 * Created on 21-11-2018
 */
@RandomUserApplicationScope
@Component(modules = {LocationModule.class,PicassoModule.class})

public interface LocationComponent {

   //LocationApi getLocation();

    Picasso getpicasso();
}

