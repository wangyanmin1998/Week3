package com.bwie.week3.presenter;

import com.bwie.week3.base.BasePresenter;
import com.bwie.week3.contract.IHomeContract;
import com.bwie.week3.model.Bean;
import com.bwie.week3.model.HomeModel;

/*
 *@auther:王彦敏
 *@Date: 2019/12/30
 *@Time:19:49
 *@Description:
 * */
public class HomePresenter extends BasePresenter<IHomeContract.IView> implements IHomeContract.IPresenter {

    private HomeModel homeModel;

    @Override
    protected void initModel() {
        homeModel = new HomeModel();
    }

    @Override
    public void getHomeData() {
        homeModel.getHomeData(new IHomeContract.IModel.IHomeCallback() {
            @Override
            public void onHomeSuccess(Bean bean) {
                view.onHomeSuccess(bean);
            }

            @Override
            public void onHomeFailure(Throwable throwable) {
                view.onHomeFailure(throwable);
            }
        });
    }
}
