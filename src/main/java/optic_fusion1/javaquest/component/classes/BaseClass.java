package optic_fusion1.javaquest.component.classes;

import optic_fusion1.engine.component.Component;
import optic_fusion1.engine.game.Game;
import optic_fusion1.javaquest.component.entity.Player;

public abstract class BaseClass extends Component {

  private Player player;

  public BaseClass(String name, Player player, Game game) {
    super(name, game);
    this.player = player;
  }

  public Player getPlayer() {
    return player;
  }

  public abstract String getSpecialMove();

  public abstract void useSpecialMove();

  public abstract char getType();

  @Override
  public abstract String toString();
}
