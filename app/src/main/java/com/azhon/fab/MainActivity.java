package com.azhon.fab;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.azhon.suspensionfab.FabAttributes;
import com.azhon.suspensionfab.OnFabClickListener;
import com.azhon.suspensionfab.SuspensionFab;


/**
 * 项目名:     SuspensionFAB
 * 包名:       com.azhon.fab
 * 文件名:     MainActivity
 * 创建者:     阿钟
 * 创建时间:   2017/6/29 23:12
 * 描述:       TODO 构建按钮时请务必设置tag
 */

public class MainActivity extends AppCompatActivity implements OnFabClickListener {

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

        fabBottom.setFabClickListener(this);
        fabRight.setFabClickListener(this);
        fabTop.setFabClickListener(this);
        fabLeft.setFabClickListener(this);
    }

    @Override
    public void onFabClick(FloatingActionButton fab, Object tag) {
        Toast.makeText(MainActivity.this, "点击了第" + tag + "个", Toast.LENGTH_SHORT).show();
    }
}
