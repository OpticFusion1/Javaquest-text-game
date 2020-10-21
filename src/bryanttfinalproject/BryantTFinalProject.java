/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bryanttfinalproject;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author S537321
 */
public class BryantTFinalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variable Establishment and Object Creation
        String characterType = ""; // stores letter used for character creation
        String choice; // stores letter used for what the player wants to do within an event
        String gameChoice; // stores letter used for what the player wants to do
        Player player = new Healer(); // initial character
        int totalGold = 3; // your total gold!
        int totalHealth = 10; // your total health!
        int exitLoop = 0; // when set to 1, the current loop will not loop again
        
        Scanner scan = new Scanner(System.in); // takes in user input
        Random randEvent = new Random(); // randEvent determines what kind of event happens 
        
        
        // intro statements
        System.out.println("Welcome to JavaQuest!");
        System.out.println("Do you have what it takes to survive?");
        System.out.println("These lands are cruel but there is plenty of fortune to be had for the daring...\n");
        
        // character creation loop
        while (exitLoop != 1){
            System.out.println("Chose a character...");
            System.out.println("{k} Knight || {h} Healer || {w} Wizard || {t} Thief\n");
        
            characterType = scan.nextLine();
            switch (characterType) {
                case "k":
                    player = new Knight();
                    exitLoop = 1;
                    System.out.println("\nYou were once an honorable knight, but since then have left your kingdom to seek your fortune!");
                    System.out.println("Welcome, Knight!");
                    break;
                case "h":
                    player = new Healer();
                    exitLoop = 1;
                    System.out.println("\nYou are a healer and have left your temple to seek your fortune!");
                    System.out.println("Welcome, Healer!");
                    break;
                case "w":
                    player = new Wizard();
                    exitLoop = 1;
                    System.out.println("\nYou are a wizard and have set aside your studies to seek your fortune!");
                    System.out.println("Welcome, Wizard!");
                    break;
                case "t":
                    player = new Thief();
                    exitLoop = 1;
                    System.out.println("\nYou are a thief and have left your small hometown to seek greater fortune!");
                    System.out.println("Welcome, Thief!");
                    break;
                default:
                    System.out.println("\nPlease enter a valid letter");
                    break;
            }
        }
        //Gameplay loop
        exitLoop = 0;
        while (exitLoop != 1){
            System.out.println("\nWhat would you like to do?");
            System.out.println("{?} Status Report || {n} {s} {e} {w} Move 1 Space North, South, East, or West || {q} Quit");
            gameChoice = scan.nextLine();

            if (gameChoice.equals("n") || gameChoice.equals("s") 
            || gameChoice.equals("e") || gameChoice.equals("w")) {
                
                // find an event
                int event = 1 + randEvent.nextInt(10);
                
                if (event <= 3){ // 30% of the time, do this
                    
                    // call method for nothing
                    RandomEvent occurence = new RandomEvent(characterType);
                    totalGold = occurence.Nothing(totalGold);
                    System.out.println("You pause and consider your next move...");

                }
                else if (event <= 6){ // 30% of the time, do this
                    // call method for an encounter
                    RandomEvent occurence = new RandomEvent(characterType);
                    totalGold = occurence.Encounter(totalGold, totalHealth);
                    System.out.println("\nAs you walk away, you stretch your arms towards the sky. You never know what you'll find in the forest.");
                }
                else if (event > 6){ // 40% of the time, do this
                    //call method for a fight
                    RandomFight randfight = new RandomFight(characterType);
                    totalHealth = randfight.Fight(totalHealth);
                    if (totalHealth > 0){
                        System.out.println("\nYou take a swig of your canteen. The cool water relaxes you from the fight");
                    }
                    else{
                        System.out.println("\nAs you fall to the ground, everything around you fades to darkness...");
                        break;
                    }
                }
            }
            else if (gameChoice.equals("?")){
                // print character status
                System.out.println("********************************************\n");
                System.out.println("Here are you player stats!");
                player.toString();
                System.out.println("health: " + totalHealth);
                System.out.println("gold: " + totalGold);
            }
            else if (gameChoice.equals("q")){
                // quit game
                exitLoop = 1;
            }
            else {
                System.out.println("Please enter a valid letter \n");
            }
        }
        System.out.println("********************************************");
        System.out.println("********************************************");
        System.out.println("The game has come to an end! Your final stats: ");
        // use toString to print stats
        System.out.println("health: " + totalHealth);
        System.out.println("gold: " + totalGold);
        System.out.println("Thanks for playing!");
    }
}
