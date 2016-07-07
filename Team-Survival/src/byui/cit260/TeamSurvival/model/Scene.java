/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TeamSurvival.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Aboli
 */
public class Scene implements Serializable{
    
    //create class instance variable
    
    private String type;
    private String description;
    private String mapSymbol;
    private String Blocked;
    private int onOfMoves;
    
//generate constructor function 
    public Scene() {
    }
    
    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    public String getBlocked() {
        return Blocked;
    }

    public void setBlocked(String Blocked) {
        this.Blocked = Blocked;
    }

    public int getOnOfMoves() {
        return onOfMoves;
    }

    public void setOnOfMoves(int onOfMoves) {
        this.onOfMoves = onOfMoves;
    }

    
    


    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.type);
        hash = 59 * hash + Objects.hashCode(this.description);
        return hash;
    }

    @Override
    public String toString() {
        return "Scene{" + "type=" + type + ", description=" + description + '}';
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    public void setBlocked(boolean b) {
        System.out.println("\n***puroseOfGame stub function called");
    }
    
    
    
    
}
