package com.bwie.week3.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.bwie.week3.R;
import com.bwie.week3.base.BaseActivity;
import com.bwie.week3.base.BasePresenter;
import com.bwie.week3.contract.IHomeContract;
import com.bwie.week3.model.Bean;
import com.bwie.week3.presenter.HomePresenter;

import java.util.List;

public class MainActivity extends BaseActivity<HomePresenter> implements IHomeContract.IView {

    private Bean.ResultBean resultBean;

    @Override
    protected void initData() {
        mPresenter.getHomeData();
    }

    @Override
    protected void initView() {

    }

    @Override
    protected HomePresenter providePresenter() {
        return new HomePresenter();
    }

    @Override
    protected int layoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void onHomeSuccess(Bean bean) {
        List<Bean.ResultBean> result = bean.getResult();
        for (int i = 0; i < result.size(); i++) {
            resultBean = result.get(i);

        }
        Toast.makeText(this, ""+resultBean, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onHomeFailure(Throwable throwable) {

    }
}
