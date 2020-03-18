package com.cts.Pages;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {

	public static By payLoc = By.xpath("//a[text()='PayPal/Credit/Debit/ATM Card']");
    public static By assLoc = By.xpath("//h2[text()='PayPal/ Credit / Debit / ATM Card']");
	
	
	public static void paymentMethod(WebDriver driver) {
		driver.findElement(payLoc).click();
	}

	public static void paymentAssertion(WebDriver driver, String text) {
		if (text.contains(driver.findElement(assLoc).getText())) {
			System.out.println("present");
		} else {
              Assert.fail("not present");
		}
		driver.quit();
	}
}
