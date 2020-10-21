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
public class Healer extends Player{

    @Override
    public String getSpecialMove() {
        return "'Use Sleeping Powder'";
    }

    @Override
    public void useSpecialMove() {
        System.out.println("Over the years you have perfected your specalty: Sleeping Powder. 'this should do the trick', you whisper as the enemy collapses");
        System.out.println("Player wins! Score increased by 2 points!");

    }
    
    public void setScore(int x){
        super.setScore(x);
    }
    public void setHealth(int x){
        super.setHealth(x);
    }
    
    public String toString(){
        return "Healer status:\nHealth: " + super.getHealth() + "\nScore: " + super.getScore() +
                "The Healer's special move is " + getSpecialMove(); 
    }
}
