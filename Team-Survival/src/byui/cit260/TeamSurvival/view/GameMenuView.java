/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TeamSurvival.view;

/**
 *
 * @author Aboli
 */
public class GameMenuView {
    
    private String menu;
   
    
    public GameMenuView(){
        this.menu = 
                "\n**********************************"
               +"\n |  Main Menu                      "
               +"\n **********************************"
               +"\n V - View Map                      "    
               +"\n Y - View locations already visited" 
               +"\n N - View Locations not yet visited" 
               +"\n R - View remaining number of moves" 
               +"\n S - Save game                     " 
               +"\n H - Help menu                     " 
               +"\n Q - Quit                          " 
               +"\n***********************************";
    }
    void displayMenu(){
            System.out.println("\n displayMenu stub function called");
           
    
}
}