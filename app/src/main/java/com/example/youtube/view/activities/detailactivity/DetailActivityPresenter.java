package com.example.youtube.view.activities.detailactivity;

import android.util.Log;

import com.example.youtube.model.datasource.remote.retrofit.RetrofitHelper;

import com.example.youtube.model.results.Results;



import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

import static com.example.youtube.model.datasource.remote.retrofit.UrlConstants.API_KEY;

class DetailActivityPresenter {
    private DetailActivityContract contract;


    DetailActivityPresenter(DetailActivityContract contract) {
        this.contract = contract;

    }

    //
    void getUser(String part, String channelId) {
        RetrofitHelper retrofitHelper = new RetrofitHelper();

        retrofitHelper.getSearchService()
                //
                .getUser(part, channelId, API_KEY)
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

    private void setUpAdapter(Results results) {

        contract.onAdapterReady(results.getItems());
    }
}
