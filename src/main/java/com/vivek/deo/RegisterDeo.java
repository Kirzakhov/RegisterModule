package com.vivek.deo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RegisterDeo {
	String url = "jdbc:mysql://localhost:3306/vivek";
	String un = "root";
	String up = "0000";
	String q = "insert into login values(?, ?)";
	public int register(String uname, String pass) {
		int i=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,un,up);
			PreparedStatement pst = con.prepareStatement(q);
			pst.setString(1, uname);
			pst.setString(2, pass);
			i = pst.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
}
