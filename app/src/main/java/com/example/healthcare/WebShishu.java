package com.example.healthcare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebShishu extends AppCompatActivity {

    WebView webView;
    String url = "http://dhakashishuhospital.org.bd";

    WebSettings settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_shishu);

        webView = findViewById(R.id.webshishu);

        settings = webView.getSettings();

        settings.setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient(){

            @Override
            public boolean shouldOverrideUrlLoading(WebView view,WebResourceRequest request) {

                view.loadUrl(url);
                return true;
            }
        });

        webView.loadUrl(url);

    }

    @Override
    public void onBackPressed() {

        if(webView.canGoBack())

            webView.goBack();

        else

            super.onBackPressed();
    }
}