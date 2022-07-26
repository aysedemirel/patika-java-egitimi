package org.ayse.java101.loop;

import java.util.Scanner;

/**
 * Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların
 * ortalamasını hesaplayan programı yazınız.
 */
public class AverageCalculator {

  private final int number;

  public AverageCalculator() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Number: ");
    number = scanner.nextInt();
  }

  public static void main(String[] args) {
    AverageCalculator averageCalculator = new AverageCalculator();
    averageCalculator.calculate();
  }

  public void calculate() {
    double sum = 0;
    double totalNum = 0;
    for (int i = 1; i <= number; i++) {
      if (i % 3 == 0 && i % 4 == 0) {
        sum += i;
        totalNum++;
      }
    }
    double average = (totalNum != 0) ? (sum / totalNum) : 0;
    System.out.println("Average: " + average);
  }

}
