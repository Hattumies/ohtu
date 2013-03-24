/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtuesimerkki;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ilmarihu
 */
public class StatisticsTest {
    TestiReader reader = new TestiReader();
    
    
    public StatisticsTest() {
        Statistics stats = new Statistics(reader);
        assertNotNull(stats);
    }
    
    public void searchTest() {
        int i = 0;
        assertEquals(i, 0);
    }
    
    
   
}
