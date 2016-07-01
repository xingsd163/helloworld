package dao;

import dao.UserDAO;
import entity.User;

public class TestDAO {
	public static void main(String[] args) 
	throws Exception {
		// TODO Auto-generated method stub
		UserDAO dao = new UserDAO();
		User user = 
			new User("ZWX","ZHANGWENXING","test","m");
		dao.save(user);
		User user2 = dao.findByUsername("ZWX");
		System.out.println(user2.getName());
	}

}