/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TeamSurvival.view;

import byui.cit260.TeamSurvival.control.GameControl;
import java.util.Scanner;
import team.survival.TeamSurvival;

/**
 *
 * @author Aboli
 */
public class HelpMenuView{ 
        
         private String menu;
   
    
    public HelpMenuView(){
        this.menu = 
                "\n**********************************"
               +"\n |  Help Menu                      "
               +"\n **********************************"
               +"\n P - Purpose of the Game           "    
               +"\n H - How to move                   " 
               +"\n D - Description of locations      " 
               +"\n Q - Quit                          " 
               +"\n***********************************";
    }
    
    public void displayHelpMenuView(){
    boolean done = false; //set flag to not done
    do{
        String menuOption = this.getmenuOption();
        if (menuOption.toUpperCase().equals("Q"))//user want to quit
            return ;
        
        //do the requested action and display the next view
        done = this.doAction(menuOption);
    }while(!done);

    
}

    private String getmenuOption() {
Scanner keyboard = new Scanner(System.in); //get infile from the keyboard
        String value = ""; //value to be returned is a string
        boolean valid = false; // initialize the valuve of the vaariable to not valid
        
        while (!valid){
        
                System.out.println("\n" + this.menu);
                
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


    private boolean doAction(String choice) {
        choice = choice.toUpperCase();// convert choice to upper case
                       switch(choice){
                           case "P":
                               this.purposeOfGame();
                               break;
                           case "H":
                               this.howToMove();
                               break;
                           case "D":
                               this.descriptionOfLocation();
                               break;
                           default:
                               System.out.println("\nInvalid selection. Try again");
                       }

                        return false;   
    }
    
    
    //create the help menu onject
                        

//   

    private void purposeOfGame() {
                               System.out.println("\n***puroseOfGame stub function called");
    }

    private void howToMove() {
                               System.out.println("\n***howToMove stub function called");
    }

    private void descriptionOfLocation() {
                               System.out.println("\n***desriptionOfLocation stub function called");
    }



    

        
    }

