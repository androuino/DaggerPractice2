package com.example.sem.daggerpractice.ui.main;

import com.example.sem.daggerpractice.data.ApiService;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sem on 11/9/17.
 *
 */
@Module
public class MainActivityModule {

    @Provides
    MainView provideMainView(MainActivity mainActivity){
        return mainActivity;
    }

    @Provides
    MainPresenter provideMainPresenter(MainView mainView, ApiService apiService){
        return new MainPresenterImpl(mainView, apiService);
    }
}
