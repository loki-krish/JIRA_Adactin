package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public WebDriver driver; // no value
	
	@FindBy (xpath = "//input[@id = 'username']")
	private WebElement email;
	
	@FindBy (xpath = "//input[@id = 'password']")
	private WebElement pswd;
	
	@FindBy (xpath = "//input[@id = 'login']")
	private WebElement login;
	
	
	public Login_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}


	public WebElement getEmail () {
		return email;
	}
	
	public WebElement getPswd () {
		return pswd;
	}
	
	public WebElement getLogin () {
		return login;
	}
	
}
