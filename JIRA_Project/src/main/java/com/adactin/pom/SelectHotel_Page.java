package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel_Page {
	
	public WebDriver driver;
	
	@FindBy (xpath = "//input[@type='radio']")
	private WebElement radio_btn;
	
	@FindBy (xpath = "//input[@type='submit']")
	private WebElement continue_btn;
	
	
	public SelectHotel_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadio_btn () {
		return radio_btn;
	}
	
	public WebElement getContinue_btn () {
		return continue_btn;
	}

}
