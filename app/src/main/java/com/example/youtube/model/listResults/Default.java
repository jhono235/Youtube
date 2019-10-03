
package com.example.youtube.model.listResults;


import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Default {

    @SerializedName("url")
    private String mUrl;

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

}
