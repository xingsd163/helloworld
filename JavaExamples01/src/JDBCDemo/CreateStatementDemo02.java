package JDBCDemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * 
 * @author Nathan
 * 
 * 连接到MySQL并执行SQL语句
 * 执行Select查询语句
 *
 */

public class CreateStatementDemo02 {
	
	public static void main(String[] args) throws SQLException {
		Connection connection=MysqlConnectDemo01.getConnection();
		//打印Connection对象
		System.out.println(connection);
		
		try (
			Statement statement = connection.createStatement();
			//执行查询语句
			ResultSet rSet = statement.executeQuery("select cust_id,cust_name from customers");
			)
		{
			while(rSet.next()){
				//使用索引作为参数性能好
				//System.out.println(rSet.getInt(1)+"\t"+rSet.getString(2));
				//使用列名作为参数可读性好
				System.out.println(rSet.getInt("cust_id")+"\t"+rSet.getString("cust_name"));
			}
		}
		
		if (connection!=null) {
			MysqlConnectDemo01.closeConnection(connection);
		}
		
		
		
		
		
	}

}
