package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login 
{
	  WebDriver driver;
//	  By username = By.id("txtUsername");
//	  By passwd = By.id("txtPassword");
//	  By btn = By.id("btnSignIn");
	  
	  By username = By.id("input-8");
	  By passwd = By.id("input-11");
	  By btn = By.xpath("//*[contains(text(),'Login')]");
	

	  public Login(WebDriver driver)
	  	{
		  this.driver = driver;
	  	}
	  
	  public void verifylogin(String uname, String pwd) 
	  	{
	    driver.findElement(username).sendKeys("vivek.shah@ignitiongroup.co.za");
	    driver.findElement(passwd).sendKeys("seFPZH26KFuhsYA");
	    driver.findElement(btn).click();

	  	}
}
