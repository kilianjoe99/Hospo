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
public class Kursleiter {
    
    private String name;
    private int personalnummer;
    private String passwort;
    private List<Kurs> kurse = new LinkedList<>();
    private List<Vermerk> vermerke = new LinkedList<>();
    
    public Kursleiter(String name, int persNr, String pw) {
        this.name = name;
        this.personalnummer = persNr;
        this.passwort = pw;
    }
}
