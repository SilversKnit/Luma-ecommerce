package com.POM.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shiping {
	
	public WebDriver driver;
	
	public Shiping(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(xpath="//div[.='Shipping Address']")
	private WebElement ship;
	
	@FindBy(xpath="(//label[@class='label'])[3]/following-sibling::div/input")
	private WebElement email;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement company;
	
	@FindBy(xpath="//input[@name='street[0]']")
	private WebElement add1;
	
	@FindBy(xpath="//input[@name='street[1]']")

	private WebElement add2;
	
	@FindBy(xpath="//input[@name='street[2]']")
	private WebElement add3;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement city;
	
	@FindBy(xpath="(//select[@class='select'])[1]")
	private WebElement state;
	
	@FindBy(xpath="//input[@name='postcode']")
	private WebElement zipcode;
	
	@FindBy(xpath="(//select[@class='select'])[2]")
	private WebElement country;
	
	@FindBy(xpath="//input[@name='telephone']")
	private WebElement phone;
	
	@FindBy(xpath="(//input[@class='radio'])[1]")
	private WebElement deliverycharge;
	
	@FindBy(xpath="//span[.='Next']")
	private WebElement next;
	
	

	
	
	public WebElement getShip() {
		return ship;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getAdd1() {
		return add1;
	}

	public WebElement getAdd2() {
		return add2;
	}

	public WebElement getAdd3() {
		return add3;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getZipcode() {
		return zipcode;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getDeliverycharge() {
		return deliverycharge;
	}

	public WebElement getNext() {
		return next;
	}

	
}
