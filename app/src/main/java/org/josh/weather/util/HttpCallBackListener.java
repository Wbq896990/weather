package org.josh.weather.util;

/**
 * Created by Josh on 2016/8/25.
 */
public interface HttpCallBackListener {
    void onFinish(String response);
    void onError(Exception e);
}
