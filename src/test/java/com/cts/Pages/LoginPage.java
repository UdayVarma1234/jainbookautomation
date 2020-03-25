package com.cts.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public By loginLoc = By.id("login");
	public By loginLoc1 = By.id("ContentPlaceHolder1_TextBox1");
	public By loginLoc2 = By.id("ContentPlaceHolder1_TextBox2");
	public By loginloc3 = By.id("ContentPlaceHolder1_btnlogin");

	// Login the account with valid credentials
	public void login(WebDriver driver, String username, String password) throws Throwable {
		driver.findElement(loginLoc).click();
		Thread.sleep(2000);
		driver.findElement(loginLoc1).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(loginLoc2).sendKeys(password);
		driver.findElement(loginloc3).click();
	}

}
