package com.TaxiForSure.RegTestCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.TaxiForSure.BusinessLib.ProjectCommonLib;
import com.TaxiForSure.GenericLib.Driver;
import com.TaxiForSure.GenericLib.ReportLib;
import com.TaxiForSure.GenericLib.WebDriverCommonLib;
import com.TaxiForSure.ObjectRepository.AddCorporatePaymentPage;
import com.TaxiForSure.ObjectRepository.SettlementHomePage;
import com.TaxiForSure.ObjectRepository.SettlementPage;
import com.TaxiForSure.Utility.ReadDataFromExcel;


public class SettlementTest {

	WebDriverCommonLib wbcLib = new WebDriverCommonLib();
	ProjectCommonLib pcLib =new ProjectCommonLib();
	ReportLib rLib = new ReportLib();
	SettlementHomePage seHoPage = PageFactory.initElements(Driver.driver, SettlementHomePage.class);
	SettlementPage sePage = PageFactory.initElements(Driver.driver, SettlementPage.class);
	AddCorporatePaymentPage adCoPage = PageFactory.initElements(Driver.driver, AddCorporatePaymentPage.class);
	ReadDataFromExcel excelRead = new ReadDataFromExcel();
	
	@BeforeClass
	public void configBeforeClass() throws InvalidFormatException, IOException
	{
		pcLib.openSettlementUrl();
	
	}
	
	@BeforeMethod
	public void configBeforeMethod() throws IOException, InvalidFormatException
	{
		
		pcLib.loginToApp();
		wbcLib.waitForPageToLoad();
	}
	
	@DataProvider(name="SettlementData")
	public Object[][] getOperatorData() throws Exception {
		return excelRead.testData("PrepaidOperator");
	}
	
	@Test(dataProvider="SettlementData")
	public void settlementDataTest(String operatorName) throws InterruptedException
	{
		seHoPage.getSettlementPageLnk().click();
		wbcLib.waitForPageToLoad();
		
		sePage.getSettlementSectionLnk().click();
		pcLib.selectByText(sePage.getOperatorSel(),operatorName);
		
		sePage.getSettlementSubmitBtn().click();
		Thread.sleep(3000);
		
		String ActualMsgHeader="Prepaid Summary";
		String ExpectedMsgHeader= sePage.getPrepaidSummaryheader().getText();
		
		Assert.assertEquals(ExpectedMsgHeader, ActualMsgHeader,"Actual header is not as Expected");
		
	}
	
	@DataProvider(name="AddPaymentData")
	public Object[][] getAddPaymentData() throws Exception {
		return excelRead.testData("addPayment");
	}
	
	@Test(dataProvider="AddPaymentData")
	public void addPaymentTest(String city,String operatorName,String paymentMode,String authorizedBy,String remarks,
			String paymentFor,String amount,String refNum) throws InterruptedException, AWTException
	{
		seHoPage.getSettlementPageLnk().click();
		wbcLib.waitForPageToLoad();
		Thread.sleep(1000);
		
		sePage.getPaymentSectionLnk().click();
		wbcLib.waitForPageToLoad();
		pcLib.selectByText(sePage.getCitySel(), city);
		pcLib.selectByIndex(sePage.getPaymentOperatorSel(), 4);
		pcLib.selectByText(sePage.getPaymentModeSel(), paymentMode);
		sePage.getAuthorizedByEdt().sendKeys(authorizedBy);
		sePage.getPaymentRemarksEdt().sendKeys(remarks);
		pcLib.selectByText(sePage.getPaymentForEdt(),paymentFor);
		sePage.getAmountPaidEdt().sendKeys(amount);
		sePage.getReferenceNumEdt().sendKeys(refNum);
		
		sePage.getPaymentSubmit().click();
		Thread.sleep(1000);
		
		String actualAlertMsg=wbcLib.alertText();
		System.out.println(actualAlertMsg);
		String expectedAlertMsg="Data Updation Successful!";
		wbcLib.acceptAlert();
		if(expectedAlertMsg.equalsIgnoreCase(actualAlertMsg))
		{
			Thread.sleep(10000);
			pcLib.fileDownload();
		}
	    Assert.assertEquals(actualAlertMsg, expectedAlertMsg,"Actual is not as Expected");
	}
	
	@DataProvider(name="PaymentHistory")
	public Object[][] getPaymentHistoryData() throws Exception {
		return excelRead.testData("PrepaidOperator");
	}
	
	@Test(dataProvider="PaymentHistory")
	public void paymentHistoryTest(String operatorName) throws InterruptedException
	{
		seHoPage.getSettlementPageLnk().click();
		wbcLib.waitForPageToLoad();
		Thread.sleep(1000);
		
		sePage.getPaymentHistoryLnk().click();
		Thread.sleep(1000);
		
		pcLib.selectByText(sePage.getOperatoryHistorySel(),operatorName);
		
		sePage.getPaymentHistorySubmitBtn().click();
		Thread.sleep(1000);
		
		String ExpectedHeaderMsg="Total Settlements Summary";
		String ActualHeaderMsg = sePage.getTotalSettlementHistoryHeader().getText();
		Assert.assertEquals(ActualHeaderMsg, ExpectedHeaderMsg,"Actual is not as Expected");
		
		
	}
	
	@DataProvider(name="AddCorporatePayment")
	public Object[][] getCorporatePaymentData() throws Exception {
		return excelRead.testData("AddCorporatePayment");
	}
	@Test(dataProvider="AddCorporatePayment")
	public void addCorporatePaymentTest(String clientName,String paymentFor,String amount,
			String paymentType,String paymentDate,String refNum,String valueDate) throws InterruptedException
	{
		seHoPage.getAddCorporatePaymentLnk().click();
		wbcLib.waitForPageToLoad();
		Thread.sleep(1000);
		
		pcLib.selectByText(adCoPage.getClientNameSel(), clientName);
		
		pcLib.selectByText(adCoPage.getPaymentForSel(), paymentFor);
		
		adCoPage.getAmountEdt().clear();
		adCoPage.getAmountEdt().sendKeys(amount);
		
		pcLib.selectByText(adCoPage.getPaymentTypeSel(), paymentType);
		
		adCoPage.getPaymentDateEdt().sendKeys(paymentDate);
		
		adCoPage.getReferenceNumEdt().sendKeys(refNum);
		
		adCoPage.getValueDateEdt().sendKeys(valueDate);
		
		adCoPage.getSubmitBtn().click();
		
		String actualAlertMsg=wbcLib.alertText();
		String expectedAlertMsg="Added successfully";
		wbcLib.acceptAlert();
		Thread.sleep(1000);
		
		Assert.assertEquals(actualAlertMsg, expectedAlertMsg,"Actual is not as Expected");
		
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
