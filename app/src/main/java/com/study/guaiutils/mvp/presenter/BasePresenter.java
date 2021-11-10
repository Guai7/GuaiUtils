package com.study.guaiutils.mvp.presenter;

import com.blankj.utilcode.util.RegexUtils;
import com.study.guaiutils.mvp.model.IModel;
import com.study.guaiutils.mvp.view.IView;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * +----------------------------------------------------------------------
 * | 项   目: GuaiCodeUtils
 * +----------------------------------------------------------------------
 * | 包   名: com.study.guaiutils.mvp.presenter
 * +----------------------------------------------------------------------
 * | 类   名: BasePresenter
 * +----------------------------------------------------------------------
 * | 时　　间: 2021/11/10 16:22
 * +----------------------------------------------------------------------
 * | 代码创建: 王益德
 * +----------------------------------------------------------------------
 * | 版本信息: V1.0.0
 * +----------------------------------------------------------------------
 * | 功能描述:
 * +----------------------------------------------------------------------
 **/
public class BasePresenter<V extends IView,M extends IModel> implements IPresenter {

    protected V view;
    protected M model;

    private CompositeDisposable disposables = new CompositeDisposable();

    public BasePresenter(M model) {
        this.model = model;
    }

    @Override
    public <H extends IView> void attView(H view) {
        this.view = (V) view;
    }

    public void addDisposable(Disposable disposable){
        disposables.add(disposable);
    }

    @Override
    public void destroy() {
        if (model!=null){
            model.destroy();
            model = null;
        }
        if (disposables.size()>0){
            disposables.clear();
        }
    }
}
