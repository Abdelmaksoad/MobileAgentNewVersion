package com.rentcentric.mobileagent.Network;

import com.rentcentric.mobileagent.Models.Requests.AdminLoginRequest;
import com.rentcentric.mobileagent.Models.Responses.AdminLoginResponse;
import com.rentcentric.mobileagent.Models.Requests.LoginRequest;
import com.rentcentric.mobileagent.Models.Responses.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Mohamed.Mohsen on 01-11-17.
 */

public interface RestAPI {

    @POST("MobileUserLogin")
    Call<LoginResponse> login(@Body LoginRequest loginRequest);

    @POST("AdminLogin")
    Call<AdminLoginResponse> adminLogin(@Body AdminLoginRequest adminLoginRequest);
}