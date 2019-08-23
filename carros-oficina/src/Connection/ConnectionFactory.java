package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory{
	
	private static ConnectionFactory conexaoUtil;
	
	public static ConnectionFactory getInstance() {
		if(conexaoUtil == null) {
			conexaoUtil = new ConnectionFactory();
		}
		return conexaoUtil;
	}
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		 Class.forName("com.mysql.cj.jdbc.Driver"); 
		 
		 return DriverManager.getConnection("jdbc:mysql://localhost:3306/vemcar?useTimezone=true&serverTimezone=UTC","root", "");
	}
	
	 public static void main(String[] args) { 		  
		    try {
				System.out.println(getInstance().getConnection());
			} catch (Exception e) {				
				e.printStackTrace();
			} 

		 
	 }
}

