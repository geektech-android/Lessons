package com.akai.geektech.practiclessons.Broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.util.Log;

public class WiFiReceiver extends BroadcastReceiver {
    private String s;
    @Override
    public void onReceive(Context context, Intent intent) {
        NetworkInfo info = intent.getParcelableExtra(WifiManager.EXTRA_NETWORK_INFO);

        if(info != null && info.isConnected()){
            Log.d("tadaaam", "Wi-Fi is connected");
        }
        Log.d("tadaaam", "Wi-Fi is not connected");
    }
}
