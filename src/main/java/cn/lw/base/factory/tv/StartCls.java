package cn.lw.base.factory.tv;

/**
 * 项目名称：DesignModel
 * 类 名 称：StartCls
 * 类 描 述：
 * 创建时间：2019-07-28 22:32
 * 创 建 人：Lance.WU
 */
public class StartCls {
    public static void main(String[] args) throws Exception {
        TVFactory factory = new TVFactory();
        factory.produceTV("haier");

        /**** 第一种方法获取 ********/
        String barnchName = XMLUtilTV.getBranchName();
        TV tv = factory.produceTV(barnchName);
        System.out.println("tv:" + tv);
    }
}
