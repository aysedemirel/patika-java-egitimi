package org.ayse.java101.sort;

import java.util.Scanner;

/**
 * Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
 */
public class NumberSorting {

  private static final String FIRST = "First";
  private static final String SECOND = "Second";
  private static final String THIRD = "Third";
  private final int number1;

  private final int number2;

  private final int number3;

  public NumberSorting() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter three numbers to sort...");
    System.out.print("First number: ");
    number1 = scanner.nextInt();
    System.out.print("Second number: ");
    number2 = scanner.nextInt();
    System.out.print("Third number: ");
    number3 = scanner.nextInt();
  }

  public static void main(String[] args) {
    NumberSorting numberSorting = new NumberSorting();
    numberSorting.sortAndPrint();
  }

  public void sortAndPrint() {
    int min = Math.min(number1, number2);
    int max = Math.max(number1, number2);
    int middle = number3;
    if (min > number3) {
      min = number3;
      middle = Math.min(number1, number2);
    }
    if (max < number3) {
      max = number3;
      middle = Math.max(number1, number2);
    }
    String minStr = (min == number1) ? FIRST : SECOND;
    minStr = (min == number3) ? THIRD : minStr;

    String maxStr = (max == number1) ? FIRST : SECOND;
    maxStr = (max == number3) ? THIRD : maxStr;

    String middleStr = (middle == number1) ? FIRST : SECOND;
    middleStr = (middle == number3) ? THIRD : middleStr;
    if (min == max) {
      System.out.println("These three numbers are equal");
    } else {
      System.out.println(min + " - " + middle + " - " + max);
      System.out.println(minStr + " - " + middleStr + " - " + maxStr);
    }
  }
}
