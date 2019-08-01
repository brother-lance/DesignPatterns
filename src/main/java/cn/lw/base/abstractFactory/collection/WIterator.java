package cn.lw.base.abstractFactory.collection;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：WIterator
 * 类 描 述：迭代器
 * 创建时间：2019-08-01 23:19
 * 创 建 人：Lance.WU
 */
public interface WIterator<E> {

    boolean hasNext();

    E next();


}
