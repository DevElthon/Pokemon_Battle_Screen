/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pokemons;

import Poderes.Moves;
import javax.swing.ImageIcon;

/**
 *
 * @author samuel
 */
public class Charmeleon extends Pokemon{
    
    Moves ember = new Moves("Ember", 40, "Special", "Fire", 100, 20);
    Moves fireFang = new Moves("Fire Fang", 65, "Physical", "Water", 95, 0);
    Moves slash = new Moves("Slash", 70,"Physical", "Normal", 60, 0);
    Moves fireSpin = new Moves("Fire Spin", 120, "Special", "Fire", 100, 30);
    
    public Charmeleon(ImageIcon sprite, ImageIcon icon, String name, String attribute, int HP, int attack, int defense, int specialAttack, int specialDefense, int speed, int level, int mana, boolean vivo) {
        super(sprite, icon, name, attribute, HP, attack, defense, specialAttack, specialDefense, speed, level, mana, vivo);
        
        Moves attacks[] = {ember, fireFang, slash, fireSpin};
        setAttacks(attacks);
    }
    
    
}
