package com.lee.git_text1.mvp.contract.presenterinter;

import java.util.Map;

import okhttp3.ResponseBody;

/**
 * @author Lee
 * @create_time 2018/5/11 16:16
 * @description
 */
public interface PresenterInter {
    void onSuccess(ResponseBody responseBody);

    void onError(Throwable e);

    void getDataFromNet(String url, Map<String, String> map);

    void unsubcribe();
}
