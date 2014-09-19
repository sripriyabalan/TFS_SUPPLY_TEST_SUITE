package com.TaxiForSure.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleRegistrationForm {

	
	@FindBy(xpath="//*[@id='top']/div[7]/div[1]/table/thead/tr[1]/th[3]")
	private WebElement nxtInsExpDateSel;
	
	@FindBy(xpath="//*[@id='top']/div[7]/div[1]/table/tbody/tr[4]/td[7]")
	private WebElement insExpDateDaySel;
	
	public WebElement getNxtInsExpDateSel() {
		return nxtInsExpDateSel;
	}

	public WebElement getInsExpDateDaySel() {
		return insExpDateDaySel;
	}
	
	@FindBy(xpath="//*[@id='top']/div[8]/div[1]/table/thead/tr[1]/th[3]")
	private WebElement nxtTaxExpDateSel;
	
	@FindBy(xpath="//*[@id='top']/div[8]/div[1]/table/tbody/tr[4]/td[7]")
	private WebElement taxDateDaySel;
	
	public WebElement getNxtTaxExpDateSel() {
		return nxtTaxExpDateSel;
	}

	public WebElement getTaxDateDaySel() {
		return taxDateDaySel;
	}
	
	@FindBy(xpath="//*[@id='top']/div[9]/div[1]/table/thead/tr[1]/th[3]")
	private WebElement nxtPermitExpDateSel;
	
	@FindBy(xpath="//*[@id='top']/div[9]/div[1]/table/tbody/tr[4]/td[7]")
	private WebElement permitDateDaySel;
	
	public WebElement getNxtPermitExpDateSel() {
		return nxtPermitExpDateSel;
	}

	public WebElement getPermitDateDaySel() {
		return permitDateDaySel;
	}
	
	@FindBy(xpath="//*[@id='top']/div[10]/div[1]/table/thead/tr[1]/th[3]")
	private WebElement nxtPUCExpDateSel;
	
	@FindBy(xpath="//*[@id='top']/div[10]/div[1]/table/tbody/tr[4]/td[7]")
	private WebElement pucDateDaySel;
	
	public WebElement getNxtPUCExpDateSel() {
		return nxtPUCExpDateSel;
	}

	public WebElement getPucDateDaySel() {
		return pucDateDaySel;
	}

	@FindBy(xpath="//*[@id='top']/div[11]/div[1]/table/thead/tr[1]/th[3]")
	private WebElement nxtFitnessExpDateSel;
	
	@FindBy(xpath="//*[@id='top']/div[11]/div[1]/table/tbody/tr[4]/td[7]")
	private WebElement fitnessDateDaySel;
	
	public WebElement getNxtFitnessExpDateSel() {
		return nxtFitnessExpDateSel;
	}

	public WebElement getFitnessDateDaySel() {
		return fitnessDateDaySel;
	}
	@FindBy(id="operator_name")
	private WebElement operatorNameSel;
	
	@FindBy(id="car_owner")
	private WebElement carOwnerNameEdt;
	
	@FindBy(id="driver_name")
	private WebElement driverNameSel;
	
	@FindBy(id="mobile_no")
	private WebElement mobileNoEdt;
	
	@FindBy(id="vehicle_type")
	private WebElement vehicleTypeSel;
	
	@FindBy(id="insurance_company")
	private WebElement insuranceCompanyEdt;
	
	@FindBy(id="insurance_number")
	private WebElement insuranceNumEdt;
	
	@FindBy(id="tax_card")
	private WebElement taxCardNumEdt;
	
	@FindBy(id="permit_number")
	private WebElement permitNumEdt;
	
	@FindBy(id="puc_number")
	private WebElement pucNumEdt;
	
	@FindBy(id="fitness_number")
	private WebElement fitnessNumEdt;
	
	@FindBy(id="submit_vehicle_registration")
	private WebElement vehicleRegBtn;
	
	@FindBy(id="smart_card")
	private WebElement smartCardFileSelect;
	
	@FindBy(id="permit")
	private WebElement permitFileSelect;
	
	@FindBy(id="insurance_expiry")
	private WebElement insExpDateCal;
	
	public WebElement getInsExpDateCal() {
		return insExpDateCal;
	}

	public WebElement getTaxCardNumExpDateCal() {
		return taxCardNumExpDateCal;
	}

	public WebElement getPermitExpDateCal() {
		return permitExpDateCal;
	}

	public WebElement getPucExpDateCal() {
		
		return pucExpDateCal;
	}

	public WebElement getFitnessCertExpDateCal() {
		return fitnessCertExpDateCal;
	}

	@FindBy(id="expiry")
	private WebElement taxCardNumExpDateCal;
	
	@FindBy(id="permit_expiry")
	private WebElement permitExpDateCal;
	
	@FindBy(id="puc_expiry")
	private WebElement pucExpDateCal;
	
	@FindBy(id="fitness_certificate_expiry")
	private WebElement fitnessCertExpDateCal;
	
	
	public WebElement getOperatorNameSel() {
		return operatorNameSel;
	}

	public WebElement getCarOwnerNameEdt() {
		return carOwnerNameEdt;
	}

	public WebElement getDriverNameSel() {
		return driverNameSel;
	}

	public WebElement getMobileNoEdt() {
		return mobileNoEdt;
	}

	public WebElement getVehicleTypeSel() {
		return vehicleTypeSel;
	}

	public WebElement getInsuranceCompanyEdt() {
		return insuranceCompanyEdt;
	}

	public WebElement getInsuranceNumEdt() {
		return insuranceNumEdt;
	}

	public WebElement getTaxCardNumEdt() {
		return taxCardNumEdt;
	}

	public WebElement getPermitNumEdt() {
		return permitNumEdt;
	}

	public WebElement getPucNumEdt() {
		return pucNumEdt;
	}

	public WebElement getFitnessNumEdt() {
		return fitnessNumEdt;
	}

	public WebElement getVehicleRegBtn() {
		return vehicleRegBtn;
	}

	public WebElement getSmartCardFileSelect() {
		return smartCardFileSelect;
	}

	public WebElement getPermitFileSelect() {
		return permitFileSelect;
	}

	public WebElement getPucFileSelect() {
		return pucFileSelect;
	}

	public WebElement getInsuranceFileSelect() {
		return insuranceFileSelect;
	}

	public WebElement getFitnessFileSelect() {
		return fitnessFileSelect;
	}

	@FindBy(id="puc")
	private WebElement pucFileSelect;
	
	@FindBy(id="insurance")
	private WebElement insuranceFileSelect;
	
	@FindBy(id="fitness")
	private WebElement fitnessFileSelect;
	
	@FindBy(xpath="//*[@id='cont']/div/strong")
	private WebElement ActualMsg;

	public WebElement getActualMsg() {
		return ActualMsg;
	}
	
	
}
