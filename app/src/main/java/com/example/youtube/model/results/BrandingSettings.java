
package com.example.youtube.model.results;

import java.util.List;

import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class BrandingSettings {

    @SerializedName("channel")
    private Channel mChannel;
    @SerializedName("hints")
    private List<Hint> mHints;
    @SerializedName("image")
    private Image mImage;

    public Channel getChannel() {
        return mChannel;
    }

    public void setChannel(Channel channel) {
        mChannel = channel;
    }

    public List<Hint> getHints() {
        return mHints;
    }

    public void setHints(List<Hint> hints) {
        mHints = hints;
    }

    public Image getImage() {
        return mImage;
    }

    public void setImage(Image image) {
        mImage = image;
    }

}
