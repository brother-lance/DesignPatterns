package cn.lw.base.observer.example;


import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：DesignModel
 * 类 名 称：ObserverManagerFactory
 * 类 描 述：观查者管理工厂
 * 创建时间：2019-07-26 16:08
 * 创 建 人：Lance.WU
 */
public class ObserverManagerFactory {

    List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void deleteObserver(Observer o) {
        int index = observers.indexOf(o);
        if (index > 0) {
            observers.remove(o);
        }
    }

    public void notifyObserver() {
        observers.forEach(o->{
            o.check();
        });

    }
}
