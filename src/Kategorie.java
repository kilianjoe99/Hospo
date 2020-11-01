/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verwaltung;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author i.moetsch
 */
public class Kategorie {
    
    private String name;
    private List<Kurs> kurse = new LinkedList<>();
    
    public Kategorie(String name) {
        this.name = name;
    }
}
