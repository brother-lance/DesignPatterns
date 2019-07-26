package cn.lw.base.observer.example;

/**
 * 项目名称：DesignModel
 * 类 名 称：ProcessVerifySubject
 * 类 描 述：业务流程验证
 * 创建时间：2019-07-26 16:28
 * 创 建 人：Lance.WU
 */
public class ProcessVerifySubject extends AbstractVerifySubject {


    public void init() {
        addObserver(new UserCheckObserver());
        addObserver(new RoleCheckObserver());
        addObserver(new EnvCheckObserver());
    }

    @Override
    public void check() {
        this.init();
        System.out.println("开始进行验证");
        super.notifyObserver();
    }


}
