package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel_Page {
	
	public WebDriver driver;
	
	@FindBy (xpath = "//select[@id='location']")
	private WebElement location;
	
	@FindBy (xpath = "//select[@id='hotels']")
	private WebElement hotel;
	
	@FindBy (xpath = "//select[@id='room_type']")
	private WebElement room_type;
	
	@FindBy (xpath = "//select[@id='room_nos']")
	private WebElement room_nos;
	
	@FindBy (xpath = "//input[@id='datepick_in']")
	private WebElement checkin;
	
	@FindBy (xpath = "//input[@id='datepick_out']")
	private WebElement checkout;
	
	@FindBy (xpath = "//select[@id='adult_room']")
	private WebElement adult_room;
	
	@FindBy (xpath = "//select[@id='child_room']")
	private WebElement child_room;
	
	@FindBy (xpath = "//input[@id='Submit']")
	private WebElement submit;

	public SearchHotel_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getRoom_nos() {
		return room_nos;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdult_room() {
		return adult_room;
	}

	public WebElement getChild_room() {
		return child_room;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
}
