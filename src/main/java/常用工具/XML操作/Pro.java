package 常用工具.XML操作;


import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

public class Pro
{

    public static void main(String[] args) throws Exception
    {
        // 打印xml
        // ShowXML();
        // addElelment();
        // getInfo();
        // removeElement();
        // ====================================复习
        // findElement();
        addElementNew();
    }

    // 输出xml文档
    public static void ShowXML() throws Exception
    {
        SAXReader reader = new SAXReader();
        Document document = reader.read("src//常用工具.XML操作//Person.xml");
        System.out.println(document.asXML());
    }

    // 遍历所有人的信息
    public static void getInfo() throws Exception
    {
        SAXReader reader = new SAXReader();
        Document document = reader.read("src//常用工具.XML操作//Person.xml");
        Element root = document.getRootElement();
        Iterator iterator = root.elementIterator("Person");// 也可以不含参数
        while (iterator.hasNext())
        {
            Element person = (Element) iterator.next();
            String id = person.attributeValue("id");
            String name = person.elementText("name");
            System.out.println(name);
        }
    }

    // 增加一个节点
    public static void addElelment() throws Exception
    {
        SAXReader reader = new SAXReader();
        Document document = reader.read("src//常用工具.XML操作//Person.xml");
        Element root = document.getRootElement();// 找到根节点
        Element person = root.addElement("Person");// 根节点添加节点person
        person.addAttribute("id", "9").addAttribute("class", "shuxig1").addAttribute("class2", "shuxing2");// 可以连续添加属性
        person.addElement("name").addText("新添加");// person节点添加新节点并且添加文本
        person.addElement("age").addText("56");
        OutputFormat outputFormat = OutputFormat.createPrettyPrint();// 定义好写入的格式
        outputFormat.setEncoding("gb2312");// 设置xml文档的字符集
        XMLWriter xmlWriter = new XMLWriter(new PrintWriter("src//常用工具.XML操作//Person_copy.xml", "gb2312"), outputFormat);// 定义好往哪写,写的格式
        xmlWriter.write(document);
        xmlWriter.close();
    }

    // 删除一个节点，使用XPath删除,比如删除xml文件内的“美洲豹”一项
    public static void removeElement() throws Exception
    {
        SAXReader reader = new SAXReader();
        Document document = reader.read("src//常用工具.XML操作//Person.xml");
        String xpath = "//Animal[@name='meizhoubao']";
        Element meizhoubao = (Element) document.selectSingleNode(xpath);
        System.out.println(meizhoubao.getParent().remove(meizhoubao));

    }

    // ===============================================================================复习
    private static void readXmlAsString() throws Exception
    {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("src//常用工具.XML操作//Person.xml");
        System.out.println(document.asXML());
        Element root = document.getRootElement();
        Iterator iterator = root.elementIterator();
        while (iterator.hasNext())
        {
            Element element = (Element) iterator.next();
            System.out.println(element.getName());
        }
    }

    private static void findElement() throws Exception
    {
        // 需求：输出所有属性叫“jinsihou”d的元素
        SAXReader reader = new SAXReader();
        Document document = reader.read("src//常用工具.XML操作//Person.xml");
        String XPath = "//Animal[@name='jinsihou']";
        List list = document.selectNodes(XPath);// 将找到的元素组合成一个列表
        Iterator it = list.iterator();
        while (it.hasNext())
        {
            Element element = (Element) it.next();
            System.out.println(element.asXML());
        }
        Element t = (Element) document.selectSingleNode(XPath);// 找到单个的元素
        System.out.println(t.asXML());

    }

    private static void addElementNew() throws Exception
    {

        SAXReader reader = new SAXReader();
        Document document = reader.read("src//常用工具.XML操作//Person.xml");

        String xpath = "//Animal[@name='dandinghe']";
        System.out.println(xpath);
        Element dandinghe = (Element) document.selectSingleNode(xpath);
        System.out.println(dandinghe.asXML());
        dandinghe.addAttribute("id", "45").addElement("food").addText("虫子");

        OutputFormat outputFormat = OutputFormat.createPrettyPrint();// 准备格式
        XMLWriter writer = new XMLWriter(new PrintWriter("src//常用工具.XML操作//Person_copy.xml", "utf-8"), outputFormat);
        writer.write(document);
        writer.close();

    }

}
