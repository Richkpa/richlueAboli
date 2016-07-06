/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TeamSurvival.control;

import byui.cit260.TeamSurvival.model.Location;
import byui.cit260.TeamSurvival.model.Map;
import byui.cit260.TeamSurvival.model.Scene;
import byui.cit260.TeamSurvival.model.SceneType;

/**
 *
 * @author prich
 */
class MapControl {
   public static Map create() {
       //create the map
       Map map = null;
       
     System.out.println("\n*** CreateMap() called ****");
       return map;
   }
 
 public static Map createMap() {
        //create the map
       Map map = new Map (20, 20);
        
        //create the list of different sences in the game
       Scene[] scenes = createScenes();
        
        //assign the different scenes to location in the map
        assignScenesToLocation(map, scenes);
        
        return map;
    }
 
 //create the scene array
    private static Scene[] createScenes() {
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "Times are hard. The country is getting pooere everyday,"
              + "beacuse of this you have to travel to the next country to"
              + "find food for necessary life supplies for you and your family."
              + "On your way, you will face many challenges on the ship because"
              + "you are going illegally.");
        
        startingScene.setMapSymbol("STA");
        startingScene.setBlocked(false);
        startingScene.setOnOfMoves(150);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription(
                "Well done for being brave. You have a strong personality,"
              + "and willing to do anything to save your family and friends."
              + "They are proud of you.");
        
        finishScene.setMapSymbol("FN");
        finishScene.setBlocked(false);
        finishScene.setOnOfMoves((int) Double.POSITIVE_INFINITY);
        scenes[SceneType.finish.ordinal()] = finishScene;
         
        return scenes;
    }
    
    private static void assignScenesToLocation(Map map, Scene[] scenes) {
       Location[][] location = map.getLocations();
       
       //start point
       location[0][0].getScene(scenes[SceneType.start.ordinal()]);
       location[0][1].getScene(scenes[SceneType.foodRoom.ordinal()]);
       location[0][2].getScene(scenes[SceneType.medicineRoom.ordinal()]);
       location[0][3].getScene(scenes[SceneType.medicineRoom.ordinal()]);
          
       
    }

    static void moveCharactersToStartingLocation(Map map) {
        System.out.println("\n***puroseOfGame stub function called");
    }
}
