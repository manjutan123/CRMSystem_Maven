package commonMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import pageObject.ContactPage;
import pageObject.Loginpage;

public class CommonFunctions {

	public static void enterCrendential(WebDriver driver, String uname, String pwd) throws InterruptedException {
		WebElement password = Loginpage.pwd(driver);
		WebElement uname1 = Loginpage.username(driver);
		WebElement logbtn = Loginpage.loginbtn(driver);
		uname1.sendKeys(uname);
		password.sendKeys(pwd);
		Thread.sleep(3000);
		logbtn.click();
	}

	public static void entercontact(WebDriver driver, String uname, String lname) throws InterruptedException {
		  driver.switchTo().frame("mainpanel");

		WebElement cntlink = ContactPage.contactlink(driver);
		WebElement newcntlink = ContactPage.newcontactlink(driver);
		

		Actions act = new Actions(driver);
		act.moveToElement(cntlink).build().perform();
		newcntlink.click();

		WebElement savebtn = ContactPage.savelink(driver);
		WebElement fname = ContactPage.firstname(driver);
		WebElement lname1 = ContactPage.lastname(driver);
		
		fname.sendKeys(uname);
		lname1.sendKeys(lname);
		System.out.println("save shown " + savebtn.isDisplayed());
		savebtn.click();
	}

}
