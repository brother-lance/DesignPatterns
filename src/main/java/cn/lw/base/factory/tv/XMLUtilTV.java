package cn.lw.base.factory.tv;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：XMLUtilTV
 * 类 描 述：读取文件内容
 * 创建时间：2019-07-29 22:42
 * 创 建 人：Lance.WU
 */
public class XMLUtilTV {

    public static String getBranchName() {
        try {

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();


            String path = XMLUtilTV.class.getResource("/").getPath();


            Document document = builder.parse(new File(path + "config/configTV.xml"));
            NodeList classNode = document.getElementsByTagName("branchName");
            Node firstChild = classNode.item(0).getFirstChild();
            String branchName = firstChild.getNodeValue().trim();
            return branchName;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
