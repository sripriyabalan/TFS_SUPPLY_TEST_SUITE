package com.TaxiForSure.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettlementPage {

	@FindBy(id="id_operator")
	private WebElement operatorSel; 
	
	public WebElement getOperatorSel() {
		return operatorSel;
	}

	public WebElement getSettlementSubmitBtn() {
		return settlementSubmitBtn;
	}

	public WebElement getLogoutLnk() {
		return logoutLnk;
	}

	public WebElement getInvoiceLnk() {
		return invoiceLnk;
	}

	@FindBy(id="submit_settlements")
	private WebElement  settlementSubmitBtn;
	
	@FindBy(linkText="Logout")
	private WebElement logoutLnk;
	
	@FindBy(linkText="Invoicing")
	private WebElement invoiceLnk;
	
	@FindBy(xpath="//div[@id='prepaid']/h3")
	private WebElement prepaidSummaryheader;

	public WebElement getPrepaidSummaryheader() {
		return prepaidSummaryheader;
	}
	
	@FindBy(id="id_operator_2")
	private WebElement paymentOperatorSel;
	
	public WebElement getPaymentOperatorSel() {
		return paymentOperatorSel;
	}

	public WebElement getPaymentModeSel() {
		return paymentModeSel;
	}

	public WebElement getAuthorizedByEdt() {
		return authorizedByEdt;
	}

	public WebElement getPaymentRemarksEdt() {
		return paymentRemarksEdt;
	}

	public WebElement getPaymentForEdt() {
		return paymentForEdt;
	}

	public WebElement getAmountPaidEdt() {
		return amountPaidEdt;
	}

	public WebElement getReferenceNumEdt() {
		return referenceNumEdt;
	}

	@FindBy(id="id_payment_mode_addpayment")
	private WebElement paymentModeSel;
	
	@FindBy(id="id_auth_by")
	private WebElement authorizedByEdt;
	
	@FindBy(id="id_remarks")
	private WebElement paymentRemarksEdt;
	
	@FindBy(id="id_payment_for")
	private WebElement paymentForEdt;
	
	@FindBy(id="id_amount_paid")
	private WebElement amountPaidEdt;
	
	@FindBy(id="id_ref_num")
	private WebElement referenceNumEdt;
	
	@FindBy(id="submit_payment")
	private WebElement paymentSubmit;

	public WebElement getPaymentSubmit() {
		return paymentSubmit;
		
		
	}
	
	@FindBy(id="section_payments")
	private WebElement paymentSectionLnk;

	public WebElement getPaymentSectionLnk() {
		return paymentSectionLnk;
	}
	
	@FindBy(id="section_settlements")
	private WebElement settlementSectionLnk;

	public WebElement getSettlementSectionLnk() {
		return settlementSectionLnk;
	}
	
	
	@FindBy(id="section_history")
	private WebElement paymentHistoryLnk;
	
	@FindBy(id="id_operator_3")
	private WebElement operatoryHistorySel;
	
	@FindBy(xpath="//div[@id='payment_history']/button[1]")
	private WebElement paymentHistorySubmitBtn;

	public WebElement getPaymentHistoryLnk() {
		return paymentHistoryLnk;
	}

	public WebElement getOperatoryHistorySel() {
		return operatoryHistorySel;
	}

	public WebElement getPaymentHistorySubmitBtn() {
		return paymentHistorySubmitBtn;
	}
	
	
	@FindBy(id="total_set")
	private WebElement totalSettlementHistoryHeader;

	public WebElement getTotalSettlementHistoryHeader() {
		return totalSettlementHistoryHeader;
	}
	
	@FindBy(id="id_city")
	private  WebElement citySel;

	public WebElement getCitySel() {
		return citySel;
	}
	
	
		
}
