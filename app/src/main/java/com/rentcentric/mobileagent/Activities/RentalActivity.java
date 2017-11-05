package com.rentcentric.mobileagent.Activities;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.rentcentric.mobileagent.Fragments.RentalCheckInFragment;
import com.rentcentric.mobileagent.Fragments.RentalCheckOutFragment;
import com.rentcentric.mobileagent.R;

public class RentalActivity extends AppCompatActivity {

    TextView Checkin, Checkout;
    boolean in = true, out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rental);
        Checkin = (TextView) findViewById(R.id.checkin);
        Checkout = (TextView) findViewById(R.id.checkout);
        getFragmentManager().beginTransaction().add(R.id.RentalContainer, new RentalCheckInFragment()).commit();
        CheckinChecked();

        Checkin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in = true;
                CheckinChecked();
                out = false;
                CheckoutChecked();
            }
        });

        Checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                out = true;
                CheckoutChecked();
                in = false;
                CheckinChecked();
            }
        });
    }

    private void CheckinChecked() {
        if (in == true) {
            getFragmentManager().beginTransaction().replace(R.id.RentalContainer, new RentalCheckInFragment()).commit();
            Checkin.setBackground(getResources().getDrawable(R.drawable.textview));
            Checkin.setTextColor(getResources().getColor(R.color.colorAccent));
        } else {
            Checkin.setBackground(getResources().getDrawable(R.drawable.tab));
            Checkin.setTextColor(getResources().getColor(R.color.colorWhite));
        }
    }

    private void CheckoutChecked() {
        if (out == true) {
            getFragmentManager().beginTransaction().replace(R.id.RentalContainer, new RentalCheckOutFragment()).commit();
            Checkout.setBackground(getResources().getDrawable(R.drawable.textview));
            Checkout.setTextColor(getResources().getColor(R.color.colorAccent));
        } else {
            Checkout.setBackground(getResources().getDrawable(R.drawable.tab));
            Checkout.setTextColor(getResources().getColor(R.color.colorWhite));
        }
    }
}