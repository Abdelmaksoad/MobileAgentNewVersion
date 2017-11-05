package com.rentcentric.mobileagent.Models.Requests;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Mohamed.Mohsen on 01-11-17.
 */

public class LoginRequest implements Parcelable {

    @SerializedName("Email")
    @Expose
    private String email;
    @SerializedName("MobileServicePassword")
    @Expose
    private String mobileServicePassword = "dr0w$$ap";
    @SerializedName("MobileServiceUserName")
    @Expose
    private String mobileServiceUserName = "dr0w$$ap";
    @SerializedName("Password")
    @Expose
    private String password;

    public LoginRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    protected LoginRequest(Parcel in) {
        email = in.readString();
        mobileServicePassword = in.readString();
        mobileServiceUserName = in.readString();
        password = in.readString();
    }

    public static final Creator<LoginRequest> CREATOR = new Creator<LoginRequest>() {
        @Override
        public LoginRequest createFromParcel(Parcel in) {
            return new LoginRequest(in);
        }

        @Override
        public LoginRequest[] newArray(int size) {
            return new LoginRequest[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(email);
        dest.writeString(mobileServicePassword);
        dest.writeString(mobileServiceUserName);
        dest.writeString(password);
    }
}