package com.mphasis.testng.TestNgDemo;

import static org.testng.Assert.assertFalse;
import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class TestClass1  extends AbstractTestNgDemo
{
    @Test()
    public void method1()
    {
    	System.out.println("method 1 in class 1");
    	assertFalse(true);
    }
    @Test()
    public void method2()
    {
    	System.out.println("method 2 in class 1");
    }
    
}
