package com.example.sem.daggerpractice.ui.detail;

import android.support.v4.app.Fragment;

import com.example.sem.daggerpractice.ui.detail.fragment.DetailFragment;
import com.example.sem.daggerpractice.ui.detail.fragment.DetailFragmentComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

/**
 * Created by sem on 11/9/17.
 *
 */
@Module
public abstract class DetailFragmentProvider {

    @Binds
    @IntoMap
    @FragmentKey(DetailFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> provideDetailFragmentFactory(DetailFragmentComponent.Builder builder);
}
