package com.example.myproject.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;


public class HttpUtils {

     public static boolean isNetworkAvailable(Context context) {
             if(context !=null){
                 ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
                 @SuppressLint("MissingPermission") NetworkInfo info = cm.getActiveNetworkInfo();
                 if(info !=null){
                     return info.isAvailable();
                 }
             }
             return false;
         }
}
