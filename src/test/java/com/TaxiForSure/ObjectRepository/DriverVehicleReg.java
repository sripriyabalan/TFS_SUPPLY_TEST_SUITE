package com.TaxiForSure.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DriverVehicleReg {

	@FindBy(xpath ="//a[@href='./supplyOrOperatorLogin']")
	private WebElement operatorMgmtLnk;
	
	@FindBy(xpath ="//a[@href='./driverRegistrationForm']")
	private WebElement addDriverLnk;
	
	public WebElement getOperatorMgmtLnk() {
		return operatorMgmtLnk;
	}

	public WebElement getAddDriverLnk() {
		return addDriverLnk;
	}

	public WebElement getAddVehicleLnk() {
		return addVehicleLnk;
	}

	public WebElement getSearchEditLnk() {
		return searchEditLnk;
	}

	public WebElement getDetachedDriverLnk() {
		return detachedDriverLnk;
	}

	public WebElement getApproveDriverVehicleLnk() {
		return approveDriverVehicleLnk;
	}

	@FindBy(xpath ="//a[@href='./vehicleRegistrationForm']")
	private WebElement addVehicleLnk;
	
	@FindBy(xpath ="//a[@href='./advancedSearch']")
	private WebElement searchEditLnk;
	
	@FindBy(xpath ="//a[@id='id_detachedDriverBtn']")
	private WebElement detachedDriverLnk;
	
	@FindBy(xpath ="//a[@href='./approveDriver']")
	private WebElement approveDriverVehicleLnk;
	
	@FindBy(linkText="Approve Corporate")
	private WebElement approveCorporateLnk;

	public WebElement getApproveCorporateLnk() {
		return approveCorporateLnk;
	}
	
	@FindBy(linkText="Approve Driver/Vehicle by Supply")
	private WebElement approveDriverVehicleSupplyLnk;

	public WebElement getApproveDriverVehicleSupplyLnk() {
		return approveDriverVehicleSupplyLnk;
	}
}
