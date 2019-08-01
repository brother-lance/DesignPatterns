package cn.lw.base.abstractFactory.example;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：ConcreteProduct
 * 类 描 述：真实产品
 * 创建时间：2019-08-01 22:11
 * 创 建 人：Lance.WU
 */
public class ConcreteProduct extends Product {

    @Override
    public void property() {
        System.out.println("我是真实产品属性。");
    }
}
