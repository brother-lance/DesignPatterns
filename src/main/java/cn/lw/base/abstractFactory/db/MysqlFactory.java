package cn.lw.base.abstractFactory.db;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：MysqlFactory
 * 类 描 述：mysql连接工厂
 * 创建时间：2019-08-02 23:00
 * 创 建 人：Lance.WU
 */
public class MysqlFactory implements  DBFactory {

    @Override
    public Connection createConnect() {
        return new MysqlConnection();
    }

    @Override
    public Statement createStatement() {
        return new MysqlStatement();
    }
}
