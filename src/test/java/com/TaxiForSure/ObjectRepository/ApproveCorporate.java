package com.TaxiForSure.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApproveCorporate {

	
	@FindBy(id="userName")
	private WebElement userNameEdt;
	
	@FindBy(id="clientStatus")
	private WebElement clientStatusSel;
	
	@FindBy(id="submit_button")
	private WebElement submitBtn;

	public WebElement getUserNameEdt() {
		return userNameEdt;
	}

	public WebElement getClientStatusSel() {
		return clientStatusSel;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
}
