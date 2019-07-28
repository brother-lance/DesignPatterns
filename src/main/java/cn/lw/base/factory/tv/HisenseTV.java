package cn.lw.base.factory.tv;

/**
 * 项目名称：DesignModel
 * 类 名 称：HisenseTV
 * 类 描 述：海斯特委
 * 创建时间：2019-07-28 22:26
 * 创 建 人：Lance.WU
 */
public class HisenseTV implements TV {

    @Override
    public void play() {
        System.out.println("创建海信TV");
    }
}
