package com.example.sem.daggerpractice.ui.detail.fragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by sem on 11/9/17.
 */

@Subcomponent(modules = DetailFragmentModule.class)
public interface DetailFragmentComponent extends AndroidInjector<DetailFragment> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DetailFragment> {
    }
}
