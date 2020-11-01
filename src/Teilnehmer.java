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
public class Teilnehmer {
    
    public String benutzername;
    public String passwort;
    public String vorname;
    public String nachname;
    public String email;
    public boolean bezahlt = false;
    public int iban;
    public float betrag;
    public List<Vermerk> vermerke = new LinkedList<>();
    public List<Kurs> favoritenliste = new LinkedList<>();
    public List<Teilnehmerliste> teilnahme = new LinkedList<>();
    
    public boolean gesperrt() {
        // wann wird diese Methode aufgerufen? 
        if (vermerke.size() >= 3) {
            return true;
        } else return false;
    }
}
