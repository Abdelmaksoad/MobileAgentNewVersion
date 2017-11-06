package com.rentcentric.mobileagent.Activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.rentcentric.mobileagent.Models.Requests.LoginRequest;
import com.rentcentric.mobileagent.Models.Responses.LoginResponse;
import com.rentcentric.mobileagent.Network.RestAPI;
import com.rentcentric.mobileagent.Network.RetrofitService;
import com.rentcentric.mobileagent.R;

import at.markushi.ui.CircleButton;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    EditText mail, password;
    CircleButton login;
    TextView forgot;
    RestAPI restAPI;
    ProgressDialog progressDialog;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        sharedPreferences = getSharedPreferences("LoginPref", MODE_PRIVATE);
        editor = sharedPreferences.edit();

        mail = (EditText) findViewById(R.id.mailET);
        password = (EditText) findViewById(R.id.passwordET);
        login = (CircleButton) findViewById(R.id.login);
        forgot = (TextView) findViewById(R.id.forgotPassword);
        progressDialog = new ProgressDialog(this);

        mail.setText("hesham.mohammed@rentcentric.com");
        password.setText("Rent45");

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDialog.setMessage("Loading...");
                progressDialog.setCanceledOnTouchOutside(false);
                progressDialog.show();
                restAPI = RetrofitService.getLoginService().create(RestAPI.class);
                LoginRequest loginRequest = new LoginRequest(mail.getText().toString(), password.getText().toString());
                Call<LoginResponse> call = restAPI.login(loginRequest);
                call.enqueue(new Callback<LoginResponse>() {
                    @Override
                    public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                        if (response.body().getStatus().getStatusCode().equals("0")) {
                            editor.putString("Mail", mail.getText().toString());
                            editor.putString("Password", password.getText().toString());
                            editor.putString("ServerName", response.body().getServerName().toString());
                            editor.putString("ClientID", response.body().getClientID().toString());
                            editor.apply();
                            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                            startActivity(intent);
                            finish();
                        } else {
                            progressDialog.hide();
                            Toast.makeText(LoginActivity.this, response.body().getStatus().getDescription(), Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<LoginResponse> call, Throwable t) {
                        progressDialog.hide();
                        Toast.makeText(LoginActivity.this, getString(R.string.server_connection_error), Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}