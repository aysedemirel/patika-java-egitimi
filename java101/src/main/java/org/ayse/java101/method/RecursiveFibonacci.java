package org.ayse.java101.method;

import java.util.Scanner;

/**
 * Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir. *
 * Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar, *
 * yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde
 * * edilir.
 * <p>
 * Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam, bir önceki rakamla toplanır. Elde *
 * edilen sonuç rakamın sağ tarafına yazılır. Fibonacci dizisinin ilk on sayısı şu şekildedir:
 * <p>
 * 9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21
 * <p>
 * Bu örnek recursive metotlar ile fibonacci sayısını bulan programdır
 */
public class RecursiveFibonacci {

  private final int fibonacciIndex;

  public RecursiveFibonacci() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Fibonacci index: ");
    fibonacciIndex = scanner.nextInt();
    System.out.print(
        "The " + fibonacciIndex + "th fibonacci number is:" + printFibonacci(fibonacciIndex));
  }

  public static void main(String[] args) {
    new RecursiveFibonacci();
  }

  public int printFibonacci(int fibonacciIndex) {
    if (fibonacciIndex == 1 || fibonacciIndex == 2) {
      return 1;
    }
    return printFibonacci(fibonacciIndex - 1) + printFibonacci(fibonacciIndex - 2);
  }
}
