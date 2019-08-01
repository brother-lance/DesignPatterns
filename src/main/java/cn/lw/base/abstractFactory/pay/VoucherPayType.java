package cn.lw.base.abstractFactory.pay;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：VoucherPayType
 * 类 描 述：劵支付
 * 创建时间：2019-08-01 22:20
 * 创 建 人：Lance.WU
 */
public class VoucherPayType extends PayType {

    @Override
    void pay() {
        System.out.printf("劵支付方式");
    }
}
