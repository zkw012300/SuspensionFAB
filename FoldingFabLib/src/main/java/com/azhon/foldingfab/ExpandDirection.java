package com.azhon.foldingfab;

/*
 * 项目名:    SuspensionFAB
 * 包名       com.azhon.foldingfab
 * 文件名:    ExpandDirection
 * 创建者:    ZSY
 * 创建时间:  2017/6/29 on 16:57
 * 描述:     TODO 折叠按钮的展开方向
 */
public enum ExpandDirection {

    /**
     * 按钮的上边
     */
    FAB_TOP(1),
    /**
     * 按钮的下边
     */
    FAB_BOTTOM(2),
    /**
     * 按钮的左边
     */
    FAB_LEFT(3),
    /**
     * 按钮的右边
     */
    FAB_RIGHT(4);

    ExpandDirection(int value) {
        mValue = value;
    }

    private int mValue = 0;


    /**
     * @return 枚举变量实际返回值
     */
    public int getValue() {
        return mValue;
    }
}
