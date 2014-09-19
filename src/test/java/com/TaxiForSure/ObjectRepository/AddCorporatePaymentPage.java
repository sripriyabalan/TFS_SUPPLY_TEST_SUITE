package com.TaxiForSure.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCorporatePaymentPage {

	@FindBy(id="clientName")
	private WebElement clientNameSel;
	
	@FindBy(id="paymentFor")
	private WebElement paymentForSel;;
	
	@FindBy(id="amount")
	private WebElement amountEdt;
	
	@FindBy(id="paymentType")
	private WebElement paymentTypeSel;
	
	@FindBy(id="paymentDate")
	private WebElement paymentDateEdt;
	
	@FindBy(id="referenceNumber")
	private WebElement referenceNumEdt;
	
	@FindBy(id="valueDate")
	private WebElement valueDateEdt;
	
	public WebElement getClientNameSel() {
		return clientNameSel;
	}

	public WebElement getPaymentForSel() {
		return paymentForSel;
	}

	public WebElement getAmountEdt() {
		return amountEdt;
	}

	public WebElement getPaymentTypeSel() {
		return paymentTypeSel;
	}

	public WebElement getPaymentDateEdt() {
		return paymentDateEdt;
	}

	public WebElement getReferenceNumEdt() {
		return referenceNumEdt;
	}

	public WebElement getValueDateEdt() {
		return valueDateEdt;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	@FindBy(id="submit_button")
	private WebElement submitBtn;
	
}
