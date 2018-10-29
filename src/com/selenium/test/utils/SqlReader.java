package com.selenium.test.utils;

import java.sql.*;

import com.microsoft.sqlserver.jdbc.SQLServerException;

public class SqlReader {

    //这里可以设置数据库名称
    private static final String URL = "jdbc:sqlserver://CNBJS1BMS015:1433;DatabaseName=BC_MIS2_QA";
    private static final String USER="mis2_qa";
    private static final String PASSWORD="1";
    private static Connection conn=null;
    private static Statement stmt = null;
    private static ResultSet rs = null;
    
    //静态代码块（将加载驱动、连接数据库放入静态块中）
    public Connection getConnection(){
        try {
            //1.加载驱动程序
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //2.获得数据库的连接
            conn=(Connection)DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("连接失败！！！！！");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("连接失败！！！！！");
        }
        return conn;
    }
    
    public Statement getStatement() {
    	try {
            stmt = getConnection().createStatement();
    	}catch(SQLException se) {
    		se.printStackTrace();
            System.out.println("声明失败！！！！！");
    	}
        return stmt;
    }
    
    public ResultSet getResultSet(String sql) {
    	try {
    		rs = getStatement().executeQuery(sql);
    	}catch(SQLException se) {
    		se.printStackTrace();
            System.out.println("执行失败！！！！！");
    	}
        return rs;
    }
    
    public Boolean getUpdateResultSet(String sql) {
    	boolean isNum = true;
    	try {
    		int result = getStatement().executeUpdate(sql);
    		if (result==0) {
    			isNum = false;
    		}
    	}catch(SQLException se) {
    		se.printStackTrace();
            System.out.println("执行失败！！！！！");
    	}
        return isNum;
    }
        
    public void getCloseConnection() {
        if(rs!= null){   // 关闭记录集   
            try{   
                rs.close() ;   
            }catch(SQLException e){   
                e.printStackTrace() ;   
            }   
        }   
        
        if(stmt != null){   // 关闭声明   
            try{   
                stmt.close() ;   
            }catch(SQLException e){   
                e.printStackTrace() ;   
            }   
        }
        
	    if(conn != null){  // 关闭连接对象   
	     try{   
	        conn.close() ;   
	     }catch(SQLException e){   
	        e.printStackTrace() ;   
	     }   
	    }
    }
}