package cn.lw.base.observer.example;

/**
 * 项目名称：DesignModel
 * 类 名 称：AbstractSubject
 * 类 描 述：订阅主题
 * 创建时间：2019-07-26 15:46
 * 创 建 人：Lance.WU
 */
public  abstract class AbstractVerifySubject implements  Subject {

   private ObserverManagerFactory factory = new ObserverManagerFactory();

    @Override
    public void addObserver(Observer o) {
        factory.addObserver(o);
    }

    @Override
    public void deleteObserver(Observer o) {
        factory.deleteObserver(o);
    }

    @Override
    public void notifyObserver() {
        factory.notifyObserver();
    }

    public abstract void check();
}
