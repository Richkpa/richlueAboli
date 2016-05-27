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
        System.out.println("test case 1");

        double radius = 4.0;
        LocationControl instance = new LocationControl();
        double expResult = 50.27;
        double result = instance.calcArea(radius);
        assertEquals(expResult, result, 0.01);
        
        
        
        //Test case 2
        System.out.println("test case 2");

        radius = 0;
        expResult = -1;
        result = instance.calcArea(radius);
        assertEquals(expResult, result, 0.01);
        
        
        
        //Test case 3
        System.out.println("test case 3");
        radius = -1;
        expResult = -1;
        result = instance.calcArea(radius);
        System.out.println(result);
        System.out.println(expResult);
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
     * Test of getFinalResult method, of class LocationControl.
     */
    @Test
    public void testGetFinalResult() {
        System.out.println("getFinalResult");
        
        
        // Test case 1A
        System.out.println("Test case 1A");        
        double area = 3;
        double number = 92;
        LocationControl instance = new LocationControl();
        double expResult = 95;
        double result = instance.getFinalResult(area, number);
        System.out.println(result);
        System.out.println(expResult);
        assertEquals(expResult, result, 0.01);
        
        //test case 2A
        System.out.println("Test case 2A");
        area = -12;
        number = 270;
        expResult = -1;
        result = instance.getFinalResult(area, number);
        assertEquals(expResult, result, 0.0);
        
        
        //test case 3A
        System.out.println("Test case 3A");
        area = 50.27;
        number = 40;
        expResult = -1;
        result = instance.getFinalResult(area, number);
        assertEquals(expResult, result, 0.0);
        
        
    }

    /**
     * Test of calcDistance method, of class LocationControl.
     */
    @Test
    public void testCalcDistance() {
        System.out.println("calcDistance");
        
        //test case 1
        System.out.println("Test case 1");

        double x1 = 2.0;
        double y1 = 6.0;
        double x2 = 12.0;
        double y2 = 4.0;
        LocationControl instance = new LocationControl();
        double expResult = 10.19804;
        double result = instance.calcDistance(x1, y1, x2, y2);
        assertEquals(expResult, result, 0.01);
        
        //test case 2
        System.out.println("Test case 2");

        x1 = -1;
        y1 = 4;
        x2 = 12.0;
        y2 = 4.0;
        expResult = -1;
        result = instance.calcDistance(x1, y1, x2, y2);
        assertEquals(expResult, result, 0.01);
        
        //test case 3
        System.out.println("Test case 3");

        x1 = 2;
        y1 = 6;
        x2 = -1;
        y2 = -4;
        expResult = -1;
        result = instance.calcDistance(x1, y1, x2, y2);
        assertEquals(expResult, result, 0.01);
        
        
        
        //test case 4 for exceeded bondaries on x and y
        System.out.println("Test case 4");

        x1 = 101;
        y1 = 4;
        x2 = 4;
        y2 = 31;
        expResult = -1;
        result = instance.calcDistance(x1, y1, x2, y2);
        assertEquals(expResult, result, 0.01);
//        
//        
        //test case 5 for boundaries on x axis
        System.out.println("Test case 5");

        x1 = 1;
        y1 = 12;
        x2 = 100;
        y2 = 4;
        expResult = 99.32271;
        result = instance.calcDistance(x1, y1, x2, y2);
        assertEquals(expResult, result, 0.01);
//        
//        
        //test case 6 for boundaries on y axis
        System.out.println("Test case 6");

        x1 = 2;
        y1 = 1;
        x2 = 6;
        y2 = 30;
        expResult = 29.27456;
        result = instance.calcDistance(x1, y1, x2, y2);
        assertEquals(expResult, result, 0.01);
//        
//        
        //test case 7 for upper boundaries x and y
        System.out.println("Test case 7");

        x1 = 100;
        y1 = 1;
        x2 = 1;
        y2 = 30;
        expResult = 103.16007;
        result = instance.calcDistance(x1, y1, x2, y2);
        assertEquals(expResult, result, 0.01);
//        
//        
        //test case 8 for boundaries on x and y
        System.out.println("Test case 8");

        x1 = 1;
        y1 = 30;
        x2 = 100;
        y2 = 1;
        expResult = 103.16007;
        result = instance.calcDistance(x1, y1, x2, y2);
        assertEquals(expResult, result, 0.01);
        
    }
    
}
