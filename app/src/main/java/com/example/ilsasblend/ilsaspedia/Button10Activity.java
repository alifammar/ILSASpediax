package com.example.ilsasblend.ilsaspedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Button10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button10);

        String url = "http://blendedlearning.tnbilsas.com.my/ebook/EL%20Super%20Admin%20Unit%20Kursus%20Modul/index.html";
        WebView view =(WebView)this.findViewById(R.id.webview10);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
