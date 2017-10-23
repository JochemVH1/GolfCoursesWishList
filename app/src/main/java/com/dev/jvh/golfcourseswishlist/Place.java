package com.dev.jvh.golfcourseswishlist;

import android.content.Context;

/**
 * Created by JochemVanHespen on 10/23/2017.
 */

public class Place {
    public String name;
    public String imageName;

    public int getImageResourceId(Context context) {
        return context.getResources().getIdentifier(this.imageName, "drawable", context.getPackageName());
    }
}