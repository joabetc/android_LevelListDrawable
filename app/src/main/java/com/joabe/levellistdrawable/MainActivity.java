package com.joabe.levellistdrawable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private int level = 0;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.battery_image);
    }

    public void decreaseLevel(View view) {
        if (level > 0) {
            imageView.setImageLevel(--level);
        }
    }

    public void increaseLevel(View view) {
        if (level < 6) {
            imageView.setImageLevel(++level);
        }
    }
}
