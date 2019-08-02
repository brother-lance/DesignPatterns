package cn.lw.base.abstractFactory.db;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：OracleConnection
 * 类 描 述：oracle连接
 * 创建时间：2019-08-02 22:54
 * 创 建 人：Lance.WU
 */
public class OracleConnection implements Connection {

    @Override
    public void conn() {
        System.out.println("创建oracle连接");
    }
}
