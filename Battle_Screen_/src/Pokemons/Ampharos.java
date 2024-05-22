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
public class Ampharos extends Pokemon{

    Moves voltSwitch = new Moves("Volt Switch", 70, "Special", "Electric", 100, 40);
    Moves chargeBean = new Moves("Charge Bean",90, "Special", "Electric", 50, 20);
    Moves bulldoze = new Moves("Bulldoze", 60, "Physical", "Ground", 100, 0);
    Moves outrage = new Moves("Outrage", 120, "Physical", "Dragon", 100,0);

    public Ampharos(ImageIcon sprite,ImageIcon icon, String name, String attribute, int HP, int attack, int defense, int specialAttack, int specialDefense, int speed, int level, int mana, boolean vivo) {
        super(sprite, icon, name, attribute, HP, attack, defense, specialAttack, specialDefense, speed, level, mana, vivo);
        
        Moves attacks[] = {voltSwitch, chargeBean, bulldoze, outrage};
        setAttacks(attacks);
    }
       
}
