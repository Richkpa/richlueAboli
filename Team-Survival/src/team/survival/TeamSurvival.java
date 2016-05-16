/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team.survival;

import byui.cit260.TeamSurvival.model.Player;
import byui.cit260.TeamSurvival.model.Resource;
import byui.cit260.TeamSurvival.model.Scene;

/**
 *
 * @author prich
 */
public class TeamSurvival {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Player playerOne = new Player();
         Player playerTwo = new Player();
        
        playerOne.setName("James");
        playerOne.setLessMove(50);
        
         playerTwo.setName("Aboli");
        playerTwo.setLessMove(50);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        String playerTwoInfo = playerTwo.toString();
        System.out.println(playerTwoInfo);
        
        // Resource Class
        Resource resourceOne = new Resource();
    
        resourceOne.setResourceType("Food");
        resourceOne.setDescription("Mostly carbohydates");
    
        String resourceInfo = resourceOne.toString();
        System.out.println(resourceInfo);
        
        //scene class
        
        Scene sceneOne = new Scene();
        
        sceneOne.setType("Basement");
        sceneOne.setDescription("This is where every player begins. The basement is in the bottom of the ship");
 
        String sceneInfo = sceneOne.toString();
        System.out.println(sceneInfo);

    }
  
}
