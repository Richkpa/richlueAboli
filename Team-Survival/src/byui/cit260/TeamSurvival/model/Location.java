/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TeamSurvival.model;

import java.io.Serializable;

/**
 *
 * @author Aboli
 */
public class Location implements Serializable{
    
    private int row;
    private int column;
    private int locationsVisited;
    private int locationsRemaining;

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
    
    



    
    
}
