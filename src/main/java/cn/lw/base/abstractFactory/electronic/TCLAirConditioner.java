package cn.lw.base.abstractFactory.electronic;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：HaierAirConditioner
 * 类 描 述：熊猫空调
 * 创建时间：2019-08-02 22:43
 * 创 建 人：Lance.WU
 */
public class TCLAirConditioner implements  AirConditioner {

    @Override
    public void changeTemperature() {
        System.out.println("熊猫空调温度改变是。。。");
    }
}
