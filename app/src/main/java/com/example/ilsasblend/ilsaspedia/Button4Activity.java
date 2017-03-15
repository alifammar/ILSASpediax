package com.example.ilsasblend.ilsaspedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Button4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button4);

        String url = "http://blendedlearning.tnbilsas.com.my/ebook/EL%20Pelulus%20Meluluskan%20Content/index.html";
        WebView view =(WebView)this.findViewById(R.id.webview4);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
