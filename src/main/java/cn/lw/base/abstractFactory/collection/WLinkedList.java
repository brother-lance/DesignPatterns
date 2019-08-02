package cn.lw.base.abstractFactory.collection;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：WLinkedList
 * 类 描 述： 有序集群
 * 创建时间：2019-08-01 23:51
 * 创 建 人：Lance.WU
 */
public class WLinkedList<E> implements WList<E> {

    @Override
    public WIterator<E> iterator() {
        System.out.println("获取集合的迭代器");
        return new WListStr<>();
    }

    @Override
    public WListIterator<E> listIterator() {
        System.out.println("获取集合的迭代器");
        return new WListStr<>();
    }

    @Override
    public WListIterator<E> WListIterator(int index) {
        System.out.println("获取集合的迭代器");
        return new WListStr<>(index);
    }

}