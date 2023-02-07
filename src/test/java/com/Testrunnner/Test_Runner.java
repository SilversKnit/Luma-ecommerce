package com.Testrunnner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.Base_Class.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\SFeaturefile\\ffile.feature" , 
				 glue= "com.Step_Definition",
				 //dryRun = true,
				 // tags = ("@Purchase"),
				 plugin = {"html:Reports/htmlfile.html","json:Reports/jsonfile.json" ,
						 //"com.cucumber.listener.ExtentCucumberFormatter:Reports/Extent.html"
						 } )

public class Test_Runner {
	
	@BeforeClass
	public static void open() {
		BaseClass.browser_Launch("chrome");
	}
	
	
	@AfterClass
	public static void end() {
		BaseClass.terminateBrowser();
	}
	
}
