package com.example.cg_8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //button kembali
        //getSupportActionBar().setHomeButtonEnabled(true);
       // getSupportActionBar().setDisplayShowHomeEnabled(true);

        web= findViewById(R.id.situs_gms);

        web.loadUrl("https://myaccount.mygms.com/");
        web.setWebViewClient(new WebViewClient(){
                                 @Override
                                 public void onPageFinished(WebView view, String url) {
                                     //getSupportActionBar().setTitle(web.getTitle());
                                 }
                             }

        );

        web.getSettings().setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if (web.canGoBack()){
            web.goBack();
        }else {
            super.onBackPressed();
        }
    }
    }

