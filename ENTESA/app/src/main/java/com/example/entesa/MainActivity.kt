package com.example.entesa

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val webviewVariable=findViewById<WebView>(R.id.webView)
        webViewSetup(webviewVariable)

    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetup(webView: WebView){
        webView.webViewClient= WebViewClient()
        webView.apply {
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
            loadUrl("https://sachin2503.github.io/demo1/")
        }
    }
}