package org.ayse.java101.loop;

import java.util.Scanner;

/**
 * Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı
 * <p>
 * "For Döngüsü" kullanarak yapınız.
 * <p>
 * x^y
 */
public class ExponentialNumber {

  private final long x;
  private final long y;

  public ExponentialNumber() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("X: ");
    x = scanner.nextLong();
    System.out.print("Y: ");
    y = scanner.nextLong();
    long result = 1;
    for (long i = 0; i < y; i++) {
      result *= x;
    }
    System.out.println("Result: " + result);
  }

  public static void main(String[] args) {
    new ExponentialNumber();
  }
}
