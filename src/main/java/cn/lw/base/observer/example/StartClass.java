package cn.lw.base.observer.example;

/**
 * 项目名称：DesignModel
 * 类 名 称：StartClass
 * 类 描 述：启动类
 * 创建时间：2019-07-26 15:38
 * 创 建 人：Lance.WU
 */
public class StartClass {

    public static void main(String[] args) {
        /**
         *   介绍 将前端后数据发送至后台，如果订阅了用户验证，则进行用户验证，如果订阅了环境验证则进行环境验证。
         * */
        System.out.println("开始业务流程。。。");

        AbstractVerifySubject verifySubject = new ProcessVerifySubject();

//        Observer userCheckObserver = new UserCheckObserver();
//        verifySubject.addObserver(userCheckObserver);
//        Observer roleCheckObserver = new RoleCheckObserver();
//        verifySubject.addObserver(roleCheckObserver);
//        Observer envCheckObserver = new EnvCheckObserver();
//        verifySubject.addObserver(envCheckObserver);

        verifySubject.check();

        System.out.println("执行后续操作。。。");

        System.out.println("结束操作。。。");


    }
}
