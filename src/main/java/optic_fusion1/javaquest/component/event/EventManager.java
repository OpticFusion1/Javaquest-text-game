package optic_fusion1.javaquest.component.event;

import java.util.HashMap;
import java.util.Random;

public class EventManager {

  private static final Random RANDOM = new Random();
  private static final HashMap<String, Event> EVENTS = new HashMap<>();

  public void registerEvents() {
    registerEvent(new NothingEvent("nothing"));
    registerEvent(new FightEvent("fight"));
    registerEvent(new EncounterEvent("encounter"));
  }

  private void registerEvent(Event event) {
    EVENTS.putIfAbsent(event.getName(), event);
  }

  public Event getEvent(String name) {
    return EVENTS.get(name);
  }

}
