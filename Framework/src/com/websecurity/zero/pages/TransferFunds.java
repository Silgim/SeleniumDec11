package com.websecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TransferFunds {
	@FindBy(id="tf_fromAccountId")
	private WebElement fromAcc;
	
	@FindBy(id="tf_toAccountId")
	private WebElement toAcc;
	
	@FindBy(id="tf_amount")
	private WebElement amt;
	
	@FindBy(id="tf_description")
	private WebElement description;
	
	@FindBy(id="btn_submit")
	private WebElement submit;
	
	public TransferFunds(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
public void transFund(String amount,String des) {
	Select fromac=new Select(fromAcc);
	fromac.selectByIndex(2);
	
	Select toAccount=new Select(toAcc);
			toAccount.selectByIndex(3);
						
			
	amt.sendKeys(amount);
	description.sendKeys(des);
	submit.click();
	
}
}
