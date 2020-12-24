package com.example.twitterpart;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.tweetcomposer.ComposerActivity;
import com.twitter.sdk.android.tweetcomposer.TweetComposer;
import com.twitter.sdk.android.tweetui.TweetTimelineListAdapter;
import com.twitter.sdk.android.tweetui.UserTimeline;

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

        ListView tweetList;
        tweetList = findViewById(R.id.tweetList);

        final UserTimeline userTimeline = new UserTimeline.Builder()
                .screenName(username)
                .build();
        final TweetTimelineListAdapter adapter = new TweetTimelineListAdapter.Builder(this)
                .setTimeline(userTimeline)
                .build();
        tweetList.setAdapter(adapter);

        postButton = findViewById(R.id.postButton);
        postButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                final TwitterSession session = TwitterCore.getInstance().getSessionManager()
                        .getActiveSession();
                final Intent intent = new ComposerActivity.Builder(TwitterPage.this)
                        .session(session)
                        .text("")
                        .hashtags("#AndroidStudio")
                        .createIntent();
                startActivity(intent);
            }
        });

        searchButton = findViewById(R.id.searchButton);
        searchButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent i = new Intent(TwitterPage.this, HashtagActivity.class);
                startActivity(i);

            }
        });
    }
}
