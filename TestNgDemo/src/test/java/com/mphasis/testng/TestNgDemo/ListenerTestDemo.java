package com.mphasis.testng.TestNgDemo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mphasis.testng.TestNgDemo.listener.MyListener;

@Listeners(MyListener.class)
public class ListenerTestDemo {
  @Test
  public void f() {
	  assertTrue(true);
  }
  @Test
  public void f1() {
	  assertTrue(false);
  }
  @Test
  public void f2() {
	  assertTrue(true);
  }
}
