package com.demo.JerseyRestAPI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
	Connection con = null;
	
	public ProductRepository(){
		String url = "jdbc:mysql://localhost/hsbcdemo";
		String user = "root";
		String password = "root";
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
		}
		catch(Exception e){
		}
	}

	public List<Products> getProductAndCategory(){
		List<Products> list = new ArrayList<>();
		String sql = "select category,product from Products";
		Products p = new Products();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if(rs.next()){
				p.setCategory(rs.getString(1));
				p.setProduct(rs.getString(3));
				list.add(p);
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		return list;
	}

	public List<Products> getProductByCategory(){
		List<Products> list = new ArrayList<>();
		String sql = "select product, category from products ORDER BY category";
		Products p = new Products();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if(rs.next()){
				p.setCategory(rs.getString(1));
				p.setProduct(rs.getString(2));
				list.add(p);
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		return list; 
	}
	
	public List<Products> getProductByCompany(){
		List<Products> list = new ArrayList<>();
		String sql = "select product, company from products ORDER BY company";
		Products p = new Products();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if(rs.next()){
				p.setCategory(rs.getString(1));
				p.setProduct(rs.getString(2));
				list.add(p);
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		return list; 
	}
	
	public List<Products> getDiscountByCategory(){
		List<Products> list = new ArrayList<>();
		String sql = "select product,price from products ORDER BY category";
		Products p = new Products();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if(rs.next()){
				p.setCategory(rs.getString(1));
				p.setProduct(rs.getString(2));
				list.add(p);
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		return list; 
	}
}
