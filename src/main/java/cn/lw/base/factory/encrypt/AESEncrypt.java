package cn.lw.base.factory.encrypt;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.Security;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：AESEncrypt
 * 类 描 述：AES加密
 * 创建时间：2019-07-30 22:18
 * 创 建 人：Lance.WU
 */
public class AESEncrypt extends Encrypt {


    private static final String EncryptAlg = "AES";

    private static final String Cipher_Mode = "AES/ECB/PKCS7Padding";

    private static final String Encode = "UTF-8";

    private static final int Secret_Key_Size = 128;  // 密钥的长度

    private static final String Key_Encode = "UTF-8";

    private static final String key = "A1B2C3D4E5F6G7H8A1B2C3D4E5F6G7H8";


    @Override
    public String encrypt(String content) {

        try {
            KeyGenerator kgen = KeyGenerator.getInstance(EncryptAlg);// 创建AES的Key生产者

            kgen.init(Secret_Key_Size, new SecureRandom(key.getBytes()));// 利用用户密码作为随机数初始化出
            // 128位的key生产者
            //加密没关系，SecureRandom是生成安全随机数序列，password.getBytes()是种子，只要种子相同，序列就一样，所以解密只要有password就行

            SecretKey secretKey = kgen.generateKey();// 根据用户密码，生成一个密钥

            byte[] enCodeFormat = secretKey.getEncoded();// 返回基本编码格式的密钥，如果此密钥不支持编码，则返回
            // null。

            SecretKeySpec key = new SecretKeySpec(enCodeFormat, EncryptAlg);// 转换为AES专用密钥

            Cipher cipher = Cipher.getInstance(EncryptAlg);// 创建密码器

            byte[] byteContent = content.getBytes(Encode);

            cipher.init(Cipher.ENCRYPT_MODE, key);// 初始化为加密模式的密码器

            byte[] result = cipher.doFinal(Base64Util.encoder(byteContent));// 加密

            return new String(result);

        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }
        return null;

        // return doFinal(Cipher.ENCRYPT_MODE, content);
    }

    @Override
    public String decrypt(String content) {
        try {
            KeyGenerator kgen = KeyGenerator.getInstance(EncryptAlg);// 创建AES的Key生产者
            kgen.init(Secret_Key_Size, new SecureRandom(key.getBytes()));
            SecretKey secretKey = kgen.generateKey();// 根据用户密码，生成一个密钥
            byte[] enCodeFormat = secretKey.getEncoded();// 返回基本编码格式的密钥
            SecretKeySpec key = new SecretKeySpec(enCodeFormat, EncryptAlg);// 转换为AES专用密钥
            Cipher cipher = Cipher.getInstance(EncryptAlg);// 创建密码器
            cipher.init(Cipher.DECRYPT_MODE, key);// 初始化为解密模式的密码器
            byte[] result = cipher.doFinal(Base64Util.decoder(content.getBytes()));
            return new String(result); // 明文
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }
        return null;
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
