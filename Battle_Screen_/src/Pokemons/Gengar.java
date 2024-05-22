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
public class Gengar extends Pokemon{

    Moves shadowBall = new Moves("Shadow Ball", 90, "Special", "Ghost", 100, 20);
    Moves psyshock = new Moves("Psyshock", 80, "Special", "Psychic", 100, 10);
    Moves lick = new Moves("Lick", 35,"Physical", "Ghost", 100, 0);
    Moves poisonJab = new Moves("Poison Jab", 80, "Physical", "Poison", 100, 0);
    
    public Gengar(ImageIcon sprite, ImageIcon icon, String name, String attribute, String attibute2, int HP, int attack, int defense, int specialAttack, int specialDefense, int speed, int level, int mana, boolean vivo) {
        super(sprite, icon, name, attribute,attibute2, HP, attack, defense, specialAttack, specialDefense, speed, level, mana, vivo);
        
        Moves attacks[] = {shadowBall, psyshock, lick, poisonJab};
        setAttacks(attacks);
    }
   
}
