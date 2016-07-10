/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TeamSurvival.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author prich
 */
public enum Character implements Serializable{
    
    Simba("He is a young and strong warrior"),
    Zawuo("The brave and fearless and willing to take any challenge"),
    Payezin("He is foolish and has courage to do anything");
    
    //class instance variable
    private final String description;
    private final Point coordinates;
    
    private Location location;

    Character(String description) {
        this.description = description;
        coordinates = new Point (1,1);
}

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    } 

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    
    
}