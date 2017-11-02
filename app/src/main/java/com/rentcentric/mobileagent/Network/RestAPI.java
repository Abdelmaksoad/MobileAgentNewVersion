package com.rentcentric.mobileagent.Network;

import android.database.Observable;

import com.rentcentric.mobileagent.Models.LoginRequest;
import com.rentcentric.mobileagent.Models.LoginResponse;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Mohamed.Mohsen on 01-11-17.
 */

public interface RestAPI {

    @POST ("MobileUserLogin")
    Call<LoginResponse> login(@Body LoginRequest loginRequest);
}