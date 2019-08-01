package cn.lw.base.abstractFactory.tv;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：HaierTV
 * 类 描 述：海尔电视机
 * 创建时间：2019-08-01 22:45
 * 创 建 人：Lance.WU
 */
public class Basketball implements Ball {

    @Override
    public void play() {
        System.out.println("使用篮球进行活动！");
    }
}
