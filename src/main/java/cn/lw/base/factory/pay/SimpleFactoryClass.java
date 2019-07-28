package cn.lw.base.factory.pay;


/**
 * 项目名称：DesignModel
 * 类 名 称：SimpleFactoryClass
 * 类 描 述：简单工厂启动类
 * 创建时间：2019-07-28 22:08
 * 创 建 人：Lance.WU
 */
public class SimpleFactoryClass {

    public static void main(String[] args) {

        Pay pay = new Pay();
        pay.pay("cash");
        pay.pay("creditCard");
        pay.pay("voucher");


        pay.payAbstract("cash");
        pay.payAbstract("creditCard");
        pay.payAbstract("voucher");


    }
}
