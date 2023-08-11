package com.familyDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.connectionjdbc.Connectionjdbc;
import com.entity.Family;

public class familyDao {

	public static boolean insertFamily(Family st)
	{
		boolean f=false;
		try
		{
		//jdbccode 
		Connection con = Connectionjdbc.createC();
		String q="Insert into family(familyid,familyname,familyrelation,familyphone,familycity) values(?,?,?,?,?)";
		PreparedStatement p = con.prepareStatement(q);
		
		p.setInt(1, st.getFamilyId());
		p.setString(2, st.getFamilyName());
		p.setString(3, st.getFamilyRelation());
		p.setString(4, st.getFamilyPhone());
		p.setString(5, st.getFamilyCity());
		
		
		//execute
		
		p.executeUpdate();
		f=true;
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return f;
	}

public static boolean deleteFamily(int userId) {
		
		boolean f=false;
		try
		{
		//jdbc code 
		Connection con = Connectionjdbc.createC();
		String q="delete from family where familyid=?";
		PreparedStatement p = con.prepareStatement(q);
		
		p.setInt(1, userId);
		
		
		//execute
		
		p.executeUpdate();
		f=true;
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return f;
		
	}

public static void showAllFamily() {
	//boolean f=false;
	try
	{
	//jdbccode 
	Connection con = Connectionjdbc.createC();
	String q="select * from family;";
	
	java.sql.Statement s= con.createStatement();
   
   ResultSet set =s.executeQuery(q);
   
   while(set.next())
   {
	   int id= set.getInt(1);
	   String name =set.getString(2);
	   String relation =set.getString(3);
	   String phone =set.getString(4);
	   String city =set.getString(5);
	   
	   System.out.println("ID: "+id);
	   System.out.println("Name: "+name);
	   System.out.println("Relation: "+relation);
	   System.out.println("Phone no :"+phone);
	   System.out.println("city: "+city);
	   
	   System.out.println("_______________________________________________________________");
	   
	   
	   
	   
   }
	
	}
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
	

}

public static boolean updateFamily(Family st, int userId2) {
	boolean f=false;
	try
	{
	//jdbccode 
	Connection con = Connectionjdbc.createC();
	String q="update family set familyid=?, familyname=?, familyrelation=?, familyphone=? ,familycity=? where familyid=?";
	PreparedStatement p = con.prepareStatement(q);
	
	p.setInt(1, st.getFamilyId());
	p.setString(2, st.getFamilyName());
	p.setString(3, st.getFamilyRelation());
	p.setString(4, st.getFamilyPhone());
	p.setString(5, st.getFamilyCity());
	p.setInt(6, userId2);
	
	
	//execute
	
	p.executeUpdate();
	f=true;
	
	}
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	return f;
	

}
}
