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
public class MatchLog {
    
    public void addMatchToLog() { // INCOMPLETE
        // save scores to file in convenient format, including player and team details
    }
    
    public void getMatch(Team home, Team away) { // INCOMPLETE
        // Very important method
        // Scores passed from GUI
        // This distributes to MatchScore, which then passes further to SetScore etc.
        // MatchScore, SetScore etc. do not communicate directly with GUI!!! Better cohesion, looser coupling
        // Methods call this method when they want scores
    }
}
