package com.androidnetworking.interfaces;

import com.androidnetworking.error.ANError;

import okhttp3.Response;

/**
 * Created by jordanbondo on 8/9/17.
 */

public interface OkHttpResponseAndRequestListener<T> {
    void onResponse(Response okHttpResponse, T response);
    void onError(ANError anError);
}
