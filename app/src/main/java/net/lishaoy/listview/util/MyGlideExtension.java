package net.lishaoy.listview.util;

import com.bumptech.glide.annotation.GlideExtension;
import com.bumptech.glide.annotation.GlideOption;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;

import net.lishaoy.listview.R;

@GlideExtension
public class MyGlideExtension {
    private MyGlideExtension() {
    }

    @GlideOption
    public static BaseRequestOptions<?> injectOptions(BaseRequestOptions<?> options) {
        return options.placeholder(R.drawable.ic_image_160dp).error(R.drawable.ic_error_image_160dp);
    }
}
