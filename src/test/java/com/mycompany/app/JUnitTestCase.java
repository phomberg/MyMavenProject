package com.mycompany.app;

import junit.framework.TestCase;

public class JUnitTestCase extends TestCase {
	 private int variable;
	 
	    public void setUp() {
	       variable = 3;
	   }
	    public void testfirstThing() {
	       variable = variable +1;
	       assertEquals(4,variable);        
	   }
	    public void testsecondThing() {
	        variable = variable - 3;
	        assertTrue(variable == 0);        
	    }
	    public void tearDown() {
	        variable = 0;
	    }

}
