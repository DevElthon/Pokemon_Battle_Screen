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
    EnemyPokemon enemy = new EnemyPokemon(360, 0, 10, 15, 10);
    PlayerPokemon player = new PlayerPokemon(360, 0, 10, 15, 10, 0); 
    
    int enemyAction = 0;
    
    double playerTurnDamage = 0;
    double enemyTurnDamage = 0;
    
    double playerTurnDefense = player.defense;
    double enemyTurnDefense = enemy.defense;

    public EnemyPokemon getEnemy() {
        return enemy;
    }

    public PlayerPokemon getPlayer() {
        return player;
    }
    
    public void turnControl(){
        //Primeiro, recebe a acao do inimigo
        enemyAction = enemy.enemyAction();
        
        switch(enemyAction){
            case 1:
                enemyTurnDamage = enemy.attack();
                break;
            case 2:
                if(enemy.getMana() >= 25){
                    enemyTurnDamage = enemy.specialAttack();
                }
                else{
                    enemyAction = 1;
                    enemyTurnDamage = enemy.attack();
                }
                break;
            case 3:
                enemyTurnDefense += enemy.defend();
                break;
        }
        
        //Segundo, comparação de combate 
        if(player.playerAction == 1 || player.playerAction == 2 && playerTurnDamage < enemyTurnDefense){
            switch(player.playerAction){    
                case 1:
                    enemy.setMana(enemy.getMana()+10);
                    break;
                case 2:
                    enemy.setMana(enemy.getMana()+15);
                    player.setMana(player.getMana()-25);
                    break;
            }
        }
        else if(player.playerAction == 1 || player.playerAction == 2 && playerTurnDamage >= enemyTurnDefense){
            enemy.setHealth(enemy.getHealth()-playerTurnDamage);
            switch(player.playerAction){    
                case 1:
                    player.setMana(player.getMana()+10);
                    break;
                case 2:
                    player.setMana(player.getMana()-25);
                    break;
            }
        }
        
        if(enemyAction == 1 || enemyAction == 2 && enemyTurnDamage < playerTurnDefense){
            switch(enemyAction){    
                case 1:
                    player.setMana(player.getMana()+10);
                    break;
                case 2:
                    player.setMana(player.getMana()+15);
                    enemy.setMana(enemy.getMana()-25);
                    break;
            }
        }
        else if(enemyAction == 1 || enemyAction == 2 && enemyTurnDamage >= playerTurnDefense){
            player.setHealth(player.getHealth()-enemyTurnDamage);
            switch(enemyAction){    
                case 1:
                    enemy.setMana(enemy.getMana()+10);
                    break;
                case 2:
                    enemy.setMana(enemy.getMana()-25);
                    break;
            }
        }
        
        ResetTurnVariables();
    }
    
    public void playerAttacks(){
        player.setPlayerAction(1);
        playerTurnDamage = player.attack();
    }
    
    public void PlayerSpecial(){
        player.setPlayerAction(2);
        playerTurnDamage = player.specialAttack();
    }
    
    public void PlayerDefend(){
        player.setPlayerAction(3);
        player.defense += 5;
    }
    
    private void ResetTurnVariables(){
        player.setPlayerAction(0);
        playerTurnDamage = 0;
        playerTurnDefense = player.defense;
        enemyAction = 0;
        enemyTurnDamage = 0;
        enemyTurnDefense = enemy.defense;
    }
}