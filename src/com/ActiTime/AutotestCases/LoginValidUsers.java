package com.ActiTime.AutotestCases;

import org.testng.annotations.Test;

import com.ActiTime.GenericUtils.BaseTest;
import com.ActiTime.Pages.LoginPage;

public class LoginValidUsers extends BaseTest
{

	@Test
	public void ValidUsers()
	{
		
		LoginPage lp = new LoginPage(driver); 
		lp.EnterUserName("sjayadevappa");
		lp.EnterPassword("5tgb%TGB");
		lp.LoginButton();
		
	}
	
}
