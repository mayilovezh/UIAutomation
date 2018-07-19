package com.selenium.test.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XmlReader {
	String filePath = null;
	String element = null;

	public XmlReader(String filePath, String element) {
		this.filePath = filePath;
		this.element = element;
	}

	public String getUrl() {
		InputStream fis;
		Element ele = null;
		String eleText = null;
		try {
			fis = new FileInputStream(this.filePath);
			SAXReader saxReader = new SAXReader();
			Document document;
			try {
				document = saxReader.read(fis);
				Element rootElement = document.getRootElement();
				ele = rootElement.element(this.element);
				eleText = ele.getText();
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return eleText;
	}
}
