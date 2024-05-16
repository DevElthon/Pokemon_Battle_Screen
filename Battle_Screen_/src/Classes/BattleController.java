/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author ElthonBicudo
 */
public class BattleController {
    Character enemy = new Character(200, 0, 10, 15, 10);
    Character player = new Character(220, 0, 15, 20, 15); 
    
    public void PlayerAttacks(){
        if(player.attack() > enemy.defend()){
            enemy.setHealth(enemy.health - player.attack());
        }
        else{
            enemy.mana += 5;
        }
    }
    
    public void EnemyAttacks(){
        if(enemy.attack() > player.defend()){
            player.setHealth(player.health - enemy.attack());
        }
        else{
            player.mana += 5;
        }
    }
    
    public void PlayerSpecial(){
        if(player.specialAttack() > enemy.defend()){
            enemy.setHealth(enemy.health - player.specialAttack());
        }
        else{
            enemy.mana += 5;
        }
    }
    
    public void EnemySpecial(){
        if(enemy.specialAttack() > player.defend()){
            player.setHealth(player.health - enemy.specialAttack());
        }
        else{
            player.mana += 5;
        }
    }
    
    public void PlayerDefend(){
        player.defense += 5;
    }
    
    public void EnemyDefend(){
        enemy.defense += 5;
    }
    
    public void PlayerFlees(){
        player.setHealth(0);
    }
}