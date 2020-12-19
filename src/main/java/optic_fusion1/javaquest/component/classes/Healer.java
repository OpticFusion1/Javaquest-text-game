package optic_fusion1.javaquest.component.classes;

import optic_fusion1.engine.game.Game;
import optic_fusion1.javaquest.component.entity.Player;

public class Healer extends BaseClass {

  public Healer(String name, Player player, Game game) {
    super(name, player, game);
  }

  @Override
  public String getSpecialMove() {
    return "'Use Sleeping Powder'";
  }

  @Override
  public void useSpecialMove() {
    System.out.println("Over the years you have perfected your specalty: Sleeping Powder. 'this should do the trick', you whisper as the enemy collapses");
    System.out.println("Player wins! Score increased by 2 points!");

  }

  @Override
  public String toString() {
    return "Healer status:\nHealth: " + getPlayer().getHealth() + "\nScore: " + getPlayer().getScore()
            + "The Healer's special move is " + getSpecialMove();
  }
  
  @Override
  public char getType() {
    return 'h';
  }

}
