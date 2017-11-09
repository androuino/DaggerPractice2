package com.example.sem.daggerpractice.ui.main;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by sem on 11/9/17.
 */

@Subcomponent(modules = MainActivityModule.class)
public interface MainActivityComponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity>{}
}
