package cn.lw.base.abstractFactory.example;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：ConcreteFactory
 * 类 描 述：真实工厂
 * 创建时间：2019-08-01 22:09
 * 创 建 人：Lance.WU
 */
public class ConcreteFactory extends Factory {


    @Override
    Product make() {
        return new ConcreteProduct();
    }
}
