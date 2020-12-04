package com.example.twitterpart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HashtagActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hashtag);

        final EditText hashtagTextSearch;
        hashtagTextSearch = findViewById(R.id.hashtagTextSearch);

        Button searchButton;
        searchButton = findViewById(R.id.searchButton);

        searchButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(HashtagActivity.this, SearchedHashtagsActivity.class);
                i.putExtra("EXTRA_HASHTAG", hashtagTextSearch.getText().toString());
                startActivity(i);
            }
        });


        Button trendsButton;
        trendsButton = findViewById(R.id.trendsButton);
        trendsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(HashtagActivity.this,TrendingHashtagsActivity.class);
                startActivity(i);
            }
        });
    }
}