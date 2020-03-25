package com.cts.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CartPage {
	
	public    By cartLoc = By.xpath("//i[@class='glyphicon glyphicon-remove remove-btn']");
	public    By selectLoc = By.id("maincontent_Button5");
	public    By selectLoc1 = By.id("ContentPlaceHolder1_TextBox1");
	public    By selectLoc2 = By.id("ContentPlaceHolder1_TextBox2");
	public    By selectLoc3 = By.id("ContentPlaceHolder1_btnlogin");
			
	public    void removeCart(WebDriver driver)
	{
		driver.findElement(cartLoc).click();
		driver.switchTo().alert().accept();
	}
	public    void selectLocation(WebDriver driver ,String location,String user,String pass) throws InterruptedException 
	{
	Select sle=new Select(driver.findElement(By.id("ContentPlaceHolder1_DropDownList1")));
	sle.selectByVisibleText(location);
	driver.findElement(selectLoc).click();
	Thread.sleep(2000);
	driver.findElement(selectLoc1).sendKeys(user);
	driver.findElement(selectLoc2).sendKeys(pass);
	driver.findElement(selectLoc3).click();
	}
	
}
