package com.mphasis.selenium.SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemo {

	public static void main(String[] args) throws InterruptedException {
		
		 //1) Load the driver
		 // mac users and mac m1 users do not specify the location
		//  https://www.swtestacademy.com/install-chrome-driver-on-mac/
		 //System.setProperty("webdriver.chrome.driver", "/Users/Shalini/Desktop/jars/chromedriver");
		 // windows user
		 //System.setProperty("webdriver.chrome.driver", "D://jars/chromedriver.exe");
		 
		 // 2) which browser
		 
		 WebDriver driver = new ChromeDriver();
		 
		 // 3) open the browser and url
		 driver.get("https://www.techgatha.com");
		
		 // 4) close the browser
		 driver.close();

	}

}
