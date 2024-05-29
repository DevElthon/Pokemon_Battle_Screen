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
    
    public Venusaur() {        
        Moves attacks[] = {sludgeBomb, earthquake, gigaDrain, furyCutter};
        setAttacks(attacks);
        
        setName("Venusaur");
        
        //images
        setSprite(new ImageIcon(getClass().getResource("/images/pokemon/venusaur.png")));
        setIcon(new ImageIcon(getClass().getResource("/images/icon/iconVenusaur.png")));
        
        // Stats
        setHP(364);
        setAttack(289);
        setDefense(291);
        setSpecialAttack(328);
        setSpecialDefense(328);
        setSpeed(284);
        
        //Atributos
        setAttribute("Grass");
        setAttribute2("Poison");
    }

}
