package com.lee.git_text1.mvp.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import butterknife.ButterKnife;

/**
 * @author Lee
 * @create_time 2018/5/11 19:28
 * @description Activity基类
 */
public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity {
    public Context mContext;
    public T       mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        ButterKnife.bind(this);
        initView();
        initData();

    }

    //初始化view
    protected void initView() {
    }

    //初始化数据
    protected void initData() {
    }

    /**
     * activity跳转（无参数）
     *
     * @param className
     */
    public void startActivity(Class<?> className) {
        Intent intent = new Intent(mContext, className);
        startActivity(intent);
    }

    /**
     * activity跳转（有参数）
     *
     * @param className
     */
    public void startActivity(Class<?> className, Bundle bundle) {
        Intent intent = new Intent(mContext, className);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }
}
