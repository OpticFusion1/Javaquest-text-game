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
public class Knight extends Player{

    @Override
    public String getSpecialMove() {
        return ("'Slash With Sword'"); 
    }
    @Override
    public void useSpecialMove() {
        System.out.println("You raise your sword, remembering all of your training over the years, and swiftly strike the enemy!");
        System.out.println("Player wins! Score increased by 2 points!");
    }
    public void setScore(int x){
        super.setScore(x);
    }
    public void setHealth(int x){
        super.setHealth(x);
    }
    public String toString(){
        return "Knight status:\nHealth: " + super.getHealth() + "\nScore: " + super.getScore() +
                "The Knight's special move is " + getSpecialMove(); 
    }
}
