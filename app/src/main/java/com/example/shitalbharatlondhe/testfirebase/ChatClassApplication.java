package com.example.shitalbharatlondhe.testfirebase;

import android.app.Application;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by jaysingh on 25/11/16.
 */

public class ChatClassApplication extends Application
{

    @Override
    public void onCreate() {
        super.onCreate();

//        FirebaseOptions firebaseOptions = new FirebaseOptions.Builder()
//                .setDatabaseUrl("https://fir-mypersonalchat.firebaseio.com/")
//                .setApiKey("AIzaSyADH2ws8Zj5zR9IvuTQgvi9vp2zQcTMmPc")
//                .setApplicationId("fir-mypersonalchat").build();
        FirebaseApp.initializeApp(getApplicationContext());

        if (!FirebaseApp.getApps(this).isEmpty()) {
            FirebaseDatabase.getInstance().setPersistenceEnabled(true);
        }




    }
}
