package com.mphasis.selenium.SeleniumDemo;

import static org.testng.Assert.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest 
{
    private WebDriver driver;
    private String url;
    private String expectedTitle;
	
//	@BeforeEach
//	public void before()
//	{
//		//System.setProperty("webdriver.chrome.driver", "D://jars/chromedriver.exe");
//		driver = new ChromeDriver();
//		url = "http://www.google.com";
//		expectedTitle = "Google";
//		driver.navigate().to(url);
//	}	
//    @Test
//    public void shouldTitleMatch()
//    { 	
//		String actualtitle = driver.getTitle();
//		assertEquals(actualtitle, expectedTitle);
//    }
//    @AfterEach
//	public  void closeBrowser()
//	{
//		// 4) close the browser
//		driver.close();
//	}
    @BeforeEach
	public void before()
	{
    	System.setProperty("webdriver.chrome.driver", "/Users/Shalini/Desktop/jars/chromedriver");
		driver = new ChromeDriver();
		url = "http://www.code.org";
		expectedTitle = "Google";
		driver.navigate().to(url);
	}	
    @Test
    public void shouldTitleMatch() throws InterruptedException
    { 	
    	//driver.findElement(By.linkText("Learn")).click();
    		Thread.sleep(1000);
//    	driver.findElement(By.linkText("Teach")).click();
//    	Thread.sleep(1000);
//		driver.navigate().back();
//		Thread.sleep(2000);
    }
    @AfterEach
	public  void closeBrowser()
	{
		// 4) close the browser
		//driver.close();
	}
}