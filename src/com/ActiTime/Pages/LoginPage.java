package com.ActiTime.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage
{
	WebDriver driver;
	//Declation

	@FindBy(id="username")
	private WebElement UserName ; 
	
	@FindBy(xpath="//input[contains(@name,'pwd')]")
	private WebElement Actipassword; 
	
	@FindBy(xpath="(//div[contains(.,'Login')])[3]")
	private WebElement ActiLoginButton;

	//intilizaion
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//utilization

	public void EnterUserName(String un)
	{
		UserName.sendKeys(un);
	}
	public void EnterPassword(String pwd)
	{
		Actipassword.sendKeys(pwd);
	}
	public void LoginButton()
	{
		ActiLoginButton.click();
	}
	
	
}
