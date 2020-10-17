package br.edu.ifba.pooinf008.persistence;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import br.edu.ifba.pooinf008.exceptions.DBException;

public class ConnectionDAO {
	public static Connection conn = null;
	
	public static Connection getConnection() {
		if(conn == null) {
			try {
				Properties props = loadProperties();
				String url = props.getProperty("dburl");
				conn = DriverManager.getConnection(url, props);
			} catch(SQLException e) {
				throw new DBException(e.getMessage());
			}
		}
		return conn;
	}
	
	public static void closeConnection(){
		if(conn!=null) {
			try {
				conn.close();
			} catch(SQLException e){
				throw new DBException(e.getMessage());
			}
		}
	}
	
	public static Properties loadProperties() {
		try(FileInputStream fs = new FileInputStream("C:\\Users\\Matheus Rodrigues\\eclipse-workspace\\TRABALHOPOOINF008\\db.properties")){
			Properties props = new Properties();
			props.load(fs);
			return props;
		} catch(IOException e) {
			throw new DBException(e.getMessage());
		}
	}
}
