package com.example.sem.daggerpractice.ui.detail;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.example.sem.daggerpractice.R;
import com.example.sem.daggerpractice.data.LocalSharedPreferences;
import com.example.sem.daggerpractice.ui.detail.fragment.DetailFragment;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

/**
 * Created by sem on 11/9/17.
 */

public class DetailActivity extends AppCompatActivity implements HasSupportFragmentInjector, DetailView {

    private static final String TAG = DetailActivity.class.getSimpleName();
    private String pullFromSharedPrefs;

    @Inject
    DispatchingAndroidInjector<Fragment> fragmentDispatchingAndroidInjector;

    @Inject
    DetailPresenter detailPresenter;

    @Inject
    LocalSharedPreferences localSharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        detailPresenter.loadDetail();

        if (savedInstanceState == null)
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container, DetailFragment.newInstance())
                    .commitAllowingStateLoss();

        localSharedPreferences.put(TAG, "Hello From DetailActivity");
        pullFromSharedPrefs = localSharedPreferences.get(TAG, "");
        Toast.makeText(this, pullFromSharedPrefs, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onDetailLoaded() {
        Log.v("TEST", "Detail is loaded");
    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentDispatchingAndroidInjector;
    }
}
