package net.lishaoy.listview.util;

import com.bumptech.glide.request.RequestOptions;

import net.lishaoy.listview.R;


public class GlideOptionsUtils {
    public static RequestOptions baseOptions() {
        return new RequestOptions().placeholder(R.drawable.ic_image_160dp).error(R.drawable.ic_error_image_160dp);
    }
    public static RequestOptions circleOptions(){
        return baseOptions().circleCrop();
    }
}
