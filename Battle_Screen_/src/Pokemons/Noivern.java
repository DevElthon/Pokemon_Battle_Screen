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
    
    
    public Noivern() {        
        Moves attacks[] = {hurricane, uTurn, hyperBean, aerialAce};
        setAttacks(attacks);
        
        setName("Noivern");
        
        //images
        setSprite(new ImageIcon(getClass().getResource("/images/pokemon/noivern.png")));
        setIcon(new ImageIcon(getClass().getResource("/images/icon/iconNoivern.png")));
        
        // Stats
        setHP(374);
        setAttack(262);
        setDefense(284);
        setSpecialAttack(322);
        setSpecialDefense(284);
        setSpeed(379);
        
        //Atributos
        setAttribute("Flying");
        setAttribute2("Dragon");
    }

   
}
