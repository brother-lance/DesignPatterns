package cn.lw.base.factory.encrypt;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：Encrypt
 * 类 描 述：加解密抽像类
 * 创建时间：2019-07-30 20:42
 * 创 建 人：Lance.WU
 */
public abstract class  Encrypt {

    public abstract String encrypt(String content);

    public abstract String decrypt(String content);
}
