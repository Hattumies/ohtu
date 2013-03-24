/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtuesimerkki;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ilmarihu
 */
public class TestiReader implements Reader{
    ArrayList<Player> lista = new ArrayList<Player>();
    
    public TestiReader() {
        lista.add(new Player("Arto Vehviläinen", "Yliopisto", 100, 100));
    }

    @Override
    public List<Player> getPlayers() {
        return lista;
    }
    
}
