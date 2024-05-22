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
public class Venusaur extends Pokemon{

    Moves sludgeBomb = new Moves("Sludge Bomb", 90, "Special", "Poison", 100, 10);
    Moves earthquake = new Moves("Earthquake", 100, "Physical", "Ground", 100, 0);
    Moves gigaDrain = new Moves("Giga Drain", 75, "Special", "Grass", 100, 20);
    Moves furyCutter = new Moves("Fury Cutter", 40, "Physical", "Bug", 100, 0);
    
    public Venusaur(ImageIcon sprite, ImageIcon icon, String name, String Attribute, String Attribute2, int HP, int attack, int defense, int specialAttack, int specialDefense, int speed, int level, int mana, boolean vivo) {
        super(sprite, icon, name, Attribute, Attribute2, HP, attack, defense, specialAttack, specialDefense, speed, level, mana, vivo);
        
        Moves attacks[] = {sludgeBomb, earthquake, gigaDrain, furyCutter};
        setAttacks(attacks);
    }

}
