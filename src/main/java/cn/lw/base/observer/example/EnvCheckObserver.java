package cn.lw.base.observer.example;

/**
 * 项目名称：DesignModel
 * 类 名 称：EnvCheckObserver
 * 类 描 述：环境信息验证
 * 创建时间：2019-07-26 16:26
 * 创 建 人：Lance.WU
 */
public class EnvCheckObserver implements  Observer {

    @Override
    public void check() {
        System.out.println("验证环境信息。。。。");
    }
}
