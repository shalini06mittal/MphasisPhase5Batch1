package com.mphasis.testng.TestNgDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ParallelTestDemo {

	public ParallelTestDemo() {
		System.out.println("contructor");
	}

	//WebDriver driver;
	String url;
	@Test
	public void testOpening2() throws InterruptedException {
		System.out.println("about");
		 System.setProperty("webdriver.chrome.driver", "/Users/Shalini/Desktop/jars/chromedriver");
		WebDriver  driver = new ChromeDriver();
		url = "https://www.techgatha.com";
		driver.navigate().to(url);
		WebElement ele = driver
				.findElement(By.partialLinkText("ABOUT"));
		ele.click();

		assertTrue(driver.getTitle().startsWith("TechGatha"));
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void testOpening1() throws InterruptedException {
		System.out.println("kids");
		 System.setProperty("webdriver.chrome.driver", "/Users/Shalini/Desktop/jars/chromedriver");
		WebDriver driver = new ChromeDriver();
		url = "https://www.techgatha.com";
		driver.navigate().to(url);

		WebElement ele = driver
				.findElement(By.linkText("SERVICES"));
		driver.navigate().refresh();
		ele.click();
		// List<WebElement> elements = driver.findElements(By.tagName("h2"));
		assertTrue(driver.getTitle().startsWith("TechGatha"));
		Thread.sleep(1000);
		driver.close();
	}

}
