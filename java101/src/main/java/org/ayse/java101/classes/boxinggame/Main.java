package org.ayse.java101.classes.boxinggame;

/**
 * Projeye ilk kimin dövüşe başlayacağını %50 olasılık ile hesaplayan sistemi entegre ediniz.
 */
public class Main {

  public static void main(String[] args) {
    Fighter marc = new Fighter("Marc", 10, 100, 90, 0);
    Fighter alex = new Fighter("Alex", 10, 95, 100, 0);
    Ring r = new Ring(marc, alex, 90, 100);
    r.run();
  }
}
