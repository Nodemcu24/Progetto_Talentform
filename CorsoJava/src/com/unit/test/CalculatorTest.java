package com.unit.test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*; 

import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	   @Test
	    void testAdd() {
	        Calculator calc = new Calculator();
	        assertEquals(5, calc.add(2, 3));
	        //fail("Not yet implemented");
	    }
	    
	    @Test
	    void testSott() {
	        Calculator calc = new Calculator();
	        assertEquals(3, calc.sott(6, 3));
	        //fail("Not yet implemented");
	    }
	    
	    @Test
	    void testDiv() {
	        Calculator calc = new Calculator();
	        assertEquals(2, calc.div(6, 3));
	        //fail("Not yet implemented");
	    }
	    
	    @Test
	    void testMolt() {
	        Calculator calc = new Calculator();
	        assertEquals(6, calc.molt(2, 3));
	        //fail("Not yet implemented");
	    
	    }
	        @Test
	      void testNotNull() {
	        	
	        	String str = "prova";
	        
	        	assertNotNull(str);
	        
	        }
	        	 @Test
	        	 void testStringEquals () {
	        	
	        		String expected = "JUnit"; 
	        		 String actual = "JUnit";
	        		 
	        		 assertEquals( expected, actual    ) ;
	        	 }
	        
	        	 @Test
	               void testsameObject() {
	        		 
	        		String a = "Junit";
	        		String b = a;
	        		assertSame(a,b);
	        		 
	        	 }
	             
	          @Test
	           void testNotSameObject () {
	        	  
	        	   String c = new String("junit");
	        	   String d = new String("junit");
	        	   
	        	   assertNotSame( c,d);
	        	   
	          }
	
	          @Test
               void testCondition() {
	        	  
	        	  assertTrue(5 > 2);
	        	  assertFalse(2 > 5);
	          }
	          
	          @Test
	          void testThrowsException() {
	        	  
	        	  assertThrows(ArithmeticException.class, () ->{ int x = 1/0;});
	          }
	   
	         @Test 
	          void testArrayEquals() {
	        
	        	 int [] expected = new int [3];
	        	 int [] actual = new int[3];
	        	 assertArrayEquals( expected, actual);
	         }
	          
	         @Test 
	          void testStringLength() {
	        	 
	        	 
	        	 assertEquals(26,"ABCDEFGHIJKLMNOPQRSTUWXYVZ".length());
	        	 
	         }
	          
	         @Test 
	          void testDoubleCompare() {
	        	 
	        	 assertEquals(3.14, 3.1415, 0.1);
	         }
	         
	         @Test 
	          void testareListaVuota() {
	        	 
	        	 List<Integer> lista = new ArrayList<>();
	        	 assertTrue(lista.isEmpty());
	        	 lista.add(Integer.valueOf(1));
	        	 assertEquals( 1, lista.size());
	        	 assertFalse( lista.isEmpty());
	        	 
	         }
	         
	         @Test
	          void TestUpperCase() {
	        	 
	        	 assertEquals("BENVENUTO","BENVENUTO".toUpperCase());
	         }
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	}


