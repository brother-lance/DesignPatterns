package cn.lw.base.factory.encrypt;

import javax.crypto.Cipher;
import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import static cn.lw.base.factory.encrypt.Base64Util.encoder;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：RSAEncrypt
 * 类 描 述：对称加解密
 * 创建时间：2019-07-30 20:43
 * 创 建 人：Lance.WU
 */
public class RSAEncrypt extends Encrypt {

    private String publicKey;

    private String privateKey;

    public RSAEncrypt() {
        init();
    }

    public void init() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");  // 单例
            keyPairGenerator.initialize(1024, new SecureRandom());
            KeyPair keyPair = keyPairGenerator.generateKeyPair();  // 构建密钥对像
            PublicKey aPublic = keyPair.getPublic();
            PrivateKey aPrivate = keyPair.getPrivate();
            publicKey = new String(encoder(aPublic.getEncoded()));
            privateKey = new String(encoder(aPrivate.getEncoded()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }


    @Override
    public String encrypt(String content) {
        byte[] outStr = null;
        try {
            //base64编码的公钥
            byte[] inputByte = Base64Util.decoder(publicKey);
            RSAPublicKey pubKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(inputByte));
            //RSA加密
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.ENCRYPT_MODE, pubKey);
            outStr = Base64Util.encoder(cipher.doFinal(content.getBytes("UTF-8")));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new String(outStr);


    }

    @Override
    public String decrypt(String content) {
        try {
            byte[] inputByte = Base64Util.decoder(content);
            byte[] keyByte = Base64Util.decoder(privateKey);
            RSAPrivateKey priKey = (RSAPrivateKey) KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(keyByte));
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.DECRYPT_MODE, priKey);
            return new String(cipher.doFinal(inputByte));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
