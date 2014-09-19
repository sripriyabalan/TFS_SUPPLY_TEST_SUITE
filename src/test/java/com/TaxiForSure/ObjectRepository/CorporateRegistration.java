package com.TaxiForSure.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CorporateRegistration {

	@FindBy(id="corporateName")
	private WebElement corporateNameEdt;
	
	@FindBy(id="addressLine1")
	private WebElement addressLine1Edt;
	
	@FindBy(id="name")
	private WebElement nameEdt;
	
	@FindBy(id="mobileNumber")
	private WebElement mobileNumEdt;
	
	@FindBy(id="emailId")
	private WebElement emailIdEdt;
	
	@FindBy(id="submit_button")
	private WebElement submitBtn;

	public WebElement getCorporateNameEdt() {
		return corporateNameEdt;
	}

	public WebElement getAddressLine1Edt() {
		return addressLine1Edt;
	}

	public WebElement getNameEdt() {
		return nameEdt;
	}

	public WebElement getMobileNumEdt() {
		return mobileNumEdt;
	}

	public WebElement getEmailIdEdt() {
		return emailIdEdt;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	@FindBy(linkText="Add Corporate")
	private WebElement addCorporateLnk;
	
	@FindBy(linkText="Edit Corporate")
	private WebElement editCorporateLnk;

	public WebElement getAddCorporateLnk() {
		return addCorporateLnk;
	}

	public WebElement getEditCorporateLnk() {
		return editCorporateLnk;
	}
	
	@FindBy(id="total_set")
	private WebElement corporateListheader;

	public WebElement getCorporateListheader() {
		return corporateListheader;
	}
	
	
	
	
}
