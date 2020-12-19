package optic_fusion1.javaquest.component.event;

import java.util.Random;
import optic_fusion1.engine.game.Game;
import static optic_fusion1.engine.game.Game.LOGGER;
import optic_fusion1.javaquest.component.entity.Player;

public class NothingEvent extends Event {

  private static final Random RANDOM = new Random();

  public NothingEvent(String name, Game game) {
    super(name, game);
  }

  @Override
  public int run(Player player) {
    int nothingInt = 1 + RANDOM.nextInt(10);
    char characterType  = player.getPlayerClass().getType();
    LOGGER.info("**************************************************************************");
    //TODO: Make this abstract so it's easier to implement new strings
    switch (nothingInt) {
      case 1:
        LOGGER.info("You continue to explore the deeply wooded area. The strong scent of cedar fills your lungs.");
        break;
      case 2:
        LOGGER.info("You see a small hut up the hill to your right. Probably best to keep moving.");
        break;
      case 3:
        LOGGER.info("You catch your balance as uneven tree stumps misguide your feet. You continue through the woods.");
        break;
      case 4:
        LOGGER.info("You remember back to why you are exploring the forest in the first place...");
        LOGGER.info("There have been ancient legends as old as your village that claim the forest is enchanted.");
        LOGGER.info("Unexplained treasure chests have been foudn scattered throughout the forest.");
        LOGGER.info("The competition is high for finding the magical chests. You acknowledge that you probably aren't alone in the forest...");
        break;
      case 5:
        LOGGER.info("You find yourself in a bright clearing in the forest. Rays of sunlight warm your skin.");
        break;
      case 6:
        LOGGER.info("You slow your pace as you come across a body of a hunter, his clothing torn to shred and pockets picked turned inside out.");
        LOGGER.info("He has been dead no more than a day. You carry on, warry of what may be to come.");
        break;
      case 7:
        LOGGER.info("The scent of cedar grows stronger as you follow a beaten trail through the rich forest.");
        break;
      case 8:
        LOGGER.info("The leaves rustle to your left. You pause and listen, only now hearing the sound of your steady heart beat.");
        LOGGER.info("You decide it's best to continue on");
        break;
      case 9:
        LOGGER.info("As you make a good pace through the forest, you think back to your old life...");
        switch (characterType) {
          case 'k':
            LOGGER.info("Training to fight for the kingdom was rewarding work, btu oh so repetitive.");
            LOGGER.info("You know you can use your skilsl to find great fortune in the forest.");
            break;
          case 'h':
            LOGGER.info("Healing the sick and the lame is very rewarding work, but it's gotten boring over the years.");
            LOGGER.info("You yearn for the adventure that adventuring brings and know great fortune can be found for someone with your abilities.");
            break;
          case 'w':
            LOGGER.info("Back in your chambers, you were developing spells that could influence the weather.");
            LOGGER.info("oh, the applications of the work... But damnit the weather just didn't want to cooperate!");
            LOGGER.info("Adventuring will be a nice change of pace and perhaps fund your next experiment.");
            break;
          default:
            LOGGER.info("Small time thieving was fun. The rush of picking the lock to a jewelry box was it's own reward.");
            LOGGER.info("You also recognize that there is much to be discovered and learned by venturing outside of your normal work.");
            LOGGER.info("Even if you find great fortune here, you'll probably continue to thieve... after all, who would say no to more fortune!");
            break;
        }
        break;
      case 10:
        LOGGER.info("You pause, squinting your eyes as you think you see a very faint puff of colored dust about 5 meteres in front of you.");
        LOGGER.info("As it dissipates, you can't come to a rational conclusion as to what you just saw or why it happened...");
        LOGGER.info("Maybe this forest is enchanted after all...");
        break;
      default:
        LOGGER.info("The leaves crunch under your boots as you venture through the forest. You withdraw a small piece of bread from your pocket and enjoy a snack.");
        LOGGER.info("The many scents of the forest flood  your nose and you feel refreshed by the plentiful nature and the food.");
    }
    return player.getGold();
  }

}
