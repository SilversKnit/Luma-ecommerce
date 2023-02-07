package com.Propertyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property {
	
	public Properties pp; 
	
	public Property() throws IOException {
		
		File ff = new File("C:\\Users\\Ragul S\\eclipse-workspace\\Maven-project-5practice-cucumber\\src\\main\\java\\com\\Propertyfile\\datafile.properties");
		FileInputStream input = new FileInputStream(ff);
	    pp = new Properties();
		pp.load(input);
		
	}
	
	
	public String getUrl() {
		String url = pp.getProperty("Url");
		return url;
	}
	
	public String getEmail() {
		String email = pp.getProperty("email");
		return email;
	}
	
	public String getFirstName() {
		String firstname = pp.getProperty("firstname");
		return firstname;
	}
	
	public String getLastName() {
		String lastname = pp.getProperty("lastname");
		return lastname;
	}
	
	public String getCompany() {
		String company = pp.getProperty("company");
		return company;
	}
	
	public String getAdd1() {
		String add1 = pp.getProperty("add1");
		return add1;
	}
	
	public String getAdd2() {
		String add2 = pp.getProperty("add2");
		return add2;
	}
	
	public String getAdd3() {
		String add3 = pp.getProperty("add3");
		return add3;
	}
	
	public String getCity() {
		String city = pp.getProperty("city");
		return city;
	}
	
	public String getState() {
		String state = pp.getProperty("state");
		return state;
	}
	
	public String getZipCode() {
		String zipcode = pp.getProperty("zipcode");
		return zipcode;
	}
	
	public String getCountry() {
		String country = pp.getProperty("country");
		return country;
	}
	
	public String getPhone() {
		 String phone = pp.getProperty("phone");
		 return phone;
	}
	

}
