package com.TaxiForSure.Utility;

import java.io.File; 
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult; 
import org.testng.Reporter; 
import org.testng.TestListenerAdapter; 


import com.TaxiForSure.GenericLib.*;;

public class Screenshot extends TestListenerAdapter { 
@Override 

	  public void onTestFailure(ITestResult result) {
          String workingDirectory = System.getProperty("user.dir");
String fileName = workingDirectory +"\\src\\test\\java\\com\\TaxiForSure" + File.separator + "ScreenShots" + File.separator +  result.getMethod().getMethodName() + "().png";//filename
File scrFile = ((TakesScreenshot)Driver.driver).getScreenshotAs(OutputType.FILE);
try {
FileUtils.copyFile(scrFile, new File(fileName ));
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
Reporter.log("<a href=\"" + fileName  + "\">  Clickhere  </a>"  );
Reporter.setCurrentTestResult(null);

}

@Override 
public void onTestSkipped(ITestResult result) { 
// will be called after test will be skipped 
} 

@Override 
public void onTestSuccess(ITestResult result) { 
// will be called after test will pass 
} 

}