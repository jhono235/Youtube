
package com.example.youtube.model.results;


import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Snippet {

    @SerializedName("country")
    private String mCountry;
    @SerializedName("customUrl")
    private String mCustomUrl;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("localized")
    private Localized mLocalized;
    @SerializedName("publishedAt")
    private String mPublishedAt;
    @SerializedName("thumbnails")
    private Thumbnails mThumbnails;
    @SerializedName("title")
    private String mTitle;

    public String getCountry() {
        return mCountry;
    }

    public void setCountry(String country) {
        mCountry = country;
    }

    public String getCustomUrl() {
        return mCustomUrl;
    }

    public void setCustomUrl(String customUrl) {
        mCustomUrl = customUrl;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public Localized getLocalized() {
        return mLocalized;
    }

    public void setLocalized(Localized localized) {
        mLocalized = localized;
    }

    public String getPublishedAt() {
        return mPublishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        mPublishedAt = publishedAt;
    }

    public Thumbnails getThumbnails() {
        return mThumbnails;
    }

    public void setThumbnails(Thumbnails thumbnails) {
        mThumbnails = thumbnails;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

}
