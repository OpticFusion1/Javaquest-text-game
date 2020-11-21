package optic_fusion1.javaquest.component.event;

import optic_fusion1.javaquest.component.entity.Player;

public class EncounterEvent extends Event{

  public EncounterEvent(String name) {
    super(name);
  }

  @Override
  public int run(Player player) {
    /*
    
    // 30% of the time a random encounter will occur 
    Scanner scanner = new Scanner(System.in);
    String choice = "";
    int Random;
    int encounterInt = 1 + random.nextInt(5);
    int goldFound = 0;

    System.out.println("**************************************************************************");
    if (encounterInt == 1) {
      System.out.println("You stumble upon a large golden treasure chest with an unknown language enscribed on the casing.");
      System.out.println("The treasure chest has a large padlock in the center. \nWhat do you do?");

      if (characterType.equals("k")) {
        System.out.println("Enter 'x' to use your sword to bash the padlock as hard as you can");
        System.out.println("Enter any other letter to walk away, leaving the chest untouched");
        choice = scanner.nextLine();
        System.out.println("**************************************************************************");

        if (choice.equals("x")) {
          Random = random.nextInt(2);
          if (Random == 0) {
            System.out.println("You raise your sword and strike down at the chest. The chest disappears before you can make contact!");
          } else {
            System.out.println("You raise your sword and strike down at the chest. The lock breaks with ease and the chest opens!");
            goldFound = random.nextInt(11);
            totalGold = totalGold + goldFound;
            System.out.println("You find " + goldFound + " gold inside the chest!");
          }
        } else {
          System.out.println("You stand back up and walk away, thinking that it's probably best to avoid such a strange chest");
        }
      }
      if (characterType.equals("h")) {
        System.out.println("Enter 'x' to kick the padlock as hard as you can");
        System.out.println("Enter any other letter to walk away, leaving the chest untouched");
        choice = scanner.nextLine();
        System.out.println("**************************************************************************");

        if (choice.equals("x")) {
          Random = random.nextInt(2);
          if (Random == 0) {
            System.out.println("You raise your leg and kick as hard as you can. The chest disappears before you can make contact!");
          } else {
            System.out.println("You raise your leg and kick as hard as you can. The lock breaks with ease and the chest opens!");
            goldFound = random.nextInt(11);
            totalGold = totalGold + goldFound;
            System.out.println("You find " + goldFound + " gold inside the chest!");
          }
        } else {
          System.out.println("You stand back up and walk away, thinking that it's probably best to avoid such a strange chest");
        }
      }
      if (characterType.equals("w")) {
        System.out.println("Enter 'x' to cast an unlocking spell at the chest");
        System.out.println("Enter any other letter to walk away, leaving the chest untouched");
        choice = scanner.nextLine();
        System.out.println("**************************************************************************");

        if (choice.equals("x")) {
          Random = random.nextInt(5);
          if (Random == 0) {
            System.out.println("You raise your hand and utter a simple phrase. The chest disappears before you can finish the spell!");
          } else {
            System.out.println("You raise your hand and utter a simple phrase. The lock pops open and the chest is unlocked!");
            goldFound = random.nextInt(11);
            totalGold = totalGold + goldFound;
            System.out.println("You find " + goldFound + " gold inside the chest!");
          }
        } else {
          System.out.println("You stand back up and walk away, thinking that it's probably best to avoid such a strange chest");
        }
      }
      if (characterType.equals("t")) {
        System.out.println("Enter 'x' to use your knowledge of lockpicking to open the lock");
        System.out.println("Enter any other letter to walk away, leaving the chest untouched");
        choice = scanner.nextLine();
        System.out.println("**************************************************************************");

        if (choice.equals("x")) {
          Random = random.nextInt(5);
          if (Random == 0) {
            System.out.println("You kneel down and prepare to pick the lock. The chest disappears before you can make contact!");
          } else {
            System.out.println("You kneel down and prepare to pick the lock. The lock opens with ease!");
            goldFound = random.nextInt(11);
            totalGold = totalGold + goldFound;
            System.out.println("You find " + goldFound + " gold inside the chest!");
          }
        } else {
          System.out.println("You stand back up and walk away, thinking that it's probably best to avoid such a strange chest");
        }
      }
    }

    switch (encounterInt) {
      case 2:
        int gambleAmount;
        int diceSum1;
        int diceSum2;
        int dice1 = 1 + random.nextInt(6);
        int dice2 = 1 + random.nextInt(6);
        int dice3 = 1 + random.nextInt(6);
        int dice4 = 1 + random.nextInt(6);
        int dice5 = 1 + random.nextInt(6);
        int dice6 = 1 + random.nextInt(6);
        System.out.println("You come across a clearing where a man in a pinstripe suit stands. He warmly greets you.");
        System.out.println("Interested in a game of luck? We each toss 3 dice and the one with highest sum wins!");
        System.out.println("I win ties, but you win double if you roll 3 dice of same value...\n");
        System.out.println("How do you respond?");
        System.out.println("Enter 'x' to play the game");
        System.out.println("Enter 'c' to deny his request");
        System.out.println("Enter any other letter to deny his request and lecure him about how gambling is bad");
        choice = scanner.nextLine();
        System.out.println("**************************************************************************");
        if (choice.equals("x")) {
          if (totalGold == 0) {
            System.out.println("You have no gold to gamble with!");
          } else {
            System.out.println("How much will you gamble?");
            System.out.println("Gold available: " + totalGold);
            System.out.println("Enter an amount: ");
            gambleAmount = scanner.nextInt();
            if (gambleAmount > totalGold) {
              System.out.println("You don't have that much gold to gamble with!");
            } else {
              System.out.println("\nThe game begins!");
              System.out.println("You roll a " + dice1 + ", " + dice2 + ", " + dice3);
              System.out.println("The gambler rolls a " + dice4 + ", " + dice5 + ", " + dice6);
              diceSum1 = dice1 + dice2 + dice3;
              diceSum2 = dice4 + dice5 + dice6;
              if (diceSum1 > diceSum2) {
                System.out.println("\nYou win!");
                if (dice1 == dice2 && dice1 == dice3) {
                  System.out.println("You also rolled 3 of a kind!");
                  System.out.println("you have gained " + (gambleAmount * 3) + " gold");
                  totalGold = totalGold + (gambleAmount * 2);
                  System.out.println("The gambler yells, infuriated by the result! He storms off in another direction.");
                } else {
                  System.out.println("You have gained " + (gambleAmount * 2) + " gold");
                  totalGold = totalGold + gambleAmount;
                  System.out.println("The gambler grumbles under his breath and walks away.");
                }
              } else {
                System.out.println("\nYou lose!");
                totalGold = totalGold - gambleAmount;
                System.out.println("The gambler chuckles as he collects your gold.");
              }
            }
          }
        } else if (choice.equals("c")) {
          System.out.println("You deny his request. The gambler looks dissapointed, but nods his head in acceptance.");
        } else {
          System.out.println("You begin your long-winded rant about how foolish gambling is, and how he should make something of his life.");
          System.out.println("After a heated argument and several middle fingers, you both take your leave. You sure told him off!");
        }

        break;
      case 3:
        System.out.println("You stop dead in your tracks as frantic screaming is heard from up ahead.");
        System.out.println("A deranged-looking man suddenly bursts through the hillside, sprinting towards you.");
        System.out.println("while slurring incoherent sentences, the man runs up to you, yells 'TAKE IT!', and throws a coinpurse at your feet.");
        System.out.println("He continues to run away. You look down, the small coin purse sitting innocently at your feet.");
        System.out.println("\nWhat do you do?");
        System.out.println("Enter 'x' to loot the coin purse");
        System.out.println("Enter any other letter to leave the coin purse on the ground");
        choice = scanner.nextLine();
        System.out.println("**************************************************************************");
        if (choice.equals("x")) {
          Random = 1 + random.nextInt(3);
          System.out.println("You pick up the coin purse and empty the contents into your hand");
          if (Random < 3) {
            goldFound = 1 + random.nextInt(9);
            totalGold = totalGold + goldFound;
            System.out.println("You find " + goldFound + " gold inside the purse!");
          } else {
            System.out.println("One small gold coin falls into your hand. As you are examining it, the coin becomes red hot!");
            System.out.println("You flinch, dropping the coin before it burns your hand any more than it already has");
            System.out.println("You have lost 1 health!");
            totalHealth = totalHealth - 1;
            return totalHealth;
          }
        } else {
          System.out.println("You decide against picking up the coins. Who knows where they come from or what could be wrong with them...");
        }
        break;
      case 4:
        switch (eventFourCounter) {
          case 6:
            // eventFourCounter 6 is when girl/devil sitatuion is over
            System.out.println("You feel something hard under your foot, and look down to find a gold coin!");
            totalGold = totalGold + 1;
            break;
          case 5:
            // eventFourCounter 4 is when player attacked girl & meets devil
            System.out.println("Further up the path you see a red devil standing next to a broken down carriage");
            System.out.println("'Aye, you there, can you please help me?', he calls out. 'I'm a merchant you see, and I have to make supply runs.");
            System.out.println("I was hauling my goods in this carriage until a girl in blue attacked me and stole all my gold!");
            System.out.println("Listen, you look like you can handle herself. Please teach her a lesson if you see her!");
            System.out.println("You explain to the demon that you have already met the girl, and that she disappeared when you attacked her");
            System.out.println("\nAye, she's pure evil that one, I tell you! I'm glad you were aware! Here, have these coins. She didn't find them on me.");
            System.out.println("Gained 3 coins!");
            totalGold = totalGold + 3;
            eventFourCounter = 6;
            break;
          case 4:
            // eventFourCounter 4 is when you see the devil a 2nd time after taking care of girl
            System.out.println("Up ahead you see a red devil riding in a carriage with many boxes and bags in the back.");
            System.out.println("The devil gives you a big greeting. You explain to him what happened with the girl in blue.");
            System.out.println("The devil: Wow, really huh? Well, I'm not surprised! That girl is pure evil. Thank you so much for helping me!");
            System.out.println("The devil gives you 5 coins!");
            totalGold = totalGold + 5;
            eventFourCounter = 6;
            break;
          case 3:
            System.out.println("As you follow the wooded path you see the girl in blue up ahead!");
            System.out.println("She smiles at you, but then her smile turns into an insideous frown.");
            System.out.println("The girl in blue lets out a venemous hiss sound and then vanishes, leaving nothing but a confused player");
            eventFourCounter = 4;
            break;
          case 2:
            System.out.println("As you follow the wooded path you see the girl in blue up ahead!");
            System.out.println("She smiles and waves at you.");
            System.out.println("Oh, you don't even have to say anything! I know you took care of that devil");
            System.out.println("Here, have some coins for being so nice to me!");
            System.out.println("5 gold gained");
            totalGold = totalGold + 5;
            eventFourCounter = 6;
            break;
          case 1:
            System.out.println("Further up the path you see a red devil standing next to a broken down carriage");
            System.out.println("'Aye, you there, can you please help me?', he calls out. 'I'm a merchant you see, and I have to make supply runs.");
            System.out.println("I was hauling my goods in this carriage until a girl in blue attacked me and stole all my gold!");
            System.out.println("Listen, you look like you can handle herself. Please teach her a lesson if you see her!");
            System.out.println("\nWhat do you do?");
            System.out.println("Enter 'x' to accept");
            System.out.println("Enter 'c' to attack");
            System.out.println("Enter any other character to walk away\n");
            choice = scanner.nextLine();
            System.out.println("**************************************************************************");
            switch (choice) {
              case "x":
                System.out.println("Thank you, kind traveler. And best of luck to you!");
                System.out.println("And here, she didn't take the coins in my shirt pocket. Have these");
                System.out.println("You have gained 3 gold!");
                totalGold = totalGold + 3;
                eventFourCounter = 3;
                break;
              case "c":
                System.out.println("You close your eyes and bow your head. You know what must be done.\n");
                System.out.println("---\n");
                System.out.println("The fight was quick. Especially quick because he didn't try to fight back, only saying 'why me'...");
                System.out.println("You find 3 gold in the pocket of his shirt!");
                totalGold = totalGold + 3;
                eventFourCounter = 2;
                break;
              default:
                System.out.println("Eh, probably best to not get involved in this...");
                eventFourCounter = 6;
                break;
            }
            break;

          case 0:
            System.out.println("You chance upon a young girl in blue. She looks at you with sadness in her eyes.");
            System.out.println("Girl in Blue: *sniff*... oh thank goodness you found me. Can you please help me...?");
            System.out.println("Enter 'x' to accept");
            System.out.println("Enter 'c' to attack her");
            System.out.println("Enter any other letter to leave her and continue on your journey");
            choice = scanner.nextLine();
            System.out.println("**************************************************************************");
            switch (choice) {
              case "x":
                System.out.println("Girl in Blue: Oh thank you! Thank you thank you!!!");
                System.out.println("*sniff* I was walking to my grandmothers house with a basket of freshly-baked food, and out jumped a wretched red devil!");
                System.out.println("He knocked me over and stole all my food that I made for my grandmother!");
                System.out.println("Please, find him for me and teach him a lesson!");
                System.out.println("\nYou offer to further help the young girl, but she insists that she is fine. You continue on your way");
                eventFourCounter = 1;
                break;
              case "c":
                System.out.println("Sensing a more sinister plot at work, you attack the young girl!");
                System.out.println("Right before you attack, the young girl whips her head at you and releases a vile hiss, vanishing into thin air");
                System.out.println("'Well, that was strange' you think to yourself as you continue on your way.");
                eventFourCounter = 5;
                break;
              default:
                System.out.println("You're not sure what has happened here, but it's probably best not to get involved.");
                System.out.println("You continue on your way.");
                eventFourCounter = 6;
                break;
            }
            break;

          default:
            break;
        }
        break;

      case 5:
        System.out.println("You begin to hear cheerful music, but can't pinpoint its location...");
        System.out.println("Up ahead in a clearing, you see a group of clearly drunken bards!");
        System.out.println("They laugh and drink and happily shout for you to come forth.\n");
        System.out.println("Lute Player: Lad, lad, lad, -err uh, lass? I'm too drunk to tell!");
        System.out.println("Bongo Player: Whoever you are, sing to us! Sing to us the greatest song you have ever heard!");
        System.out.println("You dart your eyes to the side, wondering what the best song is that you could sing...");
        System.out.println("What song do you sing for them?: ");
        choice = scanner.nextLine();
        System.out.println("**************************************************************************");
        int randNumb = random.nextInt(3);
        System.out.println("\nYou sing " + choice + " using all the spirit and cheer you can muster!\n");
        if (randNumb == 0) {
          System.out.println("Lute Player: aye, what did he say??");
          System.out.println("Violin Player: YOU DONT SAY THAT ABOUT MY MOTHER YOU HEAR ME!!!");
          System.out.println("Lute Player: aye the bloody nerve of the lad, singin like that!... or lass..erhm, BOOOOO\n");
          System.out.println("A unison outburst of booing takes place and you decide to leave before things get hostile");
          System.out.println("Maybe you should learn how to sing...");
        } else {
          System.out.println("Violin Player: WOW! The pipes on ye!");
          System.out.println("Group Singer: oh my, it's the enchanting voice of the angels!");
          System.out.println("Lute Player: ayyy lass -or uhh, lad, you did great! " + choice + " is me favorite!");
          System.out.println("Lute Player: here mate, have these here -uh, spare coins of mine!\n");
          System.out.println("You gained 2 coins!");
          totalGold = totalGold + 2;
        }
        break;
      default:
        break;
    }
    return totalGold;
    */
  }

}
