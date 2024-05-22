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
public class Croagunk extends Pokemon{

    Moves focusBlast = new Moves("Focus Blast", 120, "Special", "Fighting", 70, 30);
    Moves drainPunch = new Moves("Drain Punch", 75, "Physical", "Fighting", 90, 0);
    Moves sludgeBomb = new Moves("Sludge Bomb", 90, "Special", "Poison", 100, 10);
    Moves gunkShot = new Moves("Gunk Shot", 100, "Physical", "Poison", 70, 0);
    
    public Croagunk(ImageIcon sprite,ImageIcon icon, String name, String Attribute, String Attribute2, int HP, int attack, int defense, int specialAttack, int specialDefense, int speed, int level, int mana, boolean vivo) {
        super(sprite,icon, name, Attribute, Attribute2, HP, attack, defense, specialAttack, specialDefense, speed, level, mana, vivo);
        
        Moves attacks[] = {focusBlast, drainPunch, sludgeBomb, gunkShot};
        setAttacks(attacks);
    }
    
}