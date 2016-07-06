/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TeamSurvival.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Aboli
 */
public class Location implements Serializable{
    
    private int row;
    private int column;
    private int locationsVisited;
    private int locationsRemaining;
    private ArrayList<Character> character;
    
    private Item item;
    private Obstacle obstacle;
    private Scene scene;
    private Resource resource;
    private Map map;
    

    public Location() {
    }

    
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getLocationsVisited() {
        return locationsVisited;
    }

    public void setLocationsVisited(int locationsVisited) {
        this.locationsVisited = locationsVisited;
    }

    public int getLocationsRemaining() {
        return locationsRemaining;
    }

    public void setLocationsRemaining(int locationsRemaining) {
        this.locationsRemaining = locationsRemaining;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.row;
        hash = 79 * hash + this.column;
        hash = 79 * hash + this.locationsVisited;
        hash = 79 * hash + this.locationsRemaining;
        return hash;
    } 

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", locationsVisited=" + locationsVisited + ", locationsRemaining=" + locationsRemaining + '}';
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.locationsVisited != other.locationsVisited) {
            return false;
        }
        if (this.locationsRemaining != other.locationsRemaining) {
            return false;
        }
        return true;
    }

    void setVisited(boolean b) {
        System.out.println("\n***puroseOfGame stub function called");
    }

    public void getScene(Scene scene) {
         System.out.println("\n***puroseOfGame stub function called");
    }
    
    



    
    
}
