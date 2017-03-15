package com.example.ilsasblend.ilsaspedia;

import android.content.Intent;
import android.os.Vibrator;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.ActionMenuView;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;
import java.util.List;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {

//    private WebView webView;
//    private WebChromeClient chromeClient;
//    private WebViewClient wvClient;

    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;
    private Button mButton5;
    private Button mButton6;
    private Button mButton7;
    private Button mButton8;
    private Button mButton9;
    private Button mButton10;
    private Button mButton11;
    Vibrator vibrator;

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        firebaseAuth = FirebaseAuth.getInstance();

        mButton1 = (Button) findViewById(R.id.mButton1);
        mButton2 = (Button) findViewById(R.id.mButton2);
        mButton3 = (Button) findViewById(R.id.mButton3);
        mButton4 = (Button) findViewById(R.id.mButton4);
        mButton5 = (Button) findViewById(R.id.mButton5);
        mButton6 = (Button) findViewById(R.id.mButton6);
        mButton7 = (Button) findViewById(R.id.mButton7);
        mButton8 = (Button) findViewById(R.id.mButton8);
        mButton9 = (Button) findViewById(R.id.mButton9);
        mButton10 = (Button) findViewById(R.id.mButton10);
        mButton11 = (Button) findViewById(R.id.mButton11);

        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        mButton1.setOnClickListener(this);
        mButton2.setOnClickListener(this);
        mButton3.setOnClickListener(this);
        mButton4.setOnClickListener(this);
        mButton5.setOnClickListener(this);
        mButton6.setOnClickListener(this);
        mButton7.setOnClickListener(this);
        mButton8.setOnClickListener(this);
        mButton9.setOnClickListener(this);
        mButton10.setOnClickListener(this);
        mButton11.setOnClickListener(this);



    }



    @Override
    public void onClick(View view) {

        if (view == mButton1){
            startActivity(new Intent(ProfileActivity.this, Button1Activity.class));
            vibrator.vibrate(50);
        }
        if (view == mButton2){
            startActivity(new Intent(ProfileActivity.this, Button2Activity.class));
            vibrator.vibrate(50);
        }
        if (view == mButton3){
            startActivity(new Intent(ProfileActivity.this, Button3Activity.class));
            vibrator.vibrate(50);
        }
        if (view == mButton4){
            startActivity(new Intent(ProfileActivity.this, Button4Activity.class));
            vibrator.vibrate(50);
        }
        if (view == mButton5){
            startActivity(new Intent(ProfileActivity.this, Button5Activity.class));
            vibrator.vibrate(50);
        }
        if (view == mButton6){
            startActivity(new Intent(ProfileActivity.this, Button6Activity.class));
            vibrator.vibrate(50);
        }
        if (view == mButton7){
            startActivity(new Intent(ProfileActivity.this, Button7Activity.class));
            vibrator.vibrate(50);
        }
        if (view == mButton8){
            startActivity(new Intent(ProfileActivity.this, Button8Activity.class));
            vibrator.vibrate(50);
        }
        if (view == mButton9){
            startActivity(new Intent(ProfileActivity.this, Button9Activity.class));
            vibrator.vibrate(50);
        }
        if (view == mButton10){
            startActivity(new Intent(ProfileActivity.this, Button10Activity.class));
            vibrator.vibrate(50);
        }
        if (view == mButton11){
            startActivity(new Intent(ProfileActivity.this, Button11Activity.class));
            vibrator.vibrate(50);
        }

    }


    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_settings:

                firebaseAuth.signOut();
                finish();
                startActivity(new Intent(this, MainActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }
}
