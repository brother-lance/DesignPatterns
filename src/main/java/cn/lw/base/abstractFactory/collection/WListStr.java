package cn.lw.base.abstractFactory.collection;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Objects;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：WListStr
 * 类 描 述：集合
 * 创建时间：2019-08-02 00:27
 * 创 建 人：Lance.WU
 */
public class WListStr<E> implements WListIterator<E> {


    transient int size = 0;

    private E prev;

    private E item;

    private E next;

    @Override
    public boolean hasNext() {
        return Objects.nonNull(next);
    }

    @Override
    public E next() {
        System.out.println("获取下一个对像");
        return next;
    }

    @Override
    public boolean hasPrev() {
        return Objects.nonNull(prev);
    }

    @Override
    public E prev() {
        return prev;

    }

    // 创建一个存储链表对像
    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    public WListStr() {

    }

    public WListStr(int index) {
        super();
    }
}
