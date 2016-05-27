/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TeamSurvival.control;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aboli
 */
public class LocationControlTest {
    
    public LocationControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcArea method, of class LocationControl.
     */
    @Test
    public void testCalcArea() {
        System.out.println("calcArea");
        
        //Test case 1
        
        System.out.println("Test case 1");

        double radius = 4.0;
        LocationControl instance = new LocationControl();
        double expResult = 50.27;
        double result = instance.calcArea(radius);
        assertEquals(expResult, result, 0.01);
        
        //Test case 2

        System.out.println("Test case 2");

        radius = 0.0;
        expResult = -1;
        result = instance.calcArea(radius);
        assertEquals(expResult, result, 0.01);
        
        
        //Test case 3

        System.out.println("Test case 3");

        radius = -1;
        expResult = -1;
        result = instance.calcArea(radius);
        assertEquals(expResult, result, 0.01);
        
        // Test case 4
        System.out.println("Test case 4");

        radius = 121;
        expResult = -1;
        result = instance.calcArea(radius);
        assertEquals(expResult, result, 0.01);
        
        
        //Test case 5
        System.out.println("Test case 5");

        radius = 121;
        expResult = -1;
        result = instance.calcArea(radius);
        assertEquals(expResult, result, 0.01);
        
         //Test case 6
        System.out.println("Test case 6");

        radius = 1;
        expResult = 3.14;
        result = instance.calcArea(radius);
        assertEquals(expResult, result, 0.01);
        
         //Test case 7
        System.out.println("Test case 7");

        radius = 120;
        expResult = 45238.93;
        result = instance.calcArea(radius);
        assertEquals(expResult, result, 0.01);
        
        
    }

    /**
     * Test of convertLbsToGram method, of class LocationControl.
     */
    @Test
    public void testConvertLbsToGram() {
        System.out.println("convertLbsToGram");
    
        //Test Case #1 - Calculate the the valid amount to grams
    
        System.out.println("Test Case #1");
    
        double pounds = 55.0;
        LocationControl instance = new LocationControl();
        double expResult = 25000.0;
        double result = instance.convertLbsToGram(pounds);
        assertEquals(expResult, result, 0.01);
        
        //Test Case #2 - check if the pounds is less than 45
    
        System.out.println("Test Case #2");
    
         pounds = 44.0;
        
         expResult = -1.0;
         result = instance.convertLbsToGram(pounds);
         assertEquals(expResult, result, 0.01);
         
         //Test Case #3 - check if pounds is grater than 125
    
        System.out.println("Test Case #3");
    
         pounds = 126.0;
        
         expResult = -1.0;
         result = instance.convertLbsToGram(pounds);
         assertEquals(expResult, result, 0.01);
         
       
          //Test Case #4 - check for the lower boundaries of pounds
    
        System.out.println("Test Case #4");
    
         pounds = 46.0;
        
         expResult = 20909.09;
         result = instance.convertLbsToGram(pounds);
         assertEquals(expResult, result, 0.01);
         
         //Test Case #5 - check for the upper boundaries of pounds
    
        System.out.println("Test Case #5");
    
         pounds = 60.0;
        
         expResult = 27272.72;
         result = instance.convertLbsToGram(pounds);
         assertEquals(expResult, result, 0.01);
    }
    
    
    
}
