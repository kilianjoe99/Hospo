/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verwaltung;

/**
 *
 * @author i.moetsch
 */
public class Interner extends Teilnehmer {
    
    private int personalnummer;
    
    public Interner(String bn, String pw, String vn, String nn, int persNr, String email, int iban) {
        this.benutzername = bn;
        this.passwort = pw;
        this.vorname = vn;
        this.nachname = nn;
        this.personalnummer = persNr;
        this.email = email;
        this.iban = iban;
        this.betrag = 20;
        // this.bezahlt = true; ? 
    }
    
}
