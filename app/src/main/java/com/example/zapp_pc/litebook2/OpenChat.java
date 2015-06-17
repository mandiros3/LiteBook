package com.example.zapp_pc.litebook2;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;


public class OpenChat extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_chat);

        WebView chat = (WebView) findViewById(R.id.chatView);
        chat.loadUrl("http://www.messenger.com");
        WebSettings webSettings = chat.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }


}
