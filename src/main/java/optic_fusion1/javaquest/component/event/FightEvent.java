package optic_fusion1.javaquest.component.event;

import java.util.Random;
import java.util.Scanner;
import optic_fusion1.javaquest.component.entity.Player;

public class FightEvent extends Event{

  private static final Random RANDOM = new Random();
  private static final Scanner SCANNER = new Scanner(System.in);
  
  public FightEvent(String name) {
    super(name);
  }

  @Override
  public int run(Player player) {
    int totalHealth = player.getHealth();
    String choice;
    int odds;
    /*
  public int Fight(int totalHealth) {
    Scanner scanner = new Scanner(System.in);
    String choice = "";
    Random random = new Random();
    int odds;
    int fightInt = 1 + random.nextInt(3);

    System.out.println("**************************************************************************");

    if (fightInt == 1) {
      System.out.println("The bushes rustle to your side as a zombie comes barreling towards you!");
      System.out.println("What do you do?");
      System.out.println("{s} Special move || {r} Run");
      choice = scanner.nextLine();
      System.out.println("**************************************************************************");

      switch (choice) {
        case "s":
          // use special move
          switch (characterType) {
            case "k":
              odds = random.nextInt(5);
              if (odds <= 2) {
                System.out.println("You raise your sword, remembering all of your training over the years, and swiftly strike the enemy!");
                System.out.println("You win!");
                return totalHealth;
              } else {
                System.out.println("You fail to attack faster than your enemy and take damage!");
                System.out.println("You lose and have lost 1 health!");
                totalHealth--;
                return totalHealth;
              }
            case "h":
              odds = random.nextInt(5);
              if (odds <= 2) {
                System.out.println("Over the years you have perfected your specalty: Sleeping Powder. 'this should do the trick', you whisper as the enemy collapses");
                System.out.println("You win!");
                return totalHealth;
              } else {
                System.out.println("You fail to attack faster than your enemy and take damage!");
                System.out.println("You lose and have lost 1 health!");
                totalHealth--;
                return totalHealth;
              }
            case "w":
              odds = random.nextInt(5);
              if (odds <= 2) {
                System.out.println("You point your finger at the fool standing before you. Fire errupts from your hands and torches the enemy!");
                System.out.println("You win!");
                return totalHealth;
              } else {
                System.out.println("You fail to attack faster than your enemy and take damage!");
                System.out.println("You lose and have lost 1 health!");
                totalHealth--;
                return totalHealth;
              }
            case "t":
              odds = random.nextInt(5);
              if (odds <= 2) {
                System.out.println("your craft wasn't easy at first, but it sure is now. You use your skills to sneak away from the enemy!");
                System.out.println("You win!");
                return totalHealth;
              } else {
                System.out.println("You fail to attack faster than your enemy and take damage!");
                System.out.println("You lose and have lost 1 health!");
                totalHealth--;
                return totalHealth;
              }
            default:
              break;
          }
          break;

        case "r":
          //run
          odds = random.nextInt(2);
          if (odds == 0) {
            System.out.println("You try to run but the zombie grabs your arm and enjoys a quick and savory bite!");
            System.out.println("You are able to break free but suffer mild wounds.");
            System.out.println("You have lost 1 health");
            totalHealth = totalHealth - 1;
            return totalHealth;
          } else {
            System.out.println("You use your athleticism and agility to dodge the zombie!");
            System.out.println("Escape successful!");
            return totalHealth;
          }
        default:
          System.out.println("That input isn't valid!");
          System.out.println("You stand still, unsure of what to do. The zombie attacks you!");
          System.out.println("You manage to get away, but suffer mild wounds.");
          System.out.println("You have lost 1 health");
          totalHealth--;
          return totalHealth;
      }
    }
    if (fightInt == 2) {
      System.out.println("You whip your head uph and shuffle backwards as a bandit leaps from a tree and lands in front of you!");
      System.out.println("He demands all your gold, and perhaps he will spare your life");
      System.out.println("What do you do?");
      System.out.println("{s} Special move || {r} Run");
      choice = scanner.nextLine();
      System.out.println("**************************************************************************");

      switch (choice) {
        case "s":
          // use special move
          if (characterType.equals("k")) {
            odds = random.nextInt(5);
            if (odds <= 2) {
              System.out.println("You raise your sword, remembering all of your training over the years, and swiftly strike the enemy!");
              System.out.println("You win!");
              return totalHealth;
            } else {
              System.out.println("You fail to attack faster than your enemy and take damage!");
              System.out.println("You manage to get away, gold intact, but have lost 1 health!");
              totalHealth--;
              return totalHealth;
            }
          } else if (characterType.equals("h")) {
            odds = random.nextInt(5);
            if (odds <= 2) {
              System.out.println("Over the years you have perfected your specalty: Sleeping Powder. 'this should do the trick', you whisper as the enemy collapses");
              System.out.println("You win!");
              return totalHealth;
            } else {
              System.out.println("You fail to attack faster than your enemy and take damage!");
              System.out.println("You manage to get away, gold intact, but have lost 1 health!");
              totalHealth--;
              return totalHealth;
            }
          } else if (characterType.equals("w")) {
            odds = random.nextInt(5);
            if (odds <= 2) {
              System.out.println("You point your finger at the fool standing before you. Fire errupts from your hands and torches the enemy!");
              System.out.println("You win!");
              return totalHealth;
            } else {
              System.out.println("You fail to attack faster than your enemy and take damage!");
              System.out.println("You manage to get away, gold intact, but have lost 1 health!");
              totalHealth--;
              return totalHealth;
            }
          } else if (characterType.equals("t")) {
            odds = random.nextInt(5);
            if (odds <= 2) {
              System.out.println("your craft wasn't easy at first, but it sure is now. You use your skills to sneak away from the enemy!");
              System.out.println("You win!");
              return totalHealth;
            } else {
              System.out.println("You fail to attack faster than your enemy and take damage!");
              System.out.println("You manage to get away, gold intact, but have lost 1 health!");
              totalHealth--;
              return totalHealth;
            }
          }
          break;
        case "r":
          //run
          odds = random.nextInt(2);
          if (odds == 0) {
            System.out.println("You try to run but the bandit grabs you and attacks!");
            System.out.println("You are able to break free but suffer mild wounds.");
            System.out.println("You have lost 1 health");
            totalHealth = totalHealth - 1;
            return totalHealth;
          } else {
            System.out.println("You pretend to run to the left but dart quickly to the right, leaving the bandit with a broken ankle.");
            System.out.println("Escape successful!");
            return totalHealth;
          }
        default:
          System.out.println("That input isn't valid!");
          System.out.println("You stand still, unsure of what to do. The bandit attacks you!");
          System.out.println("You manage to get away, gold intact, but suffer mild wounds.");
          System.out.println("You have lost 1 health");
          totalHealth--;
          return totalHealth;
      }
    }
    if (fightInt == 3) {
      System.out.println("Up ahead you see a dapper man holding a clipboard, asking for signatures. Oh no, not a social activist!");
      System.out.println("The social activist approaches you, pleading for your signature while spitting truly vile policy reforms.");
      System.out.println("What do you do?");
      System.out.println("{s} Special move || {r} Run");
      choice = scanner.nextLine();
      System.out.println("**************************************************************************");

      switch (choice) {
        case "s":
          // use special move
          if (characterType.equals("k")) {
            odds = random.nextInt(5);
            if (odds <= 2) {
              System.out.println("You raise your sword, remembering all of your training over the years, and swiftly strike the enemy!");
              System.out.println("You win!");
              return totalHealth;
            } else {
              System.out.println("You try to attack, but the social activist is too quick! ");
              System.out.println("Not only do you take damage, but he also forces you to sign his poorly written petition!");
              System.out.println("You lose and have lost 1 health!");
              totalHealth--;
              return totalHealth;
            }
          } else if (characterType.equals("h")) {
            odds = random.nextInt(5);
            if (odds <= 2) {
              System.out.println("Over the years you have perfected your specalty: Sleeping Powder. 'this should do the trick', you whisper as the enemy collapses");
              System.out.println("You win!");
              return totalHealth;
            } else {
              System.out.println("You try to attack, but the social activist is too quick! ");
              System.out.println("Not only do you take damage, but he also forces you to sign his poorly written petition!");
              System.out.println("You lose and have lost 1 health!");
              totalHealth--;
              return totalHealth;
            }
          } else if (characterType.equals("w")) {
            odds = random.nextInt(5);
            if (odds <= 2) {
              System.out.println("You point your finger at the fool standing before you. Fire errupts from your hands and torches the enemy!");
              System.out.println("You win!");
              return totalHealth;
            } else {
              System.out.println("You try to attack, but the social activist is too quick! ");
              System.out.println("Not only do you take damage, but he also forces you to sign his poorly written petition!");
              System.out.println("You lose and have lost 1 health!");
              totalHealth--;
              return totalHealth;
            }
          } else if (characterType.equals("t")) {
            odds = random.nextInt(5);
            if (odds <= 2) {
              System.out.println("your craft wasn't easy at first, but it sure is now. You use your skills to sneak away from the enemy!");
              System.out.println("You win!");
              return totalHealth;
            } else {
              System.out.println("You try to attack, but the social activist is too quick! ");
              System.out.println("Not only do you take damage, but he also forces you to sign his poorly written petition!");
              System.out.println("You lose and have lost 1 health!");
              totalHealth--;
              return totalHealth;
            }
          }
          break;
        case "r":
          //run
          odds = random.nextInt(2);
          if (odds == 0) {
            System.out.println("You try to run but are tackled by the social activist! He forces your signature on his petition!");
            System.out.println("You are able to break free and escape but suffer mild mental trauma from hearing the terrible policies.");
            System.out.println("You have lost 1 health");
            totalHealth = totalHealth - 1;
            return totalHealth;
          } else {
            System.out.println("You quickly shout facts that disprove all the social activist's proposed policies! He flees!");
            System.out.println("Escape successful!");
            return totalHealth;
          }
        default:
          System.out.println("That input isn't valid!");
          System.out.println("You stand still, unsure of what to do. The social activist forces your signature!");
          System.out.println("You manage to get away, but suffer mild mental trauma from hearing the terrible policies.");
          System.out.println("You have lost 1 health");
          totalHealth--;
          return totalHealth;
      }
    }

    System.out.println("**************************************************************************");
    return totalHealth;
  }
    */
  }

}
