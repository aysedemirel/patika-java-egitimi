package org.ayse.java101.loop;

/**
 * Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
 */
public class PrimeNumber {

  public PrimeNumber() {
    // sonuc: 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
  }

  public static void main(String[] args) {
    PrimeNumber primeNumber = new PrimeNumber();
    primeNumber.printPrimeNumbers();
  }

  public void printPrimeNumbers() {
    for (int i = 2; i < 100; i++) {
      int result = 0;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          result++;
          break;
        }
      }
      if (result == 0) {
        System.out.print(i + " ");
      }
    }

  }
}
