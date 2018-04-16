package com.selenium.test.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class XlsReader {
	public String fileName;
	private FileInputStream fis;
	private HSSFWorkbook wb;
	@SuppressWarnings("unused")
	private HSSFCell cellvalue;
	private HSSFRow row;
	private HSSFSheet sheet;
	
	public XlsReader(String filePath){
		this.fileName = filePath;
	}
	
	@SuppressWarnings("deprecation")
	public String getCellValue(String sheetName,int rowNum, int colNum) throws IOException{
    	
		fis = new FileInputStream(this.fileName);
    	wb = new HSSFWorkbook(fis);
    	HSSFSheet sheet = (HSSFSheet)wb.getSheet(sheetName);
    	HSSFRow row = sheet.getRow(rowNum);
    	HSSFCell cell = row.getCell(colNum);
        String value = "";
        switch (cell.getCellType()) {
	        case HSSFCell.CELL_TYPE_NUMERIC: // 数字
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
	        case HSSFCell.CELL_TYPE_STRING: // 字符串
	            value = cell.getStringCellValue();
	            break;
	        case HSSFCell.CELL_TYPE_BOOLEAN: // Boolean
	            value = cell.getBooleanCellValue() + "";
	            break;
	        case HSSFCell.CELL_TYPE_FORMULA: // 公式
	            value = cell.getCellFormula() + "";
	            break;
	        case HSSFCell.CELL_TYPE_BLANK: // 空值
	            value = "";
	            break;
	        case HSSFCell.CELL_TYPE_ERROR: // 故障
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
    	wb = new HSSFWorkbook(fis);
    	HSSFSheet sheet = (HSSFSheet)wb.getSheet(sheetName);
    	int rownums = sheet.getLastRowNum();
    	return rownums;
	}

	public List<String> getColums(String sheetName,int colName) throws IOException {
    	fis = new FileInputStream(this.fileName);
    	wb = new HSSFWorkbook(fis);
    	HSSFSheet sheet = (HSSFSheet)wb.getSheet(sheetName);
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
    	wb = new HSSFWorkbook(fis);
    	sheet = (HSSFSheet)wb.getSheet(sheetName);
    	row = sheet.getRow(2);
        List<String> cols = new ArrayList<String>();
        for (int j = 0; j < row.getLastCellNum(); j++) {
            Object obj = row.getCell(j);
            cols.add(obj == null ? "" : obj.toString());
        }
        return cols;
    }

}
