package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import bean.Member;

public class ListServlet  extends HttpServlet {
	@Resource(name = "jdbc/test")
	private DataSource ds;

	public void doGet(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException {
		Connection con = null;

		try {
			con = ds.getConnection();
			List<Member> list = new ArrayList<Member>();
			Statement stmt = con.createStatement();

			String sql = "SELECT * from member";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String age = rs.getString("age");
                String sex = rs.getString("sex");
                String address = rs.getString("address");
                String bid = rs.getString("bid");
				list.add(new Member(id,name,age,sex,address,bid));
			}
			req.setAttribute("members", list);
			getServletContext().getRequestDispatcher("/WEB-INF/jsp/list.jsp").forward(req, res);
			rs.close();
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