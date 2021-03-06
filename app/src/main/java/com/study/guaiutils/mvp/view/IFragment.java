package com.study.guaiutils.mvp.view;

import android.view.View;

import androidx.annotation.IdRes;

/**
 * +----------------------------------------------------------------------
 * | 项   目: GuaiCodeUtils
 * +----------------------------------------------------------------------
 * | 包   名: com.study.guaiutils.mvp.view
 * +----------------------------------------------------------------------
 * | 类   名: IFragment
 * +----------------------------------------------------------------------
 * | 时　　间: 2021/11/10 16:03
 * +----------------------------------------------------------------------
 * | 代码创建: 王益德
 * +----------------------------------------------------------------------
 * | 版本信息: V1.0.0
 * +----------------------------------------------------------------------
 * | 功能描述:
 * +----------------------------------------------------------------------
 **/
public interface IFragment extends IActivity {
    <T extends View> T findViewById(@IdRes int id);
}
