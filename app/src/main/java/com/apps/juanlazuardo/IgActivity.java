package com.apps.juanlazuardo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class IgActivity extends AppCompatActivity {
    WebView mWebview;
    WebSettings mWebSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ig);

        mWebview = (WebView)findViewById(R.id.wv_ig);

        mWebSettings = mWebview.getSettings();
        mWebview.setWebViewClient(new WebViewClient());
        mWebview.loadUrl("https://www.facebook.com/lazuardojuan");

    }
}
