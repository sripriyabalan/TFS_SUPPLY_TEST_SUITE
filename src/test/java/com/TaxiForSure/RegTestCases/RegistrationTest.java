package com.TaxiForSure.RegTestCases;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.TaxiForSure.BusinessLib.ProjectCommonLib;
import com.TaxiForSure.GenericLib.Driver;
import com.TaxiForSure.GenericLib.ReportLib;
import com.TaxiForSure.GenericLib.WebDriverCommonLib;
import com.TaxiForSure.ObjectRepository.ApproveCorporate;
import com.TaxiForSure.ObjectRepository.CorporateRegistration;
import com.TaxiForSure.ObjectRepository.DriverRegistrationForm;
import com.TaxiForSure.ObjectRepository.DriverVehicleReg;
import com.TaxiForSure.ObjectRepository.DriverVehicleSearch;
import com.TaxiForSure.ObjectRepository.EditCompanyPage;
import com.TaxiForSure.ObjectRepository.OperatorRegistration;
import com.TaxiForSure.ObjectRepository.VehicleRegistrationForm;
import com.TaxiForSure.Utility.ReadDataFromExcel;
import com.thoughtworks.selenium.webdriven.commands.IsAlertPresent;

public class RegistrationTest {

	
	WebDriverCommonLib wbcLib= new WebDriverCommonLib();
	ProjectCommonLib pcLib =new ProjectCommonLib();
	ReportLib rLib = new ReportLib();
	DriverVehicleReg dvReg =PageFactory.initElements(Driver.driver, DriverVehicleReg.class);
	DriverRegistrationForm drRegPage = PageFactory.initElements(Driver.driver,DriverRegistrationForm.class);
	VehicleRegistrationForm veRegPage = PageFactory.initElements(Driver.driver, VehicleRegistrationForm.class);
	DriverVehicleSearch drVeSearchPage =PageFactory.initElements(Driver.driver, DriverVehicleSearch.class);
	OperatorRegistration opRegPage = PageFactory.initElements(Driver.driver, OperatorRegistration.class);
	ApproveCorporate apCoPage = PageFactory.initElements(Driver.driver, ApproveCorporate.class);
	EditCompanyPage edCoPage = PageFactory.initElements(Driver.driver, EditCompanyPage.class);
	CorporateRegistration coRegPage = PageFactory.initElements(Driver.driver,CorporateRegistration.class);
	ReadDataFromExcel excelRead = new ReadDataFromExcel();
	String filePath = System.getProperty("user.dir")+"\\src\\test\\resources\\";
	

	@BeforeClass
	public void configBeforeClass() throws InvalidFormatException, IOException
	{
		pcLib.openRegUrl();
	
	}
	
	@BeforeMethod
	public void configBeforeMethod() throws IOException, InvalidFormatException
	{
		pcLib.loginToApp();
		wbcLib.waitForPageToLoad();
	}
	
	/*@DataProvider(name="CorporateRegistration")
	public Object[][] getOperatorData() throws Exception {
		return excelRead.testData("CorporateReg");
	}
	@Test(dataProvider="CorporateRegistration")
	public void corporateRegTest(String companyName,String addressLine1,String name,String mobNum,
			String emailId) throws InterruptedException
	{
	
		coRegPage.getAddCorporateLnk().click();
		wbcLib.waitForPageToLoad();
		
		coRegPage.getCorporateNameEdt().sendKeys(companyName);
		coRegPage.getAddressLine1Edt().sendKeys(addressLine1);
		coRegPage.getNameEdt().sendKeys(name);
		coRegPage.getMobileNumEdt().sendKeys(mobNum);
		coRegPage.getEmailIdEdt().sendKeys(emailId);
		
		coRegPage.getSubmitBtn().click();
		Thread.sleep(1000);
		
		String ActualStr=wbcLib.alertText();
		String ExpectedStr="Added Successfully";
		wbcLib.acceptAlert();
		Thread.sleep(1000);
		
		Assert.assertEquals(ActualStr,ExpectedStr,"Actual String is not as expected");
		
	}
	
	@Test
	public void editCorporateTest()
	{
	
		coRegPage.getEditCorporateLnk().click();
		wbcLib.waitForPageToLoad();
		
		String ActualTxt="Corporate List";
		String ExpectedTxt=coRegPage.getCorporateListheader().getText();
		Assert.assertEquals(ActualTxt,ExpectedTxt,"Actual String is not as expected");
	}*/
	
	/*@DataProvider(name="OperatorRegistration")
	public Object[][] getOperatorData() throws Exception {
		return excelRead.testData("OperatorRegg");
	}
	
	@Test(dataProvider="OperatorRegistration")
	public void operatorRegTest(String panNum,String operatorName,String operatorLife,String cinNum,
			String proprietorName,String address,String litigations,String branch,String contactPerson,
			String emailContactPerson,String phoneNum,String mobileNum,String accountMgr,String accountMgrEmail,
			String defaultComm,String bankAccNum,String bankName,String bankHolderName,String IFSCCode,
			String securityDeposit,String dateOfPayment,String refNum) throws InvalidFormatException, IOException, InterruptedException
	{
		dvReg.getOperatorMgmtLnk().click();
		wbcLib.waitForPageToLoad();
		
		opRegPage.getAddCompanyLnk().click();
		wbcLib.waitForPageToLoad();
		
		opRegPage.getPanNumberEdt().sendKeys(panNum);
		opRegPage.getOperatorNameEdt().sendKeys(operatorName);
		pcLib.selectByText(opRegPage.getOperatorLifeTimeSel(), operatorLife);
		opRegPage.getCinNumEdt().sendKeys(cinNum);
		opRegPage.getProperietorNameEdt().sendKeys(proprietorName);
		opRegPage.getAddressEdt().sendKeys(address);
		pcLib.selectByText(opRegPage.getLitigationSel(),litigations);
		opRegPage.getNextBtn().click();
		Thread.sleep(1000);
		
		
		pcLib.selectByText(opRegPage.getBranchSel(),branch);
		opRegPage.getContactPersonEdt().sendKeys(contactPerson);
		opRegPage.getEmailEdt().sendKeys(emailContactPerson);
		opRegPage.getPhoneNumEdt().sendKeys(phoneNum);
		opRegPage.getMobileNumEdt().sendKeys(mobileNum);
		opRegPage.getRelationshipMgrEdt().sendKeys(accountMgr);
		opRegPage.getRelationshipMgrEmail().sendKeys(accountMgrEmail);
		opRegPage.getDefaultCheckBox().click();
		opRegPage.getDefaultCommEdt().sendKeys(defaultComm);
		opRegPage.getBankAccNumEdt().sendKeys(bankAccNum);
		opRegPage.getBankAccHolderNameEdt().sendKeys(bankHolderName);
		opRegPage.getBankIFSCCodeEdt().sendKeys(IFSCCode);
		
		opRegPage.getSecurityDepositAmtEdt().sendKeys(securityDeposit);
		opRegPage.getDateOfPaymentEdt().click();
		opRegPage.getDateOfPaymentEdt().sendKeys(dateOfPayment);
		opRegPage.getDateOfPaymentEdt().click();
		
		opRegPage.getRefNumEdt().sendKeys(refNum);
		opRegPage.getSubmitBtn().submit();
		Thread.sleep(1000);
		
		String ActualStr=wbcLib.alertText();
		String ExpectedStr="Added Successfully";
		wbcLib.acceptAlert();
		Thread.sleep(1000);
		
		Assert.assertEquals(ActualStr,ExpectedStr,"Actual String is not as expected");
		
	}*/
	
	@DataProvider(name="ApproveCorporate")
	public Object[][] getApproveCorporateData() throws Exception {
		return excelRead.testData("ApproveCorporate");
	}
	@Test(dataProvider ="ApproveCorporate")
	public void approveCorporateTest(String compName,String userName,String clientStatus) throws InterruptedException
	{
	
		dvReg.getApproveCorporateLnk().click();
		wbcLib.waitForPageToLoad();
		
		pcLib.editButton(compName).click();
		Set<String> set = Driver.driver.getWindowHandles();
		Iterator<String> itr= set.iterator();
		String parentWindowId=itr.next();
		String childWindowId=itr.next();
		
		Driver.driver.switchTo().window(childWindowId);
		
		if(apCoPage.getUserNameEdt().getText().equals(null))
		{
			apCoPage.getUserNameEdt().sendKeys(userName);
		}
		//pcLib.selectByText(apCoPage.getClientStatusSel(), clientStatus.trim());
		edCoPage.getSubmitBtn().click();
		Thread.sleep(1000);
		
		String ExpectedTxt="Update Successfully";
		String ActualTxt=wbcLib.alertText();
		
		wbcLib.acceptAlert();
		Driver.driver.close();
		Driver.driver.switchTo().window(parentWindowId);
		Assert.assertEquals(ActualTxt,ExpectedTxt,"Actual String is not as expected");
		
	}
	
	@DataProvider(name="EditCompany")
	public Object[][] getCompanyData() throws Exception {
		return excelRead.testData("EditComp");
	}
	
	@Test(dataProvider="EditCompany")
	public void editCompanyTest(String companyName) throws InterruptedException
	{
		dvReg.getOperatorMgmtLnk().click();
		wbcLib.waitForPageToLoad();
		
		opRegPage.getEditCompanyLnk().click();
		wbcLib.waitForPageToLoad();
		
		pcLib.selectByText(edCoPage.getCompanyDetailSel(), companyName.trim());
		//pcLib.selectByIndex(edCoPage.getCompanyDetailSel(), 3);
		
		edCoPage.getSearchBtn().click();
		Thread.sleep(1000);
		
		String ExpectedTxt="Company Name";
		String ActualTxt=edCoPage.getLabelTxt().getText();
		
		Assert.assertEquals(ActualTxt,ExpectedTxt,"Actual String is not as expected");
		
	
	}

	@DataProvider(name = "DriverRegistrationForm")
	public Object[][] getDriverData() throws Exception {
		return excelRead.testData("DriverReg");
	}
	@Test(dataProvider = "DriverRegistrationForm")
	public void driverRegTest(String operatorName,String vehicleType, String driverType,
			String driverName,String mobileNo,String vehicleNo1,String vehicleNo2,
			String vehicleNo3,String vehicleNo4,String dlNumber,String cabBadgeNo,
			String defaultComm,String language,String langProficiency,String badgeFile,
			String idProofFile,String medCerFile,String refLetterFile,
			String addProofFile,String passphotoFile,String paymentReceiptFile) throws InvalidFormatException, IOException, InterruptedException, AWTException
	{
		
		dvReg.getAddDriverLnk().click();
		wbcLib.waitForPageToLoad();
		
		//driverReg.DriverRegTest();
		
		pcLib.selectByText(drRegPage.getOperatorSelect(), operatorName);
		
		pcLib.selectByText(drRegPage.getVehicleSelect(), vehicleType);
		
		drRegPage.getDriverNameEdt().sendKeys(driverName);
		
		drRegPage.getMobileNoEdt().sendKeys(mobileNo);
		
		drRegPage.getDobCalEdt().click();
		drRegPage.getDOBDayPicker().click();
		
		drRegPage.getDlExpCal().click();
		pcLib.DLExpDatePicker();
		
		drRegPage.getDlNumberEdt().sendKeys(dlNumber);
		
		pcLib.selectByText(drRegPage.getDriverTypeSelect(), driverType.trim());
		
		drRegPage.getVehicleNo1Edt().sendKeys(vehicleNo1);
		drRegPage.getVehicleNo2Edt().sendKeys(vehicleNo2);
		drRegPage.getVehicleNo3Edt().sendKeys(vehicleNo3);
		drRegPage.getVehicleNo4Edt().sendKeys(vehicleNo4);
		
		drRegPage.getBadgeNumberEdt().sendKeys(cabBadgeNo);
		
		drRegPage.getBadgeExpCal().click();
		pcLib.ExpDatePickerBadNo();
		
		drRegPage.getDefDriverCommEdt().sendKeys(defaultComm);
		
		pcLib.selectByText(drRegPage.getDriverLangSel(), language);
		pcLib.selectByText(drRegPage.getDriverLangProfSel(), langProficiency);
		
		drRegPage.getBadgeFileSelect().click();
		pcLib.fileUpload(filePath,badgeFile);
		//pcLib.SelectFile();
		
	
		drRegPage.getIdProofFileSelect().click();
		pcLib.fileUpload(filePath,idProofFile);
		//pcLib.SelectFile();
		
		
		drRegPage.getMedCertFileSelect().click();
		pcLib.fileUpload(filePath,medCerFile);
		//pcLib.SelectFile();
		
		
		drRegPage.getRefLetterFileSelect().click();
		pcLib.fileUpload(filePath,refLetterFile);
		//pcLib.SelectFile();
		
		
		drRegPage.getAddProofFileSelect().click();
		pcLib.fileUpload(filePath,addProofFile);
		//pcLib.SelectFile();
		
		
		drRegPage.getPassPhotoFileSelect().click();
		pcLib.fileUpload(filePath,passphotoFile);
		//pcLib.SelectFile();
		
		
		drRegPage.getPayReceiptFileSelect().click();
		pcLib.fileUpload(filePath,paymentReceiptFile);
		//pcLib.SelectFile();
			
		
		drRegPage.getSubmitDriverRegBtn().submit();
		Thread.sleep(1000);
		wbcLib.acceptAlert();
		Thread.sleep(1000);
		
		String ActualStr=drRegPage.getActualMsg().getText();
		String ExpectedStr="Success!";
		Assert.assertEquals(ActualStr,ExpectedStr,"Actual String is not as expected");
		
	}
	
	@DataProvider(name = "VehicleRegistrationForm")
	public Object[][] getVehicleData() throws Exception {
		return excelRead.testData("VehicleReg");
	}
	
	@Test(dataProvider = "VehicleRegistrationForm")
	public void vehicleRegTest(String operatorName,String carOwnerName,String driverName,
			String mobileNo,String vehicleType,String insuranceCompany,String insuranceNum,
			String taxCardNum,String permitNum,String pucNum,String fitnessCertNo,String smartCardFile,
			String permitFile,String PUCFile,String insuranceFile,String fitnessFile) throws InterruptedException, IOException, AWTException
	{
		
		dvReg.getAddVehicleLnk().click();
		wbcLib.waitForPageToLoad();
		wbcLib.windowMaximize();
		
		pcLib.selectByText(veRegPage.getOperatorNameSel(), operatorName);
		
		veRegPage.getCarOwnerNameEdt().sendKeys(carOwnerName);
		
		pcLib.selectByText(veRegPage.getDriverNameSel(),driverName);
		
		veRegPage.getMobileNoEdt().sendKeys(mobileNo);
		
		pcLib.selectByText(veRegPage.getVehicleTypeSel(), vehicleType);
		
		veRegPage.getInsuranceCompanyEdt().sendKeys(insuranceCompany);
		
		veRegPage.getInsuranceNumEdt().sendKeys(insuranceNum);
		veRegPage.getInsExpDateCal().click();
		pcLib.ExpDateInsNo();
		
		
		veRegPage.getTaxCardNumEdt().sendKeys(taxCardNum);
		veRegPage.getTaxCardNumExpDateCal().click();
		pcLib.ExpDateTaxNo();
		
		veRegPage.getPermitNumEdt().sendKeys(permitNum);
		veRegPage.getPermitExpDateCal().click();
		pcLib.ExpDatePermitNo();
		
		veRegPage.getPucNumEdt().sendKeys(pucNum);
		veRegPage.getPucExpDateCal().click();
		pcLib.ExpDatePUCNo();
		
		
		veRegPage.getFitnessNumEdt().sendKeys(fitnessCertNo);
		veRegPage.getFitnessCertExpDateCal().click();
		pcLib.ExpDateFitnessNo();
		
		veRegPage.getSmartCardFileSelect().click();
		pcLib.fileUpload(filePath,smartCardFile);
		
		veRegPage.getPermitFileSelect().click();
		pcLib.fileUpload(filePath,permitFile);
		
		veRegPage.getPucFileSelect().click();
		pcLib.fileUpload(filePath,PUCFile);
		
		veRegPage.getInsuranceFileSelect().click();
		pcLib.fileUpload(filePath,insuranceFile);
		
		veRegPage.getFitnessFileSelect().click();
		pcLib.fileUpload(filePath,fitnessFile);
		
		veRegPage.getVehicleRegBtn().submit();
		
		String ActualStr=veRegPage.getActualMsg().getText();
		String ExpectedStr="Success!";
		Assert.assertEquals(ActualStr,ExpectedStr,"Actual String is not as expected");
			
	}
	
	@Test
	public void DriverSearchTest()
	{
		dvReg.getSearchEditLnk().click();
		wbcLib.waitForPageToLoad();
		wbcLib.windowMaximize();
		
		pcLib.selectByText(drVeSearchPage.getDriverOperatorNameSel(), "TaxiForSure.com");
		
		drVeSearchPage.getDriverSearchBtn().click();
		
		String ExpectedHeaderTxt = "Driver Listing";
		String ActualHeaderTxt = drVeSearchPage.getDriverHeaderTxt().getText();
		
		Assert.assertEquals(ActualHeaderTxt,ExpectedHeaderTxt,"Actual String is not as expected");
	}
	
	
	@Test
	public void VehicleSearchTest()
	{
		dvReg.getSearchEditLnk().click();
		wbcLib.waitForPageToLoad();
		wbcLib.windowMaximize();
		
		pcLib.selectByText(drVeSearchPage.getVehicleOperatorNameSel(), "TaxiForSure.com");
		
		drVeSearchPage.getVehicleSearchBtn().click();
		
		String ExpectedHeaderTxt = "Vehicle Listing";
		String ActualHeaderTxt = drVeSearchPage.getVehicleHeaderTxt().getText();
		
		Assert.assertEquals(ActualHeaderTxt,ExpectedHeaderTxt,"Actual String is not as expected");
	}
	
	@DataProvider(name = "ApproveDriver")
	public Object[][] getApproveData() throws Exception {
		return excelRead.testData("ApproveDriver");
	}
	
	
	@Test(dataProvider="ApproveDriver")
	public void approveDriverTest(String operatorName) throws InterruptedException
	{
		dvReg.getApproveDriverVehicleLnk().click();
		wbcLib.waitForPageToLoad();
		
		dvReg.getApproveDriverVehicleSupplyLnk().click();
		wbcLib.waitForPageToLoad();
		
		pcLib.selectByText(drVeSearchPage.getDriverOperatorNameSel(), operatorName);
		
		drVeSearchPage.getDriverSearchBtn().click();
		
		if(wbcLib.isAlertPresent())
		{
			String ActualTxt =wbcLib.alertText();
			wbcLib.acceptAlert();
			String ExpectedTxt="No Driver with the Specified Details!";
			Assert.assertEquals(ActualTxt,ExpectedTxt,"Actual String is not as expected");
			
		}
		else
		{
		
		drVeSearchPage.getDriverEditBtn().click();
		wbcLib.waitForPageToLoad();
		
		Set<String> set = Driver.driver.getWindowHandles();
		Iterator<String> itr= set.iterator();
		String parentWindowId=itr.next();
		String childWindowId=itr.next();
		
		Driver.driver.switchTo().window(childWindowId);
		
		drRegPage.getIsBlockedCheckBox().click();
		
		drRegPage.getSubmitDriverRegBtn().click();
		
		
		String ActualStr=drRegPage.getActualMsg().getText();
		Thread.sleep(1000);
		String ExpectedStr="Success!";
		
		Driver.driver.close();
		Driver.driver.switchTo().window(parentWindowId);
		Assert.assertEquals(ActualStr,ExpectedStr,"Actual String is not as expected");
		}
		
	}
	
	@DataProvider(name = "ApproveVehicle")
	public Object[][] getVehicleApproveData() throws Exception {
		return excelRead.testData("ApproveVehicle");
	}
	
	@Test(dataProvider="ApproveVehicle")
	public void approveVehicleTest(String operatorName) throws InterruptedException
	{
		dvReg.getApproveDriverVehicleLnk().click();
		wbcLib.waitForPageToLoad();
		
		dvReg.getApproveDriverVehicleSupplyLnk().click();
		wbcLib.waitForPageToLoad();
		pcLib.selectByText(drVeSearchPage.getVehicleOperatorNameSel(), operatorName.trim());
		drVeSearchPage.getVehicleSearchBtn().click();
		Thread.sleep(3000);
			
		boolean elementPresent=false;
		try
		{ 
		    new WebDriverWait(Driver.driver,10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='id_vehicle_table']/tbody/tr[1]/td/button")));
		    elementPresent=true;

		}catch(Exception e)
		{
		    System.out.println("Element Not Present. Exiting!!");
		    String ExpectedHeaderTxt = "Vehicle Listing";
			String ActualHeaderTxt = drVeSearchPage.getVehicleHeaderTxt().getText();
			
			Assert.assertEquals(ActualHeaderTxt,ExpectedHeaderTxt,"Actual String is not as expected");
		   
		}

		if(elementPresent)
		{
			drVeSearchPage.getVehicleEdtBtn().click();
			Thread.sleep(1000);
			Set<String> set = Driver.driver.getWindowHandles();
			Iterator<String> itr= set.iterator();
			String parentWindowId=itr.next();
			String childWindowId=itr.next();
			
			Driver.driver.switchTo().window(childWindowId);
			
			pcLib.selectByIndex(drVeSearchPage.getDriverNameSel(),2);
			
			veRegPage.getVehicleRegBtn().click();
			
			String ActualStr=veRegPage.getActualMsg().getText();
			Thread.sleep(1000);
			String ExpectedStr="Success!";
			Driver.driver.close();
			Driver.driver.switchTo().window(parentWindowId);
			Assert.assertEquals(ActualStr,ExpectedStr,"Actual String is not as expected");
		}
		
	}
	
	@AfterMethod
	public void configAfterMethod(){
		pcLib.logOut();
	}
	
	@AfterClass
	public void configAfterClass() throws InterruptedException
	{
		
		Thread.sleep(1000);
	}
}
