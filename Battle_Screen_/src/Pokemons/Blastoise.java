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
public class Blastoise extends Pokemon{
    
    Moves tackle = new Moves("Tackle", 40, "Physical","Normal", 100, 0);
    Moves waterGun = new Moves("Water Gun", 40, "Special", "Water", 100, 20);
    Moves bite = new Moves("Bite", 40, "Physical", "Dark", 60, 0);
    Moves protect = new Moves("Hydro Pump", 40, "Special", "Water", 100, 40);

    public Blastoise(ImageIcon sprite,ImageIcon icon, String name, String attribute, int HP, int attack, int defense, int specialAttack, int specialDefense, int speed, int level, int mana, boolean vivo) {
        super(sprite, icon, name, attribute, HP, attack, defense, specialAttack, specialDefense, speed, level, mana, vivo);
        
        Moves attacks[] = {tackle, waterGun, bite, protect};
        setAttacks(attacks);
    }
    
    
}
