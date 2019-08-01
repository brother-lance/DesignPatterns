package cn.lw.base.abstractFactory.pay;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：CashPayType
 * 类 描 述：现金支付类型
 * 创建时间：2019-08-01 22:18
 * 创 建 人：Lance.WU
 */
public class CashPayType extends PayType {

    @Override
    void pay() {
        System.out.println("使用现金支付");
    }
}
