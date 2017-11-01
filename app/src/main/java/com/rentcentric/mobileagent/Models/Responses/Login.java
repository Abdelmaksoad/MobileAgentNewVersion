package com.rentcentric.mobileagent.Models.Responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Mohamed.Mohsen on 01-11-17.
 */

public class Login {

    @SerializedName("ClientID")
    @Expose
    private Integer clientID;
    @SerializedName("ServerName")
    @Expose
    private String serverName;
    @SerializedName("Status")
    @Expose
    private LoginStatus status;

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

    public LoginStatus getStatus() {
        return status;
    }

    public void setStatus(LoginStatus status) {
        this.status = status;
    }
}