package testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.Login;
import Pages.Logout;
import Pages.Warehouses;

public class verifytestcases
{
  WebDriver driver;
  
   public verifytestcases() {}
//  @Parameters({"env"})
//  @org.testng.annotations.BeforeClass
   
   @BeforeClass
  public void setup()
  {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
//    driver.get("http://t2.silversurfer.ignitiongroup.co.za/Auth");
    driver.get("https://dev.freqenc.com/app/warehouses");
    
    //driver.get(env);
  }

  @Test(priority=1)
  public void verifyvalidlogin() throws InterruptedException
  {   
	  Login loginportal = new Login(driver);
      loginportal.verifylogin("uname", "pwd");
      Thread.sleep(15000);
  }
  @Parameters({"Order_Number"})
  @Test(priority=2)
  public void Verifywarehouse(String Order_Number) throws InterruptedException
  {
	  Warehouses warehousedata = new Warehouses(driver);
	  warehousedata.ClickonWarehouses(Order_Number);
      Thread.sleep(15000);
  }
  
  @Test(priority=3)
  public void verifylogout() throws InterruptedException
  {
	  Logout logoutportal = new Logout(driver);
	  //Thread.sleep(15000);
	  logoutportal.clickLogout();
      //Thread.sleep(15000);
  }
  
  @AfterClass
  public void closeoff()
  {
    driver.close();
  }
}
