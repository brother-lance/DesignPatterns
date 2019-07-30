package cn.lw.base.factory.encrypt;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.print.Doc;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：EncryptFactory
 * 类 描 述：加密工厂
 * 创建时间：2019-07-30 22:03
 * 创 建 人：Lance.WU
 */
public class EncryptFactory {

    public static Encrypt create() {

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            String path = EncryptFactory.class.getResource("/").getPath();
            Document document = builder.parse(new File(path + "/config/configEncrypt.xml"));
            NodeList childNodes = document.getElementsByTagName("encryptType");
            Node node = childNodes.item(0).getFirstChild();
            String type = node.getNodeValue().trim();
            return create(type);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;
    }

    public static Encrypt create(String type) {

        if ("rsa".equalsIgnoreCase(type))
            return new RSAEncrypt();
        else if("aes".equalsIgnoreCase(type))
            return new AESEncrypt();

        return null;


    }
}