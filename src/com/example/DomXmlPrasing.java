package com.example;
import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;





public class DomXmlPrasing {
	public static void main(String[] args) {
		try{

File stocks = new File("E:/Stocks.xml");// file is stored in e directory using name stocks.xml
DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(stocks);
		doc.getDocumentElement().normalize();
		
		System.out.println("root of xml file" + doc.getDocumentElement().getNodeName());
		
		NodeList nodes = doc.getElementsByTagName("stock");
		System.out.println("==========================");
		
		for (int i = 0; i < nodes.getLength(); i++) {
			System.out.println("nodes.getLength()"+"="+nodes.getLength());
			Node node = nodes.item(i);
			System.out.println("node. item value"+nodes.item(i));
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				System.out.println("node. get node type"+node.getNodeType());
			Element element = (Element) node;
			System.out.println("Stock Symbol: " + getValue("symbol", element));
			System.out.println("Stock Price: " + getValue("price", element));
			System.out.println("Stock Quantity: " + getValue("quantity", element));
			}
			}
			} catch(Exception ex) {
			ex.printStackTrace();
			}
			}
private static String getValue(String tag, Element element) {
NodeList nodes = element.getElementsByTagName(tag).item(0).getChildNodes();
Node node = (Node) nodes.item(0);
return node.getNodeValue();




			
	}

}
