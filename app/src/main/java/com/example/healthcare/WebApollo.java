package com.example.healthcare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebApollo extends AppCompatActivity {

    WebView webView;
    String url = "http://www.apollodhaka.com";

    WebSettings settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_apollo);

        webView = findViewById(R.id.webapollo);

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
