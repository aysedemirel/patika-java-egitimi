package org.ayse.java101.loop;

import java.util.Scanner;

/**
 * Java ile girilen sayının harmonik serisini bulan program
 * <p>
 * 1+1/2+...1/n
 */
public class HarmonicNumber {

  private final int number;

  public HarmonicNumber() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Number: ");
    number = scanner.nextInt();
    double result = 0;
    for (int i = 1; i <= number; i++) {
      result += 1.0 / i;
    }
    System.out.println("Result: " + result);
  }

  public static void main(String[] args) {
    new HarmonicNumber();
  }
}
