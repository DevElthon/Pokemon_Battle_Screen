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
    
    public Gengar() {
        Moves attacks[] = {shadowBall, psyshock, lick, poisonJab};
        setAttacks(attacks);
        
        setName("Gengar");
        
        //images
        setSprite(new ImageIcon(getClass().getResource("/images/pokemon/gengar.png")));
        setIcon(new ImageIcon(getClass().getResource("/images/icon/iconGengar.png")));
        
        // Stats
        setHP(324);
        setAttack(251);
        setDefense(240);
        setSpecialAttack(394);
        setSpecialDefense(273);
        setSpeed(350);
        
        //Atributos
        setAttribute("Ghost");
        setAttribute2("Poison");
    }
   
}
