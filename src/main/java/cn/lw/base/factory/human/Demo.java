package cn.lw.base.factory.human;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：Demo
 * 类 描 述：
 * 创建时间：2019-07-29 23:26
 * 创 建 人：Lance.WU
 */
public class Demo {

    public static void main(String[] args) {
        NuWa nuWa = new NuWa();
        Human m = nuWa.create("M");
        m.say();

    }
}
