
package com.example.youtube.model.results;

import java.util.List;

import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Channel {

    @SerializedName("country")
    private String mCountry;
    @SerializedName("defaultTab")
    private String mDefaultTab;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("featuredChannelsTitle")
    private String mFeaturedChannelsTitle;
    @SerializedName("featuredChannelsUrls")
    private List<String> mFeaturedChannelsUrls;
    @SerializedName("keywords")
    private String mKeywords;
    @SerializedName("moderateComments")
    private Boolean mModerateComments;
    @SerializedName("profileColor")
    private String mProfileColor;
    @SerializedName("showBrowseView")
    private Boolean mShowBrowseView;
    @SerializedName("showRelatedChannels")
    private Boolean mShowRelatedChannels;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("trackingAnalyticsAccountId")
    private String mTrackingAnalyticsAccountId;
    @SerializedName("unsubscribedTrailer")
    private String mUnsubscribedTrailer;

    public String getCountry() {
        return mCountry;
    }

    public void setCountry(String country) {
        mCountry = country;
    }

    public String getDefaultTab() {
        return mDefaultTab;
    }

    public void setDefaultTab(String defaultTab) {
        mDefaultTab = defaultTab;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getFeaturedChannelsTitle() {
        return mFeaturedChannelsTitle;
    }

    public void setFeaturedChannelsTitle(String featuredChannelsTitle) {
        mFeaturedChannelsTitle = featuredChannelsTitle;
    }

    public List<String> getFeaturedChannelsUrls() {
        return mFeaturedChannelsUrls;
    }

    public void setFeaturedChannelsUrls(List<String> featuredChannelsUrls) {
        mFeaturedChannelsUrls = featuredChannelsUrls;
    }

    public String getKeywords() {
        return mKeywords;
    }

    public void setKeywords(String keywords) {
        mKeywords = keywords;
    }

    public Boolean getModerateComments() {
        return mModerateComments;
    }

    public void setModerateComments(Boolean moderateComments) {
        mModerateComments = moderateComments;
    }

    public String getProfileColor() {
        return mProfileColor;
    }

    public void setProfileColor(String profileColor) {
        mProfileColor = profileColor;
    }

    public Boolean getShowBrowseView() {
        return mShowBrowseView;
    }

    public void setShowBrowseView(Boolean showBrowseView) {
        mShowBrowseView = showBrowseView;
    }

    public Boolean getShowRelatedChannels() {
        return mShowRelatedChannels;
    }

    public void setShowRelatedChannels(Boolean showRelatedChannels) {
        mShowRelatedChannels = showRelatedChannels;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getTrackingAnalyticsAccountId() {
        return mTrackingAnalyticsAccountId;
    }

    public void setTrackingAnalyticsAccountId(String trackingAnalyticsAccountId) {
        mTrackingAnalyticsAccountId = trackingAnalyticsAccountId;
    }

    public String getUnsubscribedTrailer() {
        return mUnsubscribedTrailer;
    }

    public void setUnsubscribedTrailer(String unsubscribedTrailer) {
        mUnsubscribedTrailer = unsubscribedTrailer;
    }

}
