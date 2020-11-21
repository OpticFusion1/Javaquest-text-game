package optic_fusion1.javaquest.component.entity;

import optic_fusion1.engine.component.entity.SimpleLivingEntity;

public class Player extends SimpleLivingEntity {

  private int gold = 3;
  private int score = 0;

  public Player() {
    super("Player", 10, 10);
  }

  public int getGold() {
    return gold;
  }

  public void setGold(int gold) {
    this.gold = gold;
  }
  
  public int getScore(){
    return score;
  }
  
  public void addScore(int amount){
    score += amount;
  }

}
