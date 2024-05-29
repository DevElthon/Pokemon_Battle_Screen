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
    
    public Gardevoir() {
        
        Moves attacks[] = {psyshock, headbutt, moonblast, zenHeadbutt};
        setAttacks(attacks);
        
        setName("Gardevoir");
        
        //images
        setSprite(new ImageIcon(getClass().getResource("/images/pokemon/gardevoir.png")));
        setIcon(new ImageIcon(getClass().getResource("/images/icon/iconGardevoir.png")));
        
        // Stats
        setHP(340);
        setAttack(251);
        setDefense(251);
        setSpecialAttack(383);
        setSpecialDefense(361);
        setSpeed(284);
        
        //Atributos
        setAttribute("Psychic");
        setAttribute2("Fairy");
    }


}
