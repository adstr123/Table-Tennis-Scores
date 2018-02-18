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
public class MatchScore {
    private int row1Home = 0;
    private int row1Away = 0;
    private int row2Home = 0;
    private int row2Away = 0;
    private int rowdHome = 0;
    private int rowdAway = 0;
    public static final int TEAMSIZE = 2;
    
    public MatchScore(Team hTeam, Team aTeam, Player h1, Player h2, Player a1, Player a2) {
    }
    
    public int[] calculateMatchWin(boolean hSetWin1, boolean hSetWin2, boolean hSetWin3, boolean hSetWin4, boolean hSetWind) {
        int[] scores = new int[2];
        
        if (hSetWin1) row1Home++;
        else row1Away++;
        if (hSetWin2) row1Home++;
        else row1Away++;
        if (hSetWin3) row2Home++;
        else row2Away++;
        if (hSetWin4) row2Home++;
        else row2Away++;
        if (hSetWind) rowdHome++;
        else rowdAway++;
        
        scores[0] = row1Home + row2Home + rowdHome;
        scores[1] = row1Away + row2Away + row2Away;
        return scores;
    }
    
    
    
//    
//    public SetScore getSingleSet(String hname, SingleSet aname) { // INCOMPLETE
//        // Return a single set's scores, from SingleSet/SetScore
//    }
//    
//    public DoubleSet getDoubleSet() { // INCOMPLETE
//        // Return a double set's scores, from DoubleSet/SetScore
//    }
//    
//    public Player getHomePWin() { // INCOMPLETE
//        // Return home player win
//    }
//    
//    public Team getHomeTWin() { // INCOMPLETE
//        // Return home team win
//    }
//    
//    public void setAwayTWin() { // INCOMPLETE
//        // Set away team win
//    }
//    
//    public void calculateHomePlayerScore(String hname) { // INCOMPLETE
//        // Calculate home player scores, send to GUI
//    }
//    
//    public void calculateHomeTeamScore() {
//        // Calculate home team scores, ensure details sent to Team and Player
//    }
//    
//    public String getHomeTeamName() { // INCOMPLETE
//        // Return home team's Name String attribute
//    }
//    
//    public String getAwayTeamName() { // INCOMPLETE
//        // Return away team's Name String attribute
//    }
//    
//    public void submitTeamAndPlayerWins() { // INCOMPLETE
//        // Invoke Team.addPts() and Player.incSetWon() methods
//    }

    public int getRow1Home() {
        return row1Home;
    }

    public int getRow1Away() {
        return row1Away;
    }

    public int getRow2Home() {
        return row2Home;
    }
    
    public int getRow2Away() {
        return row2Away;
    }

    public int getRowdHome() {
        return rowdHome;
    }

    public int getRowdAway() {
        return rowdAway;
    }
}
