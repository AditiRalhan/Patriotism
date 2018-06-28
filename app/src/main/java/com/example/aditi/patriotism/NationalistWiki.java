package com.example.aditi.patriotism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class NationalistWiki extends AppCompatActivity {
    String url="";
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nationalist_wiki);

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
        webView.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view, String url){
                view.loadUrl(url);
                return false;
            }
        });

        webView.loadUrl(url);


    }
}
