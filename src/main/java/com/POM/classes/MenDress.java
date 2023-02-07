package com.POM.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenDress {
	
	public WebDriver driver;
	
	public MenDress(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(xpath="(//li [@class='item product product-item'])[8]/descendant::div[.='XL']")
	private WebElement dsize2;
	
	@FindBy(xpath="(//div[@attribute-id='93'])[8]//child::div[@option-label='Black']")
	private WebElement dcolor2;
	
	@FindBy(xpath="(//span[.='Add to Cart'])[8]")
	private WebElement cart2;
	
	@FindBy(xpath="(//span[.='My Cart'])[1]/following-sibling::span[@class='counter qty']")
	private WebElement mycart;
	
	@FindBy(xpath="//div[@class='actions']//child::button[@type='button']")
	private WebElement checkout;

	
	
	
	public WebElement getDsize2() {
		return dsize2;
	}

	public WebElement getDcolor2() {
		return dcolor2;
	}

	public WebElement getCart2() {
		return cart2;
	}

	public WebElement getMycart() {
		return mycart;
	}

	public WebElement getCheckout() {
		return checkout;
	}
	
	
}
