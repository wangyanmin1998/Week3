package com.bwie.week3.model;

import com.bwie.week3.contract.IHomeContract;
import com.bwie.week3.util.NetUtil;
import com.google.gson.Gson;

/*
 *@auther:王彦敏
 *@Date: 2019/12/30
 *@Time:19:50
 *@Description:
 * */
public class HomeModel implements IHomeContract.IModel {
    @Override
    public void getHomeData(IHomeCallback iHomeCallback) {
        String httpUrl="http://172.17.8.100/small/commodity/v1/bannerShow";
        NetUtil.getInstance().getJsonGet(httpUrl, new NetUtil.MyCallback() {
            @Override
            public void onGetJson(String json) {
                Bean bean = new Gson().fromJson(json, Bean.class);
                iHomeCallback.onHomeSuccess(bean);
            }

            @Override
            public void onError(Throwable throwable) {
                iHomeCallback.onHomeFailure(throwable);
            }
        });


    }
}
