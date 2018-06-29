package com.cybertek;

import org.junit.Assert;
import org.junit.Test;

public class UnitTest<Unit> {
	
	@Test
	public void addTest() {
		int expected =2;
		Unit unit = new Unit();
		int actual = unit.add(1,1);
		
		Assert.assertEquals(actual, expected);
		
		
		
	}
	

}
