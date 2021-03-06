package com.example.admin.patriots;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Nationalistwiki extends AppCompatActivity {
    String url="";
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nationalistwiki);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        if(!bundle.isEmpty())
        {
            if(bundle.containsKey("freedom_fighter_data_link"))
            {
                url=bundle.getString("freedom_fighter_data_link");
            }
        }
        webView=findViewById(R.id.nationalists_wiki_web_view_id);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view, String url){
                view.loadUrl(url);
                return false;
            }
        });


        webView.loadUrl(url);

    }
}
