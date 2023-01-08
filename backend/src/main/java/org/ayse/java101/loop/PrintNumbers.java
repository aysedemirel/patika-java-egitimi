package org.ayse.java101.loop;

import java.util.Scanner;

/**
 * Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı
 * yazıyoruz.
 */
public class PrintNumbers {

  public PrintNumbers() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Number: ");
    int number = scanner.nextInt();
    for (int i = 1; i <= number; i++) {
      if (i % 4 == 0 || i % 5 == 0) {
        System.out.print(i + " - ");
      }
    }
  }

  public static void main(String[] args) {
    new PrintNumbers();
  }
}
