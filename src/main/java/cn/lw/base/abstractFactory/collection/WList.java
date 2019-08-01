package cn.lw.base.abstractFactory.collection;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：WList
 * 类 描 述：List集合接口
 * 创建时间：2019-08-01 23:33
 * 创 建 人：Lance.WU
 */
public interface WList<E> extends WCollection<E> {

    @Override
    WIterator<E> iterator();

    WListIterator<E> listIterator();

    WListIterator<E> WListIterator(int index);
}
