package com.TaxiForSure.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	@FindBy(id="j_username")
	private WebElement userNameEdt;
	
	@FindBy(id="j_password")
	private WebElement pwdEdt;
	
	public WebElement getUserNameEdt() {
		return userNameEdt;
	}

	public WebElement getPwdEdt() {
		return pwdEdt;
	}

	public WebElement getSignInBtn() {
		return signInBtn;
	}

	@FindBy(xpath="//button[@type='submit']")
	private WebElement signInBtn;

	@FindBy(linkText="Logout")
	private WebElement logOutLnk;

	public WebElement getLogOutLnk() {
		return logOutLnk;
	}
}
