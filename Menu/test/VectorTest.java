/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Angel
 */
public class VectorTest {
    
    public VectorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of count method, of class Vector.
     */
    @Test
    public void testCount() {
        System.out.println("count");
        Vector instance = new Vector();
        instance.push(2);
        instance.push(2);
        int expResult = 2;
        int result = instance.count();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result!=expResult){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of isEmpty method, of class Vector.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Vector instance = new Vector();
        instance.push(2);
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result!=expResult){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of peek method, of class Vector.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        Vector instance = new Vector();
        instance.push(2);
        Object expResult = 2;
        Object result = instance.peek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result!=expResult){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of pull method, of class Vector.
     */
    @Test
    public void testPull() {
        System.out.println("pull");
        Vector instance = new Vector();
        instance.push(2);
        Object expResult = 2;
        Object result = instance.pull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result!=expResult){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of push method, of class Vector.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object value = 2;
        Vector instance = new Vector();
        instance.push(value);
        // TODO review the generated test code and remove the default call to fail.
        if(instance.count() == 0){
            fail("The test case is a prototype.");
        }

    }

    /**
     * Test of Evaluate method, of class Vector.
     */
    @Test
    public void testEvaluate() {
        System.out.println("Evaluate");
        String expresion = "42/";
        Vector instance = new Vector();
        int expResult = 2;
        int result = instance.Evaluate(expresion);
        assertEquals(expResult, result);
        if(result!=expResult){
            fail("The test case is a prototype.");
        }
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
