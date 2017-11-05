package com.rentcentric.mobileagent.Models.Requests;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Mohamed.Mohsen on 05-11-17.
 */

public class AdminLoginRequest implements Parcelable {

    @SerializedName("AdminId")
    @Expose
    private String adminId;
    @SerializedName("ClientID")
    @Expose
    private String clientID;
    @SerializedName("Password")
    @Expose
    private String password;

    public AdminLoginRequest(String adminId, String clientID, String password) {
        this.adminId = adminId;
        this.clientID = clientID;
        this.password = password;
    }

    protected AdminLoginRequest(Parcel in) {
        adminId = in.readString();
        clientID = in.readString();
        password = in.readString();
    }

    public static final Creator<AdminLoginRequest> CREATOR = new Creator<AdminLoginRequest>() {
        @Override
        public AdminLoginRequest createFromParcel(Parcel in) {
            return new AdminLoginRequest(in);
        }

        @Override
        public AdminLoginRequest[] newArray(int size) {
            return new AdminLoginRequest[size];
        }
    };

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
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
        dest.writeString(adminId);
        dest.writeString(clientID);
        dest.writeString(password);
    }
}