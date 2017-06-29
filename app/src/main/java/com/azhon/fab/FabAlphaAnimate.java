package com.azhon.fab;

import android.animation.ObjectAnimator;
import android.support.design.widget.FloatingActionButton;

import com.azhon.foldingfab.SuspensionFab;
import com.azhon.foldingfab.manager.AnimationManager;


/*
 * 项目名:     SuspensionFAB
 * 包名:       com.azhon.foldingfab
 * 文件名:     FabAlphaAnimate
 * 创建者:     阿钟
 * 创建时间:   2017/6/29 23:12
 * 描述:       TODO 自己实现的动画方式
 */

public class FabAlphaAnimate extends AnimationManager {


    public FabAlphaAnimate(SuspensionFab fabView) {
        super(fabView);
    }

    @Override
    public void openAnimationTop(FloatingActionButton fab) {
        if (fab.getTag().equals(3)) {
            ObjectAnimator alpha = ObjectAnimator.ofFloat(fab, "alpha", 0f, 1f);
            alpha.setDuration(fabView.getAnimateDuration() + 400);
            alpha.start();
        }
    }

    @Override
    public void openAnimationBottom(FloatingActionButton fab) {
    }

    @Override
    public void openAnimationLeft(FloatingActionButton fab) {

    }

    @Override
    public void openAnimationRight(FloatingActionButton fab) {

    }

    @Override
    public void closeAnimationTop(FloatingActionButton fab) {

    }

    @Override
    public void closeAnimationBottom(FloatingActionButton fab) {

    }

    @Override
    public void closeAnimationLeft(FloatingActionButton fab) {

    }

    @Override
    public void closeAnimationRight(FloatingActionButton fab) {

    }

}
