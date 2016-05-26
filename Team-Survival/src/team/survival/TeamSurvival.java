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
        
        // Resource Class------------------------------------------------------
        Resource resourceOne = new Resource();
    
        resourceOne.setResourceType("Food");
        resourceOne.setDescription("Mostly carbohydates");
    
        String resourceInfo = resourceOne.toString();
        System.out.println(resourceInfo);
      
 
        
        //Game class creation---------------------------------------------------
        Game gameOne = new Game();
        
        gameOne.setNoOfMoves(75);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        //Map class creation----------------------------------------------------
        Map mapOne = new Map();
        
        mapOne.setRowCount(150);
        mapOne.setColumnCount(75);
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        
        //Ship class creation---------------------------------------------------
        Ship shipOne = new Ship();
        
        shipOne.setDescription("B-52 JET");
        shipOne.setWidth(750);
        shipOne.setLength(100);
        shipOne.setHeight(25);
        
        String shipInfo = shipOne.toString();
        System.out.println(shipInfo);
        
        //Character class creation----------------------------------------------
        //Character characterOne = Character();
        
       // characterOne.setName("Plawuo");
       // characterOne.setDescription("Fear is for Others");
      //  characterOne.setCoordinates(5);
        
       // String characterInfo = characterOne.toString();
        //System.out.println(characterInfo);
        
        //scene class 
        
        Scene sceneOne = new Scene();
         
        sceneOne.setType("Basement");
        sceneOne.setDescription("This is where every player begins. The basement is in the bottom of the ship");
  
        String sceneInfo = sceneOne.toString();
        System.out.println(sceneInfo);
        
        //Location class
        
        Location locationOne = new Location();
    
        locationOne.setRow(2);
        locationOne.setColumn(3);
        locationOne.setLocationsVisited(3);
        locationOne.setLocationsRemaining(3);


        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        
        // Obstacle class
        
        Obstacle obstacleOne = new Obstacle();
        
        obstacleOne.setDescription("Player must provide the area of a circle and the circumference. The sum of which would be the code to a lock");
        obstacleOne.setAnswer(222);
        
        String obstacleInfo = obstacleOne.toString();
        System.out.println(obstacleInfo);
        
        //item class
        
        Item itemOne = new Item();
        
        itemOne.setItemType("blanket");
        itemOne.setAvailableQuantity(3.21);
        itemOne.setRequiredAmount(5.00);

        String itemInfo = itemOne.toString();
        System.out.println(itemInfo);
        
    
    }
    
}
