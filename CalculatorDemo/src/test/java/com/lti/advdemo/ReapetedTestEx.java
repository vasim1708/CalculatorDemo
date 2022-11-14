package com.lti.advdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class ReapetedTestEx {
	
	@DisplayName("Repeat the test for 6 times")
	@RepeatedTest(5)
	public void shouldrepeat() {
		int a=10,b=20;
		assertEquals(200,(a*b),"should repeat test - passed");
	}

}
