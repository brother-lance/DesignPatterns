package cn.lw.base.factory.eat;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：KFCFastFood
 * 类 描 述：肯德基速食店
 * 创建时间：2019-07-31 19:18
 * 创 建 人：Lance.WU
 */
public class KFCFastFood extends FastFood {

    @Override
    public void produce() {
        System.out.println("制做KFC鸡翅");
    }
}
