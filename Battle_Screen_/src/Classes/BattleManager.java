/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
import Pokemons.Pokemon;
import Poderes.Moves;
import scenario.GameOver;

/**
 *
 * @author samuel
 */
public class BattleManager {    
    
    public void gameInit(Pokemon p1, Pokemon p2, Pokemon p3, Pokemon p4, Pokemon p5, Pokemon p6, Pokemon p7, Pokemon p8){
        p1.setCurrentHP(p1.getHP());
        p2.setCurrentHP(p2.getHP());
        p3.setCurrentHP(p3.getHP());
        p4.setCurrentHP(p4.getHP());
        p5.setCurrentHP(p5.getHP());
        p6.setCurrentHP(p6.getHP());
        p7.setCurrentHP(p7.getHP());
        p8.setCurrentHP(p8.getHP());
    }
    
    public void gameEnd (Pokemon p1, Pokemon p2, Pokemon p3, Pokemon p4, Pokemon p5, Pokemon p6, Pokemon p7, Pokemon p8){
        if (p1.isVivo() == false && p2.isVivo() == false && p3.isVivo() == false && p4.isVivo() == false && p5.isVivo() == false){
            GameOver gameOver = new GameOver();
            gameOver.setVisible(true);
        } else if (p6.isVivo() == false && p7.isVivo() == false && p8.isVivo()== false){
            GameOver gameOver = new GameOver();
            gameOver.setVisible(true);
        }
    }
    
    public void playerAttack(Pokemon player, Pokemon enemy, Moves move){
        int playerDamage = player.attack(enemy, move);
        
        if (enemy.getCurrentHP() > 0){
            enemy.setCurrentHP(enemy.getCurrentHP() - playerDamage);
        }
    }
    
    public void enemyAttack(Pokemon player, Pokemon enemy, Moves move){
        int enemyDamage = enemy.attack(player, move);
        
        if (player.getCurrentHP() > 0){
            player.setCurrentHP(player.getCurrentHP() - enemyDamage);
        }
    }
    
}
