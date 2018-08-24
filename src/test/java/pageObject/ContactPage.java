package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage {

	public static WebElement contactlink(WebDriver driver) {
		WebElement cnt = driver.findElement(By.xpath("//a[@title='Contacts']"));
		return cnt;
	}

	public static WebElement newcontactlink(WebDriver driver) {
		WebElement ncnt = driver.findElement(By.xpath("//a[@title='New Contact']"));
		return ncnt;
	}

	public static WebElement savelink(WebDriver driver) {
		WebElement savelink = driver.findElement(By.xpath("//input[@type='submit' and @value='Save']"));
		return savelink;
	}
	
	public static WebElement firstname(WebDriver driver) {
	WebElement fname=driver.findElement(By.xpath("//input[@id='first_name']"));
	return fname;
}
	
	public static WebElement lastname(WebDriver driver) {
		WebElement lname=driver.findElement(By.xpath("//input[@id='surname']"));
		return lname;
	}
}