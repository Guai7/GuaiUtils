package com.study.guaiutils.mvp.view;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.study.guaiutils.mvp.presenter.IPresenter;

/**
 * +----------------------------------------------------------------------
 * | 项   目: GuaiCodeUtils
 * +----------------------------------------------------------------------
 * | 包   名: com.study.guaiutils.mvp.view
 * +----------------------------------------------------------------------
 * | 类   名: BaseActivity
 * +----------------------------------------------------------------------
 * | 时　　间: 2021/11/10 16:09
 * +----------------------------------------------------------------------
 * | 代码创建: 王益德
 * +----------------------------------------------------------------------
 * | 版本信息: V1.0.0
 * +----------------------------------------------------------------------
 * | 功能描述:
 * +----------------------------------------------------------------------
 **/
public abstract class BaseActivity<P extends IPresenter> extends AppCompatActivity implements IActivity,IView {

    protected P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(bindLayout());

        presenter = initPresenter();
        if (presenter != null) {
            presenter.attView(this);
        }

        initView();
        initData();
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
