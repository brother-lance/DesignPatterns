package cn.lw.base.abstractFactory.computer;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：MemoryResource
 * 类 描 述：内存资源
 * 创建时间：2019-08-03 11:52
 * 创 建 人：Lance.WU
 */
public class MemoryResource implements Resource {

    @Override
    public void run() {
        System.out.println("内存资源运行中");
    }
}
