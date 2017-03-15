package com.example.ilsasblend.ilsaspedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Button11Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button11);

        String url = "http://blendedlearning.tnbilsas.com.my/ebook/Pelatih%20Mendaftar%20Masuk/index.html";
        WebView view =(WebView)this.findViewById(R.id.webview11);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
