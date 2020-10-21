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
public class Thief extends Player{

    @Override
    public String getSpecialMove() {
        return "'Sneak By'";
    }

    @Override
    public void useSpecialMove() {
        System.out.println("your craft wasn't easy at first, but it sure is now. You use your skills to sneak away from the enemy!");
        System.out.println("Player wins! Score increased by 2 points!");
    }
    
    public void setScore(int x){
        super.setScore(x);
    }
    public void setHealth(int x){
        super.setHealth(x);
    }
    public String toString(){
        return "Thief status:\nHealth: " + super.getHealth() + "\nScore: " + super.getScore() +
                "The Thief's special move is " + getSpecialMove(); 
    }
    
}
