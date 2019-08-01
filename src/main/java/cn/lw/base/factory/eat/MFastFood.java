package cn.lw.base.factory.eat;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：MFastFood
 * 类 描 述：麦当劳速食店
 * 创建时间：2019-07-31 19:19
 * 创 建 人：Lance.WU
 */
public class MFastFood extends  FastFood {

    @Override
    public void produce() {
        System.out.println("制做麦当劳鸡翅");
    }
}
