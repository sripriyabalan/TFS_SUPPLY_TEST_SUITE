package com.TaxiForSure.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrepaidPage {

	@FindBy(id="id_operator")
	private WebElement operatorSel;
	
	@FindBy(linkText="Operator Fine")
	private WebElement operatorFineLnk;
	
	@FindBy(xpath="//a[contains(text(),'Driver Fine')]")
	private WebElement driverFineLnk ;
	
	@FindBy(id="id_operatorFine")
	private WebElement operatorFineEdt;
	
	@FindBy(id="id_reason")
	private WebElement operatorFineReasonEdt;
	
	@FindBy(id="btn_operatorFine")
	private WebElement operatorFineApplyBtn;
	
	@FindBy(id="id_driver2")
	private WebElement drivernameFineSel;
	
	@FindBy(id="id_driverFine")
	private WebElement driverFineAmountEdt;
	
	@FindBy(id="id_drFineReason")
	private WebElement driverFineReasonEdt;
	
	@FindBy(id="btn_driverFine")
	private WebElement driverFineApplyBtn;
	
	@FindBy(linkText="Driver List")
	private WebElement driverListLnk;
	
	@FindBy(xpath="//*[@id='tablez']/thead/tr/td[1]")
	private WebElement driverListTableHeader;
	
	@FindBy(linkText="Driver Balance – Transaction Details")
	private WebElement driverBalTransLnk;
	
	@FindBy(id="id_driverTransaction")
	private WebElement driverTransSel;
	
	@FindBy(id="bal_driverTransaction")
	private WebElement baldriverTransEdt;
	
	@FindBy(xpath="//table[@id='tabletrans']/tbody/tr[1]/td[5]")
	private WebElement baldriverTransTable;
	
	@FindBy(linkText="Prepaid summary")
	private WebElement prepaidSummaryLnk;
	
	@FindBy(xpath="//*[@id='prepaid_summary_table']/tbody/tr[1]/td[1]/h4[contains(text(),'(1) Total duties done :')]")
	private WebElement prepaidSummaryTableHeader;

	public WebElement getOperatorSel() {
		return operatorSel;
	}
	
	@FindBy(linkText="Operator Recharge")
	private WebElement operatorRechargeLnk;
	
	
	@FindBy(xpath="//*[@id='operatorRecharge_form']/h2/font")
	private WebElement operatorRechargeHeader;

	public WebElement getPrepaidSummaryLnk() {
		return prepaidSummaryLnk;
	}

	public WebElement getPrepaidSummaryTableHeader() {
		return prepaidSummaryTableHeader;
	}

	public WebElement getOperatorRechargeLnk() {
		return operatorRechargeLnk;
	}

	public WebElement getOperatorRechargeHeader() {
		return operatorRechargeHeader;
	}

	public WebElement getDriverFineYesBtn() {
		return driverFineYesBtn;
	}

	public WebElement getOperatorFineLnk() {
		return operatorFineLnk;
	}

	public WebElement getDriverFineLnk() {
		return driverFineLnk;
	}

	public WebElement getOperatorFineEdt() {
		return operatorFineEdt;
	}

	public WebElement getOperatorFineReasonEdt() {
		return operatorFineReasonEdt;
	}

	public WebElement getOperatorFineApplyBtn() {
		return operatorFineApplyBtn;
	}

	public WebElement getDrivernameFineSel() {
		return drivernameFineSel;
	}

	public WebElement getDriverFineAmountEdt() {
		return driverFineAmountEdt;
	}

	public WebElement getDriverFineReasonEdt() {
		return driverFineReasonEdt;
	}

	public WebElement getDriverFineApplyBtn() {
		return driverFineApplyBtn;
	}

	public WebElement getDriverListLnk() {
		return driverListLnk;
	}

	public WebElement getDriverListTableHeader() {
		return driverListTableHeader;
	}

	public WebElement getDriverBalTransLnk() {
		return driverBalTransLnk;
	}

	public WebElement getDriverTransSel() {
		return driverTransSel;
	}

	public WebElement getBaldriverTransEdt() {
		return baldriverTransEdt;
	}

	public WebElement getBaldriverTransTable() {
		return baldriverTransTable;
	}
	
	@FindBy(id="yes_operatorFine")
	private WebElement operatorFineYesBtn;
	
	public WebElement getOperatorFineYesBtn()
	{
		return operatorFineYesBtn;
	}
	
	@FindBy(id="yes_driverFine")
	private WebElement driverFineYesBtn;
	
	public WebElement getdriverFineYesBtn()
	{
		return driverFineYesBtn;
	}
	
}
