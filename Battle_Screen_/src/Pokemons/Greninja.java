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
public class Greninja extends Pokemon{

    Moves hydroPump = new Moves("Hydro Pump", 110, "Special", "Water", 80, 20);
    Moves darkPulse = new Moves("dark Pulse", 80, "Special", "Dark", 100, 10);
    Moves gunkShot = new Moves("Gunk Shot", 100, "Physical", "Poison", 70, 0);
    Moves nightSlash = new Moves("Night Slash", 70, "Physical", "Dark", 100, 0);
    
    public Greninja() {
        
        Moves attacks[] = {hydroPump, darkPulse, gunkShot, nightSlash};
        setAttacks(attacks);
        
        setName("Greninja");
        
        //images
        setSprite(new ImageIcon(getClass().getResource("/images/pokemon/Greninja.png")));
        setIcon(new ImageIcon(getClass().getResource("/images/icon/iconGreninja.png")));
        
        // Stats
        setHP(320);
        setAttack(249);
        setDefense(236);
        setSpecialAttack(284);
        setSpecialDefense(251);
        setSpeed(284);
        
        //Atributos
        setAttribute("Water");
        setAttribute2("Dark");
        
        
    }
    
}
