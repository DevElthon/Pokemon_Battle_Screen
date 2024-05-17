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
public class Charmander extends Pokemon{
    
    Moves ember = new Moves("Ember", 40, "Fire", 100, 20);
    Moves fireFang = new Moves("Fire Fang", 65, "Water", 95, 20);
    Moves slash = new Moves("Slash", 70, "Normal", 60, 0);
    Moves fireSpin = new Moves("Fire Spin", 120, "Fire", 100, 30);
    
    public Charmander(ImageIcon sprite, String name, int HP, int attack, int defense, int specialAttack, int specialDefense, int speed, int level, int mana) {
        super(sprite, name, HP, attack, defense, specialAttack, specialDefense, speed, level, mana);
        
        Moves attacks[] = {ember, fireFang, slash, fireSpin};
        setAttacks(attacks);
    }
    
    
}
