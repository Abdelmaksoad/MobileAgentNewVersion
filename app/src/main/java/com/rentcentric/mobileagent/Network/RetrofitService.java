package com.rentcentric.mobileagent.Network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Mohamed.Mohsen on 01-11-17.
 */

public class RetrofitService {

    public static Retrofit retrofit = null;

    public static Retrofit getService() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl("https://www5.rentcentric.com/Portal_Service/PortalService.svc/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}