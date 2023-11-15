package com.example.buoi2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        LoginFragment loginFragment = LoginFragment.newInstance("Thai", "HN");
        getSupportFragmentManager().beginTransaction().add(R.id.container, loginFragment).addToBackStack("FRAG").commit();

        RegisterFragment registerFragment2 = RegisterFragment.newInstance("Thai", "HN");
        getSupportFragmentManager().beginTransaction().replace(R.id.container, registerFragment2).commit();

        // remove
//        getSupportFragmentManager().beginTransaction().remove(registerFragment2).commit();
        // xoas 1 tk dau tien fragment
//        getSupportFragmentManager().popBackStack();

//        RegisterFragment registerFragment = RegisterFragment.newInstance("", "");
//        getSupportFragmentManager().beginTransaction().add(R.id.containerB, registerFragment).commit();


    }

    @Override
    protected void onResume() {
        super.onResume();
//        int count = getSupportFragmentManager().getBackStackEntryCount();
        int count = getSupportFragmentManager().getFragments().size();
        Log.d(TAG, "onCreat: " + count);
    }
}