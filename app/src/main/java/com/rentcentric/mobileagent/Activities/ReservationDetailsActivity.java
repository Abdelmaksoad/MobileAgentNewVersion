package com.rentcentric.mobileagent.Activities;

import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.rentcentric.mobileagent.Models.Requests.CheckOutRequest;
import com.rentcentric.mobileagent.Models.Requests.StartRentalRequest;
import com.rentcentric.mobileagent.Models.Responses.CheckOutResponse;
import com.rentcentric.mobileagent.Models.Responses.StartRentalResponse;
import com.rentcentric.mobileagent.Network.RestAPI;
import com.rentcentric.mobileagent.Network.RetrofitService;
import com.rentcentric.mobileagent.R;
import com.xw.repo.BubbleSeekBar;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ReservationDetailsActivity extends AppCompatActivity {

    ImageView back;
    TextView reservationNumber, vehicleID, pickupDate, dropoffDate;
    EditText odometer;
    BubbleSeekBar seekBar;
    Button continueRD;
    RestAPI restAPI;
    ProgressDialog progressDialog;
    String ReservationID;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation_details);

        sharedPreferences = getSharedPreferences("LoginPref", MODE_PRIVATE);
        back = (ImageView) findViewById(R.id.reservationBack);
        reservationNumber = (TextView) findViewById(R.id.reservationNumber);
        vehicleID = (TextView) findViewById(R.id.vehicleID);
        pickupDate = (TextView) findViewById(R.id.pickupDate);
        dropoffDate = (TextView) findViewById(R.id.dropoffDate);
        odometer = (EditText) findViewById(R.id.odometerOut);
        seekBar = (BubbleSeekBar) findViewById(R.id.seekBar);
        continueRD = (Button) findViewById(R.id.reservationDetailsBTN);

        progressDialog = new ProgressDialog(ReservationDetailsActivity.this);
        progressDialog.setMessage("Loading...");
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.show();

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        restAPI = RetrofitService.getService().create(RestAPI.class);
        CheckOutRequest checkOutRequest = new CheckOutRequest(getIntent().getStringExtra("ReservationNumber"));
        Call<CheckOutResponse> checkOutResponseCall = restAPI.CheckOut(checkOutRequest);
        checkOutResponseCall.enqueue(new Callback<CheckOutResponse>() {
            @Override
            public void onResponse(Call<CheckOutResponse> call, Response<CheckOutResponse> response) {
                if (response.body().getStatusInfo().getStatusCode().equals("0")) {
                    for (int i = 0; i < response.body().getReservationDetailsInfo().size(); i++) {
                        reservationNumber.setText(response.body().getReservationDetailsInfo().get(i).getReservationNumber());
                        vehicleID.setText(response.body().getReservationDetailsInfo().get(i).getAssignedID());
                        pickupDate.setText(response.body().getReservationDetailsInfo().get(i).getCheckoutDate());
                        dropoffDate.setText(response.body().getReservationDetailsInfo().get(i).getCheckinDate());
                        ReservationID = response.body().getReservationDetailsInfo().get(i).getReservationID();
                        progressDialog.dismiss();
                    }
                } else {
                    progressDialog.dismiss();
                    Toast.makeText(ReservationDetailsActivity.this, response.body().getStatusInfo().getDescription(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<CheckOutResponse> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(ReservationDetailsActivity.this, getString(R.string.server_connection_error), Toast.LENGTH_SHORT).show();
            }
        });

        continueRD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restAPI = RetrofitService.getService().create(RestAPI.class);
                StartRentalRequest startRentalRequest = new StartRentalRequest(sharedPreferences.getString("Mail", ""), Integer.toString(seekBar.getProgress()), odometer.getText().toString(), ReservationID);
                Call<StartRentalResponse> startRentalRequestCall = restAPI.StartRental(startRentalRequest);
                startRentalRequestCall.enqueue(new Callback<StartRentalResponse>() {
                    @Override
                    public void onResponse(Call<StartRentalResponse> call, Response<StartRentalResponse> response) {
                        Toast.makeText(ReservationDetailsActivity.this, response.body().getContarctUrl(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<StartRentalResponse> call, Throwable t) {

                    }
                });
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}