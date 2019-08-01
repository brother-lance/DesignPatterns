package cn.lw.base.abstractFactory.pay;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：CreditCardPayType
 * 类 描 述：信用卡支付方式
 * 创建时间：2019-08-01 22:19
 * 创 建 人：Lance.WU
 */
public class CreditCardPayType extends PayType {

    @Override
    void pay() {
        System.out.println("使用信用卡支付方式");
    }
}
