/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verwaltung;

import static java.lang.System.currentTimeMillis;
/**
 *
 * @author i.moetsch
 */
public class Vermerk {
    
    private String grund;
    // Datum wird jetzt als long gespiechert. Möglichkeit als Date?
    private long datum;
    private Teilnehmer nutzer;
    private Kursleiter vonKursleiter;
    
    public Vermerk(String grund, Teilnehmer nutzer, Kursleiter vonKursleiter) {
        this.grund = grund;
        this.nutzer = nutzer;
        this.vonKursleiter = vonKursleiter;
        this.datum = currentTimeMillis();
    }
}
