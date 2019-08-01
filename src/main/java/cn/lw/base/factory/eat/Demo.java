package cn.lw.base.factory.eat;

/**
 * 项目名称：DesignPatterns
 * <p>
 * <p>
 * 1、FACTORY—追MM少不了请吃饭了，
 * 麦当劳的鸡翅和肯德基的鸡翅都是MM爱吃的东西，
 * 虽然口味有所不同，但不管你带MM去麦当劳或肯德基，
 * 只管向服务员说“来四个鸡翅”就行了。麦当劳和肯德基就是生产鸡翅的Factory。
 * <p>
 * 类 名 称：Demo
 * 类 描 述：测试
 * 创建时间：2019-07-31 19:24
 * 创 建 人：Lance.WU
 */


public class Demo {

    public static void main(String[] args) throws Exception {

        BeautifulGirl girl = new BeautifulGirl();
        FastFood kfc = girl.choose("KFC");
        kfc.produce();


    }
}
