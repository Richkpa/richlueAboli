/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TeamSurvival.view;

import java.util.Scanner;

/**
 *
 * @author prich
 */
public class ResourceListView extends View{
    
      public ResourceListView(){ 
          super("\n*********************************************"
               +"\n |  Resource List                            "
               +"\n ********************************************"
               +"\n C - Convert pounds to Grams                 "    
               +"\n F - List of items in food storage           " 
               +"\n M - List of items in medicine storage       "
               +"\n I - List of items in inventory storage      "
               +"\n D - Calculate the distance                  "
               +"\n A - Calculate the area                      "
               +"\n Q - Quit                                    " 
               +"\n*********************************************");
    }
     
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();// convert choice to upper case
        
        switch (choice){
            case "C":
               this.convertToGrams();
               break;
            case "F":
               this.listOfFoodItems();
                break;
            case "M":
               this.listOfMedicine();
                break;
            case "I":
               this.inventoryLists();
                break;
            case "D":
               this.calculateDistance();
                break;
            case "A":
               this.calculateArea();
                break;
            default:
                System.out.println("\nInvalid selection. Try again");
                       }

            return false;   
    }
    
    // Creating the resource memu objects
    //call the function "C" to perform the required action
     private void convertToGrams() {
        ConvertToGramsView convertToGrams = new ConvertToGramsView();
        convertToGrams.display();
    }
     
      private void listOfFoodItems() {
                               System.out.println("\n***puroseOfGame stub function called");
    }
      
       private void listOfMedicine() {
                               System.out.println("\n***puroseOfGame stub function called");
    }
       
        private void inventoryLists() {
                               System.out.println("\n***puroseOfGame stub function called");
    }
        
         private void calculateDistance() {
                               System.out.println("\n***puroseOfGame stub function called");
    }
         
          private void calculateArea() {
                               System.out.println("\n***puroseOfGame stub function called");
    }

   
}