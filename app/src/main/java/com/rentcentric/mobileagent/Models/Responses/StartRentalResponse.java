package com.rentcentric.mobileagent.Models.Responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Mohamed.Mohsen on 07-11-17.
 */

public class StartRentalResponse {

    @SerializedName("AgreementID")
    @Expose
    private String agreementID;
    @SerializedName("ContarctUrl")
    @Expose
    private String contarctUrl;
    @SerializedName("CurrentStatus")
    @Expose
    private String currentStatus;
    @SerializedName("RaNumber")
    @Expose
    private String raNumber;
    @SerializedName("StatusInfo")
    @Expose
    private StatusInfo statusInfo;

    public String getAgreementID() {
        return agreementID;
    }

    public void setAgreementID(String agreementID) {
        this.agreementID = agreementID;
    }

    public String getContarctUrl() {
        return contarctUrl;
    }

    public void setContarctUrl(String contarctUrl) {
        this.contarctUrl = contarctUrl;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String getRaNumber() {
        return raNumber;
    }

    public void setRaNumber(String raNumber) {
        this.raNumber = raNumber;
    }

    public StatusInfo getStatusInfo() {
        return statusInfo;
    }

    public void setStatusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
    }
}