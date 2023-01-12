package com.adactin.runnerpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.adactin.pom.Booking_Page;
import com.adactin.pom.Login_Page;
import com.adactin.pom.SearchHotel_Page;
import com.adactin.pom.SelectHotel_Page;
import com.main.baseclass.Base_Class;

public class Runner_Class extends Base_Class {
	
	public static WebDriver driver;
	
	public static void main (String[] args) {
		
		driver = Base_Class.browser_Launch("chrome");;
		
		url(driver, "https://adactinhotelapp.com/");
		
		implicit_Wait(driver);
			
		Login_Page login = new Login_Page (driver);
		
		send_Keys(login.getEmail(), "krishloe");
		
		send_Keys(login.getPswd(), "abcd1234");
		
		click(login.getLogin());
		
		SearchHotel_Page search = new SearchHotel_Page (driver);
		
		click(search.getLocation());
		
		selectby_Visibletext(search.getLocation(), "Brisbane");
		
		selectby_Visibletext(search.getHotel(), "Hotel Creek");
		
		selectby_Index(search.getRoom_type(), 1);
		
		selectby_Visibletext(search.getRoom_nos(), "1 - One");
		
		send_Keys(search.getCheckin(), "10/01/2023");
		
		send_Keys(search.getCheckout(), "12/01/2023");
		
		selectby_Visibletext(search.getAdult_room(), "2 - Two");
		
		selectby_Visibletext(search.getChild_room(), "0 - None");
		
		click(search.getSubmit());
		
		SelectHotel_Page select = new SelectHotel_Page (driver);
		
		click(select.getRadio_btn());
		
		click(select.getContinue_btn());
		
		Booking_Page book = new Booking_Page (driver);
		
		send_Keys(book.getFirst_name(), "Krish");
		
		send_Keys(book.getLast_name(), "Laws");
		
		send_Keys(book.getAddress(), "High Tower Park, Radisson Chennai");
		
		send_Keys(book.getCc_num(), "1234567890123456");
		
		selectby_Visibletext(book.getCc_type(), "American Express");
		
		selectby_Visibletext(book.getExp_month(), "April");
		
		selectby_Visibletext(book.getExp_year(), "2022");
		
		send_Keys(book.getCvv_num(), "345");
		
		click(book.getBook_now());
		
		
	}

}
