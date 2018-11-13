package com.missile.demo;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;


public class ImageActivity extends AppCompatActivity {


    private NetStateReceiver receiver = new NetStateReceiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        IntentFilter filter = new IntentFilter();
        filter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(receiver, filter);
        receiver.onReceive(this, null);

        ImageView image = (ImageView) findViewById(R.id.image);
        GlideUtil.setImage(this, "http://pic.sc.chinaz.com/files/pic/pic9/201508/apic14052.jpg", image);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.unregisterReceiver(receiver);
    }
}
