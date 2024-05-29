/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pokemons;

import Poderes.Moves;
import javax.swing.ImageIcon;

/**
 *
 * @author Pichau
 */
public class Brozong extends Pokemon{

    Moves psywave = new Moves("Psywave", 100, "Special", "Psychic", 100, 50);
    Moves ironhead = new Moves("Iron Head", 80, "Physical","Steel", 100, 0);
    Moves flashCannon = new Moves("Flash Cannon", 80, "Special", "Steel", 100, 10);
    Moves zenHeadbutt = new Moves("Zen Headbutt", 80,"Physical", "Psychic", 90, 0);

    public Brozong() {
        
        Moves attacks[] = {psywave, ironhead, flashCannon, zenHeadbutt};
        setAttacks(attacks);
    }
    
}
