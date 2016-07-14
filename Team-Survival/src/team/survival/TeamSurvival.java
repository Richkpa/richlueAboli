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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;




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
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        TeamSurvival.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        TeamSurvival.inFile = inFile;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            
            //open charcter stream files for end user input and output.
            TeamSurvival.inFile = new BufferedReader(new InputStreamReader(System.in));
            TeamSurvival.outFile = new PrintWriter(System.out, true);
        
          //create the startProgram view and display the start program view.
          StartProgramView startProgramView = new StartProgramView();
          startProgramView.display();
         
        } catch (Throwable e){
            System.out.println("Exception: " + e.toString()+
                              "\nCause: " + e.getCause()+
                              "\nMessage:" + e.getMessage());
            e.printStackTrace();
        }
        finally{
            try {
                if(TeamSurvival.inFile != null)
                   TeamSurvival.inFile.close();
                
                if(TeamSurvival.inFile != null)
                   TeamSurvival.outFile.close();

            } catch (IOException ex) {
        System.out.println("Error closing file");  
            return;
            }
        }

        }
        
    
    }
    
