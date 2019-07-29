package cn.lw.base.factory.authorityManage;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：UserFactory
 * 类 描 述：用户工厂
 * 创建时间：2019-07-29 23:05
 * 创 建 人：Lance.WU
 */
public class UserFactory {

    public static User getUser(int permission) {
        if (0 == permission)
            return new Employee();
        else if (1 == permission)
            return new Manager();
        else if (2 == permission)
            return new Adminstrator();
        return null;
    }
}
