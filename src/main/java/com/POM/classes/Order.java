package com.POM.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order {
	
	public WebDriver driver;
	
	public Order(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//span[.='Place Order']")
	private WebElement placeorder;
	
	@FindBy(xpath="//span[.='Continue Shopping']")
	private WebElement contin;

	public WebElement getPlaceorder() {
		return placeorder;
	}

	public WebElement getContin() {
		return contin;
	}
	
}
