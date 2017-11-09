package com.example.sem.daggerpractice.data;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by sem on 11/9/17.
 */
@Singleton
public class ActivityMethods {

    @Inject
    public ActivityMethods() {}

    public int sum(int x, int y) {
        return x + y;
    }

    public String name(String name) {
        return name;
    }

    public List<String> array(List<String> array) {
        return array;
    }

    public Object myObject(Object object) {
        return object;
    }
}
