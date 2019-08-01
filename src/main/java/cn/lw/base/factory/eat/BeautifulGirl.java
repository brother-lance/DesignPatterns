package cn.lw.base.factory.eat;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：BeautifulGril
 * 类 描 述：漂亮美眉
 * 创建时间：2019-07-31 19:21
 * 创 建 人：Lance.WU
 */
public class BeautifulGirl {

    public FastFood choose(String name) throws Exception {
        if ("KFC".equalsIgnoreCase(name))
            return new KFCFastFood();
        else if ("M".equalsIgnoreCase(name))
            return new MFastFood();
        throw new Exception("没有找到速食店");
    }
}
