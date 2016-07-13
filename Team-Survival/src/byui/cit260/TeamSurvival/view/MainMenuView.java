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
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n**********************************"
                + "\n |  Main Menu                      "
                + "\n **********************************"
                + "\n N - Start New Game                "
                + "\n G - Get and start saved game      "
                + "\n H - Get help on how to play       "
                + "\n S - Save game                     "
                + "\n Q - Quit                          "
                + "\n***********************************");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();// convert choice to upper case
        switch (value) {
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
        gameMenu.display();
    }

    private void startExistingGame() {
//prompts user for name of file to save the game in
        this.console.println("\n\n Enter the file path for the file where the gane is to be saved");
        String filePath = this.getInput();
        
        try{
            //save gane to the specified file.
            GameControl.getExistingGame(filePath);
        } catch (Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        //display the game menu
        GameMenuView gameMenu =new GameMenuView();
        gameMenu.display();
        System.out.println("\n***saveGame function called");
    }    
    
    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
//
    }

    private void saveGame() {
        System.out.println("\n***saveGame function called");

        //prompts user for name of file to save the game in
        this.console.println("\n\n Enter the file path for the file where the gane is to be saved");
        String filePath = this.getInput();
        
        try{
            //save gane to the specified file.
            GameControl.saveGame(TeamSurvival.getCurrentGame(), filePath);
        } catch (Exception e){
            ErrorView.display("MainMenuView", e.getMessage());
        }
    }

    
}


    



