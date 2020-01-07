package com.example.mall;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    FrameLayout frame_layout;
    private NavigationView navigationView;
    private Boolean home_fragment_flag=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowCustomEnabled(false);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.getMenu().getItem(0).setChecked(true);
        frame_layout=findViewById(R.id.main_frame_layout);
        setFragment(new home_fragment(),1);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        if(home_fragment_flag==true)
        {
            getMenuInflater().inflate(R.menu.main, menu);
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_search) {
            return true;
        }
        else if (id == R.id.action_bell) {
            return true;
        }
        else if(id==android.R.id.home)
        {
            invalidateOptionsMenu();
            getSupportActionBar().setDisplayShowCustomEnabled(false);
            setFragment(new home_fragment(),1);
        }
        else if (id == R.id.action_cart) {
            invalidateOptionsMenu();
            getSupportActionBar().setDisplayShowCustomEnabled(true);
            getSupportActionBar().setTitle("My Cart");
            setFragment(new my_cart_Fragment(),2);
            navigationView.getMenu().getItem(1).setChecked(true);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_my_home) {
            home_fragment_flag=true;
            invalidateOptionsMenu();
            getSupportActionBar().setDisplayShowCustomEnabled(false);
            setFragment(new home_fragment(),1);
            // Handle the camera action
        }
        else if(id== android.R.id.home)
        {
            invalidateOptionsMenu();
            getSupportActionBar().setDisplayShowCustomEnabled(false);
            setFragment(new home_fragment(),1);
        }
        else if(id==R.id.nav_my_cart)
        {
            invalidateOptionsMenu();
            getSupportActionBar().setDisplayShowCustomEnabled(true);
            getSupportActionBar().setTitle("My Cart");
            setFragment(new my_cart_Fragment(),2);
        }
        else if (id == R.id.nav_my_order) {
            invalidateOptionsMenu();
            getSupportActionBar().setDisplayShowCustomEnabled(true);
            getSupportActionBar().setTitle("My Orders");

            setFragment(new my_orderFragment(),3);

        } else if (id == R.id.nav_my_reward) {

        } else if (id == R.id.nav_wishlist) {
            invalidateOptionsMenu();
            getSupportActionBar().setDisplayShowCustomEnabled(true);
            getSupportActionBar().setTitle("My Wishlist");
            //navigationView.getMenu().getItem(4).setChecked(true);

            setFragment(new wishList_Fragment(),4);
        }
        else if(id==R.id.nav_my_account)
        {

        }
        else if(id==R.id.nav_sign_out)
        {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void setFragment(Fragment fragment,int no) {
        home_fragment_flag=false;
        if(no==1)
        {
            home_fragment_flag=true;
            navigationView.getMenu().getItem(0).setChecked(true);
        }
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.rigth_to_left,R.anim.left_to_rigth);
        fragmentTransaction.replace(frame_layout.getId(),fragment);
        fragmentTransaction.commit();
    }

}
