package cn.lw.base.observer;

/**
 * 项目名称：DesignModel
 * 类 名 称：Subject
 * 类 描 述：主题
 * 创建时间：2019-07-26 14:52
 * 创 建 人：Lance.WU
 */
public interface Subject {

    // 添加观察者
    void addObserver(Observer o);

    // 删除观察者
    void deleteObserver(Observer o);

    // 当主题方法改变时，这个方法被调用，通知所有的观察者
    void notifyObserver();
}
