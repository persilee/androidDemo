package net.lishaoy.listview.widget;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.just.agentweb.IWebLayout;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;

import net.lishaoy.listview.R;

public class WebLayout implements IWebLayout {

    private Activity activity;
    private final TwinklingRefreshLayout twinklingRefreshLayout;
    private WebView webView = null;

    public WebLayout(Activity activity) {
        this.activity = activity;
        twinklingRefreshLayout = (TwinklingRefreshLayout) LayoutInflater.from(activity).inflate(R.layout.fragment_twk_web,null);
        twinklingRefreshLayout.setPureScrollModeOn();
        webView = twinklingRefreshLayout.findViewById(R.id.web_view);
    }


    @NonNull
    @Override
    public ViewGroup getLayout() {
        return twinklingRefreshLayout;
    }

    @Nullable
    @Override
    public WebView getWebView() {
        return webView;
    }
}
