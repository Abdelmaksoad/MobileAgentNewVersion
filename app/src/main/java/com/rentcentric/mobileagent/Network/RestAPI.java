package com.rentcentric.mobileagent.Network;

import com.rentcentric.mobileagent.Models.Requests.AdminLoginRequest;
import com.rentcentric.mobileagent.Models.Requests.CheckOutRequest;
import com.rentcentric.mobileagent.Models.Requests.StartRentalRequest;
import com.rentcentric.mobileagent.Models.Responses.AdminLoginResponse;
import com.rentcentric.mobileagent.Models.Requests.LoginRequest;
import com.rentcentric.mobileagent.Models.Responses.CheckOutResponse;
import com.rentcentric.mobileagent.Models.Responses.LoginResponse;
import com.rentcentric.mobileagent.Models.Responses.StartRentalResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Mohamed.Mohsen on 01-11-17.
 */

public interface RestAPI {

    @POST("MobileUserLogin")
    Call<LoginResponse> Login(@Body LoginRequest loginRequest);

    @POST("AdminLogin")
    Call<AdminLoginResponse> AdminLogin(@Body AdminLoginRequest adminLoginRequest);

    @POST("GetReservations")
    Call<CheckOutResponse> CheckOut(@Body CheckOutRequest checkOutRequest);

    @POST("StartRental")
    Call<StartRentalResponse> StartRental(@Body StartRentalRequest startRentalRequest);
}