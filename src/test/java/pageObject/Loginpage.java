package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {

	public static WebElement username (WebDriver driver)
	{
		WebElement uname= driver.findElement(By.name("username"));
		return uname;
	}
	
	public static WebElement pwd (WebDriver driver)
	{
		WebElement password= driver.findElement(By.name("password"));
		return password;
	}
	
	public static WebElement loginbtn (WebDriver driver)
	{
		WebElement logbtn=driver.findElement(By.xpath("//input[@value='Login']"));
		return logbtn;
	}
	
}
