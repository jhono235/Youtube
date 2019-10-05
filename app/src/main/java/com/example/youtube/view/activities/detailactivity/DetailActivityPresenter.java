package com.example.youtube.view.activities.detailactivity;

import android.util.Log;

import com.example.youtube.model.datasource.remote.retrofit.RetrofitHelper;

import com.example.youtube.model.results.Results;



import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class DetailActivityPresenter {
    DetailActivityContract contract;


    public DetailActivityPresenter(DetailActivityContract contract) {
        this.contract = contract;

    }

    //
    public void getUser(String part, String channelId, String key) {
        RetrofitHelper retrofitHelper = new RetrofitHelper();

        retrofitHelper.getSearchService()
                //
                .getUser(part, channelId, key)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<Results>() {
                    private Results results;

                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Results results) {
                        this.results = results;
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d("TAG_PRESENTER_DETAIL", "ERROR IN API CALL -->", e);
                    }

                    @Override
                    public void onComplete() {
                        setUpAdapter(results);
                    }
                });
    }

    public void setUpAdapter(Results results) {

        contract.onAdapterReady(results.getItems());
    }
}
