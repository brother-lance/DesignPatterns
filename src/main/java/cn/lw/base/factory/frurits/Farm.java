package cn.lw.base.factory.frurits;

/**
 * 项目名称：DesignModel
 * 类 名 称：Farm
 * 类 描 述：农场
 * 创建时间：2019-07-28 21:51
 * 创 建 人：Lance.WU
 */
public class Farm {

    /**
     * 根据类型创建水果
     * @param type 类型
     * @return 返回水果类
     */
    public Fruits create(String type) {
        if ("apple".equals(type))
            return new Apple();
        if ("orange".equals(type))
            return new Orange();
        if ("banana".equals(type))
            return new Banana();
        return null;
    }
}
