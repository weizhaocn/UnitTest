package com.john.unittest;

import android.app.Application;
import android.content.Context;

/**
 * author ZhaoWei
 * created 2021/9/21 5:33 下午
 */
public class MyApp extends Application {

    private static Context globalContext;
    @Override
    public void onCreate() {
        super.onCreate();
        globalContext = this;
    }

    public static Context getGlobalContext() {
        return globalContext;
    }
}
