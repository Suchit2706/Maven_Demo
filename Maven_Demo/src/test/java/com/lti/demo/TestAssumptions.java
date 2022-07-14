package com.lti.demo;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class TestAssumptions {
// Additioanl support while executing 
// a failed assumptions results in test being terminated
// when to use - if test case failed ... do not continue further
	
	 @Test
    void testOnDev()
    {
        System.setProperty("ENV", "DEV");
        Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")), TestAssumptions::message);
        System.out.println(" continue execution");
    }

    @Test
    void testOnProd()
    {
        System.setProperty("ENV", "PROD");
        Assumptions.assumeFalse("PROD".equals(System.getProperty("ENV")),TestAssumptions::message);
        System.out.println(" don't continue execution");
    }

    private static String message () {
        return "TEST Execution Failed :: ";
    }

}
