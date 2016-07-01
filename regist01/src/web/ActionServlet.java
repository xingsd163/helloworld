package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDAO;
import entity.User;

public class ActionServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/"), uri.lastIndexOf("."));
		if (path.equals("/regist")) {
			String username = request.getParameter("username");
			UserDAO dao = new UserDAO();
			try {
				User user = dao.findByUsername(username);
				if (user == null) {
					// 用户名不存在，插入操作
					user = new User();
					user.setName(request.getParameter("name"));
					user.setPwd(request.getParameter("pwd"));
					user.setGendar(request.getParameter("gendar"));
					user.setUsername(username);
					dao.save(user);
					request.setAttribute("user", user);
					request.getRequestDispatcher("main.jsp").forward(request,
							response);
					// response.sendRedirect("main.jsp");
				} else {
					// 用户名存在，则提示用户
					request.setAttribute("regist_error", "用户名已经存在");
					request.getRequestDispatcher("regist.jsp").forward(request,response);
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException(e);
			}
		} else if (path.equals("/login")) {
			String username = request.getParameter("username");
			String pwd = request.getParameter("pwd");
			UserDAO dao = new UserDAO();
			try {
				User user = dao.findByUsername(username);
				if (user != null && user.getPwd().equals(pwd)) {
					// 登录成功
					
					HttpSession session = request.getSession();
					System.out.println("session id is:" + session.getId());
					session.setAttribute("user", user);
					
					response.sendRedirect("main.jsp");
				} else {
					// 登录失败
					request.setAttribute("login_error", "用户名或者密码错误");
					request.getRequestDispatcher("login.jsp").forward(request,response);
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException(e);
			}
		}
	}
}
