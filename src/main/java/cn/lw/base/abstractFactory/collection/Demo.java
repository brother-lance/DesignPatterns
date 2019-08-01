package cn.lw.base.abstractFactory.collection;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：Demo
 * 类 描 述： 测试类
 * 创建时间：2019-08-01 23:21
 * 创 建 人：Lance.WU
 */
public class Demo {

    public static void main(String[] args) {
        //
        WList<?> list = new WLinkedList();
        WIterator<?> iterator = list.iterator();
        iterator.next();

    }
}
