package cn.lw.base.factory.tv;

/**
 * 项目名称：DesignModel
 * 类 名 称：HaierTV
 * 类 描 述：海尔TV
 * 创建时间：2019-07-28 22:25
 * 创 建 人：Lance.WU
 */
public class TCLTV implements  TV {

    @Override
    public void play() {
        System.out.println("TCLTV");
    }
}
