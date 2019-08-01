package cn.lw.base.abstractFactory.util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：XmlUtil
 * 类 描 述：xml工具类
 * 创建时间：2019-08-01 22:28
 * 创 建 人：Lance.WU
 */
public class XmlUtil {

    public static Object getBean(String fileName) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            String path = XmlUtil.class.getResource("/").getPath();
            Document docment = builder.parse(new File(path + "/abstractFactory/" + fileName));
            NodeList list = docment.getElementsByTagName("className");
            Node node = list.item(0).getFirstChild();
            String className = node.getNodeValue();

            System.out.println("配置文件读取内容：" + className);
            // 反射创建类
            Class<?> aClass = Class.forName(className);
            return aClass.newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static <T> T getBean(String fileName, Class<T> t) {
        return (T) getBean(fileName);
    }
}
