package cn.lw.base.factory.authorityManage;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：User
 * 类 描 述：用户信息内容
 * 创建时间：2019-07-29 23:00
 * 创 建 人：Lance.WU
 */
public abstract class User {

    public void sameOpertaion() {
        System.out.println("修改个人信息！");
    }

    public abstract void diffOperation();


}
