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

    public Ampharos() {        
        Moves attacks[] = {voltSwitch, chargeBean, bulldoze, outrage};
        setAttacks(attacks);
        
        setName("Ampharos");
        
        //images
        setSprite(new ImageIcon(getClass().getResource("/images/pokemon/ampharos.png")));
        setIcon(new ImageIcon(getClass().getResource("/images/icon/iconAmpharos.png")));
        
        // Stats
        setHP(384);
        setAttack(273);
        setDefense(295);
        setSpecialAttack(361);
        setSpecialDefense(306);
        setSpeed(229);
        
        //Atributos
        setAttribute("Electric");
    }
       
}
