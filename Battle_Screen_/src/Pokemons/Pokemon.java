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
public class Pokemon {
    private ImageIcon sprite;
    private ImageIcon icon;
    private String name;
    private String Attribute;
    private String Attribute2;
    private int HP;
    private int currentHP;
    private int attack;
    private int defense;
    private int specialAttack;
    private int specialDefense;
    private int speed;
    private int level = 100;
    private int mana;
    private boolean vivo = true;
    
    private Moves[] attacks = new Moves[4];
    
    public Pokemon() {
        
    }

    public Pokemon(ImageIcon sprite, ImageIcon icon, String name, String attribute, int HP, int attack, int defense, int specialAttack, int specialDefense, int speed, int level, int mana) {
        this.sprite = sprite;
        this.icon = icon;
        this.name = name;
        this.Attribute = attribute;
        this.HP = HP;
        this.attack = attack;
        this.defense = defense;
        this.specialAttack = specialAttack;
        this.specialDefense = specialDefense;
        this.speed = speed;
        this.mana = mana;
        this.currentHP = HP;
        this.vivo = true;
    }

    public Pokemon(ImageIcon sprite, ImageIcon icon, String name, String Attribute, String Attribute2, int HP, int attack, int defense, int specialAttack, int specialDefense, int speed, int level, int mana) {
        this.sprite = sprite;
        this.icon = icon;
        this.name = name;
        this.Attribute = Attribute;
        this.Attribute2 = Attribute2;
        this.HP = HP;
        this.attack = attack;
        this.defense = defense;
        this.specialAttack = specialAttack;
        this.specialDefense = specialDefense;
        this.speed = speed;
        this.level = 100;
        this.mana = mana;
        this.vivo = true;
    }
    
    public ImageIcon getSprite() {
        return sprite;
    }

    public void setSprite(ImageIcon sprite) {
        this.sprite = sprite;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttribute() {
        return Attribute;
    }

    public void setAttribute(String Attribute) {
        this.Attribute = Attribute;
    }

    public String getAttribute2() {
        return Attribute2;
    }

    public void setAttribute2(String Attribute2) {
        this.Attribute2 = Attribute2;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpecialAttack() {
        return specialAttack;
    }

    public void setSpecialAttack(int specialAttack) {
        this.specialAttack = specialAttack;
    }

    public int getSpecialDefense() {
        return specialDefense;
    }

    public void setSpecialDefense(int specialDefense) {
        this.specialDefense = specialDefense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
    
    public Moves[] getAttacks() {
        return attacks;
    }

    public void setAttacks(Moves[] attacks) {
        this.attacks = attacks;
    }
    
    
    public int attack(Pokemon enemy, Moves move){
        int damage = (int) (Math.floor(Math.floor(Math.floor(2 * level / 5 + 2) * attack * move.getPower() / enemy.defense) / 50) + 2);

        return damage;
    }
    
    public void defence(int qntPerc){
        this.defense = this.defense + this.defense * (qntPerc / 100);
    }
    
    public void fugir(){
        
    }
    
    
    
    
    
}
