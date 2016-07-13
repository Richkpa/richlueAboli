/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TeamSurvival.view;

import java.io.PrintWriter;
import team.survival.TeamSurvival;

/**
 *
 * @author Aboli
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = TeamSurvival.getOutFile();
    private static final PrintWriter logFile = TeamSurvival.getOutFile();

    public static void display(String className, String errorMessage){     
        errorFile.println(
                "----------------------------------------------------"
                +"\n --ERROR - " + errorMessage
                +"\n-------------------------------------------------");
        
        //log error
        logFile.println(className + " - " + errorMessage);
        
    
}
}