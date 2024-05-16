/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
import java.util.Random;

/**
 *
 * @author ElthonBicudo
 */
public class Character {
    double health, mana, power, special_power, defense;
    Random rand = new Random();
    
    public Character(double health, double mana, double power, 
            double special_power, double defense){
        
        this.health = health;
        this.mana = mana;
        this.power = power;
        this.special_power = special_power;
        this.defense = defense;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }
    
    public double attack(){
        int chance_attack = rand.nextInt(11);
        return power * chance_attack;
    }
    
    public double specialAttack(){
        int chance_special = rand.nextInt(11);
        return special_power * chance_special;
    }
    
    public double defend(){
        int chance_defend = rand.nextInt(11);
        return defense * chance_defend;
    }
}
