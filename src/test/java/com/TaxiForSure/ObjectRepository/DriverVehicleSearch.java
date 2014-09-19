package com.TaxiForSure.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class DriverVehicleSearch {

	@FindBy(id="id_driver_name")
	private WebElement driverNameEdt;
	
	@FindBy(id="id_driver_operator_name")
	private WebElement driverOperatorNameSel;
	
	@FindBy(id="id_mobile_number")
	private WebElement mobileNumEdt;
	
	@FindBy(id="id_driver_license_no")
	private WebElement driverLicenseNoEdt;
	
	@FindBy(id="id_vehicle_operator_name")
	private WebElement vehicleOperatorNameSel;
	
	@FindBy(id="id_vehicle_number")
	private WebElement vehicleNoEdt;
	
	@FindBy(xpath="//div[@id='driver_search']/button[1]")
	private WebElement driverSearchBtn;
	
	@FindBy(xpath="//div[@id='vehicle_search']/button[1]")
	private WebElement vehicleSearchBtn;
	
	@FindBy(xpath="//table[@id='id_driver_table']/tbody/tr/td[7]")
	private WebElement operatorDriverList;
	
	@FindBy(xpath="//table[@id='id_vehicle_table']/tbody/tr/td[3]")
	private WebElement operatorVehicleList;
	
	@FindBy(id="total_set")
	private WebElement driverHeaderTxt;
	
	@FindBy(id="total_set_vehicle")
	private WebElement vehicleHeaderTxt;

	public WebElement getDriverHeaderTxt() {
		return driverHeaderTxt;
	}

	public WebElement getVehicleHeaderTxt() {
		return vehicleHeaderTxt;
	}

	public WebElement getDriverNameEdt() {
		return driverNameEdt;
	}

	public WebElement getDriverOperatorNameSel() {
		return driverOperatorNameSel;
	}

	public WebElement getMobileNumEdt() {
		return mobileNumEdt;
	}

	public WebElement getDriverLicenseNoEdt() {
		return driverLicenseNoEdt;
	}

	public WebElement getVehicleOperatorNameSel() {
		return vehicleOperatorNameSel;
	}

	public WebElement getVehicleNoEdt() {
		return vehicleNoEdt;
	}

	public WebElement getDriverSearchBtn() {
		return driverSearchBtn;
	}

	public WebElement getVehicleSearchBtn() {
		return vehicleSearchBtn;
	}

	public WebElement getOperatorDriverList() {
		return operatorDriverList;
	}

	public WebElement getOperatorVehicleList() {
		return operatorVehicleList;
	}
	
	@FindBy(xpath="//table[@id='id_driver_table']/tbody/tr[1]/td[8]/button")
	private WebElement driverEditBtn;

	public WebElement getDriverEditBtn() {
		return driverEditBtn;
	}
	
	@FindBy(xpath="//table[@id='id_vehicle_table']/tbody/tr[1]/td/button")
	private WebElement vehicleEdtBtn;

	public WebElement getVehicleEdtBtn() {
		return vehicleEdtBtn;
	}
	
	@FindBy(id="driver_name")
	private WebElement driverNameSel;

	public WebElement getDriverNameSel() {
		return driverNameSel;
	}
	
	
		
}
