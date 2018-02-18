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
public abstract class SetScore {
    
    public SetScore(int setNum) {
    }

    public int[] enterSetScores(int h1, int h2, int h3, int a1, int a2, int a3) { // COMPLETE. Arguments are scores from GUI, returns integer array of scores
        int[] scores = new int[6];
        scores[0] = h1;
        scores[1] = h2;
        scores[2] = h3;
        scores[3] = a1;
        scores[4] = a2;
        scores[5] = a3;
        return scores;
    }

    public boolean calculateHomeSetWin(boolean hGameWin1, boolean hGameWin2, boolean hGameWin3) { // COMPLETE. Calculates and returns individual set winner as a boolean, true if home win, flase if away win
        int hGWinCount = 0;
        int aGWinCount = 0;
        
        if (hGameWin1) hGWinCount++;
        else aGWinCount++;
        if (hGameWin2) hGWinCount++;
        else aGWinCount++;
        if (hGameWin3) hGWinCount++;
        else aGWinCount++;
        
//        DEBUG
//        System.out.println(hGWinCount);
//        System.out.println(aGWinCount);
//        System.out.println("NEXT SET");
        
        return hGWinCount > aGWinCount;
    }

    abstract void submitSetScore(); // COMPLETE. Method overridden in SingleSet and DoubleSet
}
