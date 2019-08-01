package cn.lw.base.abstractFactory.pay;

import cn.lw.base.abstractFactory.util.XmlUtil;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：Demo
 * 类 描 述：测试类
 * 创建时间：2019-08-01 22:28
 * 创 建 人：Lance.WU
 */
public class Demo {

    public static void main(String[] args) {
        PayFactory factory = (PayFactory) XmlUtil.getBean("config_pay.xml");
        PayType payType = factory.useType();
        payType.pay();

    }
}
