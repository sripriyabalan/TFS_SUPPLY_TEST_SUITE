package com.TaxiForSure.GenericLib;


import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.apache.commons.io.FileUtils;


public class Driver {

	static FirefoxProfile profile= new FirefoxProfile();
	
	public static WebDriver driver = new FirefoxDriver( getProfile());
	
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
		 
        //Convert web driver object to TakeScreenshot
 
        TakesScreenshot scrShot =((TakesScreenshot)webdriver);
 
        //Call getScreenshotAs method to create image file
 
                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
 
            //Move image file to new destination
 
                File DestFile=new File(fileWithPath);
 
                //Copy file at destination
 
                FileUtils.copyFile(SrcFile, DestFile);
 
             
 
    }
	
	/*public static WebDriver openBrowser()
	{
	
	if(driver == null)
	{
		driver = new FirefoxDriver();
		return driver;
		
	}
	else
	{
		profile.setPreference("browser.download.folderList",2);
		profile.setPreference("browser.download.dir","D:\\"); 
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/pdf");
		
		driver = new FirefoxDriver(profile);
		return driver;
	}
	}*/
	
	
	/*public static WebDriver openBrowser(){
		
	
		profile.setPreference("browser.download.folderList",2);
		profile.setPreference("browser.download.manager.showWhenStarting",false);
		profile.setPreference("browser.download.dir","D:\\"); 
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/pdf");
		driver=new FirefoxDriver(profile);
		return driver;
	}*/
	
	public static FirefoxProfile getProfile(){
		profile= new FirefoxProfile();
		profile.setPreference("browser.download.folderList",2);
		profile.setPreference("browser.download.dir","D:\\"); 
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/pdf");
		
		return profile;
	}
}
