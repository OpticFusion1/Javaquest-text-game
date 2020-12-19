package optic_fusion1.javaquest.component.event;

import optic_fusion1.engine.component.Component;
import optic_fusion1.engine.game.Game;
import optic_fusion1.javaquest.component.entity.Player;

public abstract class Event extends Component {

  public Event(String name, Game game) {
    super(name, game);
  }
  
  public abstract int run(Player player);

}
