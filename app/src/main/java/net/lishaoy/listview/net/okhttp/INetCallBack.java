package net.lishaoy.listview.net.okhttp;

public interface INetCallBack {
    void onSuccess(String response);
    void onFailed(Throwable e);
}
