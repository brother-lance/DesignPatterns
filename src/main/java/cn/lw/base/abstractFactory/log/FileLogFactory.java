package cn.lw.base.abstractFactory.log;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：DatabaseLogFactory
 * 类 描 述：文件日志工厂
 * 创建时间：2019-08-01 23:03
 * 创 建 人：Lance.WU
 */
public class FileLogFactory extends LogFactory {

    @Override
    Log createLog() {
        System.out.println("创建文件日志！");
        return new FileLog();
    }
}
