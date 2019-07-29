package cn.lw.base.factory.authorityManage;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：Manager
 * 类 描 述：管理者
 * 创建时间：2019-07-29 23:03
 * 创 建 人：Lance.WU
 */
public class Adminstrator extends User {

    public Adminstrator() {
        System.out.println("创建管理员对象！");
    }

    @Override
    public void diffOperation() {
        System.out.println("管理拥有创建和t请假条权限！");
    }
}
