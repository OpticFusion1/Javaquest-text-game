package optic_fusion1.javaquest.component.classes;

import optic_fusion1.engine.game.Game;
import optic_fusion1.javaquest.component.entity.Player;

public class Knight extends BaseClass {

  public Knight(String name, Player player, Game game) {
    super(name, player, game);
  }

  @Override
  public String getSpecialMove() {
    return ("'Slash With Sword'");
  }

  @Override
  public void useSpecialMove() {
    System.out.println("You raise your sword, remembering all of your training over the years, and swiftly strike the enemy!");
    System.out.println("Player wins! Score increased by 2 points!");
  }

  @Override
  public String toString() {
    return "Knight status:\nHealth: " + getPlayer().getHealth() + "\nScore: " + getPlayer().getScore()
            + "The Knight's special move is " + getSpecialMove();
  }

  @Override
  public char getType() {
    return 'k';
  }
  
}
