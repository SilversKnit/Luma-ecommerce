package com.Step_Definition;

import java.io.IOException;
import java.sql.DriverManager;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Base_Class.BaseClass;
import com.POManger.Class.Manager;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{
	
	Manager om = new Manager(driver);
	
	@Before
	public void beforeHooks(Scenario s) {
		String name = s.getName();
		System.out.println(name);
	}
	
	@After
	public void afterHooks(Scenario s) throws IOException {
		Status status = s.getStatus();
		System.out.println(status);
		if(s.isFailed()) {
			sshot("failed.png");
		}
	}
	
	@AfterStep
	public void attachScreenshot(Scenario s) {
		if(s.isFailed()) {
			byte[] TakenSShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			s.attach(TakenSShot, "image/png", "err scrn");
		}
	}
	
	
	
	@Given("user Enter {string} To Launch The Website")
	public void user_enter_to_launch_the_website(String url) {
		open_Website(url);
		implicitWait(25);
	}

	@When("user Choose The Size Of The Item1")
	public void user_choose_the_size_of_the_item1() {
	    clickOnElement(om.getObjectHomepage().getDsize1());
	}

	@When("user Choose The Color Of The Item1")
	public void user_choose_the_color_of_the_item1() {
	  clickOnElement(om.getObjectHomepage().getDcolor1());
	}
	
	@When("user Add To Cart To Add Item1")
	public void user_add_to_cart_to_add_item1() {
	  clickOnElement(om.getObjectHomepage().getCart());
	}
	
	@Then("Hover and Click Mens Hoodies In Mens Dropdown List To Naviagte To The Hoodies Section")
	public void hover_and_click_mens_hoodies_in_mens_dropdown_list_to_naviagte_to_the_hoodies_section() {
	 
		actionMoveToElement(om.getObjectHomepage().getMensTab1());
		actionMoveToElement(om.getObjectHomepage().getTab2());
		actionMoveToElement(om.getObjectHomepage().getHoodietab3());
		actionClick(om.getObjectHomepage().getHoodietab3());
	}
	

	//page2
	
	@When("user Choose The Size Of The Item2")
	public void user_choose_the_size_of_the_item2() {
		scroll(0, 2000);
		clickOnElement(om.getObjectMenDress().getDsize2());
	}
	
	@When("user Choose The Color Of The Item2")
	public void user_choose_the_color_of_the_item2() {
		clickOnElement(om.getObjectMenDress().getDcolor2());
	}
	
	@When("user Add To Cart To Add Item2")
	public void user_add_to_cart_to_add_item2() throws InterruptedException {
	    clickOnElement(om.getObjectMenDress().getCart2());
	    threadWait(3000);
	}
	
	@Then("user Click My Cart")
	public void user_click_my_cart() {
		scroll(0, -2000);
		clickOnElement(om.getObjectMenDress().getMycart());
	}
	
	@Then("user Click Proceed To Shiping Page")
	public void user_click_proceed_to_shiping_page() {
		clickOnElement(om.getObjectMenDress().getCheckout());
	}
	
	@When("user Enter {string} In The Email")
	public void user_enter_in_the_email(String email) throws InterruptedException {
		//explicitWait(25, om.getObjectShiping().getShip() );
		threadWait(6000);
		passInput(om.getObjectShiping().getEmail(), email);
	}
	
	@When("user Enter {string} In The Firstname")
	public void user_enter_in_the_firstname(String firstname) {
		passInput(om.getObjectShiping().getFirstname(), firstname);
		
	}
	
	@When("user Enter {string} In The Lastname")
	public void user_enter_in_the_lastname(String lastname) {
	    passInput(om.getObjectShiping().getLastname(), lastname);
	}
	
	@When("user Enter {string} In The Company")
	public void user_enter_in_the_company(String company) {
		passInput(om.getObjectShiping().getCompany(), company);
	}
	
	@When("user Enter {string} In The First Address")
	public void user_enter_in_the_first_address(String add1) {
		passInput(om.getObjectShiping().getAdd1(), add1);
	}
	
	@When("user Enter {string} In The Second Address")
	public void user_enter_in_the_second_address(String add2) {
	    passInput(om.getObjectShiping().getAdd2(), add2); 
	}
	
	@When("user Enter {string} In The Third Address")
	public void user_enter_in_the_third_address(String add3) {
	    passInput(om.getObjectShiping().getAdd3(), add3);
	}
	
	@When("user Enter {string} In The City")
	public void user_enter_in_the_city(String city) {
	    passInput(om.getObjectShiping().getCity(), city);
	}
	
	@When("user Select {string} In The State")
	public void user_select_in_the_state(String state) {
	   ddSelectText(om.getObjectShiping().getState(), state);
	}
	
	@When("user Enter {string} In The Zipcode")
	public void user_enter_in_the_zipcode(String zipcode) {
	    passInput(om.getObjectShiping().getZipcode(), zipcode);
	}
	
	@When("user Select {string} In The Country")
	public void user_select_in_the_country(String country) {
		ddSelectText(om.getObjectShiping().getCountry(), country);
	}
	
	@When("user Enter {string} In The Phone")
	public void user_enter_in_the_phone(String phone) {
		passInput(om.getObjectShiping().getPhone(), phone);
	}
	
	@When("user Click Radiobutton for Delivery Charge")
	public void user_click_radiobutton_for_delivery_charge() throws InterruptedException {
		threadWait(3000);
	   radioButton(om.getObjectShiping().getDeliverycharge());
	   threadWait(3000);
	}
	
	@Then("user Click Nextbutton To Navigate To Purchase Confirmation Page")
	public void user_click_nextbutton_to_navigate_to_purchase_confirmation_page() {
	    clickOnElement(om.getObjectShiping().getNext());
	}

	@Then("user Click Place The Order To Purchase Completion")
	public void user_click_place_the_order_to_purchase_completion() throws InterruptedException {
		threadWait(6000);
		clickOnElement(om.getObjectOrder().getPlaceorder());
		threadWait(4000);
	}
	
	@Then("user Click Continue To Resume Shoping")
	public void user_click_continue_to_resume_shoping() throws InterruptedException {
		
		clickOnElement(om.getObjectOrder().getContin());
		threadWait(4000);
	}


}
