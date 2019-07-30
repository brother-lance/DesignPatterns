package cn.lw.base.factory.encrypt;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

    private static final int Secret_Key_Size = 32;  // 密钥的长度

    private static final String Key_Encode = "UTF-8";

    private static final String key = "A1B2C3D4E5F6G7H8A1B2C3D4E5F6G7H8";


    @Override
    public String encrypt(String content) {
        return doFinal(Cipher.ENCRYPT_MODE, content);
    }

    @Override
    public String decrypt(String content) {
        return doFinal(Cipher.DECRYPT_MODE, content);
    }

    private String doFinal(int cipherType, String content) {
        Security.addProvider(new BouncyCastleProvider());
        try {
            byte[] raw = key.getBytes(Key_Encode);
            SecretKeySpec skeySpec = new SecretKeySpec(raw, EncryptAlg);
            Cipher cipher = Cipher.getInstance(Cipher_Mode);//"算法/模式/补码方式"
            cipher.init(cipherType, skeySpec);
            byte[] encrypted = cipher.doFinal(content.getBytes(Encode));
            return new String(Base64Util.encoder(encrypted));//此处使用BASE64做转码功能，同时能起到2次加密的作用。

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
