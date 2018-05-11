package com.lee.git_text1.mvp.base;

import java.util.Map;

/**
 * @author Lee
 * @create_time 2018/5/11 17:02
 * @description Model的接口
 */
public interface BaseModel {
    void getDataFromNet(String url, Map<String, String> map);

    void unsubcribe();
}