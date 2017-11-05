package com.rentcentric.mobileagent.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Mohamed.Mohsen on 05-11-17.
 */

public class AdminLoginResponse {

    @SerializedName("AdminId")
    @Expose
    private String adminId;
    @SerializedName("CheckIns")
    @Expose
    private String checkIns;
    @SerializedName("DamagesAdd")
    @Expose
    private String damagesAdd;
    @SerializedName("FullName")
    @Expose
    private String fullName;
    @SerializedName("LocationID")
    @Expose
    private Integer locationID;
    @SerializedName("StatusInfo")
    @Expose
    private Status statusInfo;

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getCheckIns() {
        return checkIns;
    }

    public void setCheckIns(String checkIns) {
        this.checkIns = checkIns;
    }

    public String getDamagesAdd() {
        return damagesAdd;
    }

    public void setDamagesAdd(String damagesAdd) {
        this.damagesAdd = damagesAdd;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getLocationID() {
        return locationID;
    }

    public void setLocationID(Integer locationID) {
        this.locationID = locationID;
    }

    public Status getStatusInfo() {
        return statusInfo;
    }

    public void setStatusInfo(Status statusInfo) {
        this.statusInfo = statusInfo;
    }
}