package org.ayse.java101.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız. Dizinin boyutunu ve
 * dizinin elemanlarını kullanıcıdan alınız.
 */
public class SortArray {

  private final int[] numbers;

  public SortArray() {
    // sort array: min->max
    Scanner scanner = new Scanner(System.in);
    System.out.print("Dimension: ");
    int dimension = scanner.nextInt();
    numbers = new int[dimension];
    for (int i = 0; i < dimension; i++) {
      System.out.print(i + ". ->");
      numbers[i] = scanner.nextInt();
    }
    sortArray();
  }

  public static void main(String[] args) {
    new SortArray();
  }

  private void sortArray() {
    Arrays.sort(numbers);
    System.out.println(Arrays.toString(numbers));
  }
}
