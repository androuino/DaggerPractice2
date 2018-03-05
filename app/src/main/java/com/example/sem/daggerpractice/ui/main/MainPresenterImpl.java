package com.example.sem.daggerpractice.ui.main;

import com.example.sem.daggerpractice.data.ApiService;

import javax.inject.Inject;

/**
 * Created by sem on 11/9/17.
 *
 */

public class MainPresenterImpl implements MainPresenter{
    MainView mainView;
    ApiService apiService;

    @Inject
    public MainPresenterImpl(MainView mainView, ApiService apiService) {
        this.mainView = mainView;
        this.apiService = apiService;
    }

    public void loadMain(){
        apiService.loadData();
        mainView.onMainLoaded();
    }
}
