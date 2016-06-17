/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TeamSurvival.view;

import java.util.Scanner;

/**
 *
 * @author prich
 */
public abstract class View implements ViewInterface{
    
    protected String displayMessage;
    
    public View(){
}
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display(){
        
    boolean done = false; //set flag to not done
    do{
        String value = this.getInput();
        if (value.toUpperCase().equals("Q"))//user want to quit
            return;
        
        //do the requested action and display the next view
        done = this.doAction(value);
        
    }while(!done);
    }
    @Override
       public String getInput() {
        Scanner keyboard = new Scanner(System.in); //get infile from the keyboard
        String value = null; //value to be returned is a string
        boolean valid = false; // initialize the valuve of the vaariable to not valid
        
        while (!valid){
        
                System.out.println("\n" + this.displayMessage);
                
                value = keyboard.nextLine(); //get nextline typed on keyboard
                value = value.trim(); //Trim off the leading and trailing blanks
                
                if (value.length() < 1){
                System.out.println("\n*** You must enter a value *** ");
                continue;

                } 
                break;
        }
                return value;
    }
    
} 
