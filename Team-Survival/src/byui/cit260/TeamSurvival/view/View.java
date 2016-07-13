/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TeamSurvival.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import team.survival.TeamSurvival;

/**
 *
 * @author prich
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;

        protected final BufferedReader keyboard = TeamSurvival.getInFile();
        protected final PrintWriter console = TeamSurvival.getOutFile();

    public View() {
    }

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {

        boolean done = false; //set flag to not done
         do {
            String value = this.getInput();
            if (value.toUpperCase().equals("Q"))//user want to quit
            {
                return;
            }

            //do the requested action and display the next view
            done = this.doAction(value);

        } while (!done);
    }

    @Override
    public String getInput() {
//        Scanner keyboard = new Scanner(System.in); //get infile from the keyboard
        String value = null; //value to be returned is a string
        boolean valid = false; // initialize the valuve of the vaariable to not valid
    try{
        while (!valid) {

            this.console.println("\n" + this.displayMessage);

            value = this.keyboard.readLine(); //get nextline typed on keyboard
            value = value.trim(); //Trim off the leading and trailing blanks

            if (value.length() < 1) {
                ErrorView.display(this.getClass().getName(),
                        "\n*** You must enter a value *** ");
                continue;

            }
            break;
        }
    }catch (Exception e){
                           ErrorView.display(this.getClass().getName(),
                            "Error reading input: " + e.getMessage());
    }
        return value;
    }

}
