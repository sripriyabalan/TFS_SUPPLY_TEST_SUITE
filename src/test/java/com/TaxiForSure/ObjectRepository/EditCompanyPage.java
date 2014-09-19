package com.TaxiForSure.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditCompanyPage {

	@FindBy(id="company_Detail")
	private WebElement companyDetailSel;
	
	public WebElement getCompanyDetailSel() {
		return companyDetailSel;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getLabelTxt() {
		return labelTxt;
	}

	@FindBy(xpath="//div[@id='data_div_operator']/div/button[@type='submit']")
	private WebElement searchBtn;
	
	@FindBy(xpath="//table[@id='id_operator_table']/tbody/tr[1]/td[1]")
	private WebElement labelTxt;
	
	@FindBy(xpath="//*[@id='id_operator_table']/tbody/tr[1]/td[3]/input")
	private WebElement editBtn;

	public WebElement getEditBtn() {
		return editBtn;
	}
	
	@FindBy(id="submit_button")
	private WebElement submitBtn;

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
			
}
