/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TeamSurvival.control;
import java.lang.Math;

/**
 *
 * @author Aboli
 */
public class LocationControl {
    
    public double calcArea (double radius){

        if (radius < 1 || radius > 120){ 
            return -1;
        }
        double area = Math.pow(radius, 2) * Math.PI;
        return area; 
}

    ////Convert Pounds to Grams Calculation
    public double convertLbsToGram (double pounds){
    
    if (pounds < 46 || pounds > 125) {
    return -1;   
    
    }
    
 
    double grams =  (pounds * (1  / 2.2 )) * (1000  / 1 );
    
     return grams;
    
    }
    

    }