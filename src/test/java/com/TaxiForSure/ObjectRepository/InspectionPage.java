package com.TaxiForSure.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InspectionPage {
	
	@FindBy(linkText="History")
	private WebElement historyLnk;

	public WebElement getHistoryLnk() {
		return historyLnk;
	}
	
	@FindBy(xpath="//div[@id='historyPageError']/div/strong")
	private WebElement historyErrMsg;

	public WebElement getHistoryErrMsg() {
		return historyErrMsg;
	}
	
	@FindBy(linkText="Home")
	private WebElement homeLnk;

	public WebElement getHomeLnk() {
		return homeLnk;
	}
	
	@FindBy(linkText="Comprehensive Inspection")
	private WebElement comprehensiveInsLnk;

	public WebElement getComprehensiveInsLnk() {
		return comprehensiveInsLnk;
	}
	
	@FindBy(linkText="Quick inspection")
	private WebElement quickInspectionLnk;

	public WebElement getQuickInspectionLnk() {
		return quickInspectionLnk;
	}
	
	public WebElement getCompInsHistoryLnk() {
		return compInsHistoryLnk;
	}

	public WebElement getQuickInsHistoryLnk() {
		return quickInsHistoryLnk;
	}

	public WebElement getCompHistoryLastInsLabel() {
		return compHistoryLastInsLabel;
	}

	public WebElement getQuickHistoryInsLabel() {
		return quickHistoryInsLabel;
	}

	@FindBy(linkText="Comprehensive Inspection History")
	private WebElement compInsHistoryLnk;
	
	@FindBy(linkText="Quick Inspection History")
	private WebElement quickInsHistoryLnk;
	
	@FindBy(xpath="//tbody[@id='margintablebodytop']/tr[1]/td[1]/label")
	private WebElement compHistoryLastInsLabel;
	
	@FindBy(xpath="//div[@id='quick']/table/tbody/tr[1]/td[1]/label")
	private WebElement quickHistoryInsLabel;

}
