/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TeamSurvival.view;

import byui.cit260.TeamSurvival.control.LocationControl;
import java.util.Scanner;

/**
 *
 * @author Aboli
 */
public class CalcAreaView {

    private String promptMessage;
    double radius;
//constructor function cons fu err
    public CalcAreaView() {
        this.promptMessage
                = "\nProvide a number between numero uno and numero uno, one score and zip : ";
    }

    public void displayCalcAreaView() {
        boolean done = false; //set flag to not done
        do {
            String valueEntered = this.getValueEntered();
            if (valueEntered.toUpperCase().equals("Q"))//user want to quit
            {
                return;
            }

            //do the requested action and display the next view
            done = this.doAction(valueEntered);
        } while (!done);

    }

    private String getValueEntered() {
        Scanner keyboard = new Scanner(System.in); //get infile from the keyboard
        String value = ""; //value to be returned is a string
        boolean valid = false; // initialize the valuve of the vaariable to not valid

        while (!valid) {

            System.out.println("\n" + this.promptMessage);

            value = keyboard.nextLine(); //get nextline typed on keyboard
            value = value.trim(); //Trim off the leading and trailing blanks

            if (value.length() < 1) {
                System.out.println("\nInvalid value: value cannot be blank");
                continue;

            }
            break;
        }
        return value;
    }

    //player provides the radius, calculation is carried out
    private boolean doAction(String valueEntered) {
        try{
            double radius = Double.parseDouble(valueEntered);
        }catch (NumberFormatException nfe){
            System.out.println("\n Your input must be a number."
                                + "Try again or enter Q to quit");
        }

        this.promptMessage = "please enter a number ";
        String value2 = this.getValueEntered();
        double number = Double.parseDouble(value2);
        
        double result = LocationControl.calcArea(radius);
        if (result < 0) {
            System.out.println("\n Invalid input. Please try again");
            return false;
            
        } 
        
        
        
        else {
                    double finalResult = result + number;

            System.out.println("\n the area for the radius you entered is " + finalResult + " traveller");
            return true;
        }

    }

}
