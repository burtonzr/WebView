package com.example.ucm;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewFragment extends Fragment {

    private WebView mWebView;
    public static String mURL;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.web_view, container, false);
        return v;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mURL = ListAppsFragment.setURL;
        if(savedInstanceState == null) {
            if(mURL == null) {
                mWebView = getView().findViewById(R.id.pageInfo);
                mWebView.setWebViewClient(new WebViewClient());
                WebSettings websettings = mWebView.getSettings();
                websettings.setJavaScriptEnabled(true);
                mWebView.loadUrl("https://kingcounty.gov/depts/transportation/metro.aspx");
            } else {
                mWebView = getView().findViewById(R.id.pageInfo);
                mWebView.setWebViewClient(new WebViewClient());
                WebSettings websettings = mWebView.getSettings();
                websettings.setJavaScriptEnabled(true);
                mWebView.loadUrl(mURL.trim());
            }
        } else {
            if(mURL == null) {
                mWebView = getView().findViewById(R.id.pageInfo);
                mWebView.setWebViewClient(new WebViewClient());
                WebSettings websettings = mWebView.getSettings();
                websettings.setJavaScriptEnabled(true);
                mWebView.loadUrl("https://kingcounty.gov/depts/transportation/metro.aspx");
            } else {
                mWebView = getView().findViewById(R.id.pageInfo);
                mWebView.setWebViewClient(new WebViewClient());
                WebSettings websettings = mWebView.getSettings();
                websettings.setJavaScriptEnabled(true);
                mWebView.loadUrl(mURL.trim());
            }
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("currentURL", mURL);
    }
}