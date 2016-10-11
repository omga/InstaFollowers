package com.promotion.instafollowers.ui;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.promotion.instafollowers.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityLoginFragment extends Fragment {

    private static final String TAG = "MainActLoginFragment";
    private Button loginBtn;
    private WebView webView;

    public MainActivityLoginFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        loginBtn = (Button) view.findViewById(R.id.loginBtn);
        webView = (WebView) view.findViewById(R.id.webView);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String authURLString = "https://api.instagram.com/oauth/authorize/?client_id=9034a5ad806f47e7a41d7560dab8858d&redirect_uri=http://andrewspromolab.com&response_type=token";
                webView.setVisibility(View.VISIBLE);
                webView.setVerticalScrollBarEnabled(false);
                webView.setHorizontalScrollBarEnabled(false);
                webView.setWebViewClient(new InstaWebViewClient());
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl(authURLString);
            }
        });
        return view;
    }
    private void switchFragment(){
        FragmentManager fragmentManager2 = getFragmentManager();
        FragmentTransaction transaction = fragmentManager2.beginTransaction();
        MainActivityFragment mainActivityFragment = new MainActivityFragment();
        transaction.replace(R.id.fragment, mainActivityFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
    public class InstaWebViewClient extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            Uri uri = Uri.parse(url);
            Log.d(TAG,"shouldOverrideUrlLoading url: " + url);
            if(getContext().getString(R.string.redirect).contains(uri.getHost())){
                String error = uri.getQueryParameter("error");
                if(error == null) {
//                    String code = uri.getQueryParameter("access_token");
                    String code = url.split("=")[1];
                    Log.d(TAG,"insta code: " + code);
//                    webView.setVisibility(View.GONE);
                    switchFragment();
//                    webView.destroy();
                }else{


                }
            }
            return super.shouldOverrideUrlLoading(view, url);
        }
    }
}
