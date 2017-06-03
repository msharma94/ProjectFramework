package com.csc.integral.Test;
import org.openqa.selenium.WebElement;

import com.csc.integral.Utils.Resources;

public class Keyword extends Resources {

	
	public static String Navigate(){
		driver.get(webElement);
		return "Pass";
	}
	
	public static String InputText(){
		getWebElement(webElement).sendKeys(TestData);
		return "Pass";
	}
	
	public static String Click(){
		getWebElement(webElement).click();
		return "Pass";
	}
	
	public static WebElement getWebElement(String locator){
		System.out.println("locator data:-"+locator+"is--"+Repository.getProperty(locator));
		return getLocator(Repository.getProperty(locator));
	}
	
}
