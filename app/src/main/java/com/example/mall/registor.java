package com.example.mall;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class registor extends AppCompatActivity {
    private FrameLayout registor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registor);
        registor=findViewById(R.id.registor);
        //ImageView close=findViewById(R.id.close);

        setFragment(new sign_in());
    }
    public void setFragment(Fragment fragment)
    {

        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        ((FragmentTransaction) fragmentTransaction).replace(registor.getId(),fragment);
        fragmentTransaction.commit();
    }
}
