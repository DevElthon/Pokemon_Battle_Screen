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
public class Blissey extends Pokemon{

    Moves hyperBean = new Moves("Hyper Bean", 150, "Special", "Normal", 90, 50);
    Moves doubleEdge = new Moves("Double-Edge", 120, "Physical", "Normal", 50, 0);
    Moves blizzard = new Moves("blizzard", 110, "Special", "Ice", 80, 40);
    Moves retaliate = new Moves("Retaliate", 70, "Physical", "Normal", 100, 0);

    public Blissey(ImageIcon sprite, ImageIcon icon, String name, String attribute, int HP, int attack, int defense, int specialAttack, int specialDefense, int speed, int level, int mana, boolean vivo) {
        super(sprite, icon, name, attribute, HP, attack, defense, specialAttack, specialDefense, speed, level, mana, vivo);
        
        Moves attacks[] = {hyperBean, doubleEdge, blizzard, retaliate};
        setAttacks(attacks);
    }
    
}
