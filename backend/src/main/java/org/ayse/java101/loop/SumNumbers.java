package org.ayse.java101.loop;

import java.util.Scanner;

/**
 * Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen
 * değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
 */
public class SumNumbers {

  public SumNumbers() {
    boolean isNotOdd = true;
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    while (isNotOdd) {
      int num = scanner.nextInt();
      isNotOdd = (num % 2 == 0);
      if (num % 4 == 0) {
        sum += num;
      }
    }
    System.out.println("Sum: " + sum);
  }

  public static void main(String[] args) {
    new SumNumbers();
  }
}
