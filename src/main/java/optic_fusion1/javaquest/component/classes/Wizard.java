package optic_fusion1.javaquest.component.classes;

import optic_fusion1.engine.game.Game;
import optic_fusion1.javaquest.component.entity.Player;

public class Wizard extends BaseClass {

  public Wizard(String name, Player player, Game game) {
    super(name, player, game);
  }

  @Override
  public String getSpecialMove() {
    return ("'fire spell'");
  }

  @Override
  public void useSpecialMove() {
    System.out.println("You point your finger at the fool standing before you. Fire errupts from your hands and torches the enemy!");
    System.out.println("Player wins! Score increased by 2 points!");
  }

  @Override
  public String toString() {
    return "Wizard status:\nHealth: " + getPlayer().getHealth() + "\nScore: " + getPlayer().getScore()
            + "The Wizard's special move is " + getSpecialMove();
  }

  @Override
  public char getType() {
    return 'w';
  }

}
