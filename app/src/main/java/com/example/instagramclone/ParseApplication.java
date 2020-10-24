package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("xGQds685Y4q9XuEAD3MIl09f9UQvBZ5T578ZbTVf")
                .clientKey("RNHBm29GdZ67WbFCdMf57eQaotQ1bI3im7SZAf1d")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
