package cn.lw.base.builder.example;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：Director
 * 类 描 述：指挥着
 * 创建时间：2019-08-03 12:21
 * 创 建 人：Lance.WU
 */
public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    public Product contruct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
