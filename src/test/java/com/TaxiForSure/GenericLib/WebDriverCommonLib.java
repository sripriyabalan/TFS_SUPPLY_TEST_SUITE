package com.TaxiForSure.GenericLib;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;






import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.common.base.Predicate;



public class WebDriverCommonLib {

	File destPath = new File(
			"E:\\TaxiForSureProject\\TaxiForSureTest\\src\\com\\taxiforsure\\screenshots\\failure.jpg");

	
	public void windowMaximize()
	{
		Driver.driver.manage().window().maximize();
	}
	public void waitForPageToLoad() {

		Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	public void ScrollDown()
	{
		JavascriptExecutor jse = (JavascriptExecutor)Driver.driver;
		jse.executeScript("window.scrollBy(0,250)", "");
	}

	public void waitForLinkPresent(String linkText) {
		WebDriverWait wait = new WebDriverWait(Driver.driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By
				.linkText(linkText)));

	}

	public void waitForWbXpath(String wbXpath) {
		WebDriverWait wait = new WebDriverWait(Driver.driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath(wbXpath)));

	}

	public void verifyText(String actualText, String expectedText) {
		try {
			
			Assert.assertEquals(actualText, expectedText,"");

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectByText(WebElement selBoxXpath, String visibleText) {
		
		Select sel = new Select(selBoxXpath);
		List<WebElement> list1 = sel.getOptions();
		for(int i=1;i<list1.size();i++)
		{
			if(list1.get(i).getText().equalsIgnoreCase(visibleText))
			{
				sel.selectByVisibleText(visibleText);
			}
		}
		
	}

	public void selectByValue(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}

	public void DeselectByValue(WebElement element, String value) {
		Select sel = new Select(element);
		sel.deselectByValue(value);
	}

	public void selectByIndex(WebElement selBoxXpath, int index) {
		
		Select sel = new Select(selBoxXpath);
		sel.selectByIndex(index);
	}

	public void DeselectByIndex(WebElement selBoxXpath, int index) {
		
		Select sel = new Select(selBoxXpath);
		sel.deselectByIndex(index);
	}

	public void deSelectByVisibleText(WebElement selBoxWb, String visibleText) {
		Select sel = new Select(selBoxWb);
		sel.deselectByVisibleText(visibleText);
	}

	public void acceptAlert() {
		Driver.driver.switchTo().alert().accept();
	}

	public void cancelAlert() {
		Alert alt = Driver.driver.switchTo().alert();
		alt.dismiss();

	}
	public boolean isAlertPresent(){
		 try 
		    { 
		        Driver.driver.switchTo().alert(); 
		        return true; 
		    }   // try 
		    catch (NoAlertPresentException Ex) 
		    { 
		        return false; 
		    }   // catch 
	}
	
	public String alertText() {
		Alert alt = Driver.driver.switchTo().alert();
		return alt.getText();
	}

	public void takeScreensort() throws IOException {

		File scr = ((TakesScreenshot) Driver.driver)
				.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, destPath);
	}
	
	 public void waitForWebElementFluently(WebElement webElement) 
	 {
         new FluentWait<WebElement>(webElement).
                 withTimeout(20, TimeUnit.SECONDS).
                 pollingEvery(10, TimeUnit.MILLISECONDS).
                 ignoring(NoSuchElementException.class).
                 until(new Predicate<WebElement>() {
                         @Override
                     public boolean apply(WebElement element) {
                         return element.isDisplayed();
                     }
                 }
                 );
     }
}
