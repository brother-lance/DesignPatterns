package cn.lw.base.abstractFactory.log;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：FileLog
 * 类 描 述：文件日志写入
 * 创建时间：2019-08-01 23:02
 * 创 建 人：Lance.WU
 */
public class FileLog implements Log {

    @Override
    public void writeLog() {
        System.out.println("文件日志写入!");
    }
}
