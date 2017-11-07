package com.rentcentric.mobileagent.Models.Responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Mohamed.Mohsen on 07-11-17.
 */

public class CheckOutResponse {

    @SerializedName("ReservationDetailsInfo")
    @Expose
    private List<ReservationDetailsInfo> reservationDetailsInfo = null;
    @SerializedName("StatusInfo")
    @Expose
    private StatusInfo statusInfo;

    public List<ReservationDetailsInfo> getReservationDetailsInfo() {
        return reservationDetailsInfo;
    }

    public void setReservationDetailsInfo(List<ReservationDetailsInfo> reservationDetailsInfo) {
        this.reservationDetailsInfo = reservationDetailsInfo;
    }

    public StatusInfo getStatusInfo() {
        return statusInfo;
    }

    public void setStatusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
    }
}