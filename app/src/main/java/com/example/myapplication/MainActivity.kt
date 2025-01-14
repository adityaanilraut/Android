package com.example.MyWebsite

import android.os.Bundle


import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.example.MyOllama.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView: WebView = findViewById(R.id.hello)
        webView.settings.javaScriptEnabled = true
        webView.settings.allowFileAccess= true
        webView.settings.allowContentAccess= true
        webView.settings.domStorageEnabled = true

        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://www.google.com/")
    }
}