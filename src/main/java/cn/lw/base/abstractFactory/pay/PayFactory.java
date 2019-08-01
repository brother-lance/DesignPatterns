package cn.lw.base.abstractFactory.pay;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：PayFactory
 * 类 描 述：支付工厂
 * 创建时间：2019-08-01 22:16
 * 创 建 人：Lance.WU
 */
public abstract class PayFactory {

    abstract  PayType useType();
}
