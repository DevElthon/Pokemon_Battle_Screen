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
public class Mamoswine extends Pokemon{

    Moves earthPower = new Moves("Earth Power", 120, "Special", "Ground", 100, 20);
    Moves earthquake = new Moves("Earthquake", 100, "Physical", "Ground", 100, 0);
    Moves blizzard = new Moves("blizzard", 110, "Special", "Ice", 80, 40);
    Moves iceShard = new Moves("Ice Shard", 40, "Physical", "Ice", 100, 0);
    
    public Mamoswine() {
    
        Moves attacks[] = {earthPower, earthquake, blizzard, iceShard};
        setAttacks(attacks);
    }

    
}
