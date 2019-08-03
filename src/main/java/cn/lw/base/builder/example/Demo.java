package cn.lw.base.builder.example;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：Demo
 * 类 描 述：测试
 * 创建时间：2019-08-03 12:25
 * 创 建 人：Lance.WU
 */
public class Demo {

    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.contruct();
    }
}
