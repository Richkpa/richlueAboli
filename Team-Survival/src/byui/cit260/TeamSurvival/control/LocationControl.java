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
    public double getFinalResult (double area, double number){
        
            
        if (number < 90 || number > 360 || area < 1){
        return -1;
        }
        
       return area + number;
       // else
    }
    
     public double calcDistance(double x1, double y1, double x2, double y2) {
         if (x1 < 1 || x1 > 100 || x2 < 1 || x2 > 100) {
         return -1;
         }
         if (y1 < 1 || y1 > 30 || y2 < 1 || y2 > 30){
         return -1;
         }
         
         double distance = (double) Math.sqrt( Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) );
         return distance;
     }
        
         
        //Scanner scan = new Scanner (System.in);
         
//        System.out.println("Enter the x coordinate for point 1: ");
//        x1 = scan.nextDouble();
//         
//        System.out.println("Enter the y coordinate for point 1: ");
//        y1 = scan.nextDouble();
//         
//        System.out.println("Enter the x coordinate for point 2: ");
//        x2 = scan.nextDouble();
//         
//        System.out.println("Enter the y coordinate for point 2: ");
//        y2 = scan.nextDouble();
//         
//        distance = distance(x1,y1,x2,y2);
//         
//        System.out.println("The distance between the two points is " + distance + " .");
    



        
}