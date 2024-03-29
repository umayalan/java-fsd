package ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Automation {
	WebDriver driver;

	@Test(groups = "Chrome")
	public void LaunchChrome() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkathiresan\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(groups = "Chrome", dependsOnMethods = "LaunchChrome")
	public void f() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

//		To find the load time and print on console

		Long loadtime = (Long) ((JavascriptExecutor) driver)
				.executeScript("return performance.timing.loadEventEnd - performance.timing.navigationStart;");
		System.out.println("Load time of the website is :- " + loadtime);

//		To search the given text in search bar

		driver.findElement(By.className("_3704LK")).sendKeys("iphone 13");
		driver.findElement(By.className("L0Z3Pu")).click();

		WebElement i = driver.findElement(By.xpath("//img[@class='_396cs4 _3exPp9']"));
		Boolean p = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete "
				+ "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);

		if (p) {
			System.out.println("Image is loaded");
		} else {
			System.out.println("Image not loaded");
		}

		try {
			long lastHeight = (long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");

			while (true) {
				((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
				Thread.sleep(2000);

				long newHeight = (long) ((JavascriptExecutor) driver)
						.executeScript("return document.body.scrollHeight");
				if (newHeight == lastHeight) {
					break;
				}
				lastHeight = newHeight;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(groups = "Firefox")
	public void LaunchFirefox() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\pkathiresan\\Downloads\\geckodriver-v0.31.0-win64.zip");
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(groups="Firefox", dependsOnMethods="LaunchFirefox")
	public void firefox() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

//		To find the load time and print on console

		Long loadtime = (Long) ((JavascriptExecutor) driver)
				.executeScript("return performance.timing.loadEventEnd - performance.timing.navigationStart;");
		System.out.println("Load time of the website is :- " + loadtime);

//		To search the given text in search bar

		driver.findElement(By.className("_3704LK")).sendKeys("iphone 13");
		driver.findElement(By.className("L0Z3Pu")).click();

		WebElement i = driver.findElement(By.xpath("//img[@class='_396cs4 _3exPp9']"));
		Boolean p = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete "
				+ "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);

		if (p) {
			System.out.println("Image is loaded");
		} else {
			System.out.println("Image not loaded");
		}

		try {
			long lastHeight = (long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");

			while (true) {
				((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
				Thread.sleep(2000);

				long newHeight = (long) ((JavascriptExecutor) driver)
						.executeScript("return document.body.scrollHeight");
				if (newHeight == lastHeight) {
					break;
				}
				lastHeight = newHeight;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
