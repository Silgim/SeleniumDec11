package com.websecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy(id="user_login")
	private WebElement uName;
	
	@FindBy(id="user_password")
	private WebElement passWord;
	
	@FindBy(name="submit")
	private WebElement logIn;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void loginApplication(String userName,String userPwd) {
		uName.sendKeys(userName);
		passWord.sendKeys(userPwd);
		logIn.click();
		
	}
	

}
