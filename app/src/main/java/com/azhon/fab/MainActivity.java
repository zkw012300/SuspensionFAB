package com.azhon.fab;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;

import com.azhon.foldingfab.FabAttributes;
import com.azhon.foldingfab.SuspensionFab;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SuspensionFab fabBottom = (SuspensionFab) findViewById(R.id.fab_bottom);
        SuspensionFab fabRight = (SuspensionFab) findViewById(R.id.fab_right);
        SuspensionFab fabTop = (SuspensionFab) findViewById(R.id.fab_top);
        SuspensionFab fabLeft = (SuspensionFab) findViewById(R.id.fab_left);

        FabAttributes collection = new FabAttributes.Builder()
                .setBackgroundTint(Color.parseColor("#2096F3"))
                .setSrc(getResources().getDrawable(R.drawable.like))
                .setFabSize(FloatingActionButton.SIZE_NORMAL)
                .setPressedTranslationZ(10)
                .setTag(1)
                .build();

        FabAttributes email = new FabAttributes.Builder()
                .setBackgroundTint(Color.parseColor("#FF9800"))
                .setSrc(getResources().getDrawable(R.drawable.mail))
                .setFabSize(FloatingActionButton.SIZE_NORMAL)
                .setPressedTranslationZ(10)
                .setTag(2)
                .build();

        FabAttributes news = new FabAttributes.Builder()
                .setBackgroundTint(Color.parseColor("#03A9F4"))
                .setSrc(getResources().getDrawable(R.drawable.news))
                .setFabSize(FloatingActionButton.SIZE_NORMAL)
                .setPressedTranslationZ(10)
                .setTag(3)
                .build();

        fabBottom.addFab(collection, email, news);
        fabRight.addFab(collection, email, news);
        fabTop.addFab(collection, email, news);
        fabLeft.addFab(collection, email, news);
        fabTop.setAnimationManager(new FabAlphaAnimate(fabTop));
    }
}
