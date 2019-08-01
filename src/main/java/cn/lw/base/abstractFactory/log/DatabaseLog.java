package cn.lw.base.abstractFactory.log;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：DatabaseLog
 * 类 描 述：数据库日志
 * 创建时间：2019-08-01 23:01
 * 创 建 人：Lance.WU
 */
public class DatabaseLog implements Log {

    @Override
    public void writeLog() {
        System.out.println("数据库日志写入！");
    }
}
