package cn.lw.base.abstractFactory.computer;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：MacCPUResource
 * 类 描 述：苹果 CPU资源运行中
 * 创建时间：2019-08-03 11:57
 * 创 建 人：Lance.WU
 */
public class MacCPUResource extends AbstractCPUResource {

    @Override
    public void run() {
        System.out.println("苹果 CPU资源运行中。。。");
    }
}
