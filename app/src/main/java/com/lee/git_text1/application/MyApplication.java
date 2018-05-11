package com.lee.git_text1.application;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Process;

/**
 * @author Lee
 * @create_time 2018/5/11 15:22
 * @description
 */

public class MyApplication extends Application {
    private static int     myTid;
    private static Handler handler;
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();

        myTid = Process.myTid();
        handler = new Handler();
        context = getApplicationContext();

    }

    //获取主线程的id
    public static int getMainThreadId() {
        return myTid;
    }

    //获取handler
    public static Handler getAppHanler() {
        return handler;
    }

    public static Context getAppContext() {
        return context;
    }
}
