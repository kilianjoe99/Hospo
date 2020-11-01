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
public class Kurs {
    
    private int id;
    private String name;
    private String sportart;
    private int beginn;
    private int ende;
    private String ort;
    
    private Kategorie kategorie;
    private Wochentag tag;
    private List<Teilnehmerliste> teilnehmerliste = new LinkedList<>();
    private List<Teilnehmer> warteliste = new LinkedList<>();
    
    public Kurs(int id, String name, String sportart, int beginn, int ende, 
            String ort, Kategorie kategorie, Wochentag tag) {
        this.id = id;
        this.name = name;
        this.sportart = sportart;
        this.beginn = beginn;
        this.ende = ende;
        this.ort = ort;
        this.kategorie = kategorie;
        this.tag = tag;
    }
    
    // wieso als Methode und nicht als Datenfeld?
    public boolean freigeschaltet() {
        // Bedingung?
        return true;
    }
    
}
