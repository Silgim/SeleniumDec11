package kdf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method {
	WebDriver driver;
	public void openBrowser() {
		driver=new ChromeDriver();
	}
	public void maximiseBrowser() {
		driver.manage().window().maximize();
	}
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	public void navigateUrl(String url) {
		driver.get(url);
	}
	public void enterValueInTextBox(String locValue,String data) {
		driver.findElement(By.id(locValue)).sendKeys(data);
	}
	public void clickButton(String loc,String localVal) {
		if(loc.equals("name")) {
			driver.findElement(By.name(localVal)).click();
		}
		else if(loc.equals("xPath")) {

			driver.findElement(By.xpath(localVal)).click();
		}
	}
	public String getErrMsg(String loc,String erMsg) {
		String errMsg = null;
		if(loc.equals("cssSelector")) {
	 errMsg=driver.findElement(By.cssSelector(erMsg)).getText();
		}
		else if(loc.equals("id")) {
			 errMsg=driver.findElement(By.id(erMsg)).getText();
		}
		return errMsg;

	}
	public void closeApp() {
		driver.close();
	}
}
