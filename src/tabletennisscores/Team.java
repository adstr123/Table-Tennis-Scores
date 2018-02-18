/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabletennisscores;

import java.util.ArrayList;

/**
 *
 * @author a4-matheson
 */
public class Team {
    private String name;
    private String venue;
    private int totalPtsWon = 0;
    ArrayList<Player> playerList = new ArrayList<>(); // INCOMPLETE - MEANT TO BE PRIVATE, NOT MEANT TO BE STATIC
    
    public Team(String name, String venue) { // COMPLETE. Constructor for RegistrationManager.addTeam
        this.name = name;
        this.venue = venue;
    }

    public Player getPlayer(String name) { // COMPLETE. Returns player object when player name variable provided.
        for (Player i : playerList) {
            if (i.getName().equals(name)) return i;
        }
        return null;
    }
    
    public Player addMember(Player p, String name) { // COMPLETE. Creates a new player.
        p = new Player(name);
        playerList.add(p);
        return p;
    }

//    public boolean isPlayerValid(String p) { // INCOMPLETE.
//    }
    
    public void addPts(int pts) { // INCOMPLETE
        totalPtsWon += pts;
    }

    @Override
    public String toString() {
        return "Team{" + "name=" + name + ", totalPtsWon=" + totalPtsWon + '}';
    }

    public String getName() {
        return name;
    }

    public String getVenue() {
        return venue;
    }

    public int getTotalPtsWon() {
        return totalPtsWon;
    }

    public void setTotalPtsWon(int totalPtsWon) {
        this.totalPtsWon = totalPtsWon;
    }
}
