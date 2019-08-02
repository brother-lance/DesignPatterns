package cn.lw.base.abstractFactory.electronic;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：TCLTevesition
 * 类 描 述：熊猫电视机
 * 创建时间：2019-08-02 22:38
 * 创 建 人：Lance.WU
 */
public class TCLTevesition implements Tevesition {

    @Override
    public void play() {
        System.out.println("熊猫电视机播放中。。。");
    }
}
