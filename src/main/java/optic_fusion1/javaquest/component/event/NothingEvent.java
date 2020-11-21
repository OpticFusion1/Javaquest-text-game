package optic_fusion1.javaquest.component.event;

import java.util.Random;
import optic_fusion1.javaquest.component.entity.Player;

public class NothingEvent extends Event {

  private static final Random RANDOM = new Random();

  public NothingEvent(String name) {
    super(name);
  }

  @Override
  public int run(Player player) {
    int gainedGold = 0;
    int nothingInt = 1 + RANDOM.nextInt(10);
    System.out.println("**************************************************************************");
    switch (nothingInt) {

    }
    /*
    switch (nothingInt) {
      case 1:
        System.out.println("You continue to explore the deeply wooded area. The strong scent of cedar fills your lungs.");
        break;
      case 2:
        System.out.println("You see a small hut up the hill to your right. Probably best to keep moving.");
        break;
      case 3:
        System.out.println("You catch your balance as uneven tree stumps misguide your feet. You continue through the woods.");
        break;
      case 4:
        System.out.println("You remember back to why you are exploring the forest in the first place...");
        System.out.println("There have been ancient legends as old as your village that claim the forest is enchanted.");
        System.out.println("Unexplained treasure chests have been found scattered throughout the forest.");
        System.out.println("The competition is high for finding the magical chests. You acknowledge that you probably aren't alone in the forest...");
        break;
      case 5:
        System.out.println("You find yourself in a bright clearing in the forest. Rays of sunlight warm your skin.");
        break;
      case 6:
        System.out.println("You slow your pace as you come accross a body of a hunter, his clothing torn to shreds and pockets turned inside out.");
        System.out.println("He has been dead no more than a day. You carry on, warry of what may be to come.");
        break;
      case 7:
        System.out.println("The scent of cedar grows stronger as you follow a beaten trail through the rich forest.");
        break;
      case 8:
        System.out.println("The leaves rustle to your left. You pause and listen, only now hearing the sound of your steady heartbeat.");
        System.out.println("You decide it's best to continue on");
        break;
      case 9:
        System.out.println("As you make a good pace through the forest, you think back to your old life...");
        switch (characterType) {
          case "k":
            System.out.println("Training to fight for the kingdom was rewarding work, but oh so repetitive.");
            System.out.println("You know you can use your skills to find great fortune in the forest.");
            break;
          case "h":
            System.out.println("Healing the sick and the lame is very rewarding work, but it's gotten boring over the years.");
            System.out.println("You yearn for the adventure that adventuring brings and know great fortune can be found for someone with your abilities!");
            break;
          case "w":
            System.out.println("Back in your chambers, you were developing spells that could influence the weather.");
            System.out.println("oh, the applications of the work... But damnit the weather just didn't want to cooperate!");
            System.out.println("Adventuring will be a nice change of pace and perhaps fund your next experiment.");
            break;
          default:
            System.out.println("Small time thieving was fun. The rush of picking the lock to a jewelry box was it's own reward.");
            System.out.println("You also recognize that there is much to be discovered and learned by venturing outside of your normal work.");
            System.out.println("Even if you find great fortune here, you'll probably continue to thieve... after all, who would say no to more fortune!");
            break;
        }
      case 10:
        System.out.println("You pause, squinting your eyes as you think you see a very faint puff of colored dust about 5 meteres in front of you.");
        System.out.println("As it dissipates, you can't come to a rational conclusion as to what you just saw or why it happened...");
        System.out.println("Maybe this forest is enchanted after all...");
        break;
      default:
        System.out.println("The leaves crunch under your boots as your venture through the forest. You withdraw a small piece of bread from your pocket and enjoy a snack.");
        System.out.println("The many scents of the forest flood your nose and you feel refreshed by the plentiful nature and the food.");
        break;
    }
     */
//    return (player.getGold() + gainedGold);
  }

}
