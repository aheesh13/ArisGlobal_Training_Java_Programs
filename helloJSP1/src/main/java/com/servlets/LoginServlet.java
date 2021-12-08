package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import java.sql.*;


public class LoginServlet extends HttpServlet{


	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Connection con=null;
		try
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String myConn="jdbc:mysql://localhost:3306/webapp?characterEncoding=utf8";
			String userName="root";
			String password="Youcan01@";
			 con=DriverManager.getConnection(myConn,userName,password);
			if(con!=null)
			{
				System.out.println("connected");
				
	}
			else {
				System.out.println("Not connected ");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		String ClientuserName=req.getParameter("username");
		String ClientpassWord=req.getParameter("password");
		String q1="select * from login where username='"+ClientuserName +"'and password='"+ClientpassWord+"';";
		
		Statement stmt;
		PrintWriter out=resp.getWriter();
		try {
			stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(q1);
			if(rs.next()) {
				RequestDispatcher rd=req.getRequestDispatcher("Welcome.jsp");
				rd.forward(req, resp);
			}
			else {
				out.println("<script type=\"text/javascript\">");
			       out.println("alert('User or password incorrect');");
			       out.println("location='index.jsp';");
			       out.println("</script>");
			       
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
       
			
	}

	
	
	
}
