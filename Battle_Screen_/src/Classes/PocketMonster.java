/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Classes;

/**
 *
 * @author eltho
 */
public interface PocketMonster {
    double health = 0; 
    double mana = 0;
    double power = 0;
    double special_power = 0;
    double defense = 0;
    int turnCount = 0;
    
    double attack();
    
    double specialAttack();
    
    public double defend();
}
