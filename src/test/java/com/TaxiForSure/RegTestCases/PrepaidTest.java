package com.TaxiForSure.RegTestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
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
import com.TaxiForSure.ObjectRepository.PrepaidPage;
import com.TaxiForSure.Utility.ReadDataFromExcel;

public class PrepaidTest {

	WebDriverCommonLib wbcLib = new WebDriverCommonLib();
	ProjectCommonLib pcLib =new ProjectCommonLib();
	ReportLib rLib = new ReportLib();
	PrepaidPage prPage = PageFactory.initElements(Driver.driver,PrepaidPage.class);
	ReadDataFromExcel excelRead = new ReadDataFromExcel();
	
	@BeforeClass
	public void configBeforeClass() throws InvalidFormatException, IOException
	{
		pcLib.openPrepaidUrl();
	
	}
	
	@BeforeMethod
	public void configBeforeMethod() throws IOException, InvalidFormatException, InterruptedException
	{
		pcLib.loginToApp();
		wbcLib.waitForPageToLoad();
	}
	
	@DataProvider(name="OperatorFine")
	public Object[][] getOperatorFineData() throws Exception {
		return excelRead.testData("PrepaidOpFine");
	}
	@Test(dataProvider="OperatorFine")
	public void prepaidOperatorFineTest(String operatorName,String fineAmount,String fineReason) throws InterruptedException
	{
		pcLib.selectByText(prPage.getOperatorSel(),operatorName);
		
		Thread.sleep(1000);
		prPage.getOperatorFineLnk().click();
		prPage.getOperatorFineEdt().click();
		prPage.getOperatorFineEdt().sendKeys(fineAmount);
		
		prPage.getOperatorFineReasonEdt().sendKeys(fineReason);
		
		prPage.getOperatorFineReasonEdt().sendKeys(Keys.TAB);
		
		prPage.getOperatorFineApplyBtn().click();
				
		prPage.getOperatorFineYesBtn().click();
		
		String ActualMsgAlert="";
		if (wbcLib.isAlertPresent())
		{
			ActualMsgAlert=wbcLib.alertText();
			wbcLib.acceptAlert();
		}
		
		String ExpectedAlertMsg="Operator Fine Applied";
		Assert.assertEquals(ActualMsgAlert,ExpectedAlertMsg,"Actual is not as Expected");
		
		Thread.sleep(1000);
	
	}
	
	@DataProvider(name="PrepaidSummary")
	public Object[][] getOperatorSummaryData() throws Exception {
		return excelRead.testData("PrepaidOperator");
	}
	
	@Test(dataProvider="PrepaidSummary")
	public void prepaidSummaryTest(String operatorName) throws InterruptedException
	{
		pcLib.selectByText(prPage.getOperatorSel(),operatorName);
		
		prPage.getPrepaidSummaryLnk().click();
		
		String ActualMsgHeader=prPage.getPrepaidSummaryTableHeader().getText();
		String ExpectedMsgHeader="(1) Total duties done :";
		Assert.assertEquals(ActualMsgHeader,ExpectedMsgHeader,"Actual is not as Expected");
		Thread.sleep(1000);
	}
	
	@DataProvider(name="OperatorRecharge")
	public Object[][] getOperatorRechargeData() throws Exception {
		return excelRead.testData("PrepaidOperator");
	}
	@Test(dataProvider ="OperatorRecharge")
	public void operatorRechargeTest(String operatorName) throws InterruptedException
	{
		pcLib.selectByText(prPage.getOperatorSel(),operatorName);
		
		prPage.getOperatorRechargeLnk().click();
		
		String ActualMsgHeader=prPage.getOperatorRechargeHeader().getText();
		String ExpectedMsgHeader="*";
		Assert.assertEquals(ActualMsgHeader,ExpectedMsgHeader,"Actual is not as Expected");
		Thread.sleep(1000);
	}
	
	@DataProvider(name="DriverFine")
	public Object[][] getDriverFineData() throws Exception {
		return excelRead.testData("PrepaidDriFine");
	}
	@Test(dataProvider="DriverFine")
	public void prepaidDriverFineTest(String operatorName,String driverName,String fineAmount,String reason) throws InterruptedException
	{
		pcLib.selectByText(prPage.getOperatorSel(),operatorName);
		
		prPage.getDriverFineLnk().click();
		
		System.out.println(prPage.getDrivernameFineSel().getText());
		pcLib.selectByIndex(prPage.getDrivernameFineSel(),3);
		
		prPage.getDriverFineAmountEdt().sendKeys(fineAmount);
		
		prPage.getDriverFineReasonEdt().sendKeys(reason);
		prPage.getDriverFineReasonEdt().sendKeys(Keys.TAB);
		
		prPage.getDriverFineApplyBtn().click();
		
		prPage.getdriverFineYesBtn().click();
		
		String ActualMsgAlert="";
		if (wbcLib.isAlertPresent())
		{
			ActualMsgAlert=wbcLib.alertText();
			wbcLib.acceptAlert();
		}
		
		String ExpectedAlertMsg="Driver Fine Applied";
		Assert.assertEquals(ActualMsgAlert,ExpectedAlertMsg,"Actual is not as Expected");
		
		Thread.sleep(1000);
	}
	
	@DataProvider(name="DriverBal")
	public Object[][] getDriverBalData() throws Exception {
		return excelRead.testData("PrepaidDriBal");
	}
	
	@Test(dataProvider="DriverBal")
	public void prepaidDriverBalTransTest(String operatorName,String driverTrans) throws InterruptedException
	{
		pcLib.selectByText(prPage.getOperatorSel(),operatorName);
		
		prPage.getDriverBalTransLnk().click();
		
		pcLib.selectByText(prPage.getDriverTransSel(),driverTrans);
		
		String balEdt=prPage.getBaldriverTransTable().getText();
		
		String ExpBalTxt="0.0";
		Assert.assertEquals(balEdt, ExpBalTxt,"Actual is not same as Expected");
		
		Thread.sleep(1000);
		
		
	}
	
	@DataProvider(name="DriverList")
	public Object[][] getDriverlistData() throws Exception {
		return excelRead.testData("PrepaidOperator");
	}
	
	@Test(dataProvider="DriverList")
	public void prepaidDriverList(String operatorName)
	{
		pcLib.selectByText(prPage.getOperatorSel(),operatorName);
		String actualTableHeader=prPage.getDriverListTableHeader().getText();
		String ExpTableHeader="S.No";
		Assert.assertEquals(actualTableHeader, ExpTableHeader,"Actual is not same as Expected");
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
