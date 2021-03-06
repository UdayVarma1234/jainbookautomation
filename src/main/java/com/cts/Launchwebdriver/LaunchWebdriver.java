package com.cts.Launchwebdriver;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchWebdriver {

	public WebDriver driver;

	// Opening chrome browser and loading url
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.jainbookagency.com/");
		driver.findElement(By.xpath("(//span[text()='�'])[2]")).click();
	}

	// Taking screenshot and closing browser
	public void termination() {
		Date date = new Date();
		String datestr = date.toString().replace(":", "-");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		file.renameTo(new File("src/test/resources/screenshot/image" + datestr + ".png"));
		driver.quit();
	}

}
