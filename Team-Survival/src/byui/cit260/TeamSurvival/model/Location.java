/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TeamSurvival.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Aboli
 */
public class Location implements Serializable{
    
    private int row;
    private int column;
    private boolean locationsVisited;
    private int locationsRemaining;
    private ArrayList<Character> character;
    
    private Item item;
    private Obstacle obstacle;
    private Scene scene;
    private Resource resource;
    private Map map;
    private boolean visited;
    

    public Location() {
    }

    
    public int getRow() {
        return row;
    }

    public boolean isLocationsVisited() {
        return locationsVisited;
    }

    public void setLocationsVisited(boolean locationsVisited) {
        this.locationsVisited = locationsVisited;
    }

    public ArrayList<Character> getCharacter() {
        return character;
    }

    public void setCharacter(ArrayList<Character> character) {
        this.character = character;
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

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.column;
        hash = 17 * hash + (this.locationsVisited ? 1 : 0);
        hash = 17 * hash + this.locationsRemaining;
        hash = 17 * hash + Objects.hashCode(this.character);
        hash = 17 * hash + Objects.hashCode(this.item);
        hash = 17 * hash + Objects.hashCode(this.obstacle);
        hash = 17 * hash + Objects.hashCode(this.scene);
        hash = 17 * hash + Objects.hashCode(this.map);
        return hash;
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
        if (!Objects.equals(this.character, other.character)) {
            return false;
        }
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        if (!Objects.equals(this.obstacle, other.obstacle)) {
            return false;
        }
        if (!Objects.equals(this.scene, other.scene)) {
            return false;
        }
        if (!Objects.equals(this.resource, other.resource)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", locationsVisited=" + locationsVisited + ", locationsRemaining=" + locationsRemaining + ", character=" + character + ", item=" + item + ", obstacle=" + obstacle + ", scene=" + scene + ", resource=" + resource + ", map=" + map + '}';
    }

    
}
