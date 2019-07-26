package cn.lw.base.observer.example;

/**
 * 项目名称：DesignModel
 * 类 名 称：RoleCheckObserver
 * 类 描 述：验证角色信息
 * 创建时间：2019-07-26 16:26
 * 创 建 人：Lance.WU
 */
public class RoleCheckObserver implements  Observer {

    @Override
    public void check() {
        System.out.println("验证角色信息。。。");
    }
}
