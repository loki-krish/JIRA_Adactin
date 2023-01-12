package com.adactin.runnercucumber;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.main.baseclass.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (features = "src/test/java/com/adactin/feature/Adactin.feature",
					  glue = "com.adactin.stepdefinition",
			    monochrome = true, // remove unwanted characters in console
			    	dryRun = false,// check feature file & step def before running
			       publish = true, // check feature file & step def during actual running
			       plugin  = {"html:Report/rep.html", "pretty"} // to generate report
				  //  tags = "@Ad4"
				)

public class Runner_Class {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void start () {		
		driver = Base_Class.browser_Launch("chrome");
		Base_Class.maximize(driver);
		Base_Class.implicit_Wait(driver);		
	}
	
	@AfterClass
	public static void end () {
		Base_Class.minimize(driver);
	}

}
