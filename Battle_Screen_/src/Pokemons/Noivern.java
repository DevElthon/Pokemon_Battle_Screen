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
public class Noivern extends Pokemon{

    Moves hurricane = new Moves("Hurricane", 110, "Special", "Flying",80, 20);
    Moves uTurn = new Moves("U-turn", 70, "Physical", "Bug", 100, 0);
    Moves hyperBean = new Moves("Hyper Bean", 150, "Special", "Normal", 80, 50);
    Moves aerialAce = new Moves("Aerial Ace", 60, "Physical", "Flying", 100, 0);
    
    
    public Noivern(ImageIcon sprite, ImageIcon icon, String name, String Attribute, String Attribute2, int HP, int attack, int defense, int specialAttack, int specialDefense, int speed, int level, int mana, boolean vivo) {
        super(sprite, icon, name, Attribute, Attribute2, HP, attack, defense, specialAttack, specialDefense, speed, level, mana, vivo);
        
        Moves attacks[] = {hurricane, uTurn, hyperBean, aerialAce};
        setAttacks(attacks);
    }

   
}
