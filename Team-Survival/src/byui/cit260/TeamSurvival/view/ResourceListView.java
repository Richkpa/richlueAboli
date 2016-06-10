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
public class ResourceListView {
    
    private String menu;
    
      public ResourceListView(){
        this.menu = 
                "\n*********************************************"
               +"\n |  Resource List                            "
               +"\n ********************************************"
               +"\n C - Convert pounds to Grams                 "    
               +"\n F - List of items in food storage           " 
               +"\n M - List of items in medicine storage       "
               +"\n I - List of items in inventory storage      "
               +"\n D - Calculate the distance                  "
               +"\n A - Calculate the area                      "
               +"\n Q - Quit                                    " 
               +"\n*********************************************";
    }
     public void ResourceListView(){
    boolean done = false; //set flag to not done
    do{
        String menuOption = this.getmenuOption();
        if (menuOption.toUpperCase().equals("Q"))//user want to quit
            return ;
        
        //do the requested action and display the next view
        done = this.doAction(menuOption);
    }while(!done);
}

    private String getmenuOption() {
        
        Scanner keyboard = new Scanner(System.in); //get infile from the keyboard
        String value = ""; //value to be returned is a string
        boolean valid = false; // initialize the valuve of the vaariable to not valid
        
        while (!valid){
        
                System.out.println("\n" + this.menu);
                
                value = keyboard.nextLine(); //get nextline typed on keyboard
                value = value.trim(); //Trim off the leading and trailing blanks
                
                if (value.length() < 1){
                System.out.println("\nInvalid value: value cannot be blank");
                continue;

                } 
                break;
        }
                return value;
    }   
   

    private boolean doAction(String choice) {
        
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
        convertToGrams.displayConvertToGramsView();
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