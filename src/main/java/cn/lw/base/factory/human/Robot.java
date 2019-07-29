package cn.lw.base.factory.human;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：Robot
 * 类 描 述：机器人
 * 创建时间：2019-07-29 23:23
 * 创 建 人：Lance.WU
 */
public class Robot extends  Human{

    @Override
    public void say() {
        System.out.println("我是机器人！");
    }
}
