package com.example.sem.daggerpractice.ui.detail.fragment;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sem on 11/9/17.
 *
 */
@Module
public class DetailFragmentModule {

    @Provides
    DetailFragmentView provideDetailFragmentView(DetailFragment detailFragment){
        return detailFragment;
    }

}
