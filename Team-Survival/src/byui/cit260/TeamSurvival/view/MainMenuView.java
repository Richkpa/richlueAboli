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
public class MainMenuView {
    
    private String menu;
   
    
    public MainMenuView(){
        this.menu = 
                "\n**********************************"
               +"\n |  Main Menu                      "
               +"\n **********************************"
               +"\n N - Start New Game                "    
               +"\n G - Get and start saved game      " 
               +"\n H - Get help on how to play       " 
               +"\n S - Save game                     " 
               +"\n Q - Quit                          " 
               +"\n***********************************";
    }
        
public void displayMainMenuView(){
    boolean done = false; //set flag to not done
    do{
        String menuOption = this.getmenuOption();
        if (menuOption.toUpperCase().equals("Q"))//user want to quit
            return;
        
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
                           case "N":
                               this.startNewGame();
                               break;
                           case "G":
                               this.startExistingGame();
                               break;
                           case "H":
                               this.displayHelpMenu();
                               break;
                           case "S":
                               this.saveGame();
                               break;
                           default:
                               System.out.println("\nInvalid selection. Try again");
                       }

                        return false;   
    }

    private void startNewGame() {
        //create a new game
        GameControl.createNewGame(TeamSurvival.getPlayer());
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
                               System.out.println("\n***startExistingGame function called");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenuView();
        
        
    }

    private void saveGame() {
                               System.out.println("\n***saveGame function called");
    }
    
    
    }


