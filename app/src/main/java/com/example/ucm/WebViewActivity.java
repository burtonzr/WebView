package com.example.ucm;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

public class WebViewActivity extends SingleFragmentActivity {

    private static final String EXTRA_APP_URL = "com.example.ucm.app_url";

    @Override
    protected Fragment createFragment() {
        return new WebViewFragment();
    }

    public static Intent newIntent(Context packageContext, String appURL) {
        Intent intent = new Intent(packageContext, WebViewActivity.class);
        intent.putExtra(EXTRA_APP_URL, appURL);
        return intent;
    }
}