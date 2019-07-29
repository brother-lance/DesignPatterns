package cn.lw.base.factory.tv;

/**
 * 项目名称：DesignModel
 * 类 名 称：TVFactory
 * 类 描 述：TV工厂
 * 创建时间：2019-07-28 22:27
 * 创 建 人：Lance.WU
 */
public class TVFactory {

    public static TV produceTV(String brand) throws Exception {
        if ("haier".equalsIgnoreCase(brand)) {
            System.out.println("电视机工厂生产了海尔电视机");
            return new HaierTV();
        } else if ("hisense".equalsIgnoreCase(brand)) {
            System.out.println("电视机工厂生产了海信电视机");
            return new HaierTV();
        } else if ("tcl".equalsIgnoreCase(brand)) {
            System.out.println("电视机工厂生产了TCL电视机");
            return new HaierTV();
        }else {
            throw new Exception("对不起，暂时不能生产该产品的电视机");
        }
    }
}
