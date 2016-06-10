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
 * @author prich
 */
public class ConvertToGramsView {
    
    private String promptMessage;
    
    public ConvertToGramsView(){
        this.promptMessage = "\n Enter the number that you want to convert in pounds: ";
        
    }
    
     public void displayConvertToGramsView() {
            boolean done  = false; //set flag to not done
            do{
                //prompt for and get the amount needed 
                String number = this.getNumber();
                if (number.toUpperCase().equals("Q"))
                    return;
                
                //do the requested action and display the next view.
                done = this.doAction(number);
            }
            while (!done);
           
    }
     
      private String getNumber() {
        
        Scanner keyboard = new Scanner(System.in); //get infile from the keyboard
        String value = ""; //value to be returned is a string
        boolean valid = false; // initialize the valuve of the vaariable to not valid
        
        while (!valid){
        
                System.out.println("\n" + this.promptMessage);
                
                value = keyboard.nextLine(); //get nextline typed on keyboard
                value = value.trim(); //Trim off the leading and trailing blanks
                
                if (value.length() < 1){
                System.out.println("\nInvalid value: value cannot be blank");
                continue;

                }
             break;
    }
        return value;
    }

//call the checkvalidedPounds class form the location control
    
    private boolean doAction(String number) {
        double answer = Double.parseDouble(number);
        // I want to pass the value "Number" enter from the user
        double ConvertPounds = 89.06;
        //this will be the answer geerated form the computer
        // this Is What I Want TO Convert To Pounds - this Is The Answer From The Computer
    boolean isValided = LocationControl.checkValidedPounds(ConvertPounds, answer);
        return isValided;
    }
    
}
