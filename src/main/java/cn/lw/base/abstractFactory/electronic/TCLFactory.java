package cn.lw.base.abstractFactory.electronic;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：TCLFactory
 * 类 描 述：熊猫工厂
 * 创建时间：2019-08-02 22:46
 * 创 建 人：Lance.WU
 */
public class TCLFactory implements  EFacotry {

    @Override
    public Tevesition produceTevesition() {
        System.out.println("创建熊猫电视机");
        return new TCLTevesition();
    }

    @Override
    public AirConditioner produceAirConditioner() {
        System.out.println("创建熊猫空调");
        return new TCLAirConditioner();
    }
}
