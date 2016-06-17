/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team.survival;

import byui.cit260.TeamSurvival.model.Game;
import byui.cit260.TeamSurvival.model.Map;
import byui.cit260.TeamSurvival.model.Player;
import byui.cit260.TeamSurvival.model.Resource;
import byui.cit260.TeamSurvival.model.Ship;
import byui.cit260.TeamSurvival.model.Scene;
import byui.cit260.TeamSurvival.model.Location;
import byui.cit260.TeamSurvival.model.Obstacle;
import byui.cit260.TeamSurvival.model.Item;
import byui.cit260.TeamSurvival.view.StartProgramView;




/**
 *
 * @author prich
 */
public class TeamSurvival {

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        TeamSurvival.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        TeamSurvival.player = player;
    }
    
    public static Game currentGame = null;
    public static Player player = null;


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          //create the startProgram view and display the start program view.
          StartProgramView startProgramView = new StartProgramView();
          startProgramView.display();
        
    
    }
    
}
