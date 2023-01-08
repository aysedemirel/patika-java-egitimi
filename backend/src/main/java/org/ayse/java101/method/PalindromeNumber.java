package org.ayse.java101.method;

import java.util.Scanner;

/**
 * Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
 * <p>
 * Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
 */
public class PalindromeNumber {

  private final int number;

  public PalindromeNumber() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Number: ");
    number = scanner.nextInt();
    System.out.println("is palindrome number ? -> " + isPalindromeNumber());
  }

  public static void main(String[] args) {
    new PalindromeNumber();
  }

  private boolean isPalindromeNumber() {
    int temp = number;
    int newNumber = 0;
    while (temp != 0) {
      int digit = temp % 10;
      newNumber = (newNumber * 10) + digit;
      temp /= 10;
    }
    return newNumber == number;
  }
}
