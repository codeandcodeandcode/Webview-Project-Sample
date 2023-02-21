package com.example.webviewprojectsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //WebViewClient allows you to handle
        //onPageFinished and override Url loading.
        webView.webViewClient = WebViewClient()

        //this will load the url of the website
        webView.loadUrl("https://sites.google.com/view/pkads")


    }
}