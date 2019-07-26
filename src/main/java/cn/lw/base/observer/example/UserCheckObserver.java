package cn.lw.base.observer.example;

/**
 * 项目名称：DesignModel
 * 类 名 称：UserCheckObserver
 * 类 描 述：用户信息验证
 * 创建时间：2019-07-26 16:24
 * 创 建 人：Lance.WU
 */
public class UserCheckObserver implements  Observer {

    @Override
    public void check() {
        System.out.println("验证用户信息。。。");
    }
}
