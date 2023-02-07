package com.Maven_project_5practice_cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base_Class.BaseClass;

public class BaseRunner extends BaseClass {
	
	public void base() {
		
		browser_Launch("chrome");
		driver.get("https://magento.softwaretestingboard.com/");
		implicitWait(25);
		
	}
	
	
	public void page1() throws InterruptedException {
		//page1
		WebElement wb1 = driver.findElement(By.xpath("//main[@id='maincontent']/descendant::div[@option-id='168'][3]"));
		wb1.click();
		
		WebElement wb2 = driver.findElement(By.xpath("//main[@id='maincontent']/descendant::div[@id='option-label-color-93-item-52'][1]"));
		wb2.click();
		
		driver.findElement(By.xpath("(//span[.='Add to Cart'])[3]")).click();
		
		WebElement wb3 = driver.findElement(By.xpath("//div[@class='message global demo']/following-sibling::div[@class='page-wrapper']/descendant::ul[@id='ui-id-2']/descendant::span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e'][4]"));
		actionMoveToElement(wb3);
		
		
		WebElement wb4 = driver.findElement(By.xpath("(//li[@role='presentation'])[12]/child::a[@class='ui-corner-all']"));
		actionMoveToElement(wb4);
		
		WebElement wb5 = driver.findElement(By.xpath("//div[@class='message global demo']/following-sibling::div[@class='page-wrapper']/descendant::ul[@id='ui-id-2']/descendant::span[.='Hoodies & Sweatshirts'][2]"));
		actionMoveToElement(wb5);
		actionClick(wb5);
	
		//page2
		scroll(0, 2000);
	
		WebElement wb6 = driver.findElement(By.xpath("(//li [@class='item product product-item'])[8]/descendant::div[.='XL']"));
		wb6.click();
		
		WebElement wb7 = driver.findElement(By.xpath("(//div[@attribute-id='93'])[8]//child::div[@option-label='Black']"));
		wb7.click();
		
		WebElement wb8 = driver.findElement(By.xpath("(//span[.='Add to Cart'])[8]"));
		wb8.click();
		
		scroll(0, -2000);
		//threadWait(5000);
		//driver.findElement(By.xpath("(//span[.='My Cart'])[1]")).click();
		driver.findElement(By.xpath("(//span[.='My Cart'])[1]/following-sibling::span[@class='counter qty']")).click();
		driver.findElement(By.xpath("//div[@class='actions']//child::button[@type='button']")).click();
		
		
	}
	
	public void ship() throws InterruptedException {
		//page3
		threadWait(4000);
		WebElement wb9 = driver.findElement(By.xpath("(//label[@class='label'])[3]/following-sibling::div/input"));
		wb9.sendKeys("mail123@mail.com");
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Jon");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Wick");
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("Apple Inc");
		driver.findElement(By.xpath("//input[@name='street[0]']")).sendKeys("1/18, london street");
		driver.findElement(By.xpath("//input[@name='street[1]']")).sendKeys("Middle Area");
		driver.findElement(By.xpath("//input[@name='street[2]']")).sendKeys("Chelsea");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("London");
		//state
		WebElement wb10 = driver.findElement(By.xpath("(//select[@class='select'])[1]"));
		ddSelectValue(wb10, "19");
		driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("12345-6789");
		//country
		WebElement wb11 = driver.findElement(By.xpath("(//select[@class='select'])[2]"));
		ddSelectValue(wb11, "US");
		driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("033 8974526");
		threadWait(3000);
		driver.findElement(By.xpath("(//input[@class='radio'])[1]")).click(); //radio button
		threadWait(3000);
		driver.findElement(By.xpath("//span[.='Next']")).click();
		
		//page4
		threadWait(3000);
		driver.findElement(By.xpath("//span[.='Place Order']")).click();
		threadWait(4000);
		//page5
		driver.findElement(By.xpath("//span[.='Continue Shopping']")).click();
		threadWait(4000);
		
		terminateBrowser();
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		BaseRunner br = new BaseRunner();
		br.base();
		br.page1();
		br.ship();
		
	}
	
	

}





//home page1 - select one dress - add to cart
//mens page2 - select one dress - add to cart
//shipping page3 - fill out details 
//confirm page to pay 
//continue shopping  page4 - click to get main home page



