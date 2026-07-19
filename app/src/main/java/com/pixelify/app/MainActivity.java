package com.pixelify.app;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(64, 64, 64, 64);

        TextView title = new TextView(this);
        title.setText("Pixelify - Pixel 10 Features");
        title.setTextSize(24);
        title.setPadding(0, 0, 0, 32);

        TextView status = new TextView(this);
        status.setText("Status: Active\nSpoofed Model: Pixel 10 Pro (frankel)\nGoogle Apps Spoofing: Enabled\nBrowser Spoofing: Enabled\nUnlimited Photos Backup: Active");
        status.setTextSize(16);

        layout.addView(title);
        layout.addView(status);

        setContentView(layout);
    }
}
