package com.cts.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

	public By cartLoc = By.xpath("//i[@class='add-to-cart']");
	public By cartLoc1 = By.xpath("//span[text()='×']");
	public By cartLoc2 = By.id("cart");
	public By barginLoc = By.xpath("//a[text()='HOT BARGAIN']");
	public By barginLoc1 = By.id("Text1");
	public By barginLoc2 = By.id("Button1");
	public By bookLoc = By.id("totrecords");
	public By logoutLoc = By.xpath("//span[@class='uname']");
	public By logoutLoc1 = By.id("logout");
	public By subsLoc = By.id("globalnewsletter");
	public By subsLoc1 = By.xpath("//button[@class='btn btn-md orange-btn']");
	public By mailLoc = By.id("ContentPlaceHolder1_lbemail");

	// Adding book to the cart
	public void addtoCart(WebDriver driver) throws InterruptedException {
		driver.findElement(cartLoc).click();
		driver.findElement(cartLoc1).click();
		Thread.sleep(2000);
		driver.findElement(cartLoc2).click();
	}

	// Searching book in the HotBargin by title
	public void clickHotBargin(WebDriver driver, String title) throws Throwable {
		driver.findElement(barginLoc).click();
		driver.findElement(barginLoc1).sendKeys(title);
		driver.findElement(barginLoc2).click();
		Thread.sleep(2000);

	}

	// Assert for Book is present or not
	public void bookAssert(WebDriver driver, String book) throws Throwable {
		if (Integer.parseInt(book) < Integer.parseInt(((driver.findElement(bookLoc).getText())))) {
			System.out.println(Integer.parseInt(((driver.findElement(bookLoc).getText()))));
		} else {
			Assert.fail(book);
		}
	}

	// Logout from the account
	public void logout(WebDriver driver) {
		Actions act = new Actions(driver);
		act.pause(3000).moveToElement(driver.findElement(logoutLoc)).pause(3000).build().perform();
		driver.findElement(logoutLoc1).click();
	}

	// Suscribing to jain book agency
	public void subscription(WebDriver driver, String mail) {
		driver.findElement(subsLoc).sendKeys(mail);
		driver.findElement(subsLoc1).click();
	}

	// Assert to check suscribed mail is present or not
	public void mailPresent(WebDriver driver, String mail) {
		if (mail.contentEquals(driver.findElement(mailLoc).getText())) {
			System.out.println("given mail is present");
		} else {
			Assert.fail("given mail is not present");
		}

	}
}
