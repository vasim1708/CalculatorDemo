package com.lti.advdemo;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.demo.Calculator;

class ExcepEx {

	@Test
    void testExpection() {


       Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Integer.parseInt("abcs");
        });
    }
	
	 @Test
     void testException1() {



        Calculator c= new Calculator();
         
         final Exception e = assertThrows(ArithmeticException.class, () -> {
             c.searchEmpId(120);
       
       });
         
         
       Assertions.assertEquals("u enetered zero",e.getMessage());
     }


}

