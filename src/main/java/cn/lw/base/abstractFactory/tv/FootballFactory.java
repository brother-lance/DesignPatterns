package cn.lw.base.abstractFactory.tv;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：BasketBallFactory
 * 类 描 述：篮球工厂
 * 创建时间：2019-08-01 22:53
 * 创 建 人：Lance.WU
 */
public class FootballFactory extends BallFactory {

    @Override
    Ball make() {
        System.out.println("足球工厂生产了足球");
        return new Football();
    }
}
