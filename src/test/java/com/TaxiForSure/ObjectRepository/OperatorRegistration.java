package com.TaxiForSure.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OperatorRegistration {
	@FindBy(id="panNumber")
	private WebElement panNumberEdt;
	
	@FindBy(id="operatorName")
	private WebElement operatorNameEdt;
			
	@FindBy(id="operatorLifeTime")
	private WebElement operatorLifeTimeSel;
	
	@FindBy(id="operatorType")
	private WebElement operatorTypeSel;
	
	@FindBy(id="cinNumber")
	private WebElement cinNumEdt;
	
	@FindBy(id="proprietorName")
	private WebElement properietorNameEdt;
	
	@FindBy(id="litigation")
	private WebElement litigationSel;
	
	@FindBy(id="next_button")
	private WebElement nextBtn;
	
	@FindBy(id="branch")
	private WebElement branchSel;
	
	@FindBy(id="contactPerson")
	private WebElement contactPersonEdt;
	
	@FindBy(id="email")
	private WebElement emailEdt;
	
	@FindBy(id="phoneNumber")
	private WebElement phoneNumEdt;
	
	@FindBy(id="mobileNumber")
	private WebElement mobileNumEdt;
	
	@FindBy(id="relationshipManager")
	private WebElement relationshipMgrEdt;
	
	@FindBy(id="relationshipManagerEmail")
	private WebElement relationshipMgrEmail;
	
	@FindBy(id="defaultCheckBox")
	private WebElement defaultCheckBox;
	
	@FindBy(id="defaultCommission")
	private WebElement defaultCommEdt;
	
	@FindBy(id="bankAccountNumber")
	private WebElement bankAccNumEdt;
	
	@FindBy(id="bankName")
	private WebElement bankNameEdt;
	
	@FindBy(id="bankAccountHolderName")
	private WebElement bankAccHolderNameEdt;
	
	@FindBy(id="bankIFSCCode")
	private WebElement bankIFSCCodeEdt;
	
	@FindBy(id="securityDepositAmount")
	private WebElement securityDepositAmtEdt;
	
	@FindBy(id="dateOfPayment")
	private WebElement dateOfPaymentEdt;
	
	@FindBy(id="referenceNumber")
	private WebElement refNumEdt;
	
	@FindBy(id="submit_button")
	private WebElement submitBtn;

	@FindBy(linkText="Add Company")
	private WebElement addCompanyLnk;
	
	@FindBy(linkText="Edit Company")
	private WebElement editCompanyLnk;
	
	@FindBy(id="address")
	private WebElement addressEdt;
	
	public WebElement getAddressEdt() {
		return addressEdt;
	}

	public WebElement getAddCompanyLnk() {
		return addCompanyLnk;
	}

	public WebElement getEditCompanyLnk() {
		return editCompanyLnk;
	}

	public WebElement getPanNumberEdt() {
		return panNumberEdt;
	}

	public WebElement getOperatorNameEdt() {
		return operatorNameEdt;
	}

	public WebElement getOperatorLifeTimeSel() {
		return operatorLifeTimeSel;
	}

	public WebElement getOperatorTypeSel() {
		return operatorTypeSel;
	}

	public WebElement getCinNumEdt() {
		return cinNumEdt;
	}

	public WebElement getProperietorNameEdt() {
		return properietorNameEdt;
	}

	public WebElement getLitigationSel() {
		return litigationSel;
	}

	public WebElement getNextBtn() {
		return nextBtn;
	}

	public WebElement getBranchSel() {
		return branchSel;
	}

	public WebElement getContactPersonEdt() {
		return contactPersonEdt;
	}

	public WebElement getEmailEdt() {
		return emailEdt;
	}

	public WebElement getPhoneNumEdt() {
		return phoneNumEdt;
	}

	public WebElement getMobileNumEdt() {
		return mobileNumEdt;
	}

	public WebElement getRelationshipMgrEdt() {
		return relationshipMgrEdt;
	}

	public WebElement getRelationshipMgrEmail() {
		return relationshipMgrEmail;
	}

	public WebElement getDefaultCheckBox() {
		return defaultCheckBox;
	}

	public WebElement getDefaultCommEdt() {
		return defaultCommEdt;
	}

	public WebElement getBankAccNumEdt() {
		return bankAccNumEdt;
	}

	public WebElement getBankNameEdt() {
		return bankNameEdt;
	}

	public WebElement getBankAccHolderNameEdt() {
		return bankAccHolderNameEdt;
	}

	public WebElement getBankIFSCCodeEdt() {
		return bankIFSCCodeEdt;
	}

	public WebElement getSecurityDepositAmtEdt() {
		return securityDepositAmtEdt;
	}

	public WebElement getDateOfPaymentEdt() {
		return dateOfPaymentEdt;
	}

	public WebElement getRefNumEdt() {
		return refNumEdt;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	

}
