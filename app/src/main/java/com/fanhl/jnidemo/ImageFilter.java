package com.fanhl.jnidemo;

import android.graphics.Bitmap;

public class ImageFilter {
    static {
        System.loadLibrary("native-lib");
    }

    /**
     * 过滤亮度
     *
     * @param bmp
     * @param brightness
     */
    public native static void brightness(Bitmap bmp, float brightness);
}
