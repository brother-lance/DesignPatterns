package cn.lw.base.builder.example;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：Builder
 * 类 描 述：建造者接口
 * 创建时间：2019-08-03 12:15
 * 创 建 人：Lance.WU
 */
public abstract class Builder {

    protected Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    public Product getResult(){
        return product;
    }

}
