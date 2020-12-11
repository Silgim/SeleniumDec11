package kdf;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utils.GenericMeth;

public class Application {
	@Test
	public void verifyInvalidLogin() throws IOException {
		//Changes made after release 1.1
	  String[][] data=GenericMeth.getData("D:\\DataEx.xlsx", "Sheet1");
	  
	  Method mtd=new Method();
	  
	for(int i=1;i<data.length;i++) {
		switch(data[i][3]) {
		case "openBrowser":
			mtd.openBrowser();
			break;
		case "maxBrowser":
			mtd.maximiseBrowser();
			break;
		case "impWait":
			mtd.maximiseBrowser();
			break;
		case "navigateToAUT":
			mtd.navigateUrl(data[i][6]);
			break;
		case "enterinTextBox":
			mtd.enterValueInTextBox(data[i][5], data[i][6]);
			break;
		case "clickButton":
			mtd.clickButton(data[i][4],data[i][5]);
			break;
		case "verifyErrMsg":
			String actualMsg=mtd.getErrMsg(data[i][4],data[i][5]);
			String expectedMsg=data[i][6];
			Assert.assertEquals(expectedMsg, actualMsg);
			
			break;
		case "closeApp":
			mtd.closeApp();
			break;		
			
		}
	}
	
	}
}
