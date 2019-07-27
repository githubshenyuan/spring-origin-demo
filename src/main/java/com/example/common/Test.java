package com.example.common;

import com.example.entity.User;
import org.springframework.util.Assert;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
public class Test {
    private static final ThreadLocal<String> threadLocal = new ThreadLocal<String>();
    private static final ThreadLocal<String> threadLocal2 = new ThreadLocal<String>();

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        document();

    }

    public static String get() {

        return (String) new Object();
    }

    public static void document() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        File file = new File("H:\\temp\\aaa.xml");

        Document document = builder.parse(file);
        Element element = document.getDocumentElement();
        String a = element.getAttribute("xmlns");
        NodeList bean = element.getChildNodes();

        for (int i = 0; i < bean.getLength(); i++) {
            Node item = bean.item(i);
            a = item.getNodeName();

        }
        a = element.getNamespaceURI();

        System.out.println("");

    }
}
