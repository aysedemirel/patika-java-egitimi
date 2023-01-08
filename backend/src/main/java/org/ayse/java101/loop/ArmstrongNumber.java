package org.ayse.java101.loop;

import java.util.Scanner;

/**
 * N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle
 * sayılara Armstrong sayı denir.
 * <p>
 * Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407
 * sayısının armstrong bir sayı olduğunu gösterir.
 * <p>
 * 1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit olmadığı
 * için armstrong sayı olmaz.
 * <p>
 * 1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634
 * <p>
 * 54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748
 */
public class ArmstrongNumber {

  private final long number;

  public ArmstrongNumber() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Number: ");
    number = scanner.nextLong();
  }

  public static void main(String[] args) {
    ArmstrongNumber armstrongNumber = new ArmstrongNumber();
    armstrongNumber.calculateArmstrong();
    armstrongNumber.sumAllDigits();
  }

  public void calculateArmstrong() {
    long temp = number;
    long result = 0;
    long digitNumber = getDigitNumber();
    while (temp >= 1) {
      double digit = temp - (temp / 10 * 10);
      temp /= 10;
      result += Math.pow(digit, digitNumber);
    }
    if (result == number) {
      System.out.println("Armstrong number...");
    } else {
      System.out.println("Not armstrong number...");
    }
  }

  public void sumAllDigits() {
    long temp = number;
    long result = 0;
    long digitNumber = getDigitNumber();
    while (temp >= 1) {
      double digit = temp - (temp / 10 * 10);
      temp /= 10;
      result += digit;
    }
    System.out.println("Sum of all digits: " + result);
  }

  public long getDigitNumber() {
    long temp = number;
    long digitNum = 0;
    while (temp >= 1) {
      temp /= 10;
      digitNum++;
    }
    return digitNum;
  }
}
