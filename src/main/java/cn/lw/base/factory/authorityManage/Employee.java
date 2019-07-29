package cn.lw.base.factory.authorityManage;


/**
 * 项目名称：DesignPatterns
 * 类 名 称：Employee
 * 类 描 述：员工对象
 * 创建时间：2019-07-29 23:01
 * 创 建 人：Lance.WU
 */
public class Employee extends User {

    public Employee(){
        System.out.println("创建员工对象");
    }

    @Override
    public void diffOperation() {
        System.out.println("员工拥有创建请假条权限");
    }
}
