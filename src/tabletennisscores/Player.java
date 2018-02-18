/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tabletennisscores;

/**
 *
 * @author a4-matheson
 */
public class Player {
    private String name;
    private int setPlayed = 0;
    private int setWon = 0;

    public Player(String name) { // COMPLETE. Constructor. Used in Team.addMember()
        this.name = name;
    }
    
    public void incSetPlayed() { // COMPLETE.
        setPlayed++;
    }
    
    public void incSetWon() { // COMPLETE.
        setWon++;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", setPlayed=" + setPlayed + ", setWon=" + setWon + '}';
    }
    
    public String getName() {
        return name;
    }
    
    public int getSetPlayed() {
        return setPlayed;
    }

    public int getSetWon() {
        return setWon;
    }
}
