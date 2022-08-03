package org.ayse.java101.loop;

import java.util.Scanner;

/**
 * Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu
 * sayıları ekrana yazan programı yazın.
 */
public class MinMaxNumber {

  private final int count;
  private final Scanner scanner = new Scanner(System.in);
  private int[] numbers;

  public MinMaxNumber() {
    System.out.print("Count: ");
    count = scanner.nextInt();
  }

  public static void main(String[] args) {
    MinMaxNumber minMaxNumber = new MinMaxNumber();
    minMaxNumber.getNumbers();
    minMaxNumber.findMaxMin();
  }

  public void getNumbers() {
    numbers = new int[count];
    for (int i = 0; i < count; i++) {
      System.out.print((i + 1) + ": ");
      numbers[i] = scanner.nextInt();
    }
  }

  public void findMaxMin() {
    if (count == 0) {
      return;
    }
    int max = numbers[0];
    int min = numbers[0];
    for (int i = 0; i < count; i++) {
      if (max < numbers[i]) {
        max = numbers[i];
      }
      if (min > numbers[i]) {
        min = numbers[i];
      }
    }
    System.out.println("Min: " + min + " Max: " + max);
  }
}
