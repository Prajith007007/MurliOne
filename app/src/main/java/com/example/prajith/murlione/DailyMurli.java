package com.example.prajith.murlione;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DailyMurli extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    private WebView webView;
    String year, month, day;
    DatePicker picker;
    Button button;
    Dialog myDialog;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myDialog= new Dialog(this);
        myDialog.setContentView(R.layout.custompopup);
        setContentView(R.layout.activity_daily_murli);
        myDialog = new Dialog(this);
        webView = (findViewById(R.id.webview));
       picker = (DatePicker) findViewById(R.id.datePicker1);
       button = (Button) findViewById(R.id.pick);
       // button2 = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               picker.setVisibility(View.GONE);
               button.setVisibility(View.GONE);
                webView.setWebViewClient(new WebViewClient());
                webView.getSettings().setDomStorageEnabled(true);
              //  webView.loadUrl("http://madhubanmurli.org/#ml+2019-07-29");
                //https://www.kerala.brahmakumaris.com/dailymurali/13-07-2020/
               // webView.loadUrl("http://madhubanmurli.org/#ml+" + picker.getYear() + "-0" + (picker.getMonth() + 1) + "-" + picker.getDayOfMonth());
                webView.loadUrl("https://www.kerala.brahmakumaris.com/dailymurali/" + picker.getDayOfMonth() + "-0" + (picker.getMonth() + 1) + "-" + picker.getYear());
                Toast.makeText(DailyMurli.this, "Loading Malayalam Murli +"+ picker.getYear() + "-0" + (picker.getMonth() + 1) + "-" + picker.getDayOfMonth(),
                        Toast.LENGTH_SHORT).show();
                WebSettings webSettings = webView.getSettings();
                webSettings.setJavaScriptEnabled(true);
            }
        });

    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
