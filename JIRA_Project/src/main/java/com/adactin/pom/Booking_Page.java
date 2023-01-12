package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Page {
	
	public WebDriver driver;
	
	@FindBy (xpath = "//input[@id='first_name']")
	private WebElement first_name;
	
	@FindBy (xpath = "//input[@id='last_name']")
	private WebElement last_name;
	
	@FindBy (xpath = "//textarea[@id='address']")
	private WebElement address;
	
	@FindBy (xpath = "//input[@id='cc_num']")
	private WebElement cc_num;
	
	@FindBy (xpath = "//select[@id='cc_type']")
	private WebElement cc_type;
	
	@FindBy (xpath = "//select[@id='cc_exp_month']")
	private WebElement exp_month;
	
	@FindBy (xpath = "//select[@id='cc_exp_year']")
	private WebElement exp_year;
	
	@FindBy (xpath = "//input[@id='cc_cvv']")
	private WebElement cvv_num;
	
	@FindBy (xpath = "//input[@id='book_now']")
	private WebElement book_now;

	public Booking_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc_num() {
		return cc_num;
	}

	public WebElement getCc_type() {
		return cc_type;
	}

	public WebElement getExp_month() {
		return exp_month;
	}

	public WebElement getExp_year() {
		return exp_year;
	}

	public WebElement getCvv_num() {
		return cvv_num;
	}

	public WebElement getBook_now() {
		return book_now;
	}

}
