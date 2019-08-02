package cn.lw.base.abstractFactory.electronic;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：HaierTevesition
 * 类 描 述：海尔产品
 * 创建时间：2019-08-02 22:37
 * 创 建 人：Lance.WU
 */
public class HaierTevesition implements  Tevesition {

    @Override
    public void play() {
        System.out.println("海尔电视机播放中。。。");
    }
}
