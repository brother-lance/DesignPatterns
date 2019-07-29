package cn.lw.base.factory.human;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：NuWa
 * 类 描 述：女娲
 * 创建时间：2019-07-29 23:24
 * 创 建 人：Lance.WU
 */
public class NuWa {

    public Human create(String type) {
        if ("M".equalsIgnoreCase(type)) {
            System.out.println("创建男人");
            return new Man();
        } else if ("W".equalsIgnoreCase(type)) {
            System.out.println("创建女人");
            return new Woman();
        } else if ("R".equalsIgnoreCase(type)) {
            System.out.println("创建器机人");
            return new Robot();
        }
        System.out.println("未能创建事物");
        return null;
    }
}
