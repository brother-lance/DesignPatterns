package cn.lw.base.factory.authorityManage;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：UserDAO
 * 类 描 述：用户业务类
 * 创建时间：2019-07-29 23:09
 * 创 建 人：Lance.WU
 */
public class UserDAO {

    public int findPermission(String loginName, String loginPwd) {
        if ("zhangsan".equalsIgnoreCase(loginName) && "123456".equalsIgnoreCase(loginPwd)) {
            return 0;
        }
        return -1;
    }
}
