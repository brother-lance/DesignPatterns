package cn.lw.base.abstractFactory.collection;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：WCollection
 * 类 描 述：集合接口
 * 创建时间：2019-08-01 23:18
 * 创 建 人：Lance.WU
 */
public interface WCollection<E> {

    // 迭代
    WIterator<E> iterator();

}
