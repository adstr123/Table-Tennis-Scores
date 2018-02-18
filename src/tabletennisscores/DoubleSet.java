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
public class DoubleSet extends SetScore {
    
    public DoubleSet(int setNum, Player h1, Player h2, Player a1, Player a2) { // COMPLETE. Implementation of abstract SetScore. Includes additional arguments for double sets.
        super(setNum);
    }
    
    void submitSetScore() { // INCOMPLETE
        // Keeps track of set score using setGameScore
        // Passes scores to classes that need details to save/calculate other scores
    }
}
