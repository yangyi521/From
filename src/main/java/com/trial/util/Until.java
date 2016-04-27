package com.trial.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Until {



		public static String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		private static final String URL = "jdbc:sqlserver://172.20.2.175;databasename=zichanguanli_10110008";
		private static final String USER = "sa";
		private static final String PWD = "";
		static{
			
			try {
				Class.forName(DRIVER);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static Connection getConn(){
			Connection conn = null;
			try {
				conn = DriverManager.getConnection(URL,USER,PWD);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return conn;
		}
	}
