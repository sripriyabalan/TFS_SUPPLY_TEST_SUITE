package com.TaxiForSure.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettlementHomePage {
	
	@FindBy(linkText="Settlement page")
	private WebElement settlementPageLnk;
	
	public WebElement getSettlementPageLnk() {
		return settlementPageLnk;
	}

	public WebElement getAddCorporatePaymentLnk() {
		return addCorporatePaymentLnk;
	}

	@FindBy(linkText="Add Corporate payment")
	private WebElement addCorporatePaymentLnk;
	
	

}
