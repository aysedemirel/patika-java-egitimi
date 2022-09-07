package org.ayse.java101.others;

/**
 * Java dilinde kullanıcının girdiği kelimenin "Palindromik" olup olmadığı bulan bir program
 * yazıyoruz.
 * <p>
 * Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa o kelime "Palindromik
 * Kelime'dir".
 * <p>
 * Örnek : abba , asa , kavak, kayak
 */
public class PalindromicWord {

  public PalindromicWord() {
    System.out.println(isPalindrome("abba"));
  }

  public static void main(String[] args) {
    new PalindromicWord();
  }

  public boolean isPalindrome(String str) {
    int i = 0, j = str.length() - 1;
    while (i < j) {
      if (str.charAt(i) != str.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }

  public boolean isPalindrome2(String str) {
    String reverse = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      reverse += str.charAt(i);
    }

    return str.equals(reverse);
  }
}
