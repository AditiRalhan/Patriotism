package com.example.admin.patriots;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Linkedin extends AppCompatActivity {
int pressedButton;
    ProgressDialog progressDialog;
WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linkedin);
        progressDialog=new ProgressDialog(this);
        pressedButton = getIntent().getExtras().getInt("buttonno");
        w = (WebView) findViewById(R.id.webview);
        if(isNetworkStatusAvialable (getApplicationContext())) {
            switch (pressedButton) {
                case 1:

                    w.getSettings().setJavaScriptEnabled(true); //to make it work fast and ignore java code.
                    w.setWebViewClient(new HelloWebViewClient());

                    w.loadUrl("https://www.linkedin.com/in/nd-singh/");


                    break;
                case 2:

                    w.getSettings().setJavaScriptEnabled(true); //to make it work fast and ignore java code.
                    w.setWebViewClient(new HelloWebViewClient());
                    w.loadUrl("https://www.linkedin.com/in/aditi-ralhan-75b275151/");


                    break;
                case 3:


                    w.getSettings().setJavaScriptEnabled(true); //to make it work fast and ignore java code.
                    w.setWebViewClient(new HelloWebViewClient());
                    w.loadUrl("https://www.linkedin.com/in/himanshu-chaurasia-77944313a");

                    //Do Something for clicking button 1 scenario
                    break;
                case 4:

                    w.getSettings().setJavaScriptEnabled(true); //to make it work fast and ignore java code.
                    w.setWebViewClient(new HelloWebViewClient());
                    w.loadUrl("https://www.linkedin.com/in/satvik-sabharwal-9b7684114");

                    //Do Something for clicking button 1 scenario
                    break;
                case 5:

                    w.getSettings().setJavaScriptEnabled(true); //to make it work fast and ignore java code.
                    w.setWebViewClient(new HelloWebViewClient());
                    w.loadUrl("https://www.linkedin.com/company/the-d-zone/");

                    //Do Something for clicking button 1 scenario
                    break;

            }
        } else {
            Toast.makeText(getApplicationContext(), "No Internet Connection", Toast.LENGTH_SHORT).show();
            Intent i=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(i);
            finish();

        }


    }
    private class HelloWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                progressDialog.setMessage("Loading...");
                progressDialog.show();

            }

            @Override
            public void onPageFinished(WebView view, String url) {

                progressDialog.dismiss();

            }
        }



    public static boolean isNetworkStatusAvialable(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager != null) {
            NetworkInfo netInfos = connectivityManager.getActiveNetworkInfo();
            if (netInfos != null)
                if (netInfos.isConnected())
                    return true;
        }
        return false;
    }
}
