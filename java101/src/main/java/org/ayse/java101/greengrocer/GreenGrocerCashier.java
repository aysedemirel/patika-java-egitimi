package org.ayse.java101.greengrocer;

import java.util.Scanner;

/**
 * Java ile kullanıcıların manavdan almış oldukları ürünlerin
 * kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
 * Meyveler ve KG Fiyatları:
 * Armut : 2,14 TL
 * Elma : 3,67 TL
 * Domates : 1,11 TL
 * Muz: 0,95 TL
 * Patlıcan : 5,00 TL
 * */
public class GreenGrocerCashier {
  private static final double PEAR_PRICE = 2.14;
  private static final double APPLE_PRICE = 3.67;
  private static final double TOMATO_PRICE = 1.11;
  private static final double BANANA_PRICE = 0.95;
  private static final double EGGPLANT_PRICE = 5.00;

  private final double pearKg;
  private final double appleKg;
  private final double tomatoKg;
  private final double bananaKg;
  private final double eggplantKg;
  public GreenGrocerCashier(){
    System.out.println("Please enter the fruit purchase amount");
    Scanner scanner = new Scanner(System.in);
    System.out.print("Pear(kg):");
    pearKg=scanner.nextDouble();
    System.out.print("Apple(kg):");
    appleKg=scanner.nextDouble();
    System.out.print("Tomato(kg):");
    tomatoKg=scanner.nextDouble();
    System.out.print("Banana(kg):");
    bananaKg=scanner.nextDouble();
    System.out.print("Eggplant(kg):");
    eggplantKg=scanner.nextDouble();
  }

  public void calculateFee(){
    double result = (pearKg*PEAR_PRICE)+(appleKg*APPLE_PRICE)+
          (tomatoKg*TOMATO_PRICE)+(bananaKg*BANANA_PRICE)+(eggplantKg*EGGPLANT_PRICE);
    System.out.println("Total Fee: "+result+" TL");
  }

  public static void main(String[] args) {
    GreenGrocerCashier greenGrocerCashier = new GreenGrocerCashier();
    greenGrocerCashier.calculateFee();
  }
}
