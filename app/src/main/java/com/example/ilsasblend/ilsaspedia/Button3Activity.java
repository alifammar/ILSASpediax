package com.example.ilsasblend.ilsaspedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Button3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button3);

        String url = "http://blendedlearning.tnbilsas.com.my/ebook/EL%20Admin%20Fakulti%20Mencipta%20Kursus/index.html";
        WebView view =(WebView)this.findViewById(R.id.webview3);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
