
package com.example.youtube.model.results;


import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Statistics {

    @SerializedName("commentCount")
    private String mCommentCount;
    @SerializedName("hiddenSubscriberCount")
    private Boolean mHiddenSubscriberCount;
    @SerializedName("subscriberCount")
    private String mSubscriberCount;
    @SerializedName("videoCount")
    private String mVideoCount;
    @SerializedName("viewCount")
    private String mViewCount;





    public String getCommentCount() {
        return mCommentCount;
    }

    public void setCommentCount(String commentCount) {
        mCommentCount = commentCount;
    }

    public Boolean getHiddenSubscriberCount() {
        return mHiddenSubscriberCount;
    }

    public void setHiddenSubscriberCount(Boolean hiddenSubscriberCount) {
        mHiddenSubscriberCount = hiddenSubscriberCount;
    }

    public String getSubscriberCount() {
        return mSubscriberCount;
    }

    public void setSubscriberCount(String subscriberCount) {
        mSubscriberCount = subscriberCount;
    }

    public String getVideoCount() {
        return mVideoCount;
    }

    public void setVideoCount(String videoCount) {
        mVideoCount = videoCount;
    }

    public String getViewCount() {
        return mViewCount;
    }

    public void setViewCount(String viewCount) {
        mViewCount = viewCount;
    }


}
