package cn.lw.base.abstractFactory.db;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：DBFactory
 * 类 描 述：数据库工厂
 * 创建时间：2019-08-02 22:58
 * 创 建 人：Lance.WU
 */
public interface DBFactory {

    Connection createConnect();

    Statement createStatement();
}
