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
 * @author prich
 */
public class Map implements Serializable{
  
    //class instance variable 
    private int rowCount;
    private int columnCount;
    private Scene scene;
    
    private Location[][] locations; //Connect the map class to the locations. A player
    //can directly go from the map to the locations.

    public Map() {
    }
    public Map(int rowCount, int columnCount) {
        
        if (rowCount < 1 || columnCount < 1) {
            System.out.print("The number of rwo and column cannot be zero");
            return;
    }

        this.rowCount = rowCount;
        this.columnCount = columnCount;
        
        //create 2-D array for Location objects
        this.locations = new Location[rowCount][columnCount];
        
        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
                //create and initialize new Location object instance
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
            }
        }
    }
   
    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public byui.cit260.TeamSurvival.model.Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.rowCount;
        hash = 59 * hash + this.columnCount;
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
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
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        return true;
    }
   
}
