
package com.example.youtube.model.results;


import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Hint {

    @SerializedName("property")
    private String mProperty;
    @SerializedName("value")
    private String mValue;

    public String getProperty() {
        return mProperty;
    }

    public void setProperty(String property) {
        mProperty = property;
    }

    public String getValue() {
        return mValue;
    }

    public void setValue(String value) {
        mValue = value;
    }

}
