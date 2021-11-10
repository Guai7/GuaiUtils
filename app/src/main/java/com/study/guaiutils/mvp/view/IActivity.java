package com.study.guaiutils.mvp.view;

import com.study.guaiutils.mvp.presenter.IPresenter;

/**
 * +----------------------------------------------------------------------
 * | 项   目: GuaiCodeUtils
 * +----------------------------------------------------------------------
 * | 包   名: com.study.guaiutils.mvp.view
 * +----------------------------------------------------------------------
 * | 类   名: IActivity
 * +----------------------------------------------------------------------
 * | 时　　间: 2021/11/10 16:01
 * +----------------------------------------------------------------------
 * | 代码创建: 王益德
 * +----------------------------------------------------------------------
 * | 版本信息: V1.0.0
 * +----------------------------------------------------------------------
 * | 功能描述:
 * +----------------------------------------------------------------------
 **/
public interface IActivity {
    void initView();
    void initData();

    int bindLayout();
    <P extends IPresenter> P initPresenter();
}
