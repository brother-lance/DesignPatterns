package cn.lw.base.abstractFactory.electronic;

import cn.lw.base.abstractFactory.util.XmlUtil;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：Demo
 * 类 描 述： 测试类
 * 创建时间：2019-08-02 22:48
 * 创 建 人：Lance.WU
 */
public class Demo {

    public static void main(String[] args) {

        EFacotry facotry = XmlUtil.getBean("config_ele.xml", EFacotry.class);
        facotry.produceAirConditioner().changeTemperature();
        facotry.produceTevesition().play();
    }
}
