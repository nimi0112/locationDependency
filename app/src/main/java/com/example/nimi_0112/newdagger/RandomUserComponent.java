package com.example.nimi_0112.newdagger;

import com.squareup.picasso.Picasso;

import dagger.Component;

/**
 * @author nimi_0112
 * Created on 21-11-2018
 */
@UserApplicationScope
@Component(modules = {RandomUsersModule.class, PicassoModule.class})
public interface RandomUserComponent {

    RandomUsersApi getRandomUserService();

    Picasso getPicasso();
}
