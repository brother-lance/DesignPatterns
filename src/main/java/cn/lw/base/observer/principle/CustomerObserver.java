package cn.lw.base.observer.principle;

/**
 * 项目名称：DesignModel
 * 类 名 称：CustomerObserver
 * 类 描 述：观察者
 * 创建时间：2019-07-26 15:24
 * 创 建 人：Lance.WU
 */
public class CustomerObserver implements  Observer {

    // observer name
    private String name;

    private int version;

    public CustomerObserver(String name){
        this.name = name;
    }

    @Override
    public void update(int version) {
        this.version = version;
        System.out.println("杂志社出新版本了");
        this.buy();

    }

    public void buy(){
        System.out.println(name + "购买了第" + version + "期的杂志");
    }
}
