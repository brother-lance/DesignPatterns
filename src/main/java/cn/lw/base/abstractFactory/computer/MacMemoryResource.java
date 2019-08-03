package cn.lw.base.abstractFactory.computer;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：MacMemoryResource
 * 类 描 述：Mac资源运行中
 * 创建时间：2019-08-03 12:01
 * 创 建 人：Lance.WU
 */
public class MacMemoryResource extends AbtractMemoryResource {

    @Override
    public void run() {
        System.out.println("苹果内存资源运行中");
    }
}
