package com.cts.Pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

	public static By cartLoc = By.xpath("//i[@class='add-to-cart']");
	public static By cartLoc1 = By.xpath("//span[text()='×']");
	public static By cartLoc2 = By.id("cart");
	public static By barginLoc = By.xpath("//a[text()='HOT BARGAIN']");
	public static By barginLoc1 = By.id("Text1");
	public static By bookLoc = By.id("totrecords");
	public static By logoutLoc = By.xpath("//span[@class='uname']");
	public static By logoutLoc1 = By.id("logout");
	public static By subsLoc =  By.id("globalnewsletter");
	public static By subsLoc1 = By.xpath("//button[@class='btn btn-md orange-btn']");
	public static By mailLoc = By.id("ContentPlaceHolder1_lbemail");
	
	public static void addtoCart(WebDriver driver) throws InterruptedException {
		driver.findElement(cartLoc).click();
		driver.findElement(cartLoc1).click();
		Thread.sleep(2000);
		driver.findElement(cartLoc2).click();
	}

	public static void clickHotBargin(WebDriver driver, String title) throws Throwable {
		driver.findElement(barginLoc).click();
		driver.findElement(barginLoc1).sendKeys(title);
		driver.findElement(By.id("Button1")).click();
		Thread.sleep(2000);

	}

	public static void bookAssert(WebDriver driver, String book) throws Throwable {
		if (Integer.parseInt(book)< Integer.parseInt(((driver.findElement(bookLoc).getText())))) {
			System.out.println(Integer.parseInt(((driver.findElement(bookLoc).getText()))));
		} else {
			Assert.fail(book);
		}
	}

	public static void logout(WebDriver driver) {
		Actions act=new Actions(driver);
		act.pause(3000).moveToElement(driver.findElement(logoutLoc)).pause(3000).build().perform();
		driver.findElement(logoutLoc1).click();
	}

	public static void subscription(WebDriver driver, String mail) {
		driver.findElement(subsLoc).sendKeys(mail);
		driver.findElement(subsLoc1).click();
	}

	public static void mailPresent(WebDriver driver, String mail) {
		if (mail.contentEquals(driver.findElement(mailLoc).getText())) {
			System.out.println("given mail is present");
		}
		else
		{
			Assert.fail("given mail is not present");
		}
	
	}
}
