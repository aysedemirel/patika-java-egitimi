package org.ayse.java101.classes.boxinggame;

public class Ring {

  Fighter f1;
  Fighter f2;
  int minWeight;
  int maxWeight;

  public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
    this.f1 = f1;
    this.f2 = f2;
    this.minWeight = minWeight;
    this.maxWeight = maxWeight;
  }

  public void run() {
    if (checkWeight()) {
      while (f1.health > 0 && f2.health > 0) {
        System.out.println("======== NEW ROUND ===========");
        boolean isFirstStart = isFirstPlayerStart();
        boolean isFinish = isFirstStart ? firstStart() : secondStart();
        if (isFinish) {
          break;
        }
        printScore();
      }

    } else {
      System.out.println("The weights of the gamers do not match.");
    }
  }

  private boolean firstStart() {
    if (hitFirst()) {
      return true;
    }
    return hitSecond();
  }

  private boolean secondStart() {
    if (hitSecond()) {
      return true;
    }
    return hitFirst();
  }

  private boolean hitFirst() {
    f2.health = f1.hit(f2);
    return isWin();
  }

  private boolean hitSecond() {
    f1.health = f2.hit(f1);
    return isWin();
  }

  private boolean isFirstPlayerStart() {
    boolean isFirstStart = (Math.random() < 0.5);
    String output = "Start : " + (isFirstStart ? "First" : "Second");
    System.out.println(output);
    return isFirstStart;
  }

  public boolean checkWeight() {
    return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight
        && f2.weight <= maxWeight);
  }

  public boolean isWin() {
    if (f1.health == 0) {
      System.out.println("Winner : " + f2.name);
      return true;
    } else if (f2.health == 0) {
      System.out.println("Winner : " + f1.name);
      return true;
    }

    return false;
  }


  public void printScore() {
    System.out.println("------------");
    System.out.println(f1.name + " Remaining Rights \t:" + f1.health);
    System.out.println(f2.name + " Remaining Rights \t:" + f2.health);
  }
}
