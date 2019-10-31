package com.amikom.sharedpreferences;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.amikom.sharedpreferences.helper.SharedPref;

public class HomeActivity extends AppCompatActivity {
    Button btnFragment1, btnFragment2, btnLogout;
    TextView username;
    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        username = findViewById(R.id.user);

        username.setText(SharedPref.getInstance(getApplicationContext()).getName());

        if (savedInstanceState == null){
            loadFragment(new SatuFragment());
        }


        initialize();
        onClick();
    }

    private void loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame_layout,fragment)
                    .commit();
        }
    }

    private void initialize() {
        btnFragment1 = findViewById(R.id.btn_fragment1);
        btnFragment2 = findViewById(R.id.btn_fragment2);
        btnLogout = findViewById(R.id.btn_logout);
    }

    private void onClick() {
        btnFragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment = new SatuFragment();
                loadFragment(fragment);
            }
        });

        btnFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment = new DuaFragment();
                loadFragment(fragment);
            }
        });

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

}
