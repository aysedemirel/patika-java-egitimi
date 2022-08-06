package org.ayse.java101.loop;

import java.util.Scanner;

/**
 * Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir.
 * Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar,
 * yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde
 * edilir.
 * <p>
 * Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam, bir önceki rakamla toplanır. Elde
 * edilen sonuç rakamın sağ tarafına yazılır. Fibonacci dizisinin ilk on sayısı şu şekildedir:
 * <p>
 * 9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21
 */
public class FibonacciNumber {

  private final int fibonacciNo;

  public FibonacciNumber() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Fibonacci number: ");
    fibonacciNo = scanner.nextInt();
  }

  public static void main(String[] args) {
    FibonacciNumber fibonacciNumber = new FibonacciNumber();
    fibonacciNumber.printFibonacci();
  }

  public void printFibonacci() {
    int sum = 0;
    int first = 0;
    int second = 1;
    for (int i = 0; i <= fibonacciNo; i++) {
      System.out.print(first + " ");
      sum = first + second;
      first = second;
      second = sum;
    }
  }
}
