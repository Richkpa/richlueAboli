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
public class Obstacle implements Serializable{
    
    private String description;
    private int answer;

    public Obstacle() {
    }

    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.description);
        hash = 37 * hash + this.answer;
        return hash;
    }

    @Override
    public String toString() {
        return "Obstacle{" + "description=" + description + ", answer=" + answer + '}';
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
        final Obstacle other = (Obstacle) obj;
        if (this.answer != other.answer) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
