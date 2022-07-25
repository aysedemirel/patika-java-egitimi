package org.ayse.java101.taximeter;

import java.util.Scanner;

/**
 * Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
 * <p>
 * Taksimetre KM başına 2.20 TL tutmaktadır. Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki
 * ücretlerde yine 20 TL alınacaktır. Taksimetre açılış ücreti 10 TL'dir.
 */
public class Taximeter {

  private static final double PER_KM = 2.20;
  private static final double START_PRICE = 10.0;
  private final double distance;

  public Taximeter() {
    System.out.print("Please enter the distance(km): ");
    Scanner scanner = new Scanner(System.in);
    distance = scanner.nextDouble();
  }

  public static void main(String[] args) {
    Taximeter taximeter = new Taximeter();
    taximeter.calculateFee();
  }

  public void calculateFee() {
    double result = START_PRICE + distance * PER_KM;
    result = (result < 20) ? 20 : result;
    System.out.println("Total fee: " + result);
  }
}
