package optic_fusion1.javaquest.component.event;

import optic_fusion1.engine.component.Component;
import optic_fusion1.javaquest.component.entity.Player;

public abstract class Event extends Component {

  public Event(String name) {
    super(name);
  }
  
  public abstract int run(Player player);

}
