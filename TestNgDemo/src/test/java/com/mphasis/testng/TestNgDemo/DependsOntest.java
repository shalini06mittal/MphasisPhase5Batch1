package com.mphasis.testng.TestNgDemo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

// junit parameterized test?
public class DependsOntest {
  @Test
  public void openBrowser() {
	  System.out.println("open the browser");
	  assertTrue(false);
  }
  
  /**
   * use depends on if you do not want to run this test if the 
   * test it depends on fails
   */
  @Test(dependsOnMethods = {"openBrowser"})
  public void siginIn()
  {
	  System.out.println("sign in ");
  }
}
