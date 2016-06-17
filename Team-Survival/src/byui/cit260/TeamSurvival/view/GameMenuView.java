/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TeamSurvival.view;

import java.util.Scanner;

/**
 *
 * @author Aboli
 */
public class GameMenuView extends View{
   
    public GameMenuView(){
          super("\n***********************************"
               +"\n |  Game Menu                      "
               +"\n **********************************"
               +"\n V - View Map                      "    
               +"\n R - View remaining number of moves" 
               +"\n L - View for resources in a place." 
               +"\n S - Save game                     " 
               +"\n H - Help menu                     " 
               +"\n Q - Quit                          " 
               +"\n***********************************");
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();// convert choice to upper case
                       switch(value){
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
                System.out.println("\nviewMap() stub function called here");
    }

    private void movesRemaining() {
                System.out.println("\nremainingMoves() stub function called here");
    }

    private void resourceList() {
                ResourceListView resourceList = new ResourceListView();
                resourceList.display();
    }

    void displayGameMenuView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}