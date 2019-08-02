package cn.lw.base.abstractFactory.electronic;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：HaierFactory
 * 类 描 述：海尔工厂
 * 创建时间：2019-08-02 22:46
 * 创 建 人：Lance.WU
 */
public class HaierFactory implements  EFacotry {

    @Override
    public Tevesition produceTevesition() {
        return new HaierTevesition();
    }

    @Override
    public AirConditioner produceAirConditioner() {
        return new HaierAirConditioner();
    }
}
