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
 * @author prich
 */
public class Player implements Serializable {
    
    //class instance variable 
    private String name;
    private int lessMove; 
    
    private Character character;

    public Player() {
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLessMove() {
        return lessMove;
    }

    public void setLessMove(int lessMove) {
        this.lessMove = lessMove;
    }   

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + this.lessMove;
        return hash;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", lessMove=" + lessMove + '}';
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
        final Player other = (Player) obj;
        if (this.lessMove != other.lessMove) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
   
    
}


