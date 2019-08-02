package cn.lw.base.abstractFactory.electronic;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：HaierAirConditioner
 * 类 描 述：海尔空调
 * 创建时间：2019-08-02 22:43
 * 创 建 人：Lance.WU
 */
public class HaierAirConditioner implements  AirConditioner {

    @Override
    public void changeTemperature() {
        System.out.println("海尔空调温度改变是。。。");
    }
}
