package cn.lw.base.abstractFactory.pay;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：CreditCardFactory
 * 类 描 述：信用卡工厂
 * 创建时间：2019-08-01 22:21
 * 创 建 人：Lance.WU
 */
public class CreditCardFactory extends PayFactory {

    @Override
    PayType useType() {
        return new CreditCardPayType();
    }
}
