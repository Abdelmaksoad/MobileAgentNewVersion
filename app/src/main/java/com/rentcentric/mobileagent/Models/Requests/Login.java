package com.rentcentric.mobileagent.Models.Requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Mohamed.Mohsen on 01-11-17.
 */

public class Login {

    @SerializedName("Email")
    @Expose
    private String email;
    @SerializedName("MobileServicePassword")
    @Expose
    private String mobileServicePassword;
    @SerializedName("MobileServiceUserName")
    @Expose
    private String mobileServiceUserName;
    @SerializedName("Password")
    @Expose
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileServicePassword() {
        return mobileServicePassword;
    }

    public void setMobileServicePassword(String mobileServicePassword) {
        this.mobileServicePassword = mobileServicePassword;
    }

    public String getMobileServiceUserName() {
        return mobileServiceUserName;
    }

    public void setMobileServiceUserName(String mobileServiceUserName) {
        this.mobileServiceUserName = mobileServiceUserName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}