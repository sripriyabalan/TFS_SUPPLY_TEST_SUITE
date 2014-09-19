package com.TaxiForSure.RegTestCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;



















import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.TaxiForSure.BusinessLib.ProjectCommonLib;
import com.TaxiForSure.GenericLib.WebDriverCommonLib;
import com.TaxiForSure.GenericLib.Driver;
import com.TaxiForSure.ObjectRepository.ComprehensiveInspectionPage;
import com.TaxiForSure.ObjectRepository.InspectionHomePage;
import com.TaxiForSure.ObjectRepository.InspectionPage;
import com.TaxiForSure.ObjectRepository.QuickInspectionPage;
import com.TaxiForSure.Utility.ReadDataFromExcel;

public class SupplyInspectionTest {

	WebDriverCommonLib wbcLib= new WebDriverCommonLib();
	ProjectCommonLib pcLib =new ProjectCommonLib();
	InspectionHomePage insHoPage = PageFactory.initElements(Driver.driver, InspectionHomePage.class);
	InspectionPage insPage = PageFactory.initElements(Driver.driver, InspectionPage.class);
	ComprehensiveInspectionPage coInsPage = PageFactory.initElements(Driver.driver, ComprehensiveInspectionPage.class);
	QuickInspectionPage quInsPage = PageFactory.initElements(Driver.driver, QuickInspectionPage.class);
	ReadDataFromExcel excelRead = new ReadDataFromExcel();
	String filePath = System.getProperty("user.dir")+"\\src\\test\\resources\\";
	
	@BeforeClass
	public void configBeforeClass() throws InvalidFormatException, IOException
	{
		pcLib.openSupplyUrl();
		
	}
	
	@BeforeMethod
	public void configBeforeMethod() throws IOException, InvalidFormatException
	{
		pcLib.loginToApp();
		wbcLib.waitForPageToLoad();
	}
	
	@DataProvider(name="HomePageVehicleNoInvalid")
	public Object[][] getHomePageVehicleNoData() throws Exception {
		return excelRead.testData("HomePageVehicleNo");
	}
	@Test(dataProvider="HomePageVehicleNoInvalid")
	public void inspectionHomePageInvalidTest(String vehicleNo1,String vehicleNo2,String vehicleNo3,String vehicleNo4)
	{
		insHoPage.getVehicleNumber1Edt().sendKeys(vehicleNo1);
		insHoPage.getVehicleNumber2Edt().sendKeys(vehicleNo2);
		insHoPage.getVehicleNumber3Edt().sendKeys(vehicleNo3);
		insHoPage.getVehicleNumber4Edt().sendKeys(vehicleNo4);
		insHoPage.getSearchBtn().click();
		//Boolean flag;
		/*WebDriverWait wait = new WebDriverWait(Driver.driver, 10);
		   ExpectedCondition<Boolean> condition = new ExpectedCondition<Boolean>() {
		   	@Override
			public Boolean apply(WebDriver d) {
		   	 WebElement result = insHoPage.getErrorMsgHeader();
		   	 return "Vehicle Number does not exist! Please try again.".equals(result.getText());
			}
		   };
		  // wait.until(condition); */// Won't get past here til timeout or element is found
	
		
		String ExpectedStr="Vehicle Number does not exist! Please try again.";
		String ActualStr=insHoPage.getErrorMsgHeader().getText();
		Assert.assertEquals(ActualStr,ExpectedStr,"Actual String is not as expected");
		
	}
	
	@DataProvider(name="ComprehensiveHistory")
	public Object[][] getComprehensiveHistoryData() throws Exception {
		return excelRead.testData("HistoryVehicleNo");
	}
	@Test(dataProvider="ComprehensiveHistory")
	public void comprehensiveHistoryTest(String vehicleNo1,String vehicleNo2,String vehicleNo3,String vehicleNo4) throws InterruptedException
	{
		insHoPage.getVehicleNumber1Edt().sendKeys(vehicleNo1);
		insHoPage.getVehicleNumber2Edt().sendKeys(vehicleNo2);
		insHoPage.getVehicleNumber3Edt().sendKeys(vehicleNo3);
		insHoPage.getVehicleNumber4Edt().sendKeys(vehicleNo4);
		insHoPage.getSearchBtn().click();
		
		Thread.sleep(1000);
		insPage.getHistoryLnk().click();
		insPage.getCompInsHistoryLnk().click();
		
		String ExpectedStr="Last Inspected By";
		String ActualStr=insPage.getCompHistoryLastInsLabel().getText();
		Assert.assertEquals(ActualStr,ExpectedStr,"Actual String is not as expected");
	}
	
	@DataProvider(name="QuickHistory")
	public Object[][] getQuickHistoryData() throws Exception {
		return excelRead.testData("HistoryVehicleNo");
	}
	@Test(dataProvider="QuickHistory")
	public void quickHistoryTest(String vehicleNo1,String vehicleNo2,String vehicleNo3,String vehicleNo4) throws InterruptedException
	{
		insHoPage.getVehicleNumber1Edt().sendKeys(vehicleNo1);
		insHoPage.getVehicleNumber2Edt().sendKeys(vehicleNo2);
		insHoPage.getVehicleNumber3Edt().sendKeys(vehicleNo3);
		insHoPage.getVehicleNumber4Edt().sendKeys(vehicleNo4);
		insHoPage.getSearchBtn().click();
		
		Thread.sleep(1000);
		insPage.getHistoryLnk().click();
		insPage.getQuickInsHistoryLnk().click();
		
		String ExpectedStr="Last Inspected By";
		String ActualStr=insPage.getQuickHistoryInsLabel().getText();
		Assert.assertEquals(ActualStr,ExpectedStr,"Actual String is not as expected");
	}
	
	
	@DataProvider(name="VehicleNoData")
	public Object[][] getHomePageVehicleData() throws Exception {
		return excelRead.testData("VehicleNo");
	}
	@Test(dataProvider="VehicleNoData")
	public void inspectionHistoryTest(String vehicleNo1,String vehicleNo2,String vehicleNo3,String vehicleNo4) throws InterruptedException
	{
		insHoPage.getVehicleNumber1Edt().sendKeys(vehicleNo1);
		insHoPage.getVehicleNumber2Edt().sendKeys(vehicleNo2);
		insHoPage.getVehicleNumber3Edt().sendKeys(vehicleNo3);
		insHoPage.getVehicleNumber4Edt().sendKeys(vehicleNo4);
		insHoPage.getSearchBtn().click();
		
		Thread.sleep(1000);
		
		insPage.getHistoryLnk().click();
		
		String ExpectedStr="Info -";
		String ActualStr=insPage.getHistoryErrMsg().getText();
		insPage.getHomeLnk().click();
		if(wbcLib.isAlertPresent())
		{
			wbcLib.acceptAlert();
		}
		Thread.sleep(1000);
		Assert.assertEquals(ActualStr,ExpectedStr,"Actual String is not as expected");
	}
	
	@DataProvider(name="ComprehensiveInsData")
	public Object[][] getComprehensiveInsData() throws Exception {
		return excelRead.testData("ComprehensiveInsData");
	}
	@Test(dataProvider="ComprehensiveInsData")
	public void comprehensiveInspectionTest(String vehicleNo1,String vehicleNo2,String vehicleNo3,String vehicleNo4,
			String odometerReading,String frontImg,String driverImg) throws InterruptedException, AWTException
	{
		insHoPage.getVehicleNumber1Edt().sendKeys(vehicleNo1);
		insHoPage.getVehicleNumber2Edt().sendKeys(vehicleNo2);
		insHoPage.getVehicleNumber3Edt().sendKeys(vehicleNo3);
		insHoPage.getVehicleNumber4Edt().sendKeys(vehicleNo4);
		insHoPage.getSearchBtn().click();
		
		insPage.getComprehensiveInsLnk().click();
		Thread.sleep(2000);
		Robot robot=new Robot();
		 robot.keyPress(KeyEvent.VK_ALT);
		 robot.keyPress(KeyEvent.VK_A);
		 robot.keyRelease(KeyEvent.VK_A);
		 robot.keyRelease(KeyEvent.VK_ALT);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_A);
		 robot.keyRelease(KeyEvent.VK_A);
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(4000);
		Thread.sleep(10000);
		System.out.println(coInsPage.getHeaderRadiusMsg().getText());
		if(coInsPage.getHeaderRadiusMsg().getText().contains("Error"))
		{
			insPage.getHomeLnk().click();
			if(wbcLib.isAlertPresent())
			{
				wbcLib.acceptAlert();
			}
			Thread.sleep(1000);
			Assert.fail("Driver is not with in 1 km radius");
		}
		coInsPage.getCurrOdometerReadingEdt().sendKeys(odometerReading);
		coInsPage.getDriverLateRaBtn().click();
		coInsPage.getVerifiedDocumentRaBtn().click();
		
		coInsPage.getFrontViewUploadBtn().click();
		Thread.sleep(1000);
		coInsPage.getFrontViewSelectImgBtn().click();
		Thread.sleep(1000);
		pcLib.fileUpload(filePath, frontImg);
		coInsPage.getFrontViewUploadImageBtn().click();
		Thread.sleep(4000);
		coInsPage.getFrontViewCloseBtn().click();
		Thread.sleep(1000);
		
		coInsPage.getDriverUploadBtn().click();
		coInsPage.getDriverSelectImgBtn().click();
		pcLib.fileUpload(filePath, driverImg);
		coInsPage.getDriverUploadImageBtn().click();
		Thread.sleep(4000);
		coInsPage.getDriverCloseBtn().click();
		Thread.sleep(1000);
		
		
		
		//SafetyChecks
		coInsPage.getHornsRaBtn().click();
		coInsPage.getHeadLampRaBtn().click();
		coInsPage.getWindScreenRaBtn().click();
		coInsPage.getWiperRaBtn().click();
		coInsPage.getRearViewMirrorRaBtn().click();
		coInsPage.getSideViewMirrorRaBtn().click();
		coInsPage.getSideIndicatorRaBtn().click();
		coInsPage.getBrakesRaBtn().click();
		coInsPage.getSeatBeltRaBtn().click();
		coInsPage.getChildLockRaBtn().click();
		coInsPage.getStephenyRaBtn().click();
		coInsPage.getToolKitRaBtn().click();
		coInsPage.getFirstAidKitRaBtn().click();
		coInsPage.getHazardIndicatorRaBtn().click();
		coInsPage.getTailLampRaBtn().click();
		
		
		//ExteriorChecks
		coInsPage.getTyresRaBtn().click();
		coInsPage.getFrontRaBtn().click();
		coInsPage.getBackRaBtn().click();
		coInsPage.getSuspensionRaBtn().click();
		coInsPage.getPaintRaBtn().click();
		coInsPage.getCarrierConditionRaBtn().click();
		coInsPage.getRopesRaBtn().click();
		coInsPage.getTarpaulinRaBtn().click();
		coInsPage.getBrandingRaBtn().click();
		
		
		//InteriorChecks
		coInsPage.getAcWorkingRaBtn().click();
		coInsPage.getFreshenersRaBtn().click();
		coInsPage.getTissuesRaBtn().click();
		coInsPage.getSeatCoversRaBtn().click();
		coInsPage.getMobileHandsFreeRaBtn().click();
		coInsPage.getFootMatRaBtn().click();
		coInsPage.getMobileChargersRaBtn().click();
		coInsPage.getPenBillRaBtn().click();
		coInsPage.getPlacardRaBtn().click();
		coInsPage.getIdCardRaBtn().click();
		coInsPage.getStereoRaBtn().click();
		coInsPage.getQualityCardRaBtn().click();
		
		//VTS Checks
		
		coInsPage.getDevStandMountedRaBtn().click();
		coInsPage.getDevStandRaBtn().click();
		coInsPage.getKnowledgeDevRaBtn().click();
		
		//DriverAuditList
		
		coInsPage.getWearingUniformRaBtn().click();
		coInsPage.getSmokingRaBtn().click();
		coInsPage.getDrinkingRaBtn().click();
		coInsPage.getChewingTobaccoRaBtn().click();
		coInsPage.getShavingRaBtn().click();
		coInsPage.getHaircutRaBtn().click();
		coInsPage.getKnowledgeRoutesRaBtn().click();
		
		//Feedback And Suggestions
		
		coInsPage.getRoutingToCustRaBtn().click();
		coInsPage.getBusinessSatisfactionRaBtn().click();
		
		coInsPage.getSaveChangesSubmitBtn().submit();
		Thread.sleep(1000);
				
		boolean elementPresent=false;
		try
		{ 
		    new WebDriverWait(Driver.driver,10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[@id='top']/div[2]/h1")));
		    elementPresent=true;

		}catch(Exception e)
		{
		    System.out.println("Element Not Present. Exiting!!");
		    insPage.getHomeLnk().click();
			if(wbcLib.isAlertPresent())
			{
				wbcLib.acceptAlert();
			}
			Thread.sleep(1000);
			Assert.fail("Enter Valid data");
		}

		if(elementPresent)
		{
			String ExpectedTxt="Inspection Summary";
			String ActualTxt = coInsPage.getInspectionSumHeader().getText();
			Assert.assertEquals(ActualTxt,ExpectedTxt,"Actual String is not as expected");
		}
		
	}
	
	@DataProvider(name="QuickInsData")
	public Object[][] getQuickInsData() throws Exception {
		return excelRead.testData("QuickInsData");
	}
	@Test(dataProvider="QuickInsData")
	public void quickInspectionTest(String vehicleNo1,String vehicleNo2,String vehicleNo3,String vehicleNo4,
			String odometerReading,String frontImg,String driverImg) throws InterruptedException, AWTException
	{
		insHoPage.getVehicleNumber1Edt().sendKeys(vehicleNo1);
		insHoPage.getVehicleNumber2Edt().sendKeys(vehicleNo2);
		insHoPage.getVehicleNumber3Edt().sendKeys(vehicleNo3);
		insHoPage.getVehicleNumber4Edt().sendKeys(vehicleNo4);
		insHoPage.getSearchBtn().click();
		//Driver.driver.manage().deleteAllCookies();
		insPage.getQuickInspectionLnk().click();
		Thread.sleep(10000);
		
		System.out.println(quInsPage.getHeaderMsg().getText());
		if(quInsPage.getHeaderMsg().getText().contains("Error"))
		{
			insPage.getHomeLnk().click();
			if(wbcLib.isAlertPresent())
			{
				wbcLib.acceptAlert();
			}
			Thread.sleep(1000);
			Assert.fail("Driver is not with in 1 km radius");
		}
		
		
		quInsPage.getCurrenOdometerReadEdt().sendKeys(odometerReading);
		quInsPage.getDriverLateRaBtn().click();
		quInsPage.getDocsVerifiedRaBtn().click();
		
		quInsPage.getFrontViewBtn().click();
		Thread.sleep(1000);
		quInsPage.getFrontViewSelectImgBtn().click();
		Thread.sleep(1000);
		pcLib.fileUpload(filePath, frontImg);
		quInsPage.getFrontViewUploadImgBtn().click();
		Thread.sleep(4000);
		quInsPage.getFrontViewCloseBtn().click();
		Thread.sleep(1000);
		
		quInsPage.getSideViewBtn().click();
		quInsPage.getSideViewSelectImgBtn().click();
		pcLib.fileUpload(filePath, driverImg);
		quInsPage.getSideViewUploadImgBtn().click();
		Thread.sleep(4000);
		quInsPage.getSideViewCloseBtn().click();
		Thread.sleep(1000);
		
		
		
		//SafetyChecks
		quInsPage.getHornRaBtn().click();
		quInsPage.getHeadLampRaBtn().click();
		quInsPage.getWindScreenRaBtn().click();
		quInsPage.getWiperRaBtn().click();
		quInsPage.getRearViewRaBtn().click();
		quInsPage.getSideViewRaBtn().click();
		quInsPage.getSideIndicatorRaBtn().click();
		quInsPage.getBrakeRaBtn().click();
		quInsPage.getSeatBeltRaBtn().click();
		quInsPage.getChildLockRaBtn().click();
		quInsPage.getStephenyRaBtn().click();
		quInsPage.getToolkitRaBtn().click();
		quInsPage.getFirstAidKitRaBtn().click();
		quInsPage.getHazardIndicatorRaBtn().click();
		quInsPage.getTailLampsRaBtn().click();
		
		
		//Cleanliness
		quInsPage.getCleanFrmInsideRaBtn().click();
		quInsPage.getCleanFrmOutsideRaBtn().click();
				
		
		//InteriorChecks
		quInsPage.getAcWorkingRaBtn().click();
		quInsPage.getFreshnerRaBtn().click();
		quInsPage.getTissueRaBtn().click();
		quInsPage.getSeatCoverRaBtn().click();
		quInsPage.getMobileHandsFreeRaBtn().click();
		quInsPage.getFloorMatRaBtn().click();
		quInsPage.getPlacardMarkerRaBtn().click();
		quInsPage.getInfoIdCardRaBtn().click();
		quInsPage.getQualityCardRaBtn().click();
		
		
		//VTS Checks
		
		quInsPage.getDevStandMountRaBtn().click();
		quInsPage.getDevOnStandRaBtn().click();
				
		//DriverAuditList
		
		quInsPage.getWearUniformRaBtn().click();
		quInsPage.getSmokingRaBtn().click();
		quInsPage.getDrinkingRaBtn().click();
		quInsPage.getChewTobaccoRaBtn().click();
		quInsPage.getShavingRaBtn().click();
		quInsPage.getHairCutRaBtn().click();
		
		
		quInsPage.getSaveChangesSubmitBtn().submit();
		Thread.sleep(3000);
		
		boolean elementPresent=false;
		try
		{ 
		    new WebDriverWait(Driver.driver,10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[@id='top']/div[2]/h1")));
		    elementPresent=true;

		}catch(Exception e)
		{
		    System.out.println("Element Not Present. Exiting!!");
		    insPage.getHomeLnk().click();
			if(wbcLib.isAlertPresent())
			{
				wbcLib.acceptAlert();
			}
			Thread.sleep(1000);
			Assert.fail("Enter Valid data");
		}

		if(elementPresent)
		{
			String ExpectedTxt="Inspection Summary";
			String ActualTxt = quInsPage.getInspectionSumHeader().getText();
			Assert.assertEquals(ActualTxt,ExpectedTxt,"Actual String is not as expected");
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

