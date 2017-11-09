package com.example.sem.daggerpractice.ui.detail.fragment;

import javax.inject.Inject;

/**
 * Created by sem on 11/9/17.
 */

public class DetailFragmentPresenter {

    DetailFragmentView detailFragmentView;

    @Inject
    public DetailFragmentPresenter(DetailFragmentView detailFragmentView) {
        this.detailFragmentView = detailFragmentView;
        detailFragmentView.onDetailFragmentLoaded();
    }
}
