package com.TaxiForSure.BusinessLib;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.TaxiForSure.GenericLib.WebDriverCommonLib;
import com.TaxiForSure.GenericLib.Driver;
import com.TaxiForSure.ObjectRepository.DriverRegistrationForm;
import com.TaxiForSure.ObjectRepository.Login;
import com.TaxiForSure.ObjectRepository.VehicleRegistrationForm;

public class ProjectCommonLib extends WebDriverCommonLib {

	Login loginPage = PageFactory.initElements(Driver.driver, Login.class);
	DriverRegistrationForm drRegPage = PageFactory.initElements(Driver.driver,
			DriverRegistrationForm.class);
	VehicleRegistrationForm veRegPage = PageFactory.initElements(Driver.driver,
			VehicleRegistrationForm.class);

	public void openRegUrl() {
		Driver.driver.get("http://54.255.57.96:8106/registration/");
		windowMaximize();
	}

	public void openSettlementUrl() {
		Driver.driver.get("http://54.255.57.96:8105/settlements/");
		windowMaximize();
	}

	public void openPrepaidUrl() {
		Driver.driver.get("http://54.255.57.96:8101/prepaid/");
		windowMaximize();
	}
	
	public void openSupplyUrl() {
		Driver.driver.get("http://54.255.57.96:8100/supply/");
		windowMaximize();
	}

	public void closeUrl() {
		Driver.driver.close();
	}

	public void loginToApp() throws IOException
	{
		FileInputStream fis = new FileInputStream(
	            System.getProperty("user.dir")+"\\src\\test\\java\\com\\TaxiForSure\\Utility\\LogInfo.properties");
		Properties prop = new Properties();
		
		prop.load(fis);
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		loginPage.getUserNameEdt().sendKeys(username);
	
		loginPage.getPwdEdt().sendKeys(password);
	
		loginPage.getSignInBtn().click();
		waitForPageToLoad();
	
	}
	public void ExpDatePicker() {
		
		
		drRegPage.getDatePickerSel().click();
		drRegPage.getNxtDatePickerSel().click();
		drRegPage.getDaypickerSel().click();

	}
	
	public void DLExpDatePicker()
	{
		drRegPage.getDlExpDateYearSel1().click();
		drRegPage.getDlExpDateYearSel2().click();
		drRegPage.getDlExpDateYearSel3().click();
		
		drRegPage.getDlExpDateMonthSel().click();
		drRegPage.getDlExpDateDateSel().click();
	}

	public void ExpDatePickerBadNo() {
		drRegPage.getNxtBadNoDatePickerSel().click();
		drRegPage.getNxtBadNoDayPickerSel().click();
	}

	public void ExpDateTaxNo() {
		veRegPage.getNxtTaxExpDateSel().click();
		veRegPage.getTaxDateDaySel().click();
	}

	public void ExpDateInsNo() {
		veRegPage.getNxtInsExpDateSel().click();
		veRegPage.getInsExpDateDaySel().click();
	}

	public void ExpDatePermitNo() {
		veRegPage.getNxtPermitExpDateSel().click();
		veRegPage.getPermitDateDaySel().click();
	}

	public void ExpDatePUCNo() {
		veRegPage.getNxtPUCExpDateSel().click();
		veRegPage.getPucDateDaySel().click();
	}

	public void ExpDateFitnessNo() {
		veRegPage.getNxtFitnessExpDateSel().click();
		veRegPage.getFitnessDateDaySel().click();
	}

	public void SelectFile() throws IOException {
		Runtime.getRuntime()
				.exec("C:\\Users\\sripriya.b\\Desktop\\FileAtt.exe");

	}
	
	public WebElement editButton(String compName)
	{
		String firstxpath="//td[h5[contains(text(),'";
		String lastxpath="')]]/following-sibling::td/input";
		return Driver.driver.findElement(By.xpath(firstxpath+compName+lastxpath));
	}

	public void fileUpload(String path) throws AWTException,
			InterruptedException {

		StringSelection stringSelection = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard()
				.setContents(stringSelection, null);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(2000);
	}
	
	public void fileUpload(String filePath, String fileName)
			throws AWTException, InterruptedException {
		StringSelection stringSelection = new StringSelection(filePath
				+ fileName);
		Toolkit.getDefaultToolkit().getSystemClipboard()
				.setContents(stringSelection, null);
		
		Robot robot = new Robot();
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(4000);
		
	}
	public void fileDownload() throws AWTException,InterruptedException
	{
		Robot robot=new Robot();
		 robot.keyPress(KeyEvent.VK_ALT);
		 robot.keyPress(KeyEvent.VK_S);
		 robot.keyRelease(KeyEvent.VK_S);
		 robot.keyRelease(KeyEvent.VK_ALT);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
	}

	
	public void logOut() {
		loginPage.getLogOutLnk().click();

	}

}
