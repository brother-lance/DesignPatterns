package cn.lw.base.factory.encrypt;

import java.util.Base64;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：Base64Util
 * 类 描 述：
 * 创建时间：2019-07-30 21:55
 * 创 建 人：Lance.WU
 */
public class Base64Util {

    public static byte[] encoder(byte[] content) {
        Base64.Encoder encoder = Base64.getEncoder();
        return encoder.encode(content);
    }

    public static byte[] encoder(String content) {
        return encoder(content.getBytes());
    }

    public static byte[] decoder(byte[] content) {
        Base64.Decoder decoder = Base64.getDecoder();
        return decoder.decode(content);
    }

    public static byte[] decoder(String content) {
        return decoder(content.getBytes());
    }
}
