package cn.lw.base.factory.encrypt;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：Demo
 * 类 描 述：加密
 * 创建时间：2019-07-30 22:02
 * 创 建 人：Lance.WU
 */
public class Demo {

    public static void main(String[] args) {

        Encrypt encrypt = EncryptFactory.create();
        String content = "passwd";
        System.out.println("RSA加密：");
        String encryptStr = encrypt.encrypt(content);
        System.out.println(content + "加密后的数据：" + encryptStr);
        String decryptStr = encrypt.decrypt(encryptStr);
        System.out.println(encryptStr + "解密后的数据：" + decryptStr);


        Encrypt aes = EncryptFactory.create("aes");
        encryptStr = aes.encrypt(content);
        System.out.println("AES加密：");
        System.out.println(content + "加密后的数据：" + encryptStr);
        decryptStr = aes.decrypt(encryptStr);
        System.out.println(encryptStr + "解密后的数据：" + decryptStr);

    }
}
