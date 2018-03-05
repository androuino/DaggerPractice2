package com.example.sem.daggerpractice.ui.detail;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by sem on 11/9/17.
 *
 */
@Subcomponent(modules = {
        DetailActivityModule.class,
        DetailFragmentProvider.class})
public interface DetailActivityComponent extends AndroidInjector<DetailActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DetailActivity> {
    }
}
