package optic_fusion1.javaquest.component.entity;

import optic_fusion1.engine.component.entity.SimpleLivingEntity;
import optic_fusion1.engine.game.Game;
import optic_fusion1.javaquest.component.classes.BaseClass;

public class Player extends SimpleLivingEntity {

  private int gold = 3;
  private int score = 0;
  private BaseClass playerClass;

  public Player(Game game) {
    super("Player", 10, 10, game);
  }

  public int getGold() {
    return gold;
  }

  public void setGold(int gold) {
    this.gold = gold;
  }

  public int getScore() {
    return score;
  }

  public void addScore(int amount) {
    score += amount;
  }

  public BaseClass getPlayerClass() {
    return playerClass;
  }

  public void setPlayerClass(BaseClass playerClass) {
    this.playerClass = playerClass;
  }

}
