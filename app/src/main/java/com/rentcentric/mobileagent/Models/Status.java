package com.rentcentric.mobileagent.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Mohamed.Mohsen on 05-11-17.
 */

public class Status {

    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("StatusCode")
    @Expose
    private String statusCode;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
}
