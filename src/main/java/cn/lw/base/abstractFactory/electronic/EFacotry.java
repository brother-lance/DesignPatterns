package cn.lw.base.abstractFactory.electronic;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：EFacotry
 * 类 描 述：电子工厂
 * 创建时间：2019-08-02 22:35
 * 创 建 人：Lance.WU
 */
public interface EFacotry {

    Tevesition produceTevesition();

    AirConditioner produceAirConditioner();

}
