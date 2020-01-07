package com.example.mall;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;



public class sign_in extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private TextView donothaveaccount,forgot_password;
    private FrameLayout parentframe;
    private ImageView close;


    public sign_in() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_sign_in, container, false);
        donothaveaccount=view.findViewById(R.id.sign_up);
        parentframe=getActivity().findViewById(R.id.registor);
        forgot_password=view.findViewById(R.id.forgot_password);
       close=view.findViewById(R.id.close);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        donothaveaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFragment(new sign_up());
            }
        });
        forgot_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFragment(new forgot_password());
            }
        });
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainactivity=new Intent(getActivity(),MainActivity.class);
                startActivity(mainactivity);
           //     finish();

            }
        });

    }

    private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction=getActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.rigth_to_left,R.anim.left_to_rigth);
        fragmentTransaction.replace(parentframe.getId(),fragment);
        fragmentTransaction.commit();
    }


}
