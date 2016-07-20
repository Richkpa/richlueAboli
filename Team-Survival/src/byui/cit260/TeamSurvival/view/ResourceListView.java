/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TeamSurvival.view;

import byui.cit260.TeamSurvival.control.GameControl;
import byui.cit260.TeamSurvival.model.Game;
import byui.cit260.TeamSurvival.model.Item;
import byui.cit260.TeamSurvival.model.ItemIndex;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import team.survival.TeamSurvival;

/**
 *
 * @author prich
 */
public class ResourceListView extends View {

    public ResourceListView() {
        super("\n*********************************************"
                + "\n |  Resource List                            "
                + "\n ********************************************"
                + "\n C - Convert pounds to Grams                 "
                + "\n F - List of items in food storage           "
                + "\n M - List of items in medicine storage       "
                + "\n I - List of items in inventory storage      "
                + "\n D - Calculate the distance                  "
                + "\n S - Sorting the list of Items               "
                + "\n K - Save the Item list to file              "
                + "\n A - Calculate the area                      "
                + "\n Q - Quit                                    "
                + "\n*********************************************");
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase();// convert choice to upper case

        switch (choice) {
            case "C":
                this.convertToGrams();
                break;
            case "S":
                this.sortingItem();
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
            case "K":
                this.saveListToFile();
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
       StringBuilder line;
       
       Game game = TeamSurvival.getCurrentGame();
       Item[] items = game.getItem();
       
       //Setting the list of inventory items and the descp.
       System.out.println("\n   LIST OF INVENTORY ITEMS");
       line = new StringBuilder("                                        ");
       line.insert(0, "DESCRIPTION");
       line.insert(20, "REQUIRED");
       line.insert(30, "IN STOCK");
       System.out.println(line.toString());
       
       //for each inventory item
       for (Item item : items) {
           line = new StringBuilder("                                      ");
           line.insert(0, item.getItemType());
           line.insert(23, item.getRequiredAmount());
           line.insert(33, item.getAvailableQuantity());
           
          //Display the line
          System.out.println(line.toString());
       }
    }

    private void calculateDistance() {
        System.out.println("\n***calculateDistance() stub function called");
    }

    private void calculateArea() {
        CalcAreaView areaView = new CalcAreaView();
        areaView.displayCalcAreaView();

    }

    private void sortingItem() {
       Game game = TeamSurvival.getCurrentGame();
       
       for (Item item: game.getItem()) {
           System.out.println(item.getWeight());
       }
       
       Item[] itemList = GameControl.sortingWeight(game.getItem());
    
       for (Item item: itemList) {
           System.out.println(item.getWeight());
       }
    
    }

    private void saveListToFile() {
       this.console.println("\n\n Enter the file path for the file where the game is to be saved");
       String filePath = this.getInput();
       try{
           Item[] items = TeamSurvival.getCurrentGame().getItem();
           printItemlistReport(items, filePath);
           console.printf("The file" + filePath + "was written successfully");
       }catch (Exception ex) {
           ErrorView.display("MainMenuView", ex.getMessage());
       }
    }

    private void printItemlistReport(Item[] item, String outputLocation){
       
        try (PrintWriter out = new PrintWriter(outputLocation)) {
           
            // print title and cloumn heading
            out.println("\n\n           Item List                  ");
            out.printf("%n%-20s%10s%10s", "Description", "Quantity", "In Stock");
             out.printf("%n%-20s%10s%10s", "----------", "--------", "------");
             
             //print the sedcription quanity of each item
             for (Item items : item) { 
                out.printf("%n%-20s%7ffgfgh"
                        + "%13.2f" 
                                              , items.getItemType()
                                              , items.getAvailableQuantity()
                                              , items.getRequiredAmount());
                 
             }
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
}
    

