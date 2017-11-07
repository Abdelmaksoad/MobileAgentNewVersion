package com.rentcentric.mobileagent.Models.Responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Mohamed.Mohsen on 07-11-17.
 */

public class ReservationDetailsInfo {

    @SerializedName("AssignedID")
    @Expose
    private String assignedID;
    @SerializedName("BoundaryLatitude1")
    @Expose
    private String boundaryLatitude1;
    @SerializedName("BoundaryLatitude2")
    @Expose
    private String boundaryLatitude2;
    @SerializedName("BoundaryLatitude3")
    @Expose
    private String boundaryLatitude3;
    @SerializedName("BoundaryLatitude4")
    @Expose
    private String boundaryLatitude4;
    @SerializedName("BoundaryLongitude1")
    @Expose
    private String boundaryLongitude1;
    @SerializedName("BoundaryLongitude2")
    @Expose
    private String boundaryLongitude2;
    @SerializedName("BoundaryLongitude3")
    @Expose
    private String boundaryLongitude3;
    @SerializedName("BoundaryLongitude4")
    @Expose
    private String boundaryLongitude4;
    @SerializedName("CheckInLocation")
    @Expose
    private String checkInLocation;
    @SerializedName("CheckOutLocation")
    @Expose
    private String checkOutLocation;
    @SerializedName("CheckinDate")
    @Expose
    private String checkinDate;
    @SerializedName("CheckoutDate")
    @Expose
    private String checkoutDate;
    @SerializedName("CredetCardNumber")
    @Expose
    private String credetCardNumber;
    @SerializedName("CurrencyCode")
    @Expose
    private String currencyCode;
    @SerializedName("CurrentLocation")
    @Expose
    private String currentLocation;
    @SerializedName("CurrentLocationAddress")
    @Expose
    private String currentLocationAddress;
    @SerializedName("CurrentLocationCity")
    @Expose
    private String currentLocationCity;
    @SerializedName("CurrentLocationCountry")
    @Expose
    private String currentLocationCountry;
    @SerializedName("CurrentLocationID")
    @Expose
    private String currentLocationID;
    @SerializedName("CurrentLocationLatitude")
    @Expose
    private String currentLocationLatitude;
    @SerializedName("CurrentLocationLongitude")
    @Expose
    private String currentLocationLongitude;
    @SerializedName("CurrentLocationPhone")
    @Expose
    private String currentLocationPhone;
    @SerializedName("CurrentLocationState")
    @Expose
    private String currentLocationState;
    @SerializedName("CurrentLocationZip")
    @Expose
    private String currentLocationZip;
    @SerializedName("CurrentStatus")
    @Expose
    private String currentStatus;
    @SerializedName("CustomerFirstName")
    @Expose
    private String customerFirstName;
    @SerializedName("CustomerID")
    @Expose
    private String customerID;
    @SerializedName("CustomerLastName")
    @Expose
    private String customerLastName;
    @SerializedName("DailyRate")
    @Expose
    private String dailyRate;
    @SerializedName("Image")
    @Expose
    private String image;
    @SerializedName("Insurances")
    @Expose
    private String insurances;
    @SerializedName("IsCancelled")
    @Expose
    private String isCancelled;
    @SerializedName("IsCheckedIn")
    @Expose
    private String isCheckedIn;
    @SerializedName("IsCheckedOut")
    @Expose
    private String isCheckedOut;
    @SerializedName("IsConfirmed")
    @Expose
    private String isConfirmed;
    @SerializedName("IsCredit")
    @Expose
    private String isCredit;
    @SerializedName("IsPassed")
    @Expose
    private String isPassed;
    @SerializedName("LicensePlate")
    @Expose
    private String licensePlate;
    @SerializedName("LicenserNumber")
    @Expose
    private String licenserNumber;
    @SerializedName("LocationID")
    @Expose
    private String locationID;
    @SerializedName("LocationName")
    @Expose
    private String locationName;
    @SerializedName("MakeName")
    @Expose
    private String makeName;
    @SerializedName("Misccharges")
    @Expose
    private String misccharges;
    @SerializedName("ModelName")
    @Expose
    private String modelName;
    @SerializedName("MonthlyRate")
    @Expose
    private String monthlyRate;
    @SerializedName("NetRate")
    @Expose
    private String netRate;
    @SerializedName("OffsiteLocation")
    @Expose
    private String offsiteLocation;
    @SerializedName("ParkingDescription")
    @Expose
    private String parkingDescription;
    @SerializedName("ParkingImage")
    @Expose
    private String parkingImage;
    @SerializedName("RateID")
    @Expose
    private String rateID;
    @SerializedName("ReservationDate")
    @Expose
    private String reservationDate;
    @SerializedName("ReservationID")
    @Expose
    private String reservationID;
    @SerializedName("ReservationNumber")
    @Expose
    private String reservationNumber;
    @SerializedName("ReservationPassed")
    @Expose
    private Boolean reservationPassed;
    @SerializedName("RideShare")
    @Expose
    private String rideShare;
    @SerializedName("Taxes")
    @Expose
    private String taxes;
    @SerializedName("ThumbNailImage")
    @Expose
    private String thumbNailImage;
    @SerializedName("TotalAmount")
    @Expose
    private Double totalAmount;
    @SerializedName("VehicleDescription")
    @Expose
    private String vehicleDescription;
    @SerializedName("VehicleID")
    @Expose
    private String vehicleID;
    @SerializedName("VehicleName")
    @Expose
    private String vehicleName;
    @SerializedName("VehicleType")
    @Expose
    private String vehicleType;
    @SerializedName("VehicleTypeId")
    @Expose
    private String vehicleTypeId;
    @SerializedName("WeeklyRate")
    @Expose
    private String weeklyRate;
    @SerializedName("YearMade")
    @Expose
    private String yearMade;
    @SerializedName("dCheckinDate")
    @Expose
    private String dCheckinDate;
    @SerializedName("dCheckoutDate")
    @Expose
    private String dCheckoutDate;

    public String getAssignedID() {
        return assignedID;
    }

    public void setAssignedID(String assignedID) {
        this.assignedID = assignedID;
    }

    public String getBoundaryLatitude1() {
        return boundaryLatitude1;
    }

    public void setBoundaryLatitude1(String boundaryLatitude1) {
        this.boundaryLatitude1 = boundaryLatitude1;
    }

    public String getBoundaryLatitude2() {
        return boundaryLatitude2;
    }

    public void setBoundaryLatitude2(String boundaryLatitude2) {
        this.boundaryLatitude2 = boundaryLatitude2;
    }

    public String getBoundaryLatitude3() {
        return boundaryLatitude3;
    }

    public void setBoundaryLatitude3(String boundaryLatitude3) {
        this.boundaryLatitude3 = boundaryLatitude3;
    }

    public String getBoundaryLatitude4() {
        return boundaryLatitude4;
    }

    public void setBoundaryLatitude4(String boundaryLatitude4) {
        this.boundaryLatitude4 = boundaryLatitude4;
    }

    public String getBoundaryLongitude1() {
        return boundaryLongitude1;
    }

    public void setBoundaryLongitude1(String boundaryLongitude1) {
        this.boundaryLongitude1 = boundaryLongitude1;
    }

    public String getBoundaryLongitude2() {
        return boundaryLongitude2;
    }

    public void setBoundaryLongitude2(String boundaryLongitude2) {
        this.boundaryLongitude2 = boundaryLongitude2;
    }

    public String getBoundaryLongitude3() {
        return boundaryLongitude3;
    }

    public void setBoundaryLongitude3(String boundaryLongitude3) {
        this.boundaryLongitude3 = boundaryLongitude3;
    }

    public String getBoundaryLongitude4() {
        return boundaryLongitude4;
    }

    public void setBoundaryLongitude4(String boundaryLongitude4) {
        this.boundaryLongitude4 = boundaryLongitude4;
    }

    public String getCheckInLocation() {
        return checkInLocation;
    }

    public void setCheckInLocation(String checkInLocation) {
        this.checkInLocation = checkInLocation;
    }

    public String getCheckOutLocation() {
        return checkOutLocation;
    }

    public void setCheckOutLocation(String checkOutLocation) {
        this.checkOutLocation = checkOutLocation;
    }

    public String getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(String checkinDate) {
        this.checkinDate = checkinDate;
    }

    public String getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(String checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public String getCredetCardNumber() {
        return credetCardNumber;
    }

    public void setCredetCardNumber(String credetCardNumber) {
        this.credetCardNumber = credetCardNumber;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getCurrentLocationAddress() {
        return currentLocationAddress;
    }

    public void setCurrentLocationAddress(String currentLocationAddress) {
        this.currentLocationAddress = currentLocationAddress;
    }

    public String getCurrentLocationCity() {
        return currentLocationCity;
    }

    public void setCurrentLocationCity(String currentLocationCity) {
        this.currentLocationCity = currentLocationCity;
    }

    public String getCurrentLocationCountry() {
        return currentLocationCountry;
    }

    public void setCurrentLocationCountry(String currentLocationCountry) {
        this.currentLocationCountry = currentLocationCountry;
    }

    public String getCurrentLocationID() {
        return currentLocationID;
    }

    public void setCurrentLocationID(String currentLocationID) {
        this.currentLocationID = currentLocationID;
    }

    public String getCurrentLocationLatitude() {
        return currentLocationLatitude;
    }

    public void setCurrentLocationLatitude(String currentLocationLatitude) {
        this.currentLocationLatitude = currentLocationLatitude;
    }

    public String getCurrentLocationLongitude() {
        return currentLocationLongitude;
    }

    public void setCurrentLocationLongitude(String currentLocationLongitude) {
        this.currentLocationLongitude = currentLocationLongitude;
    }

    public String getCurrentLocationPhone() {
        return currentLocationPhone;
    }

    public void setCurrentLocationPhone(String currentLocationPhone) {
        this.currentLocationPhone = currentLocationPhone;
    }

    public String getCurrentLocationState() {
        return currentLocationState;
    }

    public void setCurrentLocationState(String currentLocationState) {
        this.currentLocationState = currentLocationState;
    }

    public String getCurrentLocationZip() {
        return currentLocationZip;
    }

    public void setCurrentLocationZip(String currentLocationZip) {
        this.currentLocationZip = currentLocationZip;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(String dailyRate) {
        this.dailyRate = dailyRate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getInsurances() {
        return insurances;
    }

    public void setInsurances(String insurances) {
        this.insurances = insurances;
    }

    public String getIsCancelled() {
        return isCancelled;
    }

    public void setIsCancelled(String isCancelled) {
        this.isCancelled = isCancelled;
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

    public String getIsConfirmed() {
        return isConfirmed;
    }

    public void setIsConfirmed(String isConfirmed) {
        this.isConfirmed = isConfirmed;
    }

    public String getIsCredit() {
        return isCredit;
    }

    public void setIsCredit(String isCredit) {
        this.isCredit = isCredit;
    }

    public String getIsPassed() {
        return isPassed;
    }

    public void setIsPassed(String isPassed) {
        this.isPassed = isPassed;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicenserNumber() {
        return licenserNumber;
    }

    public void setLicenserNumber(String licenserNumber) {
        this.licenserNumber = licenserNumber;
    }

    public String getLocationID() {
        return locationID;
    }

    public void setLocationID(String locationID) {
        this.locationID = locationID;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getMakeName() {
        return makeName;
    }

    public void setMakeName(String makeName) {
        this.makeName = makeName;
    }

    public String getMisccharges() {
        return misccharges;
    }

    public void setMisccharges(String misccharges) {
        this.misccharges = misccharges;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMonthlyRate() {
        return monthlyRate;
    }

    public void setMonthlyRate(String monthlyRate) {
        this.monthlyRate = monthlyRate;
    }

    public String getNetRate() {
        return netRate;
    }

    public void setNetRate(String netRate) {
        this.netRate = netRate;
    }

    public String getOffsiteLocation() {
        return offsiteLocation;
    }

    public void setOffsiteLocation(String offsiteLocation) {
        this.offsiteLocation = offsiteLocation;
    }

    public String getParkingDescription() {
        return parkingDescription;
    }

    public void setParkingDescription(String parkingDescription) {
        this.parkingDescription = parkingDescription;
    }

    public String getParkingImage() {
        return parkingImage;
    }

    public void setParkingImage(String parkingImage) {
        this.parkingImage = parkingImage;
    }

    public String getRateID() {
        return rateID;
    }

    public void setRateID(String rateID) {
        this.rateID = rateID;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getReservationID() {
        return reservationID;
    }

    public void setReservationID(String reservationID) {
        this.reservationID = reservationID;
    }

    public String getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(String reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public Boolean getReservationPassed() {
        return reservationPassed;
    }

    public void setReservationPassed(Boolean reservationPassed) {
        this.reservationPassed = reservationPassed;
    }

    public String getRideShare() {
        return rideShare;
    }

    public void setRideShare(String rideShare) {
        this.rideShare = rideShare;
    }

    public String getTaxes() {
        return taxes;
    }

    public void setTaxes(String taxes) {
        this.taxes = taxes;
    }

    public String getThumbNailImage() {
        return thumbNailImage;
    }

    public void setThumbNailImage(String thumbNailImage) {
        this.thumbNailImage = thumbNailImage;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getVehicleDescription() {
        return vehicleDescription;
    }

    public void setVehicleDescription(String vehicleDescription) {
        this.vehicleDescription = vehicleDescription;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleTypeId() {
        return vehicleTypeId;
    }

    public void setVehicleTypeId(String vehicleTypeId) {
        this.vehicleTypeId = vehicleTypeId;
    }

    public String getWeeklyRate() {
        return weeklyRate;
    }

    public void setWeeklyRate(String weeklyRate) {
        this.weeklyRate = weeklyRate;
    }

    public String getYearMade() {
        return yearMade;
    }

    public void setYearMade(String yearMade) {
        this.yearMade = yearMade;
    }

    public String getDCheckinDate() {
        return dCheckinDate;
    }

    public void setDCheckinDate(String dCheckinDate) {
        this.dCheckinDate = dCheckinDate;
    }

    public String getDCheckoutDate() {
        return dCheckoutDate;
    }

    public void setDCheckoutDate(String dCheckoutDate) {
        this.dCheckoutDate = dCheckoutDate;
    }
}