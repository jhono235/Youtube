package com.example.youtube.view.activities.mainactivity;

import android.util.Log;

import com.example.youtube.model.datasource.remote.retrofit.RetrofitHelper;

import com.example.youtube.model.listResults.UserListResults;
import com.example.youtube.view.adapters.MainActivityRvAdapter;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainActivityPresenter {

    MainActivityContract contract;

    public MainActivityPresenter(MainActivityContract contract) {
        this.contract = contract;
    }

    //String part, String maxResults, String order, String term, String type, String key
    public void getUserInfo(String part, String maxResults, String order, String term, String type, String key) {
        RetrofitHelper retrofitHelper = new RetrofitHelper();
        retrofitHelper.getSearchService()
                //part, maxResults, order, term, type, key
                .getUserList(part, maxResults, order, term, type, key)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<UserListResults>() {
                    UserListResults userListResults;


                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(UserListResults userListResults) {
                        this.userListResults = userListResults;
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("TAG_PRESENTER_MAIN", "ERROR IN API CALL -->", e);
                    }

                    @Override
                    public void onComplete() {
                     setUpAdapter(userListResults);
                    }
                });
    }

                    public void setUpAdapter(UserListResults userListResults) {
        MainActivityRvAdapter mainActivityRvAdapter = new MainActivityRvAdapter(userListResults.getItems());
        contract.onAdapterReady(mainActivityRvAdapter);
    }
}

