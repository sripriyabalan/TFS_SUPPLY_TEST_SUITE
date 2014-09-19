package com.TaxiForSure.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DriverRegistrationForm {
	
	@FindBy(id="operator_name")
	private WebElement operatorSelect;
	
	@FindBy(xpath="//input[@id='driver_id']")
	private WebElement driverIdEdt;
	
	@FindBy(xpath="//select[@id='vehicle_type']")
	private WebElement vehicleSelect;
	
	@FindBy(xpath="//select[@id='role_type']")
	private WebElement driverTypeSelect;
	
	@FindBy(xpath="//input[@id='driver_name']")
	private WebElement driverNameEdt;
	
	@FindBy(xpath="//input[@id='father_name']")
	private WebElement fatherNameEdt;
	
	@FindBy(xpath="//input[@id='mobile_no']")
	private WebElement mobileNoEdt;
	
	@FindBy(xpath="//div[@class='datepicker datepicker-dropdown dropdown-menu']/div/table/thead/tr/th[@class='next']")
	private WebElement NxtDatePickerSel;
	
	@FindBy(xpath="//div[@class='datepicker datepicker-dropdown dropdown-menu']/div/table/thead/tr/th[@class='prev']")
	private WebElement PrevDatePickerSel;
	
	@FindBy(xpath="//*[@id='top']/div[6]/div[1]/table/thead/tr[1]/th[3]")
	private WebElement NxtBadNoDatePickerSel;
	
	@FindBy(xpath="//*[@id='top']/div[6]/div[1]/table/tbody/tr[3]/td[7]")
	private WebElement NxtBadNoDayPickerSel;
	
	@FindBy(xpath="//*[@id='top']/div[5]/div[1]/table/thead/tr[1]/th[2]")
	private WebElement dlExpDateYearSel1;
	
	@FindBy(xpath="//*[@id='top']/div[5]/div[2]/table/thead/tr/th[2]")
	private WebElement dlExpDateYearSel2;
	
	@FindBy(xpath="//*[@id='top']/div[5]/div[3]/table/tbody/tr/td/span[8]")
	private WebElement dlExpDateYearSel3;
	
	@FindBy(xpath="//*[@id='top']/div[5]/div[2]/table/tbody/tr/td/span[8]")
	private WebElement dlExpDateMonthSel;
	
	@FindBy(xpath="//*[@id='top']/div[5]/div[1]/table/tbody/tr[3]/td[7]")
	private WebElement dlExpDateDateSel;
	
	public WebElement getDlExpDateDateSel() {
		return dlExpDateDateSel;
	}
	public WebElement getDlExpDateMonthSel() {
		return dlExpDateMonthSel;
	}	
	public WebElement getDlExpDateYearSel3() {
		return dlExpDateYearSel3;
	}
	
	public WebElement getDlExpDateYearSel2() {
		return dlExpDateYearSel2;
	}
	public WebElement getDlExpDateYearSel1() {
		return dlExpDateYearSel1;
	}

	public WebElement getNxtBadNoDayPickerSel() {
		return NxtBadNoDayPickerSel;
	}

	public WebElement getNxtBadNoDatePickerSel() {
		return NxtBadNoDatePickerSel;
	}

	public WebElement getPrevDatePickerSel() {
		return PrevDatePickerSel;
	}

	@FindBy(xpath="//div[@class='datepicker datepicker-dropdown dropdown-menu']")
	private WebElement DatePickerSel;
	
	@FindBy(xpath="//div[@class='datepicker-days']/table/tbody/tr[2]/td[7]")
	private WebElement DaypickerSel;
	
	@FindBy(xpath="//*[@id='top']/div[11]/div[1]/table/tbody/tr[2]/td[1]")
	private WebElement DOBDayPicker;
	
	public WebElement getDOBDayPicker() {
		return DOBDayPicker;
	}

	public WebElement getDaypickerSel() {
		return DaypickerSel;
	}

	public WebElement getDatePickerSel() {
		return DatePickerSel;
	}

	public WebElement getNxtDatePickerSel() {
		return NxtDatePickerSel;
	}

	public WebElement getOperatorSelect() {
		return operatorSelect;
	}

	public WebElement getDriverIdEdt() {
		return driverIdEdt;
	}

	public WebElement getVehicleSelect() {
		return vehicleSelect;
	}

	public WebElement getDriverTypeSelect() {
		return driverTypeSelect;
	}

	public WebElement getDriverNameEdt() {
		return driverNameEdt;
	}

	public WebElement getFatherNameEdt() {
		return fatherNameEdt;
	}

	public WebElement getMobileNoEdt() {
		return mobileNoEdt;
	}

	public WebElement getAlternateNoEdt() {
		return alternateNoEdt;
	}

	public WebElement getDobCalEdt() {
		return dobCalEdt;
	}

	public WebElement getVehicleNo1Edt() {
		return vehicleNo1Edt;
	}

	public WebElement getVehicleNo2Edt() {
		return vehicleNo2Edt;
	}

	public WebElement getVehicleNo3Edt() {
		return vehicleNo3Edt;
	}

	public WebElement getVehicleNo4Edt() {
		return vehicleNo4Edt;
	}

	public WebElement getDlNumberEdt() {
		return dlNumberEdt;
	}

	public WebElement getBadgeNumberEdt() {
		return badgeNumberEdt;
	}

	public WebElement getDlExpCal() {
		return dlExpCal;
	}

	public WebElement getBadgeExpCal() {
		return badgeExpCal;
	}

	public WebElement getDefDriverCommEdt() {
		return defDriverCommEdt;
	}

	@FindBy(xpath="//input[@id='alternate_no']")
	private WebElement alternateNoEdt;
	
	@FindBy(xpath="//input[@id='dob']")
	private WebElement dobCalEdt;
	
	@FindBy(xpath="//input[@id='vehicle_number1']")
	private WebElement vehicleNo1Edt;
	
	@FindBy(xpath="//input[@id='vehicle_number2']")
	private WebElement vehicleNo2Edt;
	
	@FindBy(xpath="//input[@id='vehicle_number3']")
	private WebElement vehicleNo3Edt;
	
	@FindBy(xpath="//input[@id='vehicle_number4']")
	private WebElement vehicleNo4Edt;
	
	@FindBy(xpath="//input[@id='dl_number']")
	private WebElement dlNumberEdt;
	
	@FindBy(xpath="//input[@id='badge_number']")
	private WebElement badgeNumberEdt;
	
	@FindBy(xpath="//input[@id='dl_expiry']")
	private WebElement dlExpCal;
	
	@FindBy(xpath="//input[@id='badge_expiry']")
	private WebElement badgeExpCal;
	
	@FindBy(xpath="//input[@id='defaultDriverCommission']")
	private WebElement defDriverCommEdt;
	
	@FindBy(id="dl_badge_file")
	private WebElement BadgeFileSelect;
	
	@FindBy(id="id_proof_file")
	private WebElement IdProofFileSelect;
	
	@FindBy(id="medical_cert_file")
	private WebElement MedCertFileSelect;
	
	@FindBy(id="ref_letter_file")
	private WebElement RefLetterFileSelect;
	
	@FindBy(id="address_proof_file")
	private WebElement AddProofFileSelect;
	
	@FindBy(id="id_passport_photo_file")
	private WebElement PassPhotoFileSelect;
	
	@FindBy(id="payment_receipt_file")
	private WebElement PayReceiptFileSelect;
	
	
		
	public WebElement getPayReceiptFileSelect() {
		return PayReceiptFileSelect;
	}

	public WebElement getPassPhotoFileSelect() {
		return PassPhotoFileSelect;
	}

	public WebElement getAddProofFileSelect() {
		return AddProofFileSelect;
	}

	public WebElement getRefLetterFileSelect() {
		return RefLetterFileSelect;
	}

	public WebElement getMedCertFileSelect() {
		return MedCertFileSelect;
	}

	public WebElement getIdProofFileSelect() {
		return IdProofFileSelect;
	}

	public WebElement getBadgeFileSelect() {
		return BadgeFileSelect;
	}
	
	@FindBy(id="submit_driver_registration")
	private WebElement SubmitDriverRegBtn;

	public WebElement getSubmitDriverRegBtn() {
		return SubmitDriverRegBtn;
	}
	
	@FindBy(id="id_driver_language")
	private WebElement DriverLangSel;

	public WebElement getDriverLangSel() {
		return DriverLangSel;
	}
	
	@FindBy(id="driver_lang_proficiency")
	private WebElement DriverLangProfSel;

	public WebElement getDriverLangProfSel() {
		return DriverLangProfSel;
	}
	
	@FindBy(xpath="//*[@id='cont']/div/strong")
	private WebElement ActualMsg;

	public WebElement getActualMsg() {
		return ActualMsg;
	}
	
	@FindBy(xpath="//ul/li/a[contains(text(),'Logout')]")
	private WebElement LogoutLnk;

	public WebElement getLogoutLnk() {
		return LogoutLnk;
	}
	
	
	@FindBy(id="is_blocked")
	private WebElement isBlockedCheckBox;

	public WebElement getIsBlockedCheckBox() {
		return isBlockedCheckBox;
	}
	

	
	
}
