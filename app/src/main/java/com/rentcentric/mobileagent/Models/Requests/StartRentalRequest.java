package com.rentcentric.mobileagent.Models.Requests;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Mohamed.Mohsen on 07-11-17.
 */

public class StartRentalRequest implements Parcelable {

    @SerializedName("AdminID")
    @Expose
    private String adminID;
    @SerializedName("AgreementID")
    @Expose
    private String agreementID;
    @SerializedName("ClientID")
    @Expose
    private String clientID;
    @SerializedName("FuelOut")
    @Expose
    private String fuelOut;
    @SerializedName("OdometerOut")
    @Expose
    private String odometerOut;
    @SerializedName("OffsiteMinutes")
    @Expose
    private Integer offsiteMinutes;
    @SerializedName("ReservationID")
    @Expose
    private String reservationID;
    @SerializedName("VehicleID")
    @Expose
    private String vehicleID;

    public StartRentalRequest(String adminID, String fuelOut, String odometerOut, String reservationID) {
        this.adminID = adminID;
        this.fuelOut = fuelOut;
        this.odometerOut = odometerOut;
        this.reservationID = reservationID;
    }

    protected StartRentalRequest(Parcel in) {
        adminID = in.readString();
        agreementID = in.readString();
        clientID = in.readString();
        fuelOut = in.readString();
        odometerOut = in.readString();
        if (in.readByte() == 0) {
            offsiteMinutes = null;
        } else {
            offsiteMinutes = in.readInt();
        }
        reservationID = in.readString();
        vehicleID = in.readString();
    }

    public static final Creator<StartRentalRequest> CREATOR = new Creator<StartRentalRequest>() {
        @Override
        public StartRentalRequest createFromParcel(Parcel in) {
            return new StartRentalRequest(in);
        }

        @Override
        public StartRentalRequest[] newArray(int size) {
            return new StartRentalRequest[size];
        }
    };

    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    public String getAgreementID() {
        return agreementID;
    }

    public void setAgreementID(String agreementID) {
        this.agreementID = agreementID;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getFuelOut() {
        return fuelOut;
    }

    public void setFuelOut(String fuelOut) {
        this.fuelOut = fuelOut;
    }

    public String getOdometerOut() {
        return odometerOut;
    }

    public void setOdometerOut(String odometerOut) {
        this.odometerOut = odometerOut;
    }

    public Integer getOffsiteMinutes() {
        return offsiteMinutes;
    }

    public void setOffsiteMinutes(Integer offsiteMinutes) {
        this.offsiteMinutes = offsiteMinutes;
    }

    public String getReservationID() {
        return reservationID;
    }

    public void setReservationID(String reservationID) {
        this.reservationID = reservationID;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(adminID);
        dest.writeString(agreementID);
        dest.writeString(clientID);
        dest.writeString(fuelOut);
        dest.writeString(odometerOut);
        if (offsiteMinutes == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(offsiteMinutes);
        }
        dest.writeString(reservationID);
        dest.writeString(vehicleID);
    }
}