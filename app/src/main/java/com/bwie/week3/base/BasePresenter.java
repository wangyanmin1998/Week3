package com.bwie.week3.base;

/*
 *@auther:王彦敏
 *@Date: 2019/12/30
 *@Time:19:43
 *@Description:
 * */
public abstract class BasePresenter<V> {
    protected V view;

    public BasePresenter(){
        initModel();
    }

    protected abstract void initModel();

    public void attach(V view){
        this.view=view;
    }

    public void detach(){
        view=null;
    }

}
