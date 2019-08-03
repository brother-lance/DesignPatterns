package cn.lw.base.abstractFactory.computer;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：PCFactory
 * 类 描 述：电脑工厂
 * 创建时间：2019-08-03 11:50
 * 创 建 人：Lance.WU
 */
public interface PCFactory {

    AbtractMemoryResource produceMemory();

    AbstractCPUResource produceCPU();

}
