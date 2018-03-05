package com.example.sem.daggerpractice.ui.detail;

import com.example.sem.daggerpractice.data.ApiService;

import javax.inject.Inject;

/**
 * Created by sem on 11/9/17.
 *
 */

public class DetailPresenterImpl implements DetailPresenter{

    DetailView detailView;
    ApiService apiService;

    @Inject
    public DetailPresenterImpl(DetailView detailView, ApiService apiService) {
        this.detailView = detailView;
        this.apiService = apiService;
    }

    public void loadDetail(){
        apiService.loadData();
        detailView.onDetailLoaded();
    }
}
