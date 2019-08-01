package cn.lw.base.abstractFactory.collection;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：ListIterator
 * 类 描 述：List迭代
 * 创建时间：2019-08-01 23:26
 * 创 建 人：Lance.WU
 */
public interface WListIterator<E> extends  WIterator<E> {


    boolean hasNext();

    E next();

    boolean hasPrev();

    E prev();

}
