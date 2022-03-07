package com.mphasis.testng.TestNgDemo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PassParametersDemo {
  @Test
  @Parameters({"v1","v2"})
  public void add(@Optional("2") int v1, int v2) {
	  assertEquals(v1+v2, 4);
  }
  
}
