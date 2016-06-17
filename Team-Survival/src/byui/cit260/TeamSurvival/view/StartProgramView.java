/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TeamSurvival.view;

import byui.cit260.TeamSurvival.control.GameControl;
import byui.cit260.TeamSurvival.control.LocationControl;
import byui.cit260.TeamSurvival.model.Player;
import java.util.Scanner;

/**
 *
 * @author Aboli
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView(){
        this.promptMessage = "\n Please enter your name: ";
        
        //display banner when view is created
        this.displayBanner();
    }

    private void displayBanner() {
        
        System.out.println(
                "\n**********************************"
               +"\n                                 *" 
               +"\n This is the Survival game       *" 
               +"\n                                 *" 
               +"\n                                 *" 
               +"\n                                 *" 
               +"\n                                 *" 
               +"\n                                 *" 
               +"\n                                 *" 
               +"\n                                 *" 
               +"\n                                 *" 
               +"\n                                 *" 
               +"\n                                 *" 
               +"\n                                 *" 
               +"\n                                 *" 
               +"\n**********************************"
        );
    }

    public void displayStartProgramView() {
            boolean done  = false; //set flag to not done
            do{
                //prompt for and get the players name 
                String playerName = this.getPlayerName();
                if (playerName.toUpperCase().equals("Q"))
                    return;
                
                //do the requested action and display the next view.
                done = this.doAction(playerName);
            }
            while (!done);
    }

    private String getPlayerName() {
        
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
        

    private boolean doAction(String playerName){
        if (playerName.length() < 2){
                System.out.println("\nInvalid player name:"  + "The name must be greater than one character in lenght");
                return false;
        }
        //call the create player control function 
        Player player = GameControl.createPlayer(playerName);
        if (player == null){
                System.out.println("\nError creating the player");
                return false;
        }
        //function goes here
         this.displayNextView(player);
            return true;
            
    }

    private void displayNextView(Player player) {
                        System.out.println(
                "\n**********************************"
               +"\n                                 *" 
               +"\n welcome " + player.getName()   
               +"\n we hope you enjoy the game" 
               +"\n**********************************"
        );
                        //create the main menu onject
                MainMenuView mainMenuView = new MainMenuView();
                        
                        //display main menu view        
                        mainMenuView.display();

    }
}
    
    

                

    
    

    
    
    

