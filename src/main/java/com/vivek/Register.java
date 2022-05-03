package com.vivek;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vivek.deo.RegisterDeo;


@WebServlet("/Register")
public class Register extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String un = request.getParameter("uname");
		String up = request.getParameter("pass");
		RegisterDeo rd = new RegisterDeo();
		int i = rd.register(un, up);
		PrintWriter pw = response.getWriter();
		if(i>0)
			pw.println("Data entered successfully");
		else
			pw.println("Data not inserted");
	}


}
