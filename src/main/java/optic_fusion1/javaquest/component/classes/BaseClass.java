package optic_fusion1.javaquest.component.classes;

import optic_fusion1.engine.component.Component;
import optic_fusion1.javaquest.component.entity.Player;

public abstract class BaseClass extends Component {

  private Player player;
  
  public BaseClass(String name, Player player) {
    super(name);
    this.player = player;
  }
  
  public Player getPlayer(){
    return player;
  }

  public abstract String getSpecialMove();

  public abstract void useSpecialMove();

  @Override
  public abstract String toString();
}
