package com.mphasis.testng.TestNgDemo;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;
//listeners => listens for something to happen
public class ReporterOutputDemo {
  @Test
  public void testLoginShouldBeSuccessful() {
	  Reporter.log("Opening Login Page");
	  assertEquals("login success", "login success");
	  Reporter.log("Login successful");
  }
  @Test
  public void testRegistrationShouldBeSuccessful() {
	  Reporter.log("Opening Registration Page");
	  assertEquals("regn success", "regn success");
	  Reporter.log("Registration successful");  
  }
  
}
