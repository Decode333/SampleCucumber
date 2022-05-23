package com.pom;

import org.basemethods.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SelectHotel extends BaseClass {
	public SelectHotel() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement hotelBtn;
	
	@FindBy(id="continue")
	private WebElement continueBtn;

	public WebElement getHotelBtn() {
		return hotelBtn;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}
}
