package org.ayse.java101.method;

import java.util.Scanner;

/**
 * Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot
 * kullanarak yapan programı yazınız.
 * <p>
 * Taban değeri giriniz : 5 Üs değerini giriniz : 3 Sonuç : 125
 */
public class ExponentCalculation {

  public ExponentCalculation() {
    Scanner scanner = new Scanner(System.in);
    boolean isExit = false;
    int base;
    int exponent;
    do {
      System.out.print("Enter the base value :");
      base = scanner.nextInt();
      System.out.print("Enter the exponent: ");
      exponent = scanner.nextInt();
      System.out.println("Result: " + getResult(exponent, base));
      System.out.println("If you want to exit, please enter 0: (or continue with another number)");
      isExit = scanner.nextInt() == 0;
    } while (!isExit);
  }

  public static void main(String[] args) {
    new ExponentCalculation();
  }

  private int getResult(int exponent, int base) {
    if (exponent == 0) {
      return 1;
    }
    return base * getResult(exponent - 1, base);
  }

}
