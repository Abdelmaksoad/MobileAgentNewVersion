package com.rentcentric.mobileagent.Models.Responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Mohamed.Mohsen on 01-11-17.
 */

public class LoginResponse {

    @SerializedName("ClientID")
    @Expose
    private Integer clientID;
    @SerializedName("ServerName")
    @Expose
    private String serverName;
    @SerializedName("Status")
    @Expose
    private StatusInfo status;

    public Integer getClientID() {
        return clientID;
    }

    public void setClientID(Integer clientID) {
        this.clientID = clientID;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public StatusInfo getStatus() {
        return status;
    }

    public void setStatus(StatusInfo status) {
        this.status = status;
    }
}