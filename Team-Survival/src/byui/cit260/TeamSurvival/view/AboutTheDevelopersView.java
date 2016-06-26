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
public class AboutTheDevelopersView extends View {

    public AboutTheDevelopersView() {
        super("\n About Richlue and Aboli");

    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();// convert choice to upper case
        if (value == "Z") {
            System.out.println("\n***********************************"
                    + "\n |  About the Developers             "
                    + "\n **********************************  "
                    + "\n Aboli is a village boy from Nigeria "
                    + "\n Father of a beautiful daughter      "
                    + "\n Husband to a beautiful wife         "
                    + "\n                                     "
                    + "\n Richlue- The king of Liberia.       "
                    + "\n***********************************");
            return true;

        } else {
            System.out.println("\nInvalid selection. Try again");
        }
        return false;

    }
}
