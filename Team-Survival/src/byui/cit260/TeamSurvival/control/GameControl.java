/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TeamSurvival.control;

import byui.cit260.TeamSurvival.model.Game;
import byui.cit260.TeamSurvival.model.Item;
import byui.cit260.TeamSurvival.model.ItemIndex;
import byui.cit260.TeamSurvival.model.Map;
import byui.cit260.TeamSurvival.model.Player;
import byui.cit260.TeamSurvival.model.Scene;
import byui.cit260.TeamSurvival.model.Ship;
import team.survival.TeamSurvival;

/**
 *
 * @author Aboli
 */
public class GameControl {
    
    public static void createNewGame(Player player) {
    
        Game game = new Game();
        TeamSurvival.setCurrentGame(game);
        
        game.setPlayer(player);
     
       Item[] ItemIndex = GameControl.createItemList();
       game.setItem(ItemIndex);
        
//        Ship ship = new Ship();
//        game.setShip(ship);
       
       Map map = MapControl.createMap();
       game.setMap(map);
      
       MapControl.moveCharactersToStartingLocation(map);
    }
    
    public static Player createPlayer(String name){
         
        if (name == null){
            return null;
        }
        
        
        
        
        Player player = new Player();
        player.setName(name);
        
        TeamSurvival.setPlayer(player); //save the player
         return player;
    }
    
        public static Player createPlayer(Player player){
            System.out.println("\ncreatenewGame function called");
            return player;
        }

        public static Item[] sortingWeight(Item[] itemList) {
            
            for (int i = 0; i < itemList.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < itemList.length; j++)
                if (itemList[j].getWeight() < itemList[index].getWeight())
                    index = j;
      
            double smallerNumber = itemList[index].getWeight(); 
            itemList[index] = itemList[i];
            itemList[i].setWeight(smallerNumber);
            
        }
   
            return itemList;
        }
        
    public static Item[] createItemList() {
       //create array(list) of items lists
       Item[] items = new Item[3];
       
       Item rice = new Item();
       rice.setItemType("Rice");
       rice.setAvailableQuantity(0);
       rice.setRequiredAmount(0);
       rice.setWeight(7.5);
       items[ItemIndex.rice.ordinal()] = rice;
       
       Item bread = new Item();
       bread.setItemType("Bread");
       bread.setAvailableQuantity(0);
       bread.setRequiredAmount(0);
       bread.setWeight(2);
       items[ItemIndex.bread.ordinal()] = bread;
              
       Item water = new Item();
       water.setItemType("Water");
       water.setAvailableQuantity(0);
       water.setRequiredAmount(0);
       water.setWeight(4);
       items[ItemIndex.water.ordinal()] = water;
       
       
       
       return items;
    }   

   
}
