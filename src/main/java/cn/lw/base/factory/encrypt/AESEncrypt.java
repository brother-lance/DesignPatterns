package cn.lw.base.factory.encrypt;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：AESEncrypt
 * 类 描 述：AES加密
 * 创建时间：2019-07-30 22:18
 * 创 建 人：Lance.WU
 */
public class AESEncrypt extends Encrypt {


    private static final String EncryptAlg = "AES";

    private static final String Cipher_Mode = "AES/ECB/PKCS5Padding";

    private static final String Encode = "UTF-8";

    private static final int Secret_Key_Size = 128;  // 密钥的长度

    private static final String Key_Encode = "UTF-8";

    private Key key;


    public AESEncrypt() {
        this.init();
    }

    public void init() {
        key = createKey();
    }

    @Override
    public String encrypt(String content) {
        try {
            Cipher cipher = Cipher.getInstance(Cipher_Mode);
            cipher.init(cipher.ENCRYPT_MODE, key);
            //将加密并编码后的内容解码成字节数组
            byte[] result = cipher.doFinal(content.getBytes());
            return new String(Base64Util.encoder(result));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public String decrypt(String content) {
        try {
            Cipher cipher = Cipher.getInstance(Cipher_Mode);
            cipher.init(cipher.DECRYPT_MODE, key);
            //将加密并编码后的内容解码成字节数组
            byte[] result = cipher.doFinal(Base64Util.decoder(content.getBytes()));
            return new String(result);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Key createKey() {
        try {
            // 生成key
            KeyGenerator keyGenerator;
            //构造密钥生成器，指定为AES算法,不区分大小写
            keyGenerator = KeyGenerator.getInstance(EncryptAlg);
            //生成一个128位的随机源,根据传入的字节数组
            keyGenerator.init(128);
            //产生原始对称密钥
            SecretKey secretKey = keyGenerator.generateKey();
            //获得原始对称密钥的字节数组
            byte[] keyBytes = secretKey.getEncoded();
            // key转换,根据字节数组生成AES密钥
            Key key = new SecretKeySpec(keyBytes, EncryptAlg);
            return key;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }

    }


//    private String doFinal(int cipherType, String content) {
//        Security.addProvider(new BouncyCastleProvider());
//        try {
//            byte[] raw = key.getBytes(Key_Encode);
//            SecretKeySpec skeySpec = new SecretKeySpec(raw, EncryptAlg);
//            Cipher cipher = Cipher.getInstance(Cipher_Mode);//"算法/模式/补码方式"
//            cipher.init(cipherType, skeySpec);
//            byte[] encrypted = cipher.doFinal(content.getBytes(Encode));
//            return new String(Base64Util.encoder(encrypted));//此处使用BASE64做转码功能，同时能起到2次加密的作用。
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
}
