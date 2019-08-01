package cn.lw.base.abstractFactory.pay;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：CashFactory
 * 类 描 述：现金支付工厂
 * 创建时间：2019-08-01 22:18
 * 创 建 人：Lance.WU
 */
public class CashFactory extends PayFactory {

    @Override
    PayType useType() {
        return new CashPayType();

    }
}
