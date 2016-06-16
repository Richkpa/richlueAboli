/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TeamSurvival.view;

import byui.cit260.TeamSurvival.control.GameControl;
import java.util.Scanner;
import team.survival.TeamSurvival;

/**
 *
 * @author Aboli
 */
public class HelpMenuView extends View{ 
 
    public HelpMenuView(){
           super("\n***********************************"
               +"\n |  Help Menu                      "
               +"\n **********************************"
               +"\n P - Purpose of the Game           "    
               +"\n H - How to move                   " 
               +"\n D - Description of locations      " 
               +"\n L - Locations on Ship             " 
               +"\n Q - Quit                          " 
               +"\n***********************************");
    }
    
    @Override  
    public boolean doAction(String value) {
       value = value.toUpperCase();// convert choice to upper case
       switch(value){
           case "P":
                this.purposeOfGame();
                break;
           case "H":
                this.howToMove();
                break;
           case "L":
                this.locationAroundShip();
                break;
           case "D":
                 this.descriptionOfLocation();
                break;
                           default:
                               System.out.println("\nInvalid selection. Try again");
                       }

                        return false;   
    }
    
    
    //create the help menu onject
                        

//   

    private void purposeOfGame() {
                               System.out.println("\n In this game the player wil have to try to make his way back"
                                                   +"\nto the basement of the ship where they satrted after having passed"
                                                   +"\nall the obstacles");
    }

    private void howToMove() {
                               System.out.println("\n Players direction will be determined by how many rows"
                               +"\nand columns they intend to move.The player will input with up, down, left, or"
                                       + "\n right and the number of spaces they intend to move");
    }

    private void descriptionOfLocation() {
                               System.out.println("Depending on the laocation the player enters,"
                                       + "\n a brief description will be provided.");
    }

 private void locationAroundShip() {
                LocationsOnShipView locationOnShip = new LocationsOnShipView();
                locationOnShip.display();
    }

    

        
    }

