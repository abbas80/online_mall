package com.example.mall;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;



public class sign_up extends Fragment {

    private TextView alreadyaccount;
    private FrameLayout  parentlayout;
    private EditText email;
    private EditText phone_no;
    private EditText password;
    private Button sign_up;

    public sign_up() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_sign_up, container, false);
        alreadyaccount=view.findViewById(R.id.sign_in);
        parentlayout=getActivity().findViewById(R.id.registor);
        email=view.findViewById(R.id.email);
        password=(EditText)view.findViewById(R.id.password);
        phone_no=(EditText) view.findViewById(R.id.phone_no);
        sign_up=view.findViewById(R.id.sign_up);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        alreadyaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setfragment(new sign_in());

            }
        });
        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                checkInput();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        phone_no.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                checkInput();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                checkInput();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
    public void setfragment(Fragment fragment)
    {
        FragmentTransaction fragmentTransaction=getActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.out_left,R.anim.in_left);
        fragmentTransaction.replace(parentlayout.getId(),fragment);
        fragmentTransaction.commit();
    }
    public void checkInput()
    {
        if(!TextUtils.isEmpty(email.getText().toString()))
        {
            if(!TextUtils.isEmpty(phone_no.getText().toString()))
            {
                String p=password.getText().toString();
                if(!TextUtils.isEmpty(password.getText().toString())&&p.length()>=8)
                {

                    sign_up.setEnabled(true);
                    sign_up.setTextColor(Color.rgb(255,255,255));
                }
                else {
                    password.setError("Empty password Field");
                    sign_up.setEnabled(false);
                    sign_up.setTextColor(Color.argb(50,255,255,255));


                }
            }
            else
            {
                phone_no.setError("Empty  phone Field");
                sign_up.setEnabled(false);
                sign_up.setTextColor(Color.argb(50,255,255,255));


            }
        }
        else {
            email.setError("Empty email Field");
            sign_up.setEnabled(false);
            sign_up.setTextColor(Color.argb(50,255,255,255));

        }
    }


}
