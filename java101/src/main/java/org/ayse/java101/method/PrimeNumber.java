package org.ayse.java101.method;

import java.util.Scanner;

/**
 * Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup
 * olmadığını bulan programı yazın.
 */
public class PrimeNumber {


  public PrimeNumber() {
    int number;
    boolean isExit = false;
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.print("Number: ");
      number = scanner.nextInt();
      System.out.println(getResult(number));
      System.out.print(
          "If you want to exit, please enter 0 (or you can continue with another number) : ");
      isExit = scanner.nextInt() == 0;
    } while (!isExit);
  }

  public static void main(String[] args) {
    new PrimeNumber();
  }

  private String getResult(int number) {
    if (number < 2) {
      return number + " is not a prime number.";
    }
    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        return number + " is not a prime number.";
      }
    }
    return number + " is a prime number.";
  }
}
