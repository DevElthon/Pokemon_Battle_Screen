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
    
    public Mamoswine(ImageIcon sprite, ImageIcon icon, String name, String Attribute, String Attribute2, int HP, int attack, int defense, int specialAttack, int specialDefense, int speed, int level, int mana, boolean vivo) {
        super(sprite, icon, name, Attribute, Attribute2, HP, attack, defense, specialAttack, specialDefense, speed, level, mana, vivo);
    
        Moves attacks[] = {earthPower, earthquake, blizzard, iceShard};
        setAttacks(attacks);
    }

    
}
