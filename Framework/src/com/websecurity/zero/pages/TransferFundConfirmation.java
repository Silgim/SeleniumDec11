package com.websecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundConfirmation {
	@FindBy(css="#transfer_funds_content > div > div > div.alert.alert-success")
	private WebElement confirmTextBox;
	
	@FindBy(css="#settingsBox > ul > li:nth-child(3) > a")
	private WebElement selectUserName;
	
	@FindBy(id="logout_link")
	private WebElement logOut;
	
	public TransferFundConfirmation(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
	public String getConfirmationtext() {
		String conText=confirmTextBox.getText();
		return conText;
	}
	
	public void confirmLogout() {
		selectUserName.click();
		logOut.click();
	}
	

}
