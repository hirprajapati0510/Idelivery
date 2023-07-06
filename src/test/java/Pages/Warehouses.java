package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Warehouses
{
	WebDriver driver;
	
    //By search = By.id("input-19");
	//By edit = By.xpath("//*[contains(text(),'ideliver AAA')]");
	By edit = By.xpath("//a[@href ='/app/warehouses/12']");
	By Sale = By.xpath("//*[contains(text(),'Sale Orders')]"); 
	By Company = By.xpath("//div[@role='combobox']");
	By selectcompany = By.xpath("//*[contains(text(),'Ignition')]");
	By Searchorder = By.xpath("//input[@id='input-57']");
	By orderedit = By.xpath("//i[@class='v-icon notranslate mdi mdi-pencil theme--light']");
	By Cancelorder = By.xpath("//span[normalize-space()='Cancel Order']");
	By Closeorder = By.xpath("//button[@class='v-btn v-btn--text theme--dark v-size--small']//span[@class='v-btn__content'][normalize-space()='Close']");
    
	
	public Warehouses(WebDriver driver)
	  	{
		  this.driver = driver;
	  	}
	  
	public void ClickonWarehouses(String Order_Number) throws InterruptedException
	  	{
		    //driver.findElement(search).sendKeys("ideliver AAA");
		    driver.findElement(edit).click();
		    Thread.sleep(4000);
		    driver.findElement(Sale).click();
		    Thread.sleep(4000);
		    driver.findElement(Company).click();
		    Thread.sleep(3000);
		    driver.findElement(selectcompany).click();
		    Thread.sleep(3000);
		    driver.findElement(Searchorder).sendKeys(Order_Number);
 		    Thread.sleep(7000);
 		    driver.findElement(orderedit).click();
 		    Thread.sleep(7000);
 		    driver.findElement(Cancelorder).click();
 		    Thread.sleep(5000);
 		    driver.switchTo().alert().accept();
 		    Thread.sleep(7000);
 		    driver.findElement(Closeorder).click();
		    Thread.sleep(5000);
	  	}
}
