package cn.lw.base.abstractFactory.db;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：OracleFactory
 * 类 描 述：mysql连接工厂
 * 创建时间：2019-08-02 22:59
 * 创 建 人：Lance.WU
 */
public class OracleFactory implements  DBFactory {

    @Override
    public Connection createConnect() {
        return new OracleConnection();
    }

    @Override
    public Statement createStatement() {
        return new OracleStatement();
    }
}
