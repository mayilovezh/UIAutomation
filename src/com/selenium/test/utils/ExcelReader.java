package com.selenium.test.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public String fileName;
	private FileInputStream fis;
	private Workbook wb;
	private XSSFCell cellvalue;
	private XSSFRow row;
	private XSSFSheet sheet;
	
	public ExcelReader(String filePath){
		this.fileName = filePath;
	}
	
	public String getCellValue(String sheetName,int rowNum, int colNum) throws IOException{
    	
		fis = new FileInputStream(this.fileName);
    	wb = new XSSFWorkbook(fis);
    	XSSFSheet sheet = (XSSFSheet)wb.getSheet(sheetName);
    	XSSFRow row = sheet.getRow(rowNum);
    	XSSFCell cell = row.getCell(colNum);
        String value = "";
        switch (cell.getCellType()) {
	        case XSSFCell.CELL_TYPE_NUMERIC: // 数字
	            value = cell.getNumericCellValue() + "";
	            if (HSSFDateUtil.isCellDateFormatted(cell)) {
	                Date date = cell.getDateCellValue();
	                if (date != null) {
	                    value = new SimpleDateFormat("yyyy-MM-dd").format(date);
	                } else {
	                    value = "";
	                }
	             } else {
	                 value = new DecimalFormat("0").format(cell.getNumericCellValue());
	             }
	            break;
	        case XSSFCell.CELL_TYPE_STRING: // 字符串
	            value = cell.getStringCellValue();
	            break;
	        case XSSFCell.CELL_TYPE_BOOLEAN: // Boolean
	            value = cell.getBooleanCellValue() + "";
	            break;
	        case XSSFCell.CELL_TYPE_FORMULA: // 公式
	            value = cell.getCellFormula() + "";
	            break;
	        case XSSFCell.CELL_TYPE_BLANK: // 空值
	            value = "";
	            break;
	        case XSSFCell.CELL_TYPE_ERROR: // 故障
	            value = "非法字符";
	            break;
	        default:
	            value = "未知类型";
	            break;
        }
        return value;
    }

	
	public int getRowsLength(String sheetName) throws IOException {
    	fis = new FileInputStream(this.fileName);
    	wb = new XSSFWorkbook(fis);
    	XSSFSheet sheet = (XSSFSheet)wb.getSheet(sheetName);
    	int rownums = sheet.getLastRowNum();
    	return rownums;
	}

	public List<String> getColums(String sheetName,int colName) throws IOException {
    	fis = new FileInputStream(this.fileName);
    	wb = new XSSFWorkbook(fis);
    	XSSFSheet sheet = (XSSFSheet)wb.getSheet(sheetName);
    	int rownums = sheet.getLastRowNum();
		List<String> cols = new ArrayList<String>();
    	for(int i =2; i < rownums + 1; i++) {
    		Object obj = sheet.getRow(i).getCell(colName);
    		cols.add(obj == null ? "" : obj.toString());
    	}
		return cols;
	}

    public List<String> getRows(String sheetName) throws IOException {
    	fis = new FileInputStream(this.fileName);
    	wb = new XSSFWorkbook(fis);
    	sheet = (XSSFSheet)wb.getSheet(sheetName);
    	row = sheet.getRow(2);
        List<String> cols = new ArrayList<String>();
        for (int j = 0; j < row.getLastCellNum(); j++) {
            Object obj = row.getCell(j);
            cols.add(obj == null ? "" : obj.toString());
        }
        return cols;
    }


}
