package org.ayse.java101.condition.leapyear;

import java.util.Scanner;

/**
 * Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:
 * <p>
 * 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi. 100'ün katı olan yıllardan
 * sadece 400'e kalansız olarak bölünebilenler artık yıldır:
 * <p>
 * Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir. Sadece
 * 400'e tam olarak bölünebilenlerin artık yıl kabul edilmesinin nedeni, bir astronomik yılın 365,25
 * gün değil, yaklaşık olarak 365,242 gün olmasından kaynaklanan hatayı gidermektir.
 * <p>
 * 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 --> artık yıllar
 * <p>
 * 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.
 */
public class LeapYear {

  private final int year;

  public LeapYear() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Year: ");
    year = scanner.nextInt();
  }

  public static void main(String[] args) {
    LeapYear leapYear = new LeapYear();
    leapYear.calculateLeapYear();
  }

  public void calculateLeapYear() {
    boolean isLeapYear = false;
    int hundredfold = year % 400;
    int quadruple = year % 4;
    isLeapYear = (quadruple == 0 && year % 100 != 0) || (hundredfold == 0);
    System.out.print(year + " is ");
    String result = isLeapYear ? "a leap year" : "not a leap year";
    System.out.println(result);
  }
}
