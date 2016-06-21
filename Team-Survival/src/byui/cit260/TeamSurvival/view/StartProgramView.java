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
public class StartProgramView extends View {

    public StartProgramView() {
        super("\n Please enter your name: ");

        //display banner when view is created
        this.displayBanner();
    }

    private void displayBanner() {

        System.out.println(
                "\n**********************************"
                + "\n                                 *"
                + "\n This is the Survival game       *"
                + "\n                                 *"
                + "\n                                 *"
                + "\n                                 *"
                + "\n                                 *"
                + "\n                                 *"
                + "\n                                 *"
                + "\n                                 *"
                + "\n                                 *"
                + "\n                                 *"
                + "\n                                 *"
                + "\n                                 *"
                + "\n                                 *"
                + "\n**********************************"
        );
    }

    public boolean doAction(String playerName) {
        if (playerName.length() < 2) {
            System.out.println("\nInvalid player name:" + "The name must be greater than one character in lenght");
            return false;
        }
        //call the create player control function 
        Player player = GameControl.createPlayer(playerName);
        if (player == null) {
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
                + "\n                                 *"
                + "\n welcome " + player.getName()
                + "\n we hope you enjoy the game"
                + "\n**********************************"
        );
        //create the main menu onject
        MainMenuView mainMenuView = new MainMenuView();

        //display main menu view        
        mainMenuView.display();

    }
}
