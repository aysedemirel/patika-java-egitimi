package org.ayse.java101.classes.boxinggame;

public class Fighter {

  String name;
  int damage;
  int health;
  int weight;
  double dodge;

  public Fighter(String name, int damage, int health, int weight, double dodge) {
    this.name = name;
    this.damage = damage;
    this.health = health;
    this.weight = weight;
    this.dodge = dodge;
  }

  public int hit(Fighter foe) {
    System.out.println("------------");
    System.out.println(this.name + " => " + foe.name + " " + this.damage);

    if (foe.isDodge()) {
      System.out.println(foe.name + " escaped the damage");
      return foe.health;
    }

    if (foe.health - this.damage < 0) {
      return 0;
    }

    return foe.health - this.damage;
  }

  public boolean isDodge() {
    double randomValue = Math.random() * 100;  //0.0 to 99.9
    return randomValue <= this.dodge;
  }
}
