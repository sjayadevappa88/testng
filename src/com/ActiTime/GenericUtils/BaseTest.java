package com.ActiTime.GenericUtils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConstant
{
	public WebDriver driver;
	
	@BeforeMethod
	public void precondition()
	{
	
		System.setProperty(AutoConstant.chrome_key, AutoConstant.chrome_value);
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.manage().deleteAllCookies();
		driver.get(AutoConstant.AppURL); 
	}
	
	
	@AfterMethod
	public void PostCondition()
	{
		Reporter.log("test Case executed", true);
	}
	
	
}
