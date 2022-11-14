
package com.lti.advdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;



class ParameterizedEx {

	@ParameterizedTest
	@ValueSource(ints= {2,8,10,4,24} )

	
	
	 void test_intArray1(int arg) {
		System.out.println(" args: "+arg);
		Assertions.assertTrue(arg%2==0);
		
		
	}
	
	@Test
    public void checkForarray()
    {
        Integer intArray[]= {2,3,7,10};
        List<Integer> numbers= Arrays.asList(intArray);
        
        Assertions.assertAll(
                ()->assertEquals(2,numbers.get(0)),
                ()->assertEquals(3,numbers.get(1)),
                ()->assertEquals(7,numbers.get(2))                
                );        
    }

}