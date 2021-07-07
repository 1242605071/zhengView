package com.zheng.zheng.view;

import android.content.Context;

/**
 * @Description:
 * @Author: zheng
 */
public class dpUtils
{

    private static float scale;

    public static int dpToPixel(float dp, Context context) {
        if (scale == 0) {
            scale = context.getResources().getDisplayMetrics().density;
        }
        return (int) (dp * scale);
    }
}
