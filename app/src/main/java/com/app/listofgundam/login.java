package com.app.listofgundam;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class login extends AppCompatActivity {
    Button callSinUp,login_btn;
    ImageView image;
    TextView logoText, sloganText;
    TextInputLayout username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

        //hook
        callSinUp = findViewById(R.id.signup_screen);
        image = findViewById(R.id.iv_logoGundam);
        logoText = findViewById(R.id.tv_hello);
        sloganText = findViewById(R.id.tv_signin);
        username = findViewById(R.id.tv_usernamelogin);
        password = findViewById(R.id.tv_passwordlogin);
        login_btn = findViewById(R.id.bt_login);

        callSinUp.setOnClickListener((view) -> {
            Intent intent = new Intent(login.this, signUp.class);

            Pair[] pairs = new Pair[7];
            pairs[0] = new Pair<View,String >(image, "logo_image");
            pairs[1] = new Pair<View,String >(image, "logo_text");
            pairs[2] = new Pair<View,String >(image, "logo_desc");
            pairs[3] = new Pair<View,String >(image, "username_tran");
            pairs[4] = new Pair<View,String >(image, "password_tran");
            pairs[5] = new Pair<View,String >(image, "button_trans");
            pairs[6] = new Pair<View,String >(image, "login_signup_tran");

            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(login.this,pairs);
            startActivity(intent, options.toBundle());
        });
    }
}