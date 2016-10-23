package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnectDemo01 {
	
	public static Connection getConnection(){
		
		Connection connection = null;
		try {
			//加载数据库驱动程序，使用 Class 类的 forName() 静态方法来加载驱动
			//加载Oracle数据库驱动程序，Class.forName("oracle.jdbc.driver.OracleDriver")
			Class.forName("com.mysql.jdbc.Driver");
			//获取 Connection 数据库连接对象
			//Oracle的连接字符串： jdbc:oracle:thin:@hostname:port:database
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crashcourse?"+"useUnicode=true&useSSL=true&characterEncoding=utf8","root","xingsd163");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return connection;
		
	}
	
	
	public static void closeConnection(Connection connection){
		if(connection!=null){
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		Connection connection = MysqlConnectDemo01.getConnection();
		System.out.println(connection);
		
		
	}

}
