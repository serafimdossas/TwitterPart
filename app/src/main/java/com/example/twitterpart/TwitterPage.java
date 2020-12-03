package com.example.twitterpart;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class TwitterPage extends Activity {

    Button postButton;
    Button searchButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twitterpage);
        String username = getIntent().getStringExtra("username");

        TextView usernameText = findViewById(R.id.usernameText);
        usernameText.setText(username);


        postButton = findViewById(R.id.postButton);
        postButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent i = new Intent(TwitterPage.this,PostActivity.class);
                startActivity(i);
            }
        });

        searchButton = findViewById(R.id.searchButton);
        searchButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent i = new Intent(TwitterPage.this,HashtagsActivity.class);
                startActivity(i);
            }
        });
    }
}
