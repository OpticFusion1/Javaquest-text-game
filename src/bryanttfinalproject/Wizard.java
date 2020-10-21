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
public class Wizard extends Player{

    @Override
    public String getSpecialMove() {
        return ("'fire spell'");
    }

    @Override
    public void useSpecialMove() {
        System.out.println("You point your finger at the fool standing before you. Fire errupts from your hands and torches the enemy!");
        System.out.println("Player wins! Score increased by 2 points!");
    }
    
    public void setScore(int x){
        super.setScore(x);
    }
    public void setHealth(int x){
        super.setHealth(x);
    }
    public String toString(){
        return "Wizard status:\nHealth: " + super.getHealth() + "\nScore: " + super.getScore() +
                "The Wizard's special move is " + getSpecialMove(); 
    }
    
}
