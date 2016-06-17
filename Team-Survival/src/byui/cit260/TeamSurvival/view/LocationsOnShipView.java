/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TeamSurvival.view;

import byui.cit260.TeamSurvival.control.GameControl;
import team.survival.TeamSurvival;

/**
 *
 * @author prich
 */
public class LocationsOnShipView extends View{
    
     public LocationsOnShipView(){
          super("\n************************************"
               +"\n |  List of Locations on Ship       "
               +"\n ***********************************"
               +"\n F - Food items on the ship Room    "    
               +"\n M - Medical Supplies Room          " 
               +"\n C - Final conversion to grams room " 
               +"\n T - Tools Room                     " 
               +"\n Q - Quit                           " 
               +"\n************************************");
    }
     
     @Override
    public boolean doAction(String value) {
                       value = value.toUpperCase();// convert choice to upper case
                       switch(value){
                           case "F":
                               this.foodRoom();
                               break;
                           case "M":
                               this.medicineRoom();
                               break;
                           case "C":
                               this.conversionRoom();
                               break;
                           case "T":
                               this.toolsRoom();
                               break;
                           default:
                               System.out.println("\nInvalid selection. Try again");
                       }

                        return false;   
    }
     
    private void foodRoom() {
                               System.out.println("\n***foodRoom function called");
    }
    
    private void medicineRoom() {
                               System.out.println("\n***medicimeRoom function called");
    }
    
    private void conversionRoom() {
                               System.out.println("\n***conversionRoom function called");
    }
    
    private void toolsRoom() {
                               System.out.println("\n***toolsRoom function called");
    }

     
}
