package com.rentcentric.mobileagent.Fragments;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.rentcentric.mobileagent.R;

public class RentalFragment extends Fragment {

    TextView Checkin, Checkout;
    boolean in = true, out;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_rental, container, false);

        Checkin = (TextView) view.findViewById(R.id.checkin);
        Checkout = (TextView) view.findViewById(R.id.checkout);
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
        return view;
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