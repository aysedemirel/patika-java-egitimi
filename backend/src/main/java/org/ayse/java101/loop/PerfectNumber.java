package org.ayse.java101.loop;

import java.util.Scanner;

/**
 * Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı
 * kendisine eşit olan sayıya mükemmel sayı denir.
 * <p>
 * Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise
 * ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı
 * Java dilinde yazınız.
 */
public class PerfectNumber {

  private final int number;

  public PerfectNumber() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter a number:");
    number = scanner.nextInt();
  }

  public static void main(String[] args) {
    PerfectNumber perfectNumber = new PerfectNumber();
    perfectNumber.printResult();
  }

  public void printResult() {
    if (isPerfectNumber()) {
      System.out.println(number + " is perfect number");
    } else {
      System.out.println(number + " is not perfect number");
    }
  }

  private boolean isPerfectNumber() {
    int sum = 0;
    for (int i = 1; i < number; i++) {
      if (number % i == 0) {
        sum += i;
      }
    }
    return sum == number;
  }
}
