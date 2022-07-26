package org.ayse.java101.condition.login;

import java.util.Scanner;

/**
 * Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı
 * sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması
 * gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre
 * giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
 */
public class Login {

  private static final String CORRECT_USERNAME = "Ayse";
  private static final String CORRECT_PASSWORD = "123";
  private final String userName;
  private final Scanner scanner;
  private String password;

  public Login() {
    scanner = new Scanner(System.in);
    System.out.print("Username:");
    userName = scanner.nextLine();
    System.out.print("Password:");
    password = scanner.nextLine();
  }

  public static void main(String[] args) {
    Login login = new Login();
    login.checkInfo();
  }

  public void checkInfo() {
    boolean isUsernameCorrect = userName.equals(CORRECT_USERNAME);
    boolean isPasswordCorrect = password.equals(CORRECT_PASSWORD);
    if (isUsernameCorrect && isPasswordCorrect) {
      System.out.println("Successful login...");
    } else {
      System.out.print("Fail login --> ");
      if (!isUsernameCorrect) {
        System.out.print(" - username");
      }
      if (!isPasswordCorrect) {
        System.out.print(" - password");
      }
      changePasswordControl();
    }
  }

  private void changePasswordControl() {
    System.out.println("\n ------------- ");
    System.out.println("Would you like to reset your password (y/n) ?");
    boolean isExit = false;
    while (!isExit) {
      char selection = scanner.nextLine().charAt(0);
      if (selection == 'y') {
        changePassword(password);
        System.out.println("Exit...");
        isExit = true;
      } else if (selection == 'n') {
        System.out.println("Exit...");
        isExit = true;
      }
    }
  }

  public void changePassword(String oldPassword) {
    System.out.print("New password: ");
    boolean isPasswordChanged = false;
    while (!isPasswordChanged) {
      password = scanner.nextLine();
      if (password.equals(oldPassword) || password.equals(CORRECT_PASSWORD)) {
        System.out.println(
            "The new password cannot be the same as the old password or the last entered password. Please enter a new one:");
      } else {
        System.out.println("New password changed");
        isPasswordChanged = true;
      }
    }
  }
}
