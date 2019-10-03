package com.example.youtube.model.datasource.remote.retrofit;

import com.example.youtube.model.datasource.remote.retrofit.apiservices.SearchResultService;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.youtube.model.datasource.remote.retrofit.UrlConstants.BASE_URL;

public class RetrofitHelper {

    private Retrofit getRetrofitInstance(){
        return new Retrofit
                .Builder()
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public SearchResultService getSearchService(){
        return getRetrofitInstance()
                .create(SearchResultService.class);
    }


}
