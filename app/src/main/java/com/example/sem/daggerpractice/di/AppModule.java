package com.example.sem.daggerpractice.di;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.example.sem.daggerpractice.AndroidSampleApp;
import com.example.sem.daggerpractice.data.ActivityMethods;
import com.example.sem.daggerpractice.data.LocalSharedPreferences;
import com.example.sem.daggerpractice.ui.detail.DetailActivityComponent;
import com.example.sem.daggerpractice.ui.main.MainActivityComponent;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sem on 11/9/17.
 *
 */
@Module(subcomponents = {
        MainActivityComponent.class,
        DetailActivityComponent.class})
public class AppModule {

    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }

    @Provides
    SharedPreferences provideSharedPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(AndroidSampleApp.getContext());
    }

    @Provides
    LocalSharedPreferences provideLocalSharedPreferences() {
        return new LocalSharedPreferences(provideSharedPreferences());
    }

    @Provides
    ActivityMethods provideActivityMethods() {
        return new ActivityMethods();
    }

    @Provides
    int sum(int x, int y) {
        return x + y;
    }

    @Provides
    String name(String name) {
        return name;
    }

    public int getSum() {
        return provideActivityMethods().sum(10, 10);
    }
}
