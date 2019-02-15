package com.selenium.test.utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.commons.lang3.StringUtils;

public class DynamicVariables {
	
	public String SqlCZCZUValueOfCenterId = "select top 1* from tblTestCenter where CenterName = '常州大学'";
	
	public String SqlSecondValueOfBuilding = "select * from tblTestCenterBuilding where BuildingNameEn = 'No.10 Huixin dongjie, Chaoyang district, Beijing'";
	
	public String SqlFirstValueOfBuilding = "select * from tblTestCenterBuilding where BuildingNameEn = 'B Seat'";
	
	public String SqlTestDate = "select top 1* from tblTestDate where DateDiff(mm,TestDate,getdate())=0";
	
	public String SqlTestDayId = "select top 1 * from tblTestDateReal where TestDateId in (select top 1 ID from tblTestDate where DateDiff(mm,TestDate,getdate())=0) and ProductId = 1 and ExamFormatId = 1";
	
	public String SqlTestDateRealId = "select top 1 * from tblTestDateReal where TestDateId in (select ID from tblTestDate where year(TestDate)=year(getdate())) and ProductId = 1 and ExamFormatId = 1 order by TestDate";
	
	public String SqlValueOfCenterId = "select * from tblTestCenter where CenterName = '对外经济大学'";
	
	public String SqlTemplateNameValue = "select * from tblWrittenTemplates where TestCenterId in (select CenterId from tblTestCenter where CenterName like '%对外经济大学%')";
	
	public String SqlSearchStockType = "select top 1 * from TB_Dictionary where [Values] = 'Paper Test Materials (L/R/W)'";
	
	public String SqUpdateStockType = "select top 1 * from TB_Dictionary where [Values] = 'Wasted'";
	
	public String SqlLiveMaterialsCategoryName = "select top 1 * from tblStockCategory where PermanentType = 0 order by OrderNumber";
	
	public String SqlLastTestDate = "select top 1 * from tblTestDate where DateDiff(mm,TestDate,getdate())=0 order by TestDate desc";
	
	public String SqlLastTestDateRealId = "select top 1 * from tblTestDateReal where TestDateId in (select top 1 ID from tblTestDate where DateDiff(mm,TestDate,getdate())=0 order by TestDate desc) and ProductId = 1 and ExamFormatId = 3";
	
	public String SqlTBDictionary = "select * from TB_Dictionary where Table_mark = 'StockStorageType' and [Values] = 'Paper Transfer In'";
	
	public String SqlGet1stMarker = "select * from TB_Dictionary where [Values] = '1st Marker'";
	
	public String SqlGet2ndMarker = "select * from TB_Dictionary where [Values] = '2nd Marker'";
	
	public String SqlGetCountryOfChina = "select * from TB_Country where CountryName = 'China'";
	
	public String SqlGetCity = "select * from TB_Province where NAME = 'Shanghai'";
	
	public String SqlGetCityOfDistrict = "select * from TB_City where ProvinceID in (select ProId from TB_Province where NAME = 'Shanghai')";
	
	public String SqlGetClericalMarkerStatus = "select * from TB_Dictionary where [Values] = 'Active' and Table_mark = 'ClericalMarkerStatus'";
	
    public String GetFormatFirstDayOfThisMonth(){
        SimpleDateFormat sdformat = new SimpleDateFormat("dd/MM/yyyy"); 
        //获取当前月最后一天
        Calendar ca = Calendar.getInstance();    
        ca.set(Calendar.DAY_OF_MONTH, ca.getActualMinimum(Calendar.DAY_OF_MONTH));  
        String firstDay = sdformat.format(ca.getTime());
        return firstDay;
     }    



    public String GetFormatLastDayOfThisMonth(){
       SimpleDateFormat sdformat = new SimpleDateFormat("dd/MM/yyyy"); 
       //获取当前月最后一天
       Calendar ca = Calendar.getInstance();    
       ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));  
       String lastDay = sdformat.format(ca.getTime());
       return lastDay;
    }

	public String Get2ndMarker() {
		SqlReader sr = null;
		String StockTypeId = null;
		try {
			sr = new SqlReader();
			String sql = SqlGet2ndMarker;
			ResultSet rs = sr.getResultSet(sql);
			while(rs.next()) {
				StockTypeId = rs.getString("Id");
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			sr.getCloseConnection();
		}
		return StockTypeId;
	}
	
	public String GetClericalMarkerStatus() {
		SqlReader sr = null;
		String StockTypeId = null;
		try {
			sr = new SqlReader();
			String sql = SqlGetClericalMarkerStatus;
			ResultSet rs = sr.getResultSet(sql);
			while(rs.next()) {
				StockTypeId = rs.getString("Id");
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			sr.getCloseConnection();
		}
		return StockTypeId;
	}
	
	public String GetCityOfDistrict() {
		SqlReader sr = null;
		String StockTypeId = null;
		try {
			sr = new SqlReader();
			String sql = SqlGetCityOfDistrict;
			ResultSet rs = sr.getResultSet(sql);
			while(rs.next()) {
				StockTypeId = rs.getString("CityID");
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			sr.getCloseConnection();
		}
		return StockTypeId;
	}
	
	public String GetCity() {
		SqlReader sr = null;
		String StockTypeId = null;
		try {
			sr = new SqlReader();
			String sql = SqlGetCity;
			ResultSet rs = sr.getResultSet(sql);
			while(rs.next()) {
				StockTypeId = rs.getString("ProId");
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			sr.getCloseConnection();
		}
		return StockTypeId;
	}
	
	public String GetCountryOfChina() {
		SqlReader sr = null;
		String StockTypeId = null;
		try {
			sr = new SqlReader();
			String sql = SqlGetCountryOfChina;
			ResultSet rs = sr.getResultSet(sql);
			while(rs.next()) {
				StockTypeId = rs.getString("CountryId");
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			sr.getCloseConnection();
		}
		return StockTypeId;
	}
	
	public String Get1stMarker() {
		SqlReader sr = null;
		String StockTypeId = null;
		try {
			sr = new SqlReader();
			String sql = SqlGet1stMarker;
			ResultSet rs = sr.getResultSet(sql);
			while(rs.next()) {
				StockTypeId = rs.getString("Id");
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			sr.getCloseConnection();
		}
		return StockTypeId;
	}
	
	public String GetPMUpdateStockType() {
		SqlReader sr = null;
		String StockTypeId = null;
		try {
			sr = new SqlReader();
			String sql = SqlTBDictionary;
			ResultSet rs = sr.getResultSet(sql);
			while(rs.next()) {
				StockTypeId = rs.getString("Id");
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			sr.getCloseConnection();
		}
		return StockTypeId;
	}
	
    public String GetFirstDayOfThisMonth(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
        //获取当前月最后一天
        Calendar ca = Calendar.getInstance();    
        ca.set(Calendar.DAY_OF_MONTH, ca.getActualMinimum(Calendar.DAY_OF_MONTH));  
        String firstDay = format.format(ca.getTime());
        return firstDay;
     }
	
	public String GetLastTestDateID() {
		SqlReader sr = null;
		String centerId = null;
		try {
			sr = new SqlReader();
			String sql = SqlLastTestDate;
			ResultSet rs = sr.getResultSet(sql);
			while(rs.next()) {
				centerId = rs.getString("ID");
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			sr.getCloseConnection();
		}
		return centerId;
	}
	
    public String GetLastDayOfThisMonth(){
       SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
       //获取当前月最后一天
       Calendar ca = Calendar.getInstance();    
       ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));  
       String lastDay = format.format(ca.getTime());
       return lastDay;
    }
	
	public String GetLastTestDayId() {
		SqlReader sr = null;
		String centerId = null;
		try {
			sr = new SqlReader();
			String sql = SqlLastTestDateRealId;
			ResultSet rs = sr.getResultSet(sql);
			while(rs.next()) {
				centerId = rs.getString("Id");
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			sr.getCloseConnection();
		}
		return centerId;
	}
	
	public String GetLastTestDate() {
		SqlReader sr = null;
		String centerId = null;
		try {
			sr = new SqlReader();
			String sql = SqlLastTestDate;
			ResultSet rs = sr.getResultSet(sql);
			while(rs.next()) {
				centerId = rs.getString("TestDate");
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			sr.getCloseConnection();
		}
		return centerId;
	}
	
	public String getLastDateNotFormat() {
		String subTestDate = StringUtils.substringBefore(GetLastTestDate(), " ");
		String[] splitTestDate = subTestDate.split("-");
		String newTestDate = splitTestDate[0] + splitTestDate[1]+ splitTestDate[2];
		return newTestDate;
	}
	
	public String GetFormatSpritString() {
		String subTestDate = StringUtils.substringBefore(getLastDate(), " ");
		String[] subTestDateString = subTestDate.split("-");
		String[] numStringList = new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
		String formatString = null;
		for (int i =0; i<subTestDateString.length;) {
			if(Arrays.asList(numStringList).contains(subTestDateString[1])) {
				int subToInt = Integer.valueOf(subTestDateString[1]);
				String subToString = String.valueOf(subToInt);
				int subMonthToInt = Integer.valueOf(subTestDateString[2]);
				String subMonthToString = String.valueOf(subMonthToInt);
				formatString = subMonthToString + "/" + subToString + "/" + subTestDateString[0] ;
				break;
			}else {
				return subTestDate;
			}
		}
		return formatString;
	}
	
	public String GetLastFormatSpritString() {
		String subTestDate = StringUtils.substringBefore(GetLastTestDate(), " ");
		String[] subTestDateString = subTestDate.split("-");
		String[] numStringList = new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
		String formatString = null;
		for (int i =0; i<subTestDateString.length;) {
			if(Arrays.asList(numStringList).contains(subTestDateString[1])) {
				int subToInt = Integer.valueOf(subTestDateString[1]);
				String subToString = String.valueOf(subToInt);
				int subMonthToInt = Integer.valueOf(subTestDateString[2]);
				String subMonthToString = String.valueOf(subMonthToInt);
				formatString = subMonthToString + "/" + subToString + "/" + subTestDateString[0] ;
				break;
			}else {
				return subTestDate;
			}
		}
		return formatString;
	}
	
	public String getLastFormatString() {
		String subTestDate = StringUtils.substringBefore(GetLastTestDate(), " ");
		String[] subTestDateString = subTestDate.split("-");
		String[] numStringList = new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
		String formatString = null;
		for (int i =0; i<subTestDateString.length;) {
			if(Arrays.asList(numStringList).contains(subTestDateString[1])) {
				int subToInt = Integer.valueOf(subTestDateString[1]);
				String subToString = String.valueOf(subToInt);
				int subMonthToInt = Integer.valueOf(subTestDateString[2]);
				String subMonthToString = String.valueOf(subMonthToInt);
				formatString = subTestDateString[0] + "-" + subToString + "-" + subMonthToString;
				break;
			}else {
				return subTestDate;
			}
		}
		return formatString;
	}
	
	public String GetLiveMaterialsCategoryName(){
		SqlReader sr = null;
		String CategoryName = null;
		try {
			sr = new SqlReader();
			String sql = SqlLiveMaterialsCategoryName;
			ResultSet rs = sr.getResultSet(sql);
			while(rs.next()) {
				CategoryName = rs.getString("CategoryName");
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			sr.getCloseConnection();
		}
		return CategoryName;
	}
	
	public String getFormatString() {
		String subTestDate = StringUtils.substringBefore(GetTestDate(), " ");//
		String[] subTestDateString = subTestDate.split("-");
		String[] numStringList = new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
		String formatString = null;
		for (int i =0; i<subTestDateString.length;) {
			if(Arrays.asList(numStringList).contains(subTestDateString[1])) {
				int subToInt = Integer.valueOf(subTestDateString[1]);
				String subToString = String.valueOf(subToInt);
				int subMonthToInt = Integer.valueOf(subTestDateString[2]);
				String subMonthToString = String.valueOf(subMonthToInt);
				formatString = subTestDateString[0] + "-" + subToString + "-" + subMonthToString;
				break;
			}else {
				return subTestDate;
			}
		}
		return formatString;
	}
	
	public String GetSearchStockType() {
		SqlReader sr = null;
		String StockTypeId = null;
		try {
			sr = new SqlReader();
			String sql = SqlSearchStockType;
			ResultSet rs = sr.getResultSet(sql);
			while(rs.next()) {
				StockTypeId = rs.getString("Id");
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			sr.getCloseConnection();
		}
		return StockTypeId;
	}
	
	public String GetUpdateStockType() {
		SqlReader sr = null;
		String StockTypeId = null;
		try {
			sr = new SqlReader();
			String sql = SqUpdateStockType;
			ResultSet rs = sr.getResultSet(sql);
			while(rs.next()) {
				StockTypeId = rs.getString("Id");
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			sr.getCloseConnection();
		}
		return StockTypeId;
	}
	
	public String GetTemplateNameValue() {
		SqlReader sr = null;
		String WrittenTemplateId = null;
		try {
			sr = new SqlReader();
			String sql = SqlTemplateNameValue;
			ResultSet rs = sr.getResultSet(sql);
			while(rs.next()) {
				WrittenTemplateId = rs.getString("WrittenTemplateId");
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			sr.getCloseConnection();
		}
		return WrittenTemplateId;
	}
	
	public String getLastDate() {
		 Date date=new Date();//取时间
		 Calendar calendar = new GregorianCalendar();
		 calendar.setTime(date);
		 calendar.add(calendar.DATE, 1);//把日期往后增加一天.整数往后推,负数往前移动
		 date=calendar.getTime(); //这个时间就是日期往后推一天的结果 
		 SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		 String dateString = formatter.format(date);
		 return dateString;
	}
	
	public String getCurrentDate() {
		 Date date=new Date();//取时间
		 Calendar calendar = new GregorianCalendar();
		 calendar.setTime(date);
		 calendar.add(calendar.DATE,0);//把日期往后增加一天.整数往后推,负数往前移动
		 date=calendar.getTime(); //这个时间就是日期往后推一天的结果 
		 SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		 String dateString = formatter.format(date);
		 return dateString;
	}
	
	public String getLastYear() {
		 Date date=new Date();//取时间
		 Calendar calendar = new GregorianCalendar();
		 calendar.setTime(date);
		 calendar.add(calendar.YEAR, 1);//把日期往后增加一天.整数往后推,负数往前移动
		 date=calendar.getTime(); //这个时间就是日期往后推一天的结果 
		 SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
		 String dateString = formatter.format(date);
		 return dateString;
	}
	
	public String getCurrentYear() {
		 Date date=new Date();//取时间
		 Calendar calendar = new GregorianCalendar();
		 calendar.setTime(date);
		 calendar.add(calendar.YEAR,0);//把日期往后增加一天.整数往后推,负数往前移动
		 date=calendar.getTime(); //这个时间就是日期往后推一天的结果 
		 SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
		 String dateString = formatter.format(date);
		 return dateString;
	}
	
	public String getLastMonth() {
		 Date date=new Date();//取时间
		 Calendar calendar = new GregorianCalendar();
		 calendar.setTime(date);
		 calendar.add(calendar.MONTH, 1);//把日期往后增加一天.整数往后推,负数往前移动
		 date=calendar.getTime(); //这个时间就是日期往后推一天的结果 
		 SimpleDateFormat formatter = new SimpleDateFormat("MM");
		 String dateString = formatter.format(date);
		 return dateString;
	}
	
	public String getCurrentMonth() {
		 Date date=new Date();//取时间
		 Calendar calendar = new GregorianCalendar();
		 calendar.setTime(date);
		 calendar.add(calendar.MONTH, 0);//把日期往后增加一天.整数往后推,负数往前移动
		 date=calendar.getTime(); //这个时间就是日期往后推一天的结果 
		 SimpleDateFormat formatter = new SimpleDateFormat("MM");
		 String dateString = formatter.format(date);
		 return dateString;
	}
	public String GetCZCZUValueOfCenterId() {
		SqlReader sr = null;
		String centerId = null;
		try {
			sr = new SqlReader();
			String sql = SqlCZCZUValueOfCenterId;
			ResultSet rs = sr.getResultSet(sql);
			while(rs.next()) {
				centerId = rs.getString("CenterId");
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			sr.getCloseConnection();
		}
		return centerId;
	}
	
	public String GetSecondValueOfBuilding() {
		SqlReader sr = null;
		String centerId = null;
		try {
			sr = new SqlReader();
			String sql = SqlSecondValueOfBuilding;
			ResultSet rs = sr.getResultSet(sql);
			while(rs.next()) {
				centerId = rs.getString("BuildingId");
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			sr.getCloseConnection();
		}
		return centerId;
	}
	
	public String GetFirstValueOfBuilding() {
		SqlReader sr = null;
		String centerId = null;
		try {
			sr = new SqlReader();
			String sql = SqlFirstValueOfBuilding;
			ResultSet rs = sr.getResultSet(sql);
			while(rs.next()) {
				centerId = rs.getString("BuildingId");
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			sr.getCloseConnection();
		}
		return centerId;
	}
		
	public String GetTestDate() {
		SqlReader sr = null;
		String centerId = null;
		try {
			sr = new SqlReader();
			String sql = SqlTestDate;
			ResultSet rs = sr.getResultSet(sql);
			while(rs.next()) {
				centerId = rs.getString("TestDate");
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			sr.getCloseConnection();
		}
		return centerId;
	}
	
	public String GetTestDateId() {
		SqlReader sr = null;
		String centerId = null;
		try {
			sr = new SqlReader();
			String sql = SqlTestDate;
			ResultSet rs = sr.getResultSet(sql);
			while(rs.next()) {
				centerId = rs.getString("ID");
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			sr.getCloseConnection();
		}
		return centerId;
	}
	
	public String GetTestDayId() {
		SqlReader sr = null;
		String centerId = null;
		try {
			sr = new SqlReader();
			String sql = SqlTestDayId;
			ResultSet rs = sr.getResultSet(sql);
			while(rs.next()) {
				centerId = rs.getString("Id");
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			sr.getCloseConnection();
		}
		return centerId;
	}
	
	public String GetTestDateRealId() {
		SqlReader sr = null;
		String centerId = null;
		try {
			sr = new SqlReader();
			String sql = SqlTestDateRealId;
			ResultSet rs = sr.getResultSet(sql);
			while(rs.next()) {
				centerId = rs.getString("Id");
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			sr.getCloseConnection();
		}
		return centerId;
	}
	
	public String GetValueOfCenterId() {
		SqlReader sr = null;
		String centerId = null;
		try {
			sr = new SqlReader();
			String sql = SqlValueOfCenterId;
			ResultSet rs = sr.getResultSet(sql);
			while(rs.next()) {
				centerId = rs.getString("CenterId");
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			sr.getCloseConnection();
		}
		return centerId;
	}
}
