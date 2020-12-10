package com.websecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSummary{
	@FindBy(linkText="Transfer Funds")
	private WebElement tFunds;
	
	public AccountSummary(WebDriver driver){
		PageFactory.initElements(driver,this);
		
	}
	public void clickFundTransfer(){
		tFunds.click();	
		}
		
		//public boolean isTransferLinkPresent() {
			//boolean transferLink=tFunds.isDisplayed();
			//return transferLink;
		//}

}
