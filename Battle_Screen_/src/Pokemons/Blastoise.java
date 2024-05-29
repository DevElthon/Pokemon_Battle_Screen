/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pokemons;

import Poderes.Moves;
import javax.swing.ImageIcon;

/**
 *
 * @author samuel
 */
public class Blastoise extends Pokemon{
    
    Moves tackle = new Moves("Tackle", 40, "Physical","Normal", 100, 0);
    Moves waterGun = new Moves("Water Gun", 40, "Special", "Water", 100, 20);
    Moves bite = new Moves("Bite", 40, "Physical", "Dark", 60, 0);
    Moves protect = new Moves("Hydro Pump", 40, "Special", "Water", 100, 40);

    public Blastoise() {
        Moves attacks[] = {tackle, waterGun, bite, protect};
        setAttacks(attacks);
        
        setName("Blastoise");
        
        //images
        setSprite(new ImageIcon(getClass().getResource("/images/pokemon/blastoise.png")));
        setIcon(new ImageIcon(getClass().getResource("/images/icon/iconBlastoise.png")));
        
        // Stats
        setHP(362);
        setAttack(291);
        setDefense(328);
        setSpecialAttack(295);
        setSpecialDefense(339);
        setSpeed(280);
        
        //Atributos
        setAttribute("Water");
    }
    
    
}
