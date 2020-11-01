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
public class Externer extends Teilnehmer {
    
    private String adresse;
    
    public Externer(String bn, String pw, String vn, String nn, String adresse, 
            String email, int iban) {
        this.benutzername = bn;
        this.passwort = pw;
        this.vorname = vn;
        this.nachname = nn;
        this.adresse = adresse;
        this.email = email;
        this.iban = iban;
        this.betrag = 20;
        // this.bezahlt = true; ? 
    }
}
