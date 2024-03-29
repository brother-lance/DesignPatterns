package cn.lw.base.abstractFactory.ball;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：BasketBallFactory
 * 类 描 述：篮球工厂
 * 创建时间：2019-08-01 22:53
 * 创 建 人：Lance.WU
 */
public class BasketballFactory extends BallFactory {

    @Override
    Ball make() {
        System.out.println("篮球工厂生产了篮球");
        return new Basketball();
    }
}
