package cn.lw.base.factory.frurits;

import cn.lw.base.factory.frurits.Farm;

/**
 * 项目名称：DesignModel
 * 类 名 称：SimpleFactoryClass
 * 类 描 述：启动类
 * 创建时间：2019-07-28 21:43
 * 创 建 人：Lance.WU
 */
public class SimpleFactoryClass {

    public static void main(String[] args) {

        Farm farm = new Farm();
        farm.create("apple");
        System.out.println("生产苹果");
        farm.create("orange");
        System.out.println("生产橘子");
        farm.create("banana");
        System.out.println("生产香蕉");

    }
}
