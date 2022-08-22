package org.ayse.java101.method;

import java.util.Scanner;

/**
 * Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir
 * "Recursive" metot yazın.
 * <p>
 * Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her
 * çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5
 * ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
 * <p>
 * N Sayısı : 10
 * <p>
 * Çıktısı : 10 5 0 5 10
 */
public class MethodByPattern {

  private int number;

  public MethodByPattern() {
    Scanner scanner = new Scanner(System.in);
    boolean isExit = false;

    while (!isExit) {
      System.out.print("Please enter a positive number: ");
      number = scanner.nextInt();
      if (number <= 0) {
        System.out.println(number);
      } else {
        System.out.print(number + " ");
        getPatternn(number - 5, false);
      }
      System.out.println("\nIf you want to exit, please enter 0 (or enter another number) : ");
      isExit = (scanner.nextInt() == 0);
    }
  }

  public static void main(String[] args) {
    new MethodByPattern();
  }

  private void getPatternn(int no, boolean isReverse) {
    System.out.print(no + " ");
    if (no != number) {
      if (!isReverse) {
        isReverse = (no <= number && no <= 0);
      }
      int pattern = isReverse ? 5 : -5;
      getPatternn(no + pattern, isReverse);
    }
  }
}
