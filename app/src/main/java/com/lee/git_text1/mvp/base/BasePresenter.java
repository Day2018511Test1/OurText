package com.lee.git_text1.mvp.base;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/**
 * @author Lee
 * @create_time 2018/5/11 16:14
 * @description BasePresenter
 */
public abstract class BasePresenter<T> {
    protected Reference<T> mViewRef;//View接口类型弱引用

    public void attachView(T view) {
        mViewRef = new WeakReference<T>(view); //建立关联
    }

    protected T getView() {
        return mViewRef.get();//获取View
    }

    public boolean isViewAttached() {//判断是否与View建立了关联
        return mViewRef != null && mViewRef.get() != null;
    }

    public void detachView() {//解除关联
        if (mViewRef != null) {
            mViewRef.clear();
            mViewRef = null;
        }
    }
}
