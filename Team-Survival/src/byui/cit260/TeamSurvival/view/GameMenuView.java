/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TeamSurvival.view;

import byui.cit260.TeamSurvival.model.Game;
import byui.cit260.TeamSurvival.model.Location;
import byui.cit260.TeamSurvival.model.Map;
import java.util.Scanner;
import team.survival.TeamSurvival;

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
         String divider = new String (new char[150]).replace("\0", dash);
         
         System.out.println("The Map of Zulu");
    for (int i = 0; i < locations.length - 1; i++) {
        System.out.println(divider);
          System.out.print(i+1);
         for (int j = 0; j < locations[i].length - 1; j++) {
             System.out.print("|");
             Location currentLocation = locations[i][j];
            if (currentLocation.isLocationsVisited()) {
                System.out.print(locations[i][j].getScene().getMapSymbol());
            }
            else {
           System.out.print(" ?? ");
            }
            System.out.println("|");
         }
         System.out.println(divider);
         System.out.println("-");
    }
    }

    private void movesRemaining() {
        System.out.println("\nremainingMoves() stub function called here");
    }

    private void resourceList() {
        ResourceListView resourceList = new ResourceListView();
        resourceList.display();
    }

    

}
