/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package statistics.matcher;

import statistics.Player;

/**
 *
 * @author Ilmu
 */
public class Or implements Matcher {
    private Matcher[] matchers;
    
    public Or(Matcher... matchers) {
        this.matchers = matchers;
    }

    @Override
    public boolean matches(Player p) {
        int matches = 0;
        for (Matcher matcher : matchers) {
            if (matcher.matches(p)) {
                matches++;
            }
        }

        if (matches > 0) {
            return true;
        } else {
            return false;
        }
    }
    
}
