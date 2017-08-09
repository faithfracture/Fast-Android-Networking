package com.androidnetworking.interfaces;

import com.androidnetworking.error.ANError;

public interface RequestListener<T> {
    void onResponse(T response);
    void onError(ANError anError);
}
