package com.samples.network.webkit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView)findViewById(R.id.browser);
        webView.getSettings().setJavaScriptEnabled(true);
        String uri = "https://www.google.ru/";
        webView.loadUrl(uri);
    }
}
