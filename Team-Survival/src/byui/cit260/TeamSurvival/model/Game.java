/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TeamSurvival.model;
import java.io.Serializable;
/**
 *
 * @author prich
 */
public class Game implements Serializable{
    
    //class instance variable 
    private int noOfMoves;

    public Game() {
    }

    
    
    
    public int getNoOfMoves() {
        return noOfMoves;
    }

    public void setNoOfMoves(int noOfMoves) {
        this.noOfMoves = noOfMoves;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.noOfMoves;
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
        final Game other = (Game) obj;
        if (this.noOfMoves != other.noOfMoves) {
            return false;
        }
        return true;
    }
    
    
}
