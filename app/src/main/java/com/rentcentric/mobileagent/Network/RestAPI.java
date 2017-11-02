package com.rentcentric.mobileagent.Network;

import com.rentcentric.mobileagent.Models.LoginRequest;
import com.rentcentric.mobileagent.Models.LoginResponse;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by Mohamed.Mohsen on 01-11-17.
 */

public interface RestAPI {

    @POST ("PortalService.svc/help/operations/MobileUserLogin")
    Call <LoginResponse> login(LoginRequest loginRequest);
}