package com.belajarngoding.www.myapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class google extends AppCompatActivity {

    private WebView wb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google);

        wb = (WebView)findViewById(R.id.webview_google);
        wb.setWebViewClient(new WebViewClient());
        wb.loadUrl("https://www.google.com");
        

        WebSettings ws = wb.getSettings();
        ws.setJavaScriptEnabled(true);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if (wb.canGoBack()){
            wb.goBack();
        } else {
            super.onBackPressed();
        }
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
