package cn.lw.base.abstractFactory.computer;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：CPUResource
 * 类 描 述：CPU资源
 * 创建时间：2019-08-03 11:52
 * 创 建 人：Lance.WU
 */
public class WindowCPUResource extends AbstractCPUResource {

    @Override
    public void run() {
        System.out.println("window CPU资源运行中。。。");
    }
}
