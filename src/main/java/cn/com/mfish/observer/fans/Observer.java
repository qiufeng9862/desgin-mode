package cn.com.mfish.observer.fans;

/**
 * @author ：qiufeng
 * @description：观察者接口
 * @date ：2022/4/4 17:15
 */
public interface Observer {
    //接收通知
    void receiveNotify(String name);
}
