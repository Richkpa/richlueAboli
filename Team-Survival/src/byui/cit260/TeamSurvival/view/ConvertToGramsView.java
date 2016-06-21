/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TeamSurvival.view;

import byui.cit260.TeamSurvival.control.LocationControl;
import java.util.Scanner;

/**
 *
 * @author prich
 */
public class ConvertToGramsView extends View {

    public ConvertToGramsView() {
        super("\n You have ....... amount in grams. Convert this number to pounds. Enter the number of gram: ");

    }

//call the checkvalidedPounds class form the location control
    public boolean doAction(String Opnumber) { //Passing Value
        double answer = Double.parseDouble(Opnumber);
        // I want to pass the value "Number" enter from the user
        double ConvertPounds = 6876.8;
        //this will be the answer geerated form the computer
        // this Is What I Want TO Convert To Pounds - this Is The Answer From The Computer
        boolean valid = LocationControl.checkValidedPounds(ConvertPounds, answer);
        if (!valid) {
            return false;
            //System.out.println("\nNot cool man!");
        } else {
            return valid;
        }
    }

}



///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package byui.cit260.TeamSurvival.view;
//
//import byui.cit260.TeamSurvival.control.LocationControl;
//import java.util.Scanner;
//
///**
// *
// * @author prich
// */
//public class ConvertToGramsView extends View {
//
//    private String Opnumber;
//
//    public ConvertToGramsView() {
//        super("\n You have ....... amount in grams. Convert this number to pounds. Enter the number of gram: ");
//
//    }
//
////call the checkvalidedPounds class form the location control
//        double answer = Double.parseDouble(Opnumber);
//        // I want to pass the value "Number" enter from the user
//        double ConvertPounds = 6876.8;
//        //this will be the answer geerated form the computer
//        // this Is What I Want TO Convert To Pounds - this Is The Answer From The Computer
//        boolean valid = LocationControl.checkValidedPounds(ConvertPounds, answer);
//        if (!valid) {
//            return false;
//            //System.out.println("\nNot cool man!");
//        } else {
//            return valid;
//        }
//
//    @Override
//    public boolean doAction(String value) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    }
//
//}
//    private boolean doAction(String Opnumber) { //Passing Value
