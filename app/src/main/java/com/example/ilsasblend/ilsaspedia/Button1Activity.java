package com.example.ilsasblend.ilsaspedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;

public class Button1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button1);

        String url = "https://drive.google.com/file/d/0B73BqqMg4sf8TFZhYUtDdmdFV1E/view?usp=sharing";
        WebView view =(WebView)this.findViewById(R.id.webview1);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}
