package com.mphasis.testng.TestNgDemo;

import static org.testng.Assert.assertEquals;


import org.testng.annotations.Test;

public class GroupsTestDemo2 {

	@Test(groups = {"fe"})
	public void frontEndInGropus2() {
		assertEquals(2, 2);
	
	}

	
}
