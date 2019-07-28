package cn.lw.base.factory.pay;

/**
 * 项目名称：DesignModel
 * 类 名 称：Pay
 * 类 描 述：支付类
 * 创建时间：2019-07-28 22:09
 * 创 建 人：Lance.WU
 */
public class Pay {

    public void pay(String type) {
        if ("cash".equals(type))
            System.out.println("现金支付");
        else if ("creditCard".equals(type))
            System.out.println("信用卡支付");
        else if ("voucher".equals(type))
            System.out.println("虚拟卡支付");
        else
            System.out.println("其它支付方式");

    }

    public void payAbstract(String type){
        if ("cash".equals(type))
            new Cash();
        else if ("creditCard".equals(type))
            new CreditCard();
        else if ("voucher".equals(type))
            new Voucher();

            // 无
    }
}
