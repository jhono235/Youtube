
package com.example.youtube.model.listResults;


import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Id {

    @SerializedName("channelId")
    private String mChannelId;
    @SerializedName("kind")
    private String mKind;

    public String getChannelId() {
        return mChannelId;
    }

    public void setChannelId(String channelId) {
        mChannelId = channelId;
    }

    public String getKind() {
        return mKind;
    }

    public void setKind(String kind) {
        mKind = kind;
    }

}
