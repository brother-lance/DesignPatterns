package cn.lw.base.abstractFactory.db;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：OracleStatement
 * 类 描 述：oracle执行器
 * 创建时间：2019-08-02 22:56
 * 创 建 人：Lance.WU
 */
public class OracleStatement implements  Statement{

    @Override
    public void run() {
        System.out.println("运行oracle SQL语句");
    }
}
