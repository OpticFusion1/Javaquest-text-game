package optic_fusion1.javaquest.component.event;

import java.util.HashMap;
import java.util.Random;
import optic_fusion1.engine.game.Game;

public class EventManager {

  private static final Random RANDOM = new Random();
  private static final HashMap<String, Event> EVENTS = new HashMap<>();

  public void registerEvents(Game game) {
    registerEvent(new NothingEvent("nothing", game));
    registerEvent(new FightEvent("fight", game));
    registerEvent(new EncounterEvent("encounter", game));
  }

  private void registerEvent(Event event) {
    EVENTS.putIfAbsent(event.getName(), event);
  }

  public Event getEvent(String name) {
    return EVENTS.get(name);
  }

}
