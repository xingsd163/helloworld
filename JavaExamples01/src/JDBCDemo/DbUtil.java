package JDBCDemo;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtil {
	private static String url = "";
	private static String username = "";
	private static String password = "";
	private static String driver = "";
	//仅执行一次即可,减少执行次数
	static{
		try{//解析db.properties文件
			Properties props = new Properties();
			InputStream is = 
				DbUtil.class.getClassLoader()
				 .getResourceAsStream("config/db.properties");
			props.load(is);
			url = props.getProperty("url");
			username = 
				props.getProperty("username");
			password = 
				props.getProperty("password");
			driver = props.getProperty("driver");
			//注册驱动包
			Class.forName(driver);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	
	public static Connection getConnection() throws Exception{
		Connection con = 
			DriverManager.getConnection(
				url,username,password);
		return con;
	}
	
	
	public static void closeConnection(
			Connection con){
		if(con != null){
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args){
		Connection con = null;
		try {
			con = getConnection();
			//使用
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeConnection(con);
		}
	}
	
	
}
