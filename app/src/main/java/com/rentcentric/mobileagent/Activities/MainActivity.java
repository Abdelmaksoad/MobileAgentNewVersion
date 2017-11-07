package com.rentcentric.mobileagent.Activities;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.rentcentric.mobileagent.Fragments.ProfileFragment;
import com.rentcentric.mobileagent.Fragments.RentalFragment;
import com.rentcentric.mobileagent.Models.Requests.AdminLoginRequest;
import com.rentcentric.mobileagent.Models.Responses.AdminLoginResponse;
import com.rentcentric.mobileagent.Network.RestAPI;
import com.rentcentric.mobileagent.Network.RetrofitService;
import com.rentcentric.mobileagent.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView text;
    RestAPI restAPI;
    SharedPreferences sharedPreferences;
    BottomNavigationView navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction().add(R.id.container, new RentalFragment()).commit();
        }
        sharedPreferences = getSharedPreferences("LoginPref", MODE_PRIVATE);
//        text = (TextView) findViewById(R.id.maintext);
        RetrofitService.www = sharedPreferences.getString("ServerName", "");
        RetrofitService.client = sharedPreferences.getString("ClientID", "");
        restAPI = RetrofitService.getService().create(RestAPI.class);
        AdminLoginRequest adminLoginRequest = new AdminLoginRequest(
                sharedPreferences.getString("Mail", ""),
                sharedPreferences.getString("ClientID", ""),
                sharedPreferences.getString("Password", ""));
        Call<AdminLoginResponse> adminCall = restAPI.AdminLogin(adminLoginRequest);
        adminCall.enqueue(new Callback<AdminLoginResponse>() {
            @Override
            public void onResponse(Call<AdminLoginResponse> call, Response<AdminLoginResponse> response) {
//                text.setText(response.body().getAdminId().toString());
            }

            @Override
            public void onFailure(Call<AdminLoginResponse> call, Throwable t) {
                Toast.makeText(MainActivity.this, getString(R.string.server_connection_error), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    getFragmentManager().beginTransaction().replace(R.id.container, new RentalFragment()).commit();
                    return true;
                case R.id.navigation_dashboard:
                    return true;
                case R.id.navigation_profile:
                    getFragmentManager().beginTransaction().replace(R.id.container, new ProfileFragment()).commit();
                    return true;
            }
            return false;
        }
    };
}