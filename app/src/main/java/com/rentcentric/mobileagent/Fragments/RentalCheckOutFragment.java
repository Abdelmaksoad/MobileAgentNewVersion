package com.rentcentric.mobileagent.Fragments;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.rentcentric.mobileagent.Activities.LoginActivity;
import com.rentcentric.mobileagent.Activities.ReservationDetailsActivity;
import com.rentcentric.mobileagent.Models.Requests.CheckOutRequest;
import com.rentcentric.mobileagent.Models.Responses.CheckOutResponse;
import com.rentcentric.mobileagent.Network.RestAPI;
import com.rentcentric.mobileagent.Network.RetrofitService;
import com.rentcentric.mobileagent.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RentalCheckOutFragment extends Fragment {

    EditText checkoutReservation;
    Button next;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_rental_check_out, container, false);
        checkoutReservation = (EditText) view.findViewById(R.id.checkoutReservation);
        checkoutReservation.setText("683");
        next = (Button) view.findViewById(R.id.checkoutNext);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Intent intent = new Intent(getActivity(), ReservationDetailsActivity.class);
                intent.putExtra("ReservationNumber", checkoutReservation.getText().toString());
                startActivity(intent);
            }
        });
        return view;
    }
}