package com.john.unittest.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * author ZhaoWei
 * created 2021/9/21 11:24 上午
 */
public class SpUtils {

    public static String getString(Context context, String key) {
        SharedPreferences sp = context.getSharedPreferences("aaa", Context.MODE_PRIVATE);
        return sp.getString(key, "");
    }
}
