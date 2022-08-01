package org.ayse.java101.loop;

import java.util.Scanner;

enum AccountOperations {
  DEPOSIT(0),
  WITHDRAW(1),
  BALANCE_INQUIRY(2),
  EXIT(3);

  int id;

  AccountOperations(int id) {
    this.id = id;
  }

  public static AccountOperations getOperation(int id) {
    for (AccountOperations opr : values()
    ) {
      if (opr.id == id) {
        return opr;
      }
    }
    return EXIT;
  }
}

/**
 * Kullanici adi ve parola girilecek ve 3 yanlis yapma hakki var.
 * <p>
 * Diger durumda bloke olacak
 */
public class Atm {

  private static final int MAX_RIGHT = 3;
  private static final int FIRST_BALANCE = 1500;
  private static final String USERNAME = "user1";
  private static final String PASSWORD = "password123";
  private final Scanner scanner = new Scanner(System.in);
  private int right = MAX_RIGHT;
  private int balance = FIRST_BALANCE;
  private String sysUsername;
  private String sysPassword;
  private AccountOperations accountOperations;

  public Atm() {
    // ATM
  }

  public static void main(String[] args) {
    Atm atm = new Atm();
    atm.enterSystem();
  }

  public void enterSystem() {

    while (right > 0) {
      System.out.print("Username: ");
      sysUsername = scanner.nextLine();
      System.out.print("Password: ");
      sysPassword = scanner.nextLine();
      boolean isUsernameAccepted = sysUsername.equals(USERNAME);
      boolean isPasswordAccepted = sysPassword.equals(PASSWORD);
      right--;

      if (!isUsernameAccepted) {
        System.out.println("Wrong username!!!");
      } else if (!isPasswordAccepted) {
        System.out.println("Wrong password!!!");
      } else {
        System.out.println("Welcome!!!");
        selectAccountOperations();
        right = 0;
      }

      if (!isPasswordAccepted || !isUsernameAccepted) {
        if (right == 0) {
          System.out.println("Remaining right is zero. Your account is blocked...");
        } else {
          System.out.println("Please try again... Remaining right: " + right);
        }
      }
    }
  }

  private void selectAccountOperations() {
    do {
      System.out.println("---------------\n" +
          "0-Deposit\n" +
          "1-Withdraw\n" +
          "2-Balance inquiry\n" +
          "3-Exit\n" +
          "---------------");
      System.out.print("Please select account operation : ");
      accountOperations = AccountOperations.getOperation(scanner.nextInt());
      switch (accountOperations) {
        case DEPOSIT -> {
          System.out.print("How much? (TL) :");
          int price = scanner.nextInt();
          balance += price;
          break;
        }
        case WITHDRAW -> {
          System.out.print("How much? (TL) :");
          int price = scanner.nextInt();
          if (price > balance) {
            System.out.println("Insufficient balance.");
          } else {
            balance -= price;
          }
          break;
        }
        case BALANCE_INQUIRY -> {
          System.out.println("BALANCE : " + balance);
          break;
        }
        case EXIT -> {
          System.out.println("See you...");
          break;
        }
        default -> {
          break;
        }
      }
    } while (accountOperations != AccountOperations.EXIT);
  }
}
