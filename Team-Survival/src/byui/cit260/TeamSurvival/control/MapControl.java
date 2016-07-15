/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TeamSurvival.control;

import byui.cit260.TeamSurvival.model.Location;
import byui.cit260.TeamSurvival.model.Map;
import byui.cit260.TeamSurvival.model.Character;
import byui.cit260.TeamSurvival.model.Scene;
import byui.cit260.TeamSurvival.model.SceneType;
import byui.cit260.TeamSurvival.exceptions.MapControlException;

import java.awt.Point;
import team.survival.TeamSurvival;

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
        Map map = new Map(5, 5);

        //create the list of different sences in the game
        Scene[] scenes = createScenes();

        //assign the different scenes to location in the map
        MapControl.assignScenesToLocation(map, scenes);

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

//       System.out.println(location[0][0]);
        //start point
        location[0][0].setScene(scenes[SceneType.start.ordinal()]);
        location[0][1].setScene(scenes[SceneType.foodRoom.ordinal()]);
        location[0][2].setScene(scenes[SceneType.medicineRoom.ordinal()]);
        location[0][3].setScene(scenes[SceneType.calculateDistance.ordinal()]);
        location[0][4].setScene(scenes[SceneType.start.ordinal()]);
        location[1][0].setScene(scenes[SceneType.foodRoom.ordinal()]);
        location[1][1].setScene(scenes[SceneType.medicineRoom.ordinal()]);
        location[1][2].setScene(scenes[SceneType.calculateDistance.ordinal()]);
        location[1][3].setScene(scenes[SceneType.start.ordinal()]);
        location[1][4].setScene(scenes[SceneType.foodRoom.ordinal()]);
        location[2][0].setScene(scenes[SceneType.medicineRoom.ordinal()]);
        location[2][1].setScene(scenes[SceneType.calculateDistance.ordinal()]);
        location[2][2].setScene(scenes[SceneType.start.ordinal()]);
        location[2][3].setScene(scenes[SceneType.foodRoom.ordinal()]);
        location[2][4].setScene(scenes[SceneType.medicineRoom.ordinal()]);
        location[3][0].setScene(scenes[SceneType.calculateDistance.ordinal()]);
        location[3][1].setScene(scenes[SceneType.start.ordinal()]);
        location[3][2].setScene(scenes[SceneType.foodRoom.ordinal()]);
        location[3][3].setScene(scenes[SceneType.medicineRoom.ordinal()]);
        location[3][4].setScene(scenes[SceneType.calculateDistance.ordinal()]);
        location[4][0].setScene(scenes[SceneType.start.ordinal()]);
        location[4][1].setScene(scenes[SceneType.foodRoom.ordinal()]);
        location[4][2].setScene(scenes[SceneType.medicineRoom.ordinal()]);
        location[4][3].setScene(scenes[SceneType.calculateDistance.ordinal()]);
        location[4][4].setScene(scenes[SceneType.calculateWeight.ordinal()]);

//           System.out.println(scenes[0]);
    }

    public static void moveCharactersToStartingLocation(Map map) 
                                throws MapControlException{
        TeamSurvival.getCurrentGame().getPlayer().setCoordinates(new Point(0,0));
        map.getLocations()[0][0].setVisited(true);
//        Character[] characters = Character.values();
             // iterate for every character
//        for (Character character : characters) {
//            Point coordinates = character.getCoordinates();
//            MapControl.moveCharactersToLocation(characters, coordinates);
//            }
            }
        
    

    public static void moveCharactersToLocation(Character[] character, Point coordinates)
            throws MapControlException {
       
        Map map = TeamSurvival.getCurrentGame().getMap();
        int newRow = coordinates.x;
        int newColumn = coordinates.y;

        if (newRow < 0 || newRow >= map.getRowCount() || newColumn < 0 || newColumn >= map.getColumnCount()) {
            throw new MapControlException("Cannot move character to location"
                    + coordinates.x + "," + coordinates.y
                    + "because the location is outside the"
                    + " bounds of the map.");
        }
         TeamSurvival.getCurrentGame().getPlayer().setCoordinates(coordinates);
         map.getLocations()[newRow][newColumn].setVisited(true);
    }

}


