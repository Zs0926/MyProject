package com.example.myproject.base.api;


import com.example.myproject.bean.BaseResponse;

import io.reactivex.Observer;
import okhttp3.RequestBody;
import retrofit2.http.GET;

public interface MyServer {
    @GET("")
    Observer<BaseResponse<RequestBody>>   getHome();
}
