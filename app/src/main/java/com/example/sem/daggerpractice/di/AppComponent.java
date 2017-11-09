package com.example.sem.daggerpractice.di;

import android.app.Application;

import com.example.sem.daggerpractice.AndroidSampleApp;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by sem on 11/9/17.
 */
@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class,
        ActivityBuilder.class})
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }

    void inject(AndroidSampleApp app);
}

