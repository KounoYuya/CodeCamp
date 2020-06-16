package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

public class CreateServlet extends HttpServlet {
	@Resource(name = "jdbc/test")
	private DataSource ds;


	public void doGet(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException {
		System.out.println("get request");
		getServletContext().getRequestDispatcher("/WEB-INF/jsp/create.jsp").forward(req, res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException {

		System.out.println("post request");
		Connection con = null;

		String id = req.getParameter("id");
		String name = req.getParameter("name");
        String age = req.getParameter("age");
        String sex = req.getParameter("sex");
        String address = req.getParameter("address");
        String bid = req.getParameter("bid");

		try {
			con = ds.getConnection();
			String sql = "INSERT INTO member (id, name, age, sex, address, bid) VALUES(?,?,?,?,?,?)";

			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setString(2, name);
            stmt.setString(3, age);
            stmt.setString(4, sex);
            stmt.setString(5, address);
            stmt.setString(6, bid);
			stmt.executeUpdate();
			res.sendRedirect(getServletContext().getContextPath() + "/member/list");
			stmt.close();

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				throw new ServletException();
			}
		}

	}

}