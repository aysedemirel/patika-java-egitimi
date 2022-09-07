package org.ayse.java101.others;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Java dilinde programın 0-100 arasında rastgele seçtiği bir sayıyı kullanıcının tahmin etmesini
 * istediğimiz bir "Sayı Tahmin Oyunu" yapıyoruz.
 */
public class NumberGuess {

  private final int randomNumber;
  private int right = 5;

  public NumberGuess() {
    randomNumber = new Random().nextInt(100);
    guess();
    // patikaGuess();
  }

  public static void main(String[] args) {
    new NumberGuess();
  }

  private void guess() {
    int number;
    Scanner scanner = new Scanner(System.in);
    while (right > 0) {
      System.out.print("Guess (between 0-100) : ");
      number = scanner.nextInt();
      if (number <= 0 || number >= 101) {
        right--;
        System.out.println("Please enter a valid number. Right: " + right);
      } else if (number != randomNumber) {
        right--;
        System.out.println("Wrong!!! Right: " + right);
        String hint = (number > randomNumber) ? "your number is greater than lucky number"
            : "your number is lower than lucky number";
        System.out.println(hint);
      } else if (number == randomNumber) {
        System.out.println("WIN!!! Lucky number: " + number);
        break;
      }
      if (right == 0) {
        System.out.println("You don't have enough right to play..... number was: " + number);
      }
    }
  }

  public void patikaGuess() {
    Scanner input = new Scanner(System.in);
    int right = 0;
    int selected;
    int[] wrong = new int[5];
    boolean isWin = false;
    boolean isWrong = false;

    System.out.println(randomNumber);
    while (right < 5) {
      System.out.print("Lütfen tahmininizi giriniz : ");
      selected = input.nextInt();

      if (selected < 0 || selected > 99) {
        System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
        if (isWrong) {
          right++;
          System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - right));
        } else {
          isWrong = true;
          System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
        }
        continue;
      }

      if (selected == randomNumber) {
        System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğini sayı : " + randomNumber);
        isWin = true;
        break;
      } else {
        System.out.println("Hatalı bir sayı girdiniz !");
        if (selected > randomNumber) {
          System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
        } else {
          System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
        }

        wrong[right++] = selected;
        System.out.println("Kalan hakkı : " + (5 - right));
      }
    }

    if (!isWin) {
      System.out.println("Kaybettiniz ! ");
      if (!isWrong) {
        System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
      }
    }

  }
}
