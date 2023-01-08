package org.ayse.java101.loop;

import java.util.Scanner;

/**
 * 18 ve 24 sayılarının en büyük ortak bölenini 6
 * <p>
 * 6 ve 8 sayılarının en küçük ortak katı 24
 * <p>
 * EKOK = (n1*n2) / EBOB
 * <p>
 * Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
 */
public class GcdLcm {

  private final int number1;
  private final int number2;

  public GcdLcm() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Number 1: ");
    number1 = scanner.nextInt();
    System.out.print("Number 2: ");
    number2 = scanner.nextInt();
  }

  public static void main(String[] args) {
    GcdLcm gcdLcm = new GcdLcm();
    System.out.println("GCD: " + gcdLcm.findGcd());
    System.out.println("LCM: " + gcdLcm.findLcm());
  }

  public int findLcm() {
    return (number1 * number2) / findGcd();
  }

  public int findGcd() {
    int num1 = number1;
    int num2 = number2;
    while (num2 > 0) {
      int temp = num2;
      num2 = num1 % num2;
      num1 = temp;
    }
    return num1;
  }

}
