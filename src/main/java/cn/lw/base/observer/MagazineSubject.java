package cn.lw.base.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：DesignModel
 * 类 名 称：MagazineSubject
 * 类 描 述：杂志主题
 * 创建时间：2019-07-26 15:02
 * 创 建 人：Lance.WU
 */
public class MagazineSubject implements Subject {

    // store observer
    List<Observer> observers = new ArrayList<>();

    // magazine version
    private int version;

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    // delete observer
    @Override
    public void deleteObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i > 0) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        observers.forEach(e -> {
                    e.update(version);
                }
        );
    }

    // notify Magazine new version
    public void publish(){
        // new version
        this.version++;
        // notify
        this.notifyObserver();
    }

}
