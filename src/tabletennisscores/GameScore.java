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
public class GameScore {
    private int hPlayersPts;
    private int aPlayerPts;
    
    public void setGameScores(int h, int a) { // COMPLETE. Arguments are scores from GUI
        this.hPlayersPts = h;
        this.aPlayerPts = a;
    }

    public boolean calculateHomeGameWin(int hPlayerPts, int aPlayerPts) { // COMPLETE. Calculates game winner, returns true if home win, false if away win
       return hPlayerPts > aPlayerPts;
    }
    
    public int gethPlayersPts() { // COMPLETE
        return hPlayersPts;
    }

    public int getaPlayerPts() { // COMPLETE
        return aPlayerPts;
    }
}
