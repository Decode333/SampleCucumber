package com.bulk;

import org.basemethods.BaseClass;

import com.pom.Address;
import com.pom.LoginPage;
import com.pom.OrderID;
import com.pom.SearchHotel;
import com.pom.SelectHotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BulkStepDef extends BaseClass {
	BaseClass b = new BaseClass();
	@Given("user needs to initiate {string} and launch {string}")
	public void userNeedsToInitiateAndLaunch(String browser, String url) {
		driverInitiate(browser);
		launchUrl(url);
		waitFor();
	}

	@Given("user needs to enter valid username {string} and valid password {string}")
	public void userNeedsToEnterValidUsernameAndValidPassword(String username, String password) {
		LoginPage l = new LoginPage();
		b.passText(l.getUsername(), username);
		b.passText(l.getPassword(), password);
	}

	@Given("user needs to click on the login button")
	public void userNeedsToClickOnTheLoginButton() {
		LoginPage l = new LoginPage();
		b.elementClick(l.getLoginBtn());
	}

	@Then("user needs to enter {string}, select {string}, select {string}, {string}, {string} date, {string} date , {string}, {string}")
	public void userNeedsToEnterSelectSelectDateDate(String loc, String hotel, String roomtype, String noOfRooms, String checkIn, String checkOut, String noOfAdults, String noOfChild) {
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
	public void userNeedsToClickOnTheSearchButton() {
		SearchHotel h = new SearchHotel();
		b.elementClick(h.getSearch());
	}

	@Then("user needs to select the radio button of the hotel and click continue button")
	public void userNeedsToSelectTheRadioButtonOfTheHotelAndClickContinueButton() {
		SelectHotel h = new SelectHotel();
		b.elementClick(h.getHotelBtn());
		b.elementClick(h.getContinueBtn());
	}

	@Then("user needs to enter {string}, {string}, {string}, {string}, {string}, expiry {string}, expiry {string} and {string} no")
	public void userNeedsToEnterExpiryExpiryAndNo(String firstname, String lastname, String address, String ccno, String cctype, String month, String year, String cvv) {
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
	public void userNeedsToClickBookNowButton() {
		Address a = new Address();
		b.elementClick(a.getBookNowBtn());
	}

	@Then("user validates the order id generated")
	public void userValidatesTheOrderIdGenerated() {
		OrderID o = new OrderID();
		System.out.println(b.attributeValue(o.getOrderNo(), "value"));
	}	
}
