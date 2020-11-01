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
public class Teilnehmerliste {
    
    private int maxAnzahl;
    private List<Teilnehmer> teilnehmer = new LinkedList<>();
    
    public Teilnehmerliste(int maxAnzahl) {
        this.maxAnzahl = maxAnzahl;
    }
}
