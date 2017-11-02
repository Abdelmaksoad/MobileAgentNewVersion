package com.rentcentric.mobileagent.Activities;

import android.database.Observable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.rentcentric.mobileagent.Models.LoginRequest;
import com.rentcentric.mobileagent.Models.LoginResponse;
import com.rentcentric.mobileagent.Network.RestAPI;
import com.rentcentric.mobileagent.Network.RetrofitService;
import com.rentcentric.mobileagent.R;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    EditText mail, password;
    ImageView loginIcon;
    RestAPI restAPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);




        mail = (EditText) findViewById(R.id.mailET);
        password = (EditText) findViewById(R.id.passwordET);
        loginIcon = (ImageView) findViewById(R.id.loginIcon);

        mail.setText("selfservice@rentcentric.com");
        password.setText("fall2015");

        loginIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restAPI=RetrofitService.getService().create(RestAPI.class);
                LoginRequest loginRequest = new LoginRequest(mail.getText().toString(), password.getText().toString());
                Call<LoginResponse> call = restAPI.login(loginRequest);

                call.enqueue(new Callback<LoginResponse>() {
                    @Override
                    public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                        Toast.makeText(LoginActivity.this, response.body().getServerName().toString(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<LoginResponse> call, Throwable t) {
                        t.printStackTrace();
                    }
                });
            }
        });
    }
}