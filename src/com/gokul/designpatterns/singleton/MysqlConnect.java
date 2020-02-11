package com.gokul.designpatterns.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlConnect {
	
	public Connection conn;
    public Statement statement;
    
    private static MysqlConnect db;
    
    private MysqlConnect() {
        String url= "jdbc:mysql://localhost:3306/";
        String dbName = "BankDB";
        String driver1 = "com.mysql.jdbc.Driver";
        String driver2 = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String userName = "root";
        String password = "root";
        try {
            Class.forName(driver2).newInstance();
            this.conn = (Connection)DriverManager.getConnection(url+dbName,userName,password);
        }
        catch (Exception sqle) {
            sqle.printStackTrace();
        }
    }
    
    
    
    
    public static MysqlConnect getDbCon() {
        if ( db == null ) {
            db = new MysqlConnect();            
        }
        return db;
    }
    
    

    public ResultSet getBracnhId() throws SQLException{
        statement = db.conn.createStatement();
        ResultSet res = statement.executeQuery("SELECT branch_id FROM bankdb.branch_master");
        return res;
    }
    
    
    
}
