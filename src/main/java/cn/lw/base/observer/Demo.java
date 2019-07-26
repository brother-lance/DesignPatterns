package cn.lw.base.observer;

/**
 * 项目名称：DesignModel
 * 类 名 称：Demo
 * 类 描 述：测试类
 * 创建时间：2019-07-26 15:28
 * 创 建 人：Lance.WU
 */
public class Demo {

    public static void main(String[] args) {

        // create subject
        MagazineSubject subject = new MagazineSubject();

        // create three different observer
        Observer one = new CustomerObserver("A");
        Observer two = new CustomerObserver("A");
        Observer three = new CustomerObserver("A");

        subject.addObserver(one);
        subject.addObserver(two);
        subject.addObserver(three);

        subject.publish();

    }
}
