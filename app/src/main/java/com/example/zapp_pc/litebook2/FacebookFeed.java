package com.example.zapp_pc.litebook2;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;


public class FacebookFeed extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook_feed);


        WebView feed = (WebView) findViewById(R.id.feedView);
        feed.loadUrl("http://www.facebook.com");
        WebSettings webSettings = feed.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }


}
