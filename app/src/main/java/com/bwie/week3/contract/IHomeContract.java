package com.bwie.week3.contract;

import com.bwie.week3.model.Bean;

/*
 *@auther:王彦敏
 *@Date: 2019/12/30
 *@Time:19:40
 *@Description:
 * */
public interface IHomeContract {
    interface IView{
        void  onHomeSuccess(Bean bean);
        void  onHomeFailure(Throwable throwable);

    }

    interface IPresenter{
        void getHomeData();
    }
    interface IModel{
        void getHomeData(IHomeCallback iHomeCallback);
        interface IHomeCallback{
            void  onHomeSuccess(Bean bean);
            void  onHomeFailure(Throwable throwable);

        }

    }



}
