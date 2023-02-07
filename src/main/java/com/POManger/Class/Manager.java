package com.POManger.Class;

import org.openqa.selenium.WebDriver;

import com.POM.classes.Homepage;
import com.POM.classes.MenDress;
import com.POM.classes.Order;
import com.POM.classes.Shiping;

public class Manager {
	
	public WebDriver driver;
	
	public Manager(WebDriver driver2) {
		this.driver=driver2;
	}
	
	
	private Homepage hp;
	private MenDress md;
	private Shiping sp;
	private Order od;
	
	
	public Homepage getObjectHomepage() {
		if(hp==null) {
			hp = new Homepage(driver);
		}
		return hp;
	}
	
	
	public MenDress getObjectMenDress() {
		if(md==null) {
			md = new MenDress(driver);
		}
		return md;
	}
	
	
	public Shiping getObjectShiping() {
		if(sp==null) {
			sp = new Shiping(driver); 
		}
		return sp;
	}

	
	public Order getObjectOrder() {
		if(od==null) {
			od= new Order(driver);
		}
		return od;
	}
	
	
}
