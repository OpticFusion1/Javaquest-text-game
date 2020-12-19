package optic_fusion1.javaquest.component.classes;

import optic_fusion1.engine.game.Game;
import optic_fusion1.javaquest.component.entity.Player;

public class Thief extends BaseClass {

  public Thief(String name, Player player, Game game) {
    super(name, player, game);
  }

  @Override
  public String getSpecialMove() {
    return "'Sneak By'";
  }

  @Override
  public void useSpecialMove() {
    System.out.println("your craft wasn't easy at first, but it sure is now. You use your skills to sneak away from the enemy!");
    System.out.println("Player wins! Score increased by 2 points!");
  }

  @Override
  public String toString() {
    return "Thief status:\nHealth: " + getPlayer().getHealth() + "\nScore: " + getPlayer().getScore()
            + "The Thief's special move is " + getSpecialMove();
  }
  
  @Override
  public char getType() {
    return 't';
  }

}
