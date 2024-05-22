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
public class Greninja extends Pokemon{

    Moves hydroPump = new Moves("Hydro Pump", 110, "Special", "Water", 80, 20);
    Moves darkPulse = new Moves("dark Pulse", 80, "Special", "Dark", 100, 10);
    Moves gunkShot = new Moves("Gunk Shot", 100, "Physical", "Poison", 70, 0);
    Moves nightSlash = new Moves("Night Slash", 70, "Physical", "Dark", 100, 0);
    
    public Greninja(ImageIcon sprite, ImageIcon icon, String name, String Attribute, String Attribute2, int HP, int attack, int defense, int specialAttack, int specialDefense, int speed, int level, int mana, boolean vivo) {
        super(sprite, icon, name, Attribute, Attribute2, HP, attack, defense, specialAttack, specialDefense, speed, level, mana, vivo);
        
        Moves attacks[] = {hydroPump, darkPulse, gunkShot, nightSlash};
        setAttacks(attacks);
    }
    
}
