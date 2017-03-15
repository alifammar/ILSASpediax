package com.example.ilsasblend.ilsaspedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Button2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2);

        String url = "http://blendedlearning.tnbilsas.com.my/ebook/EL%20Admin%20Fakulti%20Memasukkan%20e-Content%20dan%20Pendaftaran%20Kursus/index.html";
        WebView view =(WebView)this.findViewById(R.id.webview2);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
