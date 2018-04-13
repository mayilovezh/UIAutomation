package com.selenium.test.utils;

import java.io.BufferedReader;
import java.io.FileReader;

public class CsvReader {

	String fileName;

	public CsvReader(String filePath) {
		this.fileName = filePath;
	}

	@SuppressWarnings("resource")
	public void getCellValue() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			reader.readLine();
			String line = null;
			while ((line = reader.readLine()) != null) {
				String item[] = line.split("，");

				String last = item[item.length - 1];
				// int value = Integer.parseInt(last);//如果是数值，可以转化为数值
				System.out.println(last);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
