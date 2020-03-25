package com.cts.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {

	public By payLoc = By.xpath("//a[text()='PayPal/Credit/Debit/ATM Card']");
	public By assLoc = By.xpath("//h2[text()='PayPal/ Credit / Debit / ATM Card']");

	// Selecting payment method
	public void paymentMethod(WebDriver driver) {
		driver.findElement(payLoc).click();
	}

	// Assert to check weather selected payment method is applied or not
	public void paymentAssertion(WebDriver driver, String text) {
		if (text.contains(driver.findElement(assLoc).getText())) {
			System.out.println("present");
		} else {
			Assert.fail("not present");
		}
	}
}
