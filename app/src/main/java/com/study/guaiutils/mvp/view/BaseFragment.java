package com.study.guaiutils.mvp.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.study.guaiutils.mvp.presenter.IPresenter;

/**
 * +----------------------------------------------------------------------
 * | 项   目: GuaiCodeUtils
 * +----------------------------------------------------------------------
 * | 包   名: com.study.guaiutils.mvp.view
 * +----------------------------------------------------------------------
 * | 类   名: BaseFragment
 * +----------------------------------------------------------------------
 * | 时　　间: 2021/11/10 16:11
 * +----------------------------------------------------------------------
 * | 代码创建: 王益德
 * +----------------------------------------------------------------------
 * | 版本信息: V1.0.0
 * +----------------------------------------------------------------------
 * | 功能描述:
 * +----------------------------------------------------------------------
 **/
public abstract class BaseFragment<P extends IPresenter> extends Fragment implements IView,IFragment {

    protected P presenter;
    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(bindLayout(),container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter = initPresenter();
        if (presenter != null) {
            presenter.attView(this);
        }
        initView();
        initData();
    }

    @Override
    public <T extends View> T findViewById(int id) {
        return view.findViewById(id);
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
