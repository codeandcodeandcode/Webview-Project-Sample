package com.example.webviewprojectsample

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

      // Handler().postDelayed({

        //   val intent =  Intent( this,DashboardActivity::class.java)
           // startActivity(intent)
          //  finish()


       // }, 3000 )

        //WebViewClient allows you to handle
        //onPageFinished and override Url loading.
        webView.webViewClient = WebViewClient()

        //this will load the url of the website
        webView.loadUrl("https://sites.google.com/view/pkads/")

        //this will enable the javascript settings, it can also xss vulnerabilities
        webView.settings.javaScriptEnabled = true

        //if you want to enable the zoom feature
        webView.settings.setSupportZoom(true)
    }

    //if you press Back button this code will work
    override fun onBackPressed()  {
        //if your webview can go back it will go back
        if (webView.canGoBack())
            webView.goBack()
        //if your webview cannot go back
        //it will exit the application

        else
            super.onBackPressed()

    }

    //Handler().postDelayed({

       // val intent =  Intent( this,DashboardActivity::class.java)
            // startActivity(intent)
           //  finish()


   // }, 3000 )


}