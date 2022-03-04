package com.whatsapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.whatsapp.entity.WhatsappUser;

public class WhatsappDAO implements WhatsappDAOInterface {

	public int createProfileDAO(WhatsappUser wu) {
		//dao layer want to interact with database so it will use JDBC
		int i=0;
		try {
			//step 1 load driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//create connection with database
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","rajesh");
			
			//how to write query ans using PreparedStatement 
			PreparedStatement ps=con.prepareStatement("insert into WhatsappUser values(?,?,?,?)");
			ps.setString(1, wu.getName());
			ps.setString(2, wu.getPassword());
			ps.setString(3,wu.getEmail());
			ps.setString(4,wu.getAddress());
			
			//step 4 how to execute query
			//if query is insert or delete or update then we will use executeUpdate() method
			//if query is select then we will use executeQuery() method
			
			i=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public WhatsappUser viewProfileDAO(WhatsappUser wu) {
		WhatsappUser u1=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","rajesh");
			
			PreparedStatement ps=con.prepareStatement("select * from WhatsappUser where email=?");
			ps.setString(1,wu.getEmail());
			
			
			ResultSet res=ps.executeQuery();
			if(res.next()) {
				u1=new WhatsappUser();
				String n=res.getString(1);
				String p=res.getString(2);
				String e=res.getString(3);
				String a=res.getString(4);
				
				u1.setName(n);
				u1.setPassword(p);
				u1.setEmail(e);
				u1.setAddress(a);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return u1;
	}

}











