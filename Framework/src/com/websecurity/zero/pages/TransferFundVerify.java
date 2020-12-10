package com.websecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundVerify {
	@FindBy(id="btn_submit")
	private WebElement submitBtn;
	
	public TransferFundVerify(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	public void verifyFund() {
		submitBtn.click();
	}

}
