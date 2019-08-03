package cn.lw.base.abstractFactory.computer;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：WindowsPCFacotry
 * 类 描 述：Windods工厂
 * 创建时间：2019-08-03 12:05
 * 创 建 人：Lance.WU
 */
public class WindowsPCFacotry implements  PCFactory{

    @Override
    public AbtractMemoryResource produceMemory() {
        System.out.println("windows 工厂生产内存资源");
        return new WindowMemoryResource();
    }

    @Override
    public AbstractCPUResource produceCPU() {
        System.out.println("windows 工厂生产CPU资源");
        return new WindowCPUResource();
    }
}
