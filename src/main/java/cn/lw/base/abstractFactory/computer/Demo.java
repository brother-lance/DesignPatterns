package cn.lw.base.abstractFactory.computer;

import cn.lw.base.abstractFactory.util.XmlUtil;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：Demo
 * 类 描 述：测试类
 * 创建时间：2019-08-03 12:06
 * 创 建 人：Lance.WU
 */
public class Demo {

    public static void main(String[] args) {
        PCFactory factory = XmlUtil.getBean("config_pc.xml", PCFactory.class);
        factory.produceCPU().run();
        factory.produceMemory().run();

    }
}
