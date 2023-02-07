package com.POM.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Homepage {
	
	public WebDriver driver;
	
	public Homepage(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(xpath = "//main[@id='maincontent']/descendant::div[@option-id='168'][3]")
	private WebElement dsize1 ;
	
	@FindBy(xpath="//main[@id='maincontent']/descendant::div[@id='option-label-color-93-item-52'][1]")
	private WebElement dcolor1;
	
	@FindBy(xpath="(//span[.='Add to Cart'])[3]")
	private WebElement cart1;
	
	@FindBy(xpath="//div[@class='message global demo']/following-sibling::div[@class='page-wrapper']/descendant::ul[@id='ui-id-2']/descendant::span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e'][4]")
	private WebElement MensTab1;
	
	@FindBy(xpath="(//li[@role='presentation'])[12]/child::a[@class='ui-corner-all']")
	private WebElement Tab2;
	
	@FindBy(xpath = "//div[@class='message global demo']/following-sibling::div[@class='page-wrapper']/descendant::ul[@id='ui-id-2']/descendant::span[.='Hoodies & Sweatshirts'][2]")
	private WebElement hoodietab3;

	
	public WebElement getDsize1() {
		return dsize1;
	}

	public WebElement getDcolor1() {
		return dcolor1;
	}

	public WebElement getCart() {
		return cart1;
	}

	public WebElement getMensTab1() {
		return MensTab1;
	}

	public WebElement getTab2() {
		return Tab2;
	}

	public WebElement getHoodietab3() {
		return hoodietab3;
	}
	

}
