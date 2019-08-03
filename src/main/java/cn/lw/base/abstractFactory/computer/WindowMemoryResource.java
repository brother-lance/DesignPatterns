package cn.lw.base.abstractFactory.computer;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：WindowMemoryResource
 * 类 描 述：windos 内存
 * 创建时间：2019-08-03 12:00
 * 创 建 人：Lance.WU
 */
public class WindowMemoryResource extends AbtractMemoryResource {
    @Override
    public void run() {
        System.out.println("window 内存资源运行中");
    }
}
