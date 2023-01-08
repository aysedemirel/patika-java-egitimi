package org.ayse.java101.loop;

import java.util.Scanner;

/**
 * N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li
 * kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
 * <p>
 * Java ile kombinasyon hesaplayan program yazınız.
 * <p>
 * Kombinasyon formülü C(n,r) = n! / (r! * (n-r)!)
 */
public class Factorial {

  private int n;
  private int r;

  public Factorial() {
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.print("n: ");
      n = scanner.nextInt();
      System.out.print("r: ");
      r = scanner.nextInt();
      System.out.println("Control...");
    } while (n < r);
  }

  public static void main(String[] args) {
    Factorial factorial = new Factorial();
    factorial.calculateFactorial();
  }

  // n! / (r! * (n-r)!)
  public void calculateFactorial() {
    int combination = getFactorial(n) / (getFactorial(r) * getFactorial(n - r));
    System.out.println("Combination: " + combination);
  }

  // n!
  public int getFactorial(int value) {
    int result = 1;
    for (int i = 1; i <= value; i++) {
      result *= i;
    }
    return result;
  }

}
