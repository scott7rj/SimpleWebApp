package br.gov.caixa.nsgd.cheque;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB2ConnUtils {
	public static Connection getDB2Connection() throws ClassNotFoundException, SQLException {
	        
	       // Note: Change the connection parameters accordingly.
	       String hostName = "localhost";
	       String sid = "db12c";
	       String userName = "mytest";
	       String password = "12345";
	  
	       return getDB2Connection(hostName, sid, userName, password);
	   }
	  
	   public static Connection getDB2Connection(String hostName, String sid,
	           String userName, String password) throws ClassNotFoundException,
	           SQLException {
	   
	       Class.forName("oracle.jdbc.driver.OracleDriver");
	  
	       // URL Connection for Oracle
	       // Example: 
	       // jdbc:oracle:thin:@localhost:1521:db11g
	       // jdbc:oracle:thin:@//HOSTNAME:PORT/SERVICENAME
	       String connectionURL = "jdbc:oracle:thin:@" + hostName + ":1521:" + sid;
	  
	       Connection conn = DriverManager.getConnection(connectionURL, userName, password);
	       return conn;
	   }
}
