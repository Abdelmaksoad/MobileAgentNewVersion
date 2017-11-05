package com.rentcentric.mobileagent.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.rentcentric.mobileagent.Models.Requests.AdminLoginRequest;
import com.rentcentric.mobileagent.Models.Responses.AdminLoginResponse;
import com.rentcentric.mobileagent.Models.Requests.LoginRequest;
import com.rentcentric.mobileagent.Models.Responses.LoginResponse;
import com.rentcentric.mobileagent.Network.RestAPI;
import com.rentcentric.mobileagent.Network.RetrofitService;
import com.rentcentric.mobileagent.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    EditText mail, password;
    ImageView loginIcon;
    TextView forgot;
    RestAPI restAPI;
    String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mail = (EditText) findViewById(R.id.mailET);
        password = (EditText) findViewById(R.id.passwordET);
        loginIcon = (ImageView) findViewById(R.id.loginIcon);
        forgot = (TextView) findViewById(R.id.forgotPassword);

        mail.setText("hesham.mohammed@rentcentric.com");
        password.setText("Rent45");

        loginIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                RetrofitService.www = "www5";
//                RetrofitService.client = "6470";
                LoginCall();
            }
        });
    }

    private void LoginCall() {
        restAPI = RetrofitService.getLoginService().create(RestAPI.class);
        LoginRequest loginRequest = new LoginRequest(mail.getText().toString(), password.getText().toString());
        Call<LoginResponse> call = restAPI.login(loginRequest);
        call.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if (response.body().getStatus().getStatusCode().equals("0")) {
                    RetrofitService.www = response.body().getServerName().toString();
                    RetrofitService.client = response.body().getClientID().toString();
                    AdminLoginCall(RetrofitService.client);
                } else {
                    Toast.makeText(LoginActivity.this, response.body().getStatus().getDescription(), Toast.LENGTH_SHORT).show();
                }
                id = response.body().getClientID().toString();
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                Toast.makeText(LoginActivity.this, getString(R.string.server_connection_error), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void AdminLoginCall(String ClientID) {
        restAPI = RetrofitService.getService().create(RestAPI.class);
        AdminLoginRequest adminLoginRequest = new AdminLoginRequest(mail.getText().toString(), ClientID, password.getText().toString());
        Call<AdminLoginResponse> adminCall = restAPI.adminLogin(adminLoginRequest);

        adminCall.enqueue(new Callback<AdminLoginResponse>() {
            @Override
            public void onResponse(Call<AdminLoginResponse> call, Response<AdminLoginResponse> response) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                intent.putExtra("response", response.body().getAdminId().toString());
                startActivity(intent);
            }

            @Override
            public void onFailure(Call<AdminLoginResponse> call, Throwable t) {
                t.printStackTrace();
                Toast.makeText(LoginActivity.this, getString(R.string.server_connection_error), Toast.LENGTH_SHORT).show();
            }
        });
    }
}