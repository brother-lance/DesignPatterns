package cn.lw.base.builder.example;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：ConcreteBuilder
 * 类 描 述：真实的建造者
 * 创建时间：2019-08-03 12:19
 * 创 建 人：Lance.WU
 */
public class ConcreteBuilder extends Builder {

    @Override
    public void buildPartA() {
        System.out.println("构建A部份");
    }

    @Override
    public void buildPartB() {
        System.out.println("构建B部份");
    }

    @Override
    public void buildPartC() {
        System.out.println("构建C部份");
    }
}
