package com.example.rafa.djlobo_with_downloads;

/**
 * Created by Rafa on 2/27/17.
 */

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;
import android.webkit.*;
import android.content.Intent;
import android.net.Uri;
/**
 * Created by Rafa on 4/14/16.
 */
public class WebActivity extends Activity {
    private static String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);


        WebView myWebView = (WebView) findViewById(R.id.webView);

        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        myWebView.setWebViewClient(new WebViewClient());

        myWebView.loadUrl(url);
//myWebView.getSettings().setBuiltInZoomControls(true);


        myWebView.setDownloadListener(new DownloadListener() {
            public void onDownloadStart(String url, String userAgent,
                                        String contentDisposition, String mimetype,
                                        long contentLength) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

    }

    public WebActivity(String link){
        url=link;

    }

    public WebActivity(){


    }
}
