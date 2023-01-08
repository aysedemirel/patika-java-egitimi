package org.ayse.java101.condition.horoscope;

import java.util.Scanner;

/**
 * Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
 */
public class ChineseZodiac {

  private final int birthYear;

  public ChineseZodiac() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Birthyear: ");
    birthYear = scanner.nextInt();
  }

  public static void main(String[] args) {
    ChineseZodiac chineseZodiac = new ChineseZodiac();
    chineseZodiac.calculateZodiac();
  }

  public void calculateZodiac() {
    int type = birthYear % 12;
    ChineseZodiacTypes zodiac = ChineseZodiacTypes.getType(type);
    System.out.println("Zodiac: " + zodiac);
  }
}
