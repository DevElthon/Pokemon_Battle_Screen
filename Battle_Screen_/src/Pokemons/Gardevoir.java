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
public class Gardevoir extends Pokemon{

    Moves psyshock = new Moves("Psyshock", 80, "Special", "Psychic", 100, 10);
    Moves headbutt = new Moves("Headbutt", 70, "Physical", "Normal",100, 0);
    Moves moonblast = new Moves("Moonblast", 95, "Special", "Fairy", 100, 25);
    Moves zenHeadbutt = new Moves("Zen Headbutt", 80,"Physical", "Psychic", 90, 0);
    
    public Gardevoir(ImageIcon sprite, ImageIcon icon, String name, String Attribute, String Attribute2, int HP, int attack, int defense, int specialAttack, int specialDefense, int speed, int level, int mana, boolean vivo) {
        super(sprite, icon, name, Attribute, Attribute2, HP, attack, defense, specialAttack, specialDefense, speed, level, mana, vivo);
        
        Moves attacks[] = {psyshock, headbutt, moonblast, zenHeadbutt};
        setAttacks(attacks);
    }


}
