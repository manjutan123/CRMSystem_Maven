package contactDetails;

import org.testng.annotations.Test;

import commonMethod.CommonFunctions;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Logintest {

	WebDriver driver;
  
	@Test
    public void login1() throws InterruptedException {
	  driver.get("https://www.freecrm.com/index.html");
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	  CommonFunctions.enterCrendential(driver, "naveenk", "test@123");
	  String hmtitle="CRMPRO";
	  System.out.println("Home page Title "+driver.getTitle());
	  Assert.assertTrue(driver.getTitle().equals(hmtitle), "Home page is not open");
	  Thread.sleep(3000);
	  CommonFunctions.entercontact(driver,"reena","pande");
   }
	
	
  
  @BeforeMethod
  public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "D:\\Sel\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
