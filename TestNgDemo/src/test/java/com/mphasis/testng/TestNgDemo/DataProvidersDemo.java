package com.mphasis.testng.TestNgDemo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProvidersDemo {
  @Test(dataProvider = "credentials")
  public void validateLogin(String username, String password) {
	  System.out.println(username +" "+password);
  }
  
  @DataProvider(name = "credentials")
  public Object[][] credentialProvider()
  {
	  return new Object[][] {
		  {"name1","password1"},
		  {"name2","password2"},
		  {"name3","password3"},
		  {"name4","password4x"},
	  };
  }
}
