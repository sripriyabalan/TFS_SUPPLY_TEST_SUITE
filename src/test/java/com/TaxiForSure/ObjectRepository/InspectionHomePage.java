package com.TaxiForSure.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InspectionHomePage {

	@FindBy(id="vehicle_number1")
	private WebElement vehicleNumber1Edt;
	
	@FindBy(id="vehicle_number2")
	private WebElement vehicleNumber2Edt;
	
	@FindBy(id="vehicle_number3")
	private WebElement vehicleNumber3Edt;
	
	@FindBy(id="vehicle_number4")
	private WebElement vehicleNumber4Edt;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchBtn;

	@FindBy(xpath="//body[@id='top']/div[2]/strong")
	private WebElement errorMsgHeader;
	
	public WebElement getErrorMsgHeader() {
		return errorMsgHeader;
	}

	public WebElement getVehicleNumber1Edt() {
		return vehicleNumber1Edt;
	}

	public WebElement getVehicleNumber2Edt() {
		return vehicleNumber2Edt;
	}

	public WebElement getVehicleNumber3Edt() {
		return vehicleNumber3Edt;
	}

	public WebElement getVehicleNumber4Edt() {
		return vehicleNumber4Edt;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
}
