package cn.lw.base.observer;

/**
 * 项目名称：DesignModel
 * 类 名 称：Observer
 * 类 描 述：观察者
 * 创建时间：2019-07-26 14:53
 * 创 建 人：Lance.WU
 */
public interface Observer {

    // 更新消费
    void update(int version);

}
