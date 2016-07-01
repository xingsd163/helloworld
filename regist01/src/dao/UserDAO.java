package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.DBUtil;
import entity.User;

public class UserDAO {
	public void save(User user) throws Exception {
		Connection conn = DBUtil.getConnection();
		PreparedStatement prep = conn.prepareStatement("insert into t_user("
				+ "username,name,pwd,gendar)" + " values(?,?,?,?)");
		prep.setString(1, user.getUsername());
		prep.setString(2, user.getName());
		prep.setString(3, user.getPwd());
		prep.setString(4, user.getGendar());
		prep.executeUpdate();
		DBUtil.close(conn);
	}

	public User findByUsername(String username) throws Exception {
		User user = null;
		Connection conn = DBUtil.getConnection();
		PreparedStatement prep = conn.prepareStatement("select * "
				+ "from t_user " + "where username=?");
		prep.setString(1, username);
		ResultSet rst = prep.executeQuery();
		if (rst.next()) {
			user = new User();
			user.setName(rst.getString("name"));
			user.setUsername(username);
			user.setGendar(rst.getString("gendar"));
			user.setPwd(rst.getString("pwd"));
			user.setId(rst.getLong("id"));
		}
		DBUtil.close(conn);
		return user;
	}
}