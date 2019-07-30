package cn.lw.base.factory.shape;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：ShapeFactory
 * 类 描 述：形状工厂
 * 创建时间：2019-07-30 15:36
 * 创 建 人：Lance.WU
 */
public class ShapeFactory {

    public static Shape create() throws Exception {


        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        String path = ShapeFactory.class.getResource("/").getPath();
        Document parse = builder.parse(new File(path + "config/configShape.xml"));
        NodeList shapeName = parse.getElementsByTagName("shapeName");
        Node firstChild = shapeName.item(0).getFirstChild();
        String nodeValue = firstChild.getNodeValue();

        if ("circle".equalsIgnoreCase(nodeValue)) {
            return new Circle();
        } else if ("square".equalsIgnoreCase(nodeValue))
            return new Square();
        else if ("triangle".equalsIgnoreCase(nodeValue))
            return new Triangle();
        throw new Exception("无法创建形状");


    }
}
