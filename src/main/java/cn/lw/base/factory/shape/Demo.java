package cn.lw.base.factory.shape;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：Demo
 * 类 描 述：
 * 创建时间：2019-07-30 15:47
 * 创 建 人：Lance.WU
 */
public class Demo {

    public static void main(String[] args) throws Exception {

        Shape shape = ShapeFactory.create();

        shape.count();
    }
}
