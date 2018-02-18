/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabletennisscores;

import java.util.ArrayList;
import java.util.Hashtable;
// import java.util.Hashtable;

/**
 *
 * @author a4-matheson
 */
public class RegistrationManager {
    ArrayList<Team> teamList = new ArrayList<Team>(); // INCOMPLETE - MEANT TO BE PRIVATE
    
    public void addTeam(String name, String venue) { // COMPLETE
        Team t = new Team(name, venue);
        teamList.add(t);
    }

    public Team getTeam(String name) { // COMPLETE
        for (Team i : teamList) {
            if (i.getName().equals(name)) return i;
        }
        return null;
    }
    
//    public void regPlayerToTeam(Team t, Player p) { // INCOMPLETE
//        membership.put(t, p);
//    }

    public String getAllTeams() { // COMPLETE
        String teamsString ="";
        for (Team i : teamList) {
            if (i.getTotalPtsWon() > 0)
            teamsString += i.toString() + "\n";
        }
        return teamsString;
    }

//    public String getAllPlayers() { // COMPLETE
//        String playersString ="";
//        for (Player i : Team.playerList) {
//            playersString += i.toString() + "\n";
//        }
//        return playersString;
//    }
    
//    public Team isTeamValid(String t) { // INCOMPLETE
//        Team selected = null;
//        for (Team i : teamList) {
//            if (i.getName().equals(t)) {
//                selected = i;
//                break;
//            }
//        }
//        return selected;
//    }

}
