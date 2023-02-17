package com.Base_Class;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	protected static WebDriver driver;
	
	//browserLaunch
	public static WebDriver browser_Launch(String browserlaunch) {
		
		if(browserlaunch.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Ragul S\\eclipse-workspace\\Maven-project-5practice-cucumber\\Driver\\ChromeDriver 110.0.5481.77.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		} else if(browserlaunch.equalsIgnoreCase("firefox"))  {
			
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ ".\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
		}
		
		return driver;
		
	}
	//
	
	
	//Browser commands---------------------------------------------------------------Browser commands
	public static void open_Website(String site) {	
		driver.get(site);
	}
	
	public static void title() {       
		System.out.println(driver.getTitle());
	}
	
	public static void Url() {
		System.out.println(driver.getCurrentUrl());
	}
	
	public static void pageSource() {
		System.out.println(driver.getPageSource());
	}
	
	public static void closeWindow() {	
		driver.close();
	}
	
	public static void terminateBrowser() {	
		driver.quit();
	}
	//
	
	
	//Navigate commands-------------------------------------------------------------Navigate commands
	public static void navTo(String site) {	
		driver.navigate().to(site);
	}
	
	public static void navBack() {	
		driver.navigate().back();
	}
	
	public static void navForward() {
		driver.navigate().forward();
	}
	
	public static void navRefresh() {
		driver.navigate().refresh();
	}
	//
	
	
	//WebElement commands---------------------------------------------------WebElement commands
	public static void passInput(WebElement element, String input) {
		element.sendKeys(input);
	}
	
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	
	public static void delete(WebElement element) {
		element.clear();
	}
	
	public static void text(WebElement element) {
		System.out.println(element.getText());
	}
	
	public static void attribute(WebElement element,String value) {
		System.out.println(element.getAttribute(value));
	}
	
	public static void displayed(WebElement element ) {
		System.out.println(element.isDisplayed());
	}
	
	public static void enabled(WebElement element) {
		System.out.println(element.isEnabled());
	}
	
	public static void selected(WebElement element) {
		System.out.println(element.isSelected());
	}
	//

	
	//alert--------------------------------------------------------------------alert
	public static void alertAccept() {	
		driver.switchTo().alert().accept();
	}
	
	public static void alertDismiss() {
		driver.switchTo().alert().dismiss();
	}

	public static void alertSendKeys(String input) {
	driver.switchTo().alert().sendKeys(input);
	}
	//
	
	
	//actions-----------------------------------------------------------------actions
	public static void actionClick(WebElement element) { //1
		
		Actions aa = new Actions(driver);	
		aa.click(element).build().perform();
		
	}
	
	public static void actionDoubleClick(WebElement element) {  //2
		
		Actions aa = new Actions(driver);	
		aa.doubleClick(element).build().perform();
		
	}

	public static void actionContextClick(WebElement element) {  //3
	
		Actions aa = new Actions(driver);
		aa.contextClick(element).build().perform();
	
	}
	
	public static void actionMoveToElement(WebElement element) { //4
		
		Actions aa = new Actions(driver);
		aa.moveToElement(element).build().perform();
	
	}
	
	
	public static void actionDragAndDrop(WebElement element1, WebElement element2) { //5
	
		Actions aa = new Actions(driver);
		aa.dragAndDrop(element1,element2).build().perform();
	
	}
	
	
	public static void actionHold(WebElement element) { //6
		
		Actions aa = new Actions(driver);
		aa.clickAndHold(element).build().perform();
	
	}
	
	public static void actionRelease(WebElement element) { //7
		
		Actions aa = new Actions(driver);
		aa.release(element).build().perform();
	
	}
    //
	
	
	//Robot-----------------------------------------------------------------Robot
		public static void keyBoard(int vk) throws AWTException {      
			
			Robot r = new Robot();
			r.keyPress(vk);          //up38 down40 enter10
			r.keyRelease(vk);
			
		}
	//
		
	
	//screenshot---------------------------------------------------------screenshot
	public static void sshot(String file) throws IOException {
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Ragul S\\eclipse-workspace\\Maven-project-5practice-cucumber\\sshot\\" + file);
		FileUtils.copyFile(source, destination);
		
	}
	//
	
	
	//scroll-up-down---------------------------------------------------scroll-up-down
	public static void scroll(int xnum,int ynum) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+xnum+","+ynum+")");
		
	}
	
	public static void scrollClick(WebElement element) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",element);
		
	}
	//
	
	
	//drop-down------------------------------------------------------------drop-down
	public static void ddSelectIndex(WebElement element,int index) { //1
		
		Select s = new Select(element);
		s.selectByIndex(index);
		
	}
	 
	public static void ddSelectValue(WebElement element,String value) { //2
		
		Select s = new Select(element);
		s.selectByValue(value);
		
	}
	
	public static void ddSelectText(WebElement element,String text) { //3
		
		Select s = new Select(element);
		s.selectByVisibleText(text);
		
	}
	
	public static void ddDeselectIndex(WebElement element,int index) { //4
		
		Select s = new Select(element);
		s.deselectByIndex(index);
		
	}
	
	public static void ddDeselectValue(WebElement element,String value) { //5
		
		Select s = new Select(element);
		s.deselectByValue(value);
		
	}
	
	public static void ddDeselectText(WebElement element,String text) { //6
		
		Select s = new Select(element);
		s.deselectByVisibleText(text);
		
	}
	
	
	public static void ddDelesectAll(WebElement element) { //7
		
		Select s = new Select(element);
		s.deselectAll();
		
	}
	
	public static void ddIsmultiple(WebElement element) { //8
		
		Select s = new Select(element);
		System.out.println(s.isMultiple());
		
	}
	
	public static void ddOptions(WebElement element) { //9
		
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for(WebElement option:options) {
			System.out.println(option.getText());
		}
		
	}
	
	public static void ddFristSelected(WebElement element) { //10
		
		Select s = new Select(element);
		WebElement firstselected = s.getFirstSelectedOption();
		System.out.println(firstselected.getText());
		
	}
	
	public static void ddAllSelected(WebElement element) { //11
		
		Select s = new Select(element);
		List<WebElement> allselected = s.getOptions();
		for(WebElement allselect:allselected) {
			System.out.println(allselect.getText());
		}
		
	}
	//
	
	
	//check-box----------------------------------------------------------check-box
	public static void checkBox(WebElement element) {
		
		element.click();
		
	}
	//
	
	
	//radio-button------------------------------------------------------radio-button
	public static void radioButton(WebElement element) {
		
		element.click();
		
	}
	
	
	public static void radioButtonIndex(List<WebElement> element, int x) {
		
		int button = element.size();
		
		for(int i = 1;i<button;i++) {
			
			element.get(x).click();
		}
		
	}
	//
	
	
	//frame-------------------------------------------------------------------frame
	public static void frame(int x) {
		
		driver.switchTo().frame(x);
		
	}
	
	public static void frame(String x) {
		
		driver.switchTo().frame(x);
		
	}

	public static void frame(WebElement element) {
	
		driver.switchTo().frame(element);
	
	}
	
	public static void frameBack() {
		
		driver.switchTo().parentFrame();
		
	}
	
	public static void frameHome() {
		
		driver.switchTo().defaultContent();
		
	}
	//
	
	
	//WindowHandle--------------------------------------------------WindowHandle
	public static void windowHandleID() {
		
		System.out.println(driver.getWindowHandle());
		
	}
	
	public static void multipleWindowHandle(String x) {
		
		Set<String> windowHandles = driver.getWindowHandles();
		for(String window : windowHandles) {
			
			if(x.equalsIgnoreCase("id")) {
				System.out.println(driver.switchTo().window(window).getWindowHandle());	
			}
			else if(x.equalsIgnoreCase("title")) {
				System.out.println(driver.switchTo().window(window).getTitle());
			}
		}
		
	}
	
	public static void multipleWindowSize() {
		
		System.out.println(driver.getWindowHandles().size());
		
	}
	
	//switch-between-TABS
	public static void switchTabs(int index) {
		
		Set<String> windows = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windows);
		
		driver.switchTo().window(list.get(index));
			
	}
	
	//closeOtherTabs
	public static void closeOtherTabs() {
		
		Set<String> window = driver.getWindowHandles();
		String current = driver.getWindowHandle();
		for(String win:window) {
			
			if(!win.equals(current)) {
				driver.switchTo().window(win).close();
			}
		}
		
	}
	//
	
	
	//Wait------------------------------------------------------Wait
	public static void threadWait(int seconds) throws InterruptedException {
			
		Thread.sleep(seconds);
			
	}
		
		
	public static void implicitWait(int seconds) {
			
		driver.manage().timeouts().implicitlyWait(seconds,TimeUnit.SECONDS);
			
	}
		
	
	public static void explicitWait(int seconds, WebElement element) {
			
		WebDriverWait ww = new WebDriverWait(driver,seconds); 
		ww.until(ExpectedConditions.visibilityOf(element));
	}

   
		
	//
	
	
	
	//-----------------------------------------------------------------------//
	
	
}
