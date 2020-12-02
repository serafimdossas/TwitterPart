package com.example.twitterpart;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class TwitterPage extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twitterpage);
        String username = getIntent().getStringExtra("username");

        TextView usernameText = findViewById(R.id.usernameText);
        usernameText.setText(username);
    }
}
