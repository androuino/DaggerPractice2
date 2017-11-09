package com.example.sem.daggerpractice;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import com.example.sem.daggerpractice.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by sem on 11/9/17.
 */

public class AndroidSampleApp extends Application implements HasActivityInjector {

    private static Context context;

    @Inject
    DispatchingAndroidInjector<Activity> activityDispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent.builder().application(this).build().inject(this);
        AndroidSampleApp.context = getApplicationContext();
    }

    @Override
    public DispatchingAndroidInjector<Activity> activityInjector() {
        return activityDispatchingAndroidInjector;
    }

    public static Context getContext() {
        return AndroidSampleApp.context;
    }
}
