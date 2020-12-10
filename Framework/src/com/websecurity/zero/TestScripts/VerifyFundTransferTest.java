package com.websecurity.zero.TestScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.websecurity.zero.pages.AccountSummary;
import com.websecurity.zero.pages.Login;
import com.websecurity.zero.pages.TransferFundConfirmation;
import com.websecurity.zero.pages.TransferFundVerify;
import com.websecurity.zero.pages.TransferFunds;

import utils.GenericMeth;

public class VerifyFundTransferTest extends Base {
	@Test
	public void vFundTransfer() throws IOException {
		Login log=new Login(driver);
		AccountSummary aSum=new AccountSummary(driver);
		TransferFunds tFunds=new TransferFunds(driver);
		TransferFundVerify tFundsVerify=new TransferFundVerify(driver);
		TransferFundConfirmation tFundsConfir=new TransferFundConfirmation(driver);

		String[][] data=GenericMeth.getData("D:\\TestData.xlsx", "Sheet1");


		for(int i=1;i<data.length;i++) {

			log.loginApplication(data[i][0],data[i][1]);
			//aSum.isTransferLinkPresent();
			aSum.clickFundTransfer();

			tFunds.transFund(data[i][2],data[i][3]);
			tFundsVerify.verifyFund();
			String actualMsg=tFundsConfir.getConfirmationtext();

			Assert.assertEquals(actualMsg, data[i][4]);
			tFundsConfir.confirmLogout();
			driver.navigate().to("http://zero.webappsecurity.com/login.html");
		}

	}
}
