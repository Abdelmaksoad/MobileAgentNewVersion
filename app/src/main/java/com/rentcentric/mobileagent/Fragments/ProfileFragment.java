package com.rentcentric.mobileagent.Fragments;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.rentcentric.mobileagent.Activities.LoginActivity;
import com.rentcentric.mobileagent.Activities.SplashActivity;
import com.rentcentric.mobileagent.R;

import static android.content.Context.MODE_PRIVATE;

public class ProfileFragment extends Fragment {

    TextView text;
    Button logout;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        sharedPreferences =this.getActivity().getSharedPreferences("LoginPref", MODE_PRIVATE);
        editor = sharedPreferences.edit();
        text = (TextView)view.findViewById(R.id.profileMail);
        logout=(Button)view.findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.clear();
                editor.commit();
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}