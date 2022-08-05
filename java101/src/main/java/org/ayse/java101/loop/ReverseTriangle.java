package org.ayse.java101.loop;

import java.util.Scanner;

/**
 * Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana
 * ters üçgen çizen programı yazın.
 * <p>
 * ********* * ********* 9 18+1
 * <p>
 * ******** * ******** 8 16+1
 * <p>
 * ******* * *******  7 14+1
 * <p>
 * ****** * ******   6 12+1
 * <p>
 * ***** * *****    5 10+1
 * <p>
 * **** * ****     4 8+1
 * <p>
 * *** * ***      3 6+1
 * <p>
 * ** * **       2 4+1
 * <p>
 * * * *        1 2+1
 * <p>
 * *          0 0+1
 */
public class ReverseTriangle {

  private final int digitNumber;

  public ReverseTriangle() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Number of digits: ");
    digitNumber = scanner.nextInt();
  }

  public static void main(String[] args) {
    ReverseTriangle reverseTriangle = new ReverseTriangle();
    reverseTriangle.drawTriangle();
  }

  public void drawTriangle() {
    for (int i = 0; i < digitNumber; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < digitNumber - i - 1; k++) {
        System.out.print("**");
      }
      System.out.print("*");
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      System.out.print("\n");
    }
  }

}
