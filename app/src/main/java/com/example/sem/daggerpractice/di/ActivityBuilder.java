package com.example.sem.daggerpractice.di;

import android.app.Activity;

import com.example.sem.daggerpractice.ui.detail.DetailActivity;
import com.example.sem.daggerpractice.ui.detail.DetailActivityComponent;
import com.example.sem.daggerpractice.ui.main.MainActivity;
import com.example.sem.daggerpractice.ui.main.MainActivityComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by sem on 11/9/17.
 *
 */
@Module
public abstract class ActivityBuilder {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivity(MainActivityComponent.Builder builder);

    @Binds
    @IntoMap
    @ActivityKey(DetailActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindDetailActivity(DetailActivityComponent.Builder builder);

}

