/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TeamSurvival.model;
import byui.cit260.TeamSurvival.control.GameControl;
import java.io.Serializable;
/**
 *
 * @author prich
 */
public class Game implements Serializable{
    
    //class instance variable 
    private int noOfMoves;
    
    private Ship ship;  //connect to the location to the ship control class
    private Player player; //connect to the location to the payer class
    private Map map; //connect the location to player class
    private Character character; //connect the location to character class
    private Item[] item;
    
    public Game() {
    }

    
    
    
    public int getNoOfMoves() {
        return noOfMoves;
    }

    public void setNoOfMoves(int noOfMoves) {
        this.noOfMoves = noOfMoves;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Item[] getItem() {
        return item;
    }

    public void setItem(Item[] item) {
        this.item = item;
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
