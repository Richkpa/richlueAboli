/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TeamSurvival.view;

import byui.cit260.TeamSurvival.control.MapControl;
import byui.cit260.TeamSurvival.model.Game;
import byui.cit260.TeamSurvival.model.Location;
import byui.cit260.TeamSurvival.model.Map;
import java.awt.Point;
import static java.lang.Integer.parseInt;
import java.util.Scanner;
import team.survival.TeamSurvival;
import byui.cit260.TeamSurvival.model.Character;
import byui.cit260.TeamSurvival.exceptions.MapControlException;

/**
 *
 * @author Aboli
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n***********************************"
                + "\n |  Game Menu                      "
                + "\n **********************************"
                + "\n V - View Map                      "
                + "\n M - Move Player                   "
                + "\n R - View remaining number of moves"
                + "\n L - View for resources in a place."
                + "\n S - Save game                     "
                + "\n H - Help menu                     "
                + "\n Q - Quit                          "
                + "\n***********************************");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();// convert choice to upper case
        switch (value) {
            case "V":
                this.viewMap();
                break;
            case "R":
                this.movesRemaining();
                break;
            case "L":
                this.resourceList();
                break;
             case "M":
                this.movePlayer();
                break;
            default:
                System.out.println("\nInvalid selection. Try again");
        }

        return false;
    }

//    void displayMenu() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    private void viewMap() {
         Game game = TeamSurvival.getCurrentGame();
         Map map = game.getMap();
         Location[][] locations = map.getLocations();
         
         String dash = "-";
         String divider = new String (new char[55]).replace("\0", dash);
         
         System.out.println("The Map of Zulu");
         System.out.println(divider);
    for (int i = 0; i < locations.length ; i++) {
        
          System.out.print(i+1);
         for (int j = 0; j < locations[i].length ; j++) {
             System.out.print("|");
             Location currentLocation = locations[i][j];
            if (currentLocation.isLocationsVisited()) {
                System.out.print(locations[i][j].getScene().getMapSymbol());
            }
            else {
           System.out.print(" ?? ");
            }
            System.out.print("|");
         }
         System.out.println("\n" + divider);
    }
    }

    private void movesRemaining() {
        System.out.println("\nremainingMoves() stub function called here");
    }

    private void resourceList() {
        ResourceListView resourceList = new ResourceListView();
        resourceList.display();
    }

    private void movePlayer() {
         System.out.println("\n Input the direction that you want to move in."
                 + "\n U - for moving UP"
                 + "\n D - for moving Down"
                 + "\n R - for moving Right"
                 + "\n L - for moving Left");
        String direction = this.getInput();
         System.out.println("\n  How many spaces do you want to move?");
         int spaces = parseInt(this.getInput());
       Point currentLocation =  TeamSurvival.getCurrentGame().getPlayer().getCharacter().getCoordinates();
      try{
       switch (direction) {
        case "U": 
       MapControl.moveCharactersToLocation(Character.values(), new Point (currentLocation.x, currentLocation.y - spaces ));
        break;
        case "D": 
       MapControl.moveCharactersToLocation(Character.values(), new Point (currentLocation.x, currentLocation.y + spaces ));
        break;
        case "R": 
       MapControl.moveCharactersToLocation(Character.values(), new Point (currentLocation.x + spaces, currentLocation.y));
        break;
        case "L": 
       MapControl.moveCharactersToLocation(Character.values(), new Point (currentLocation.x - spaces, currentLocation.y));
        break;
         default:
                System.out.println("\nInvalid selection. Try again");
    }
    }catch(Exception mc) {
         ErrorView.display("MainMenuView", mc.getMessage());
    }

    }

}
