package cn.lw.base.abstractFactory.tv;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：Football
 * 类 描 述：足球
 * 创建时间：2019-08-01 22:49
 * 创 建 人：Lance.WU
 */
public class Football implements Ball {
    @Override
    public void play() {
        System.out.println("使用足球进行活动！");
    }
}
