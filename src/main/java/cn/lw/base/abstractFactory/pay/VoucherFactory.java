package cn.lw.base.abstractFactory.pay;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：VoucherFactory
 * 类 描 述：劵支付工厂
 * 创建时间：2019-08-01 22:25
 * 创 建 人：Lance.WU
 */
public class VoucherFactory extends  PayFactory {

    @Override
    PayType useType() {
        return new VoucherPayType();
    }
}
