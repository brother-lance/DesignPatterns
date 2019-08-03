package cn.lw.base.abstractFactory.computer;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：MacPCFactory
 * 类 描 述：苹果工厂
 * 创建时间：2019-08-03 12:03
 * 创 建 人：Lance.WU
 */
public class MacPCFactory implements PCFactory {

    @Override
    public AbtractMemoryResource produceMemory() {
        System.out.println("苹果工厂生产出内存条");
        return new MacMemoryResource();
    }

    @Override
    public AbstractCPUResource produceCPU() {
        System.out.println("苹果工厂生产出CPU");
        return new MacCPUResource();
    }
}
