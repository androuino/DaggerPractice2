package com.example.sem.daggerpractice.ui.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.sem.daggerpractice.R;
import com.example.sem.daggerpractice.data.ActivityMethods;
import com.example.sem.daggerpractice.data.LocalSharedPreferences;
import com.example.sem.daggerpractice.ui.detail.DetailActivity;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity implements MainView {

    private static final String TAG = MainActivity.class.getSimpleName();
    private String pullFromSharedPrefs;

    @Inject
    MainPresenter mainPresenter;

    @Inject
    LocalSharedPreferences localSharedPreferences;

    @Inject
    ActivityMethods activityMethods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter.loadMain();

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DetailActivity.class));
            }
        });

        localSharedPreferences.put(TAG, "Hello From MainActivity");
        pullFromSharedPrefs = localSharedPreferences.get(TAG, "");
        Toast.makeText(this, pullFromSharedPrefs, Toast.LENGTH_LONG).show();

        List<String> array = new ArrayList<>();
        array.add("Hello");
        array.add("World!");
        activityMethods.array(array);
    }

    @Override
    public void onMainLoaded() {
        Log.v("TEST", "Main page is loaded.");
    }
}
