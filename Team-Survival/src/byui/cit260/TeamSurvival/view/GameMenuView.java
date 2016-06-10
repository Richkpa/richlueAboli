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
public class GameMenuView {
    
    private String menu;
   
    
    public GameMenuView(){
        this.menu = 
                "\n***********************************"
               +"\n |  Game Menu                      "
               +"\n **********************************"
               +"\n V - View Map                      "    
               +"\n R - View remaining number of moves" 
               +"\n L - View for resources in a place." 
               +"\n S - Save game                     " 
               +"\n H - Help menu                     " 
               +"\n Q - Quit                          " 
               +"\n***********************************";
    }
    
    public void displayGameMenuView(){
    boolean done = false; //set flag to not done
    do{
        String menuOption = this.getmenuOption();
        if (menuOption.toUpperCase().equals("Q"))//user want to quit
            return;
        
        //do the requested action and display the next view
        done = this.doAction(menuOption);
    }while(!done);

    
}
//    void displayMenu(){
//            System.out.println("\n displayMenu stub function called");
//           
//    
//}

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
                       switch(choice){
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
                System.out.println("\nresultList() stub function called here");
    }
    
}