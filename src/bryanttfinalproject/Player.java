/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bryanttfinalproject;

/**
 *
 * @author S537321
 */
public abstract class Player {
    private int health;
    private int score;
    
    public abstract String getSpecialMove();
    public abstract void useSpecialMove();
    
    public void setScore(int x){
        score = score + x;
    }
    
    public int getScore(){
        return score;
    }
    public void setHealth(int x){
        score = health + x;
    }
    
    public int getHealth(){
        return health;
    }
}
