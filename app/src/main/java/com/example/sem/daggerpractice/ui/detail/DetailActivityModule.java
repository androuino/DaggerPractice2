package com.example.sem.daggerpractice.ui.detail;

import com.example.sem.daggerpractice.data.ApiService;
import com.example.sem.daggerpractice.ui.detail.fragment.DetailFragmentComponent;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sem on 11/9/17.
 */
@Module(subcomponents = DetailFragmentComponent.class)
public class DetailActivityModule {

    @Provides
    DetailView provideDetailView(DetailActivity detailActivity) {
        return detailActivity;
    }

    @Provides
    DetailPresenter provideDetailPresenter(DetailView detailView, ApiService apiService) {
        return new DetailPresenterImpl(detailView, apiService);
    }
}
