package org.ayse.java101.horoscope;

import java.util.Scanner;

public class HoroscopeFinder {

  private final int month;
  private final int day;

  public HoroscopeFinder() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Day: ");
    day = scanner.nextInt();
    System.out.print("Month: ");
    month = scanner.nextInt();
  }

  public static void main(String[] args) {
    HoroscopeFinder horoscopeFinder = new HoroscopeFinder();
    horoscopeFinder.findHoroscope();
  }

  /**
   * Kova Burcu : 22 Ocak - 19 Şubat
   * <p>
   * Balık Burcu : 20 Şubat - 20 Mart
   * <p>
   * Koç Burcu : 21 Mart - 20 Nisan
   * <p>
   * Boğa Burcu : 21 Nisan - 21 Mayıs
   * <p>
   * İkizler Burcu : 22 Mayıs - 22 Haziran
   * <p>
   * Yengeç Burcu : 23 Haziran - 22 Temmuz
   * <p>
   * Aslan Burcu : 23 Temmuz - 22 Ağustos
   * <p>
   * Başak Burcu : 23 Ağustos - 22 Eylül
   * <p>
   * Terazi Burcu : 23 Eylül - 22 Ekim
   * <p>
   * Akrep Burcu : 23 Ekim - 21 Kasım
   * <p>
   * Yay Burcu : 22 Kasım - 21 Aralık
   * <p>
   * Oğlak Burcu : 22 Aralık - 21 Ocak
   */
  public void findHoroscope() {
    if (
        ((month == 12) && (day >= 22 && day <= 31)) ||
            ((month == 1) && (day >= 1 && day <= 21))
    ) {
      System.out.println("Capricorn");
    } else if (
        ((month == 1) && (day >= 22 && day <= 31)) ||
            ((month == 2) && (day >= 1 && day <= 19))
    ) {
      System.out.println("Aquarius");
    } else if (
        ((month == 2) && (day >= 20 && day <= 28)) ||
            ((month == 3) && (day >= 1 && day <= 20))
    ) {
      System.out.println("Pisces");
    } else if (
        ((month == 3) && (day >= 21 && day <= 31)) ||
            ((month == 4) && (day >= 1 && day <= 20))
    ) {
      System.out.println("Aries");
    } else if (
        ((month == 4) && (day >= 21 && day <= 30)) ||
            ((month == 5) && (day >= 1 && day <= 21))
    ) {
      System.out.println("Taurus");
    } else if (
        ((month == 5) && (day >= 22 && day <= 31)) ||
            ((month == 6) && (day >= 1 && day <= 22))
    ) {
      System.out.println("Gemini");
    } else if (
        ((month == 6) && (day >= 23 && day <= 30)) ||
            ((month == 7) && (day >= 1 && day <= 22))
    ) {
      System.out.println("Cancer");
    } else if (
        ((month == 7) && (day >= 23 && day <= 31)) ||
            ((month == 8) && (day >= 1 && day <= 22))
    ) {
      System.out.println("Leo");
    } else if (
        ((month == 8) && (day >= 23 && day <= 31)) ||
            ((month == 9) && (day >= 1 && day <= 22))
    ) {
      System.out.println("Virgo");
    } else if (
        ((month == 9) && (day >= 23 && day <= 30)) ||
            ((month == 10) && (day >= 1 && day <= 22))
    ) {
      System.out.println("Libra");
    } else if (
        ((month == 10) && (day >= 23 && day <= 31)) ||
            ((month == 11) && (day >= 1 && day <= 21))
    ) {
      System.out.println("Scorpio");
    } else if (
        ((month == 11) && (day >= 22 && day <= 30)) ||
            ((month == 12) && (day >= 1 && day <= 21))
    ) {
      System.out.println("Sagittarius");
    }
  }

}
