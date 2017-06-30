package com.azhon.foldingfab.manager;

import android.support.design.widget.FloatingActionButton;

import com.azhon.foldingfab.SuspensionFab;

/*
 * 项目名:     Fab
 * 包名:       com.azhon.foldingfab
 * 文件名:     AnimationManager
 * 创建者:     阿钟
 * 创建时间:   2017/6/29 23:05
 * 描述:       TODO 用来实现自定义动画，请务必使用属性动画
 */

public abstract class AnimationManager {

    public SuspensionFab fabView;

    public AnimationManager(SuspensionFab fabView) {
        this.fabView = fabView;
    }

    /**
     * 给按钮添加自定义动画
     * 向上展开
     *
     * @param fab 按钮
     */
    public abstract void openAnimationTop(FloatingActionButton fab);

    /**
     * 给按钮添加自定义动画
     * 向下展开
     *
     * @param fab 按钮
     */
    public abstract void openAnimationBottom(FloatingActionButton fab);

    /**
     * 给按钮添加自定义动画
     * 向左展开
     *
     * @param fab 按钮
     */
    public abstract void openAnimationLeft(FloatingActionButton fab);

    /**
     * 给按钮添加自定义动画
     * 向右展开
     *
     * @param fab 按钮
     */
    public abstract void openAnimationRight(FloatingActionButton fab);

    /**
     * 给按钮添加自定义动画
     * 向上折叠
     *
     * @param fab 按钮
     */
    public abstract void closeAnimationTop(FloatingActionButton fab);

    /**
     * 给按钮添加自定义动画
     * 向下折叠
     *
     * @param fab 按钮
     */
    public abstract void closeAnimationBottom(FloatingActionButton fab);

    /**
     * 给按钮添加自定义动画
     * 向左折叠
     *
     * @param fab 按钮
     */
    public abstract void closeAnimationLeft(FloatingActionButton fab);

    /**
     * 给按钮添加自定义动画
     * 向右折叠
     *
     * @param fab 按钮
     */
    public abstract void closeAnimationRight(FloatingActionButton fab);

}
