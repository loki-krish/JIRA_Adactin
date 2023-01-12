package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.Booking_Page;
import com.adactin.pom.Login_Page;
import com.adactin.pom.SearchHotel_Page;
import com.adactin.pom.SelectHotel_Page;
import com.adactin.runnercucumber.Runner_Class;
import com.main.baseclass.Base_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends Base_Class {
	
	public static WebDriver driver = Runner_Class.driver;
	
	public static Login_Page login = new Login_Page (driver);
	public static SearchHotel_Page search = new SearchHotel_Page (driver);
	public static SelectHotel_Page hotel = new SelectHotel_Page (driver);
	public static Booking_Page book = new Booking_Page (driver);
	
	@Given("user Launch The Adactin URL")
	public void user_launch_the_adactin() {
	    url(driver, "https://adactinhotelapp.com/");
	}
	
	@When("user Enter The {string} In The Username Field")
	public void user_enter_the_in_the_username_field(String string) {
	   send_Keys(login.getEmail(), string);
	}
	
	@When("user Enter The {string} In The Password Field")
	public void user_enter_the_in_the_password_field(String string) {
	   send_Keys(login.getPswd(), string);
	}
	
	@Then("user Click The Login button And It Navigates To The Search Hotel Page")
	public void user_click_the_login_button_and_it_navigates_to_the_search_hotel_page() {
	    click(login.getLogin());
	}
	
	@When("user Select The {string} From The Location Dropdown")
	public void user_select_the_from_the_location_dropdown(String string) {
	    selectby_Visibletext(search.getLocation(), string);
	}
	
	@When("user Select The {string} From The Hotels Dropdown")
	public void user_select_the_from_the_hotels_dropdown(String string) {
	    selectby_Visibletext(search.getHotel(), string);
	}
	
	@When("user Select The {string} From The Room Type Dropdown")
	public void user_select_the_from_the_room_type_dropdown(String string) {
	    selectby_Visibletext(search.getRoom_type(), string);
	}
	
	@When("user Select The {string} From The Number Of Rooms Dropdown")
	public void user_select_the_from_the_number_of_rooms_dropdown(String string) {
	    selectby_Visibletext(search.getRoom_nos(), string);
	}
	
	@When("user Enter The {string} In The Checkin Date Field")
	public void user_enter_the_in_the_checkin_date_field(String string) {
	   send_Keys(search.getCheckin(), string);
	}
	
	@When("user Enter The {string} In The Checkout Date Field")
	public void user_enter_the_in_the_checkout_date_field(String string) {
	   send_Keys(search.getCheckout(), string);
	}
	
	@When("user Select The {string} From The Adults Per Room Dropdown")
	public void user_select_the_from_the_adults_per_room_dropdown(String string) {
	   selectby_Visibletext(search.getAdult_room(), string);
	}
	
	@When("user Select The {string} From The Children Per Room Dropdown")
	public void user_select_the_from_the_children_per_room_dropdown(String string) {
	    selectby_Visibletext(search.getChild_room(), string);
	}
	
	@Then("user Click The Search button And It Navigates To The Select Hotel Page")
	public void user_click_the_search_button_and_it_navigates_to_the_select_hotel_page() {
	    click(search.getSubmit());
	}

	@When("user Select The Radio button In The Select Field")
	public void user_select_the_radio_button_in_the_select_field() {
	   click(hotel.getRadio_btn());
	}
	
	@When("user Select The Continue button And It Navigates To The Book A Hotel Page")
	public void user_select_the_continue_button_and_it_navigates_to_the_book_a_hotel_page() {
		click(hotel.getContinue_btn());
	}

	@When("user Enter The {string} In The First Name Field")
	public void user_enter_the_in_the_first_name_field(String string) {
	    send_Keys(book.getFirst_name(), string);
	}
	@When("user Enter The {string} In The Last Name Field")
	public void user_enter_the_in_the_last_name_field(String string) {
	   send_Keys(book.getLast_name(), string);
	}
	
	@When("user Enter The {string} In The Billing Address Field")
	public void user_enter_the_in_the_billing_address_field(String string) {
	    send_Keys(book.getAddress(), string);
	}
	
	@When("user Enter The {string} In The Credit Card No. FIeld")
	public void user_enter_the_in_the_credit_card_no_f_ield(String string) {
	    send_Keys(book.getCc_num(), string);
	}
	
	@When("user Select The {string} From The Credit card Type Dropdown")
	public void user_select_the_from_the_credit_card_type_dropdown(String string) {
		selectby_Visibletext(book.getCc_type(), string);
	}

	@When("user Select The {string} From The Expiry Month Dropdown")
	public void user_select_the_from_the_expiry_month_dropdown(String string) {
 		selectby_Visibletext(book.getExp_month(), string);
	}
	
	@When("user Select The {string} From The Expiry Year Dropdown")
	public void user_select_the_from_the_expiry_year_dropdown(String string) {
		selectby_Visibletext(book.getExp_year(), string);
	}
	
	@When("user Enter The {string} In The CVV Number Field")
	public void user_enter_the_in_the_cvv_number_field(String string) {
		send_Keys(book.getCvv_num(), string);
	}
	
	@Then("user Click The Book Now button And It Navigates To The Booking Confirmation Page")
	public void user_click_the_book_now_button_and_it_navigates_to_the_booking_confirmation_page() {
	    click(book.getBook_now());
	}



}
