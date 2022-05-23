package org.fullstepdef;

import org.basemethods.BaseClass;
import org.openqa.selenium.WebDriver;

import com.pom.Address;
import com.pom.LoginPage;
import com.pom.OrderID;
import com.pom.SearchHotel;
import com.pom.SelectHotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FullStepDef extends BaseClass {
	WebDriver driver;
	BaseClass b = new BaseClass();
	@Given("user needs to initiate {string} and launch {string}")
	public void user_needs_to_initiate_and_launch(String browser, String url) {
		driverInitiate(browser);
		launchUrl(url);
		waitFor();
	}

	@Given("user needs to enter valid username {string} and valid password {string}")
	public void user_needs_to_enter_valid_username_and_valid_password(String username, String password) {
		LoginPage l = new LoginPage();
		b.passText(l.getUsername(), username);
		b.passText(l.getPassword(), password);
	}

	@Given("user needs to click on the login button")
	public void user_needs_to_click_on_the_login_button() {
		LoginPage l = new LoginPage();
		b.elementClick(l.getLoginBtn());
	}

	@Then("user needs to enter location {string}, select hotel {string}, select roomtype {string}, no of rooms {string}, checkin date {string}, checkout date {string}, no of adults {string}, no of children {string}")
	public void user_needs_to_enter_location_select_hotel_select_roomtype_no_of_rooms_checkin_date_checkout_date_no_of_adults_no_of_children(String loc, String hotel, String roomtype, String noOfRooms, String checkIn, String checkOut, String noOfAdults, String noOfChild) {
		SearchHotel h = new SearchHotel();
		String droptype = "value";
		b.dropDownSelectOption(h.getLocation(), droptype, loc);
		b.dropDownSelectOption(h.getHotels(), droptype, hotel);
		b.dropDownSelectOption(h.getRoomType(), droptype, roomtype);
		b.dropDownSelectOption(h.getNoOfRooms(), droptype, noOfRooms);
		b.passText(h.getCheckIn(), checkIn);
		b.passText(h.getCheckOut(), checkOut);
		b.dropDownSelectOption(h.getAdults(), droptype, noOfAdults);
		b.dropDownSelectOption(h.getChild(), droptype, noOfChild);
		
	}

	@Then("user needs to click on the search button")
	public void user_needs_to_click_on_the_search_button() {
		SearchHotel h = new SearchHotel();
		b.elementClick(h.getSearch());
	}

	@Then("user needs to select the radio button of the hotel and click continue button")
	public void user_needs_to_select_the_radio_button_of_the_hotel_and_click_continue_button() {
		SelectHotel h = new SelectHotel();
		b.elementClick(h.getHotelBtn());
		b.elementClick(h.getContinueBtn());
		
	}

	@Then("user needs to enter firstname {string}, lastname {string}, address {string}, credit card number {string}, credit card type {string}, expiry month {string}, expiry year {string} and cvv no {string}")
	public void user_needs_to_enter_firstname_lastname_address_credit_card_number_credit_card_type_expiry_month_expiry_year_and_cvv_no(String firstname, String lastname, String address, String ccno, String cctype, String month, String year, String cvv) {
		Address a = new Address();
		String droptype = "value";
		b.passText(a.getfName(), firstname);
		b.passText(a.getlName(), lastname);
		b.passText(a.getAddr(), address);
		b.passText(a.getCreditCardNo(), ccno);
		b.dropDownSelectOption(a.getCreditCardType(), droptype, cctype);
		b.dropDownSelectOption(a.getExpiryMonth(), droptype, month);
		b.dropDownSelectOption(a.getExpiryYear(), droptype, year);
		b.passText(a.getCvvNo(), cvv);
	}

	@Then("user needs to click book now button")
	public void user_needs_to_click_book_now_button() {
		Address a = new Address();
		b.elementClick(a.getBookNowBtn());
	}

	@Then("user validates the order id generated")
	public void user_validates_the_order_id_generated() {
		OrderID o = new OrderID();
		System.out.println(b.attributeValue(o.getOrderNo(), "value"));
	}
}
