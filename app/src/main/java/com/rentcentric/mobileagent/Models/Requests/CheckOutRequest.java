package com.rentcentric.mobileagent.Models.Requests;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Mohamed.Mohsen on 07-11-17.
 */

public class CheckOutRequest implements Parcelable {

    @SerializedName("CustomerID")
    @Expose
    private String customerID;
    @SerializedName("DateFormate")
    @Expose
    private String dateFormate;
    @SerializedName("EndDate")
    @Expose
    private String endDate;
    @SerializedName("IsCheckedIn")
    @Expose
    private String isCheckedIn;
    @SerializedName("IsCheckedOut")
    @Expose
    private String isCheckedOut;
    @SerializedName("Location")
    @Expose
    private String location;
    @SerializedName("Make")
    @Expose
    private String make;
    @SerializedName("Model")
    @Expose
    private String model;
    @SerializedName("ResNumber")
    @Expose
    private String resNumber;
    @SerializedName("StartDate")
    @Expose
    private String startDate;
    @SerializedName("VehicleID")
    @Expose
    private String vehicleID;

    public CheckOutRequest(String resNumber) {
        this.resNumber = resNumber;
    }

    protected CheckOutRequest(Parcel in) {
        customerID = in.readString();
        dateFormate = in.readString();
        endDate = in.readString();
        isCheckedIn = in.readString();
        isCheckedOut = in.readString();
        location = in.readString();
        make = in.readString();
        model = in.readString();
        resNumber = in.readString();
        startDate = in.readString();
        vehicleID = in.readString();
    }

    public static final Creator<CheckOutRequest> CREATOR = new Creator<CheckOutRequest>() {
        @Override
        public CheckOutRequest createFromParcel(Parcel in) {
            return new CheckOutRequest(in);
        }

        @Override
        public CheckOutRequest[] newArray(int size) {
            return new CheckOutRequest[size];
        }
    };

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getDateFormate() {
        return dateFormate;
    }

    public void setDateFormate(String dateFormate) {
        this.dateFormate = dateFormate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getIsCheckedIn() {
        return isCheckedIn;
    }

    public void setIsCheckedIn(String isCheckedIn) {
        this.isCheckedIn = isCheckedIn;
    }

    public String getIsCheckedOut() {
        return isCheckedOut;
    }

    public void setIsCheckedOut(String isCheckedOut) {
        this.isCheckedOut = isCheckedOut;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getResNumber() {
        return resNumber;
    }

    public void setResNumber(String resNumber) {
        this.resNumber = resNumber;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
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
        dest.writeString(customerID);
        dest.writeString(dateFormate);
        dest.writeString(endDate);
        dest.writeString(isCheckedIn);
        dest.writeString(isCheckedOut);
        dest.writeString(location);
        dest.writeString(make);
        dest.writeString(model);
        dest.writeString(resNumber);
        dest.writeString(startDate);
        dest.writeString(vehicleID);
    }
}