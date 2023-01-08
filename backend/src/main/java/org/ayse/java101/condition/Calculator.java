package org.ayse.java101.condition;

import java.util.Scanner;

enum Operations {
  ADDITION('+'),
  SUBSTRACTION('-'),
  MULTIPLY('*'),
  DIVIDE('/'),
  UNKNOWN(' ');
  private final char operation;

  Operations(char operation) {
    this.operation = operation;
  }

  public static Operations getOperationEnum(char value) {
    for (Operations ch : values()) {
      if (ch.getOperation() == value) {
        return ch;
      }
    }
    return Operations.UNKNOWN;
  }

  public char getOperation() {
    return operation;
  }
}

/**
 * Basic calculator for (+)(-)(/)(*) and integer numbers
 */
public class Calculator {

  private final int firstNumber;
  private final int secondNumber;
  private final Operations operation;

  public Calculator() {
    System.out.println("Please enter two number to calculate...");
    Scanner scanner = new Scanner(System.in);
    System.out.print("First number:");
    firstNumber = scanner.nextInt();
    System.out.print("Operation (+)(-)(/)(*) :");
    operation = Operations.getOperationEnum(scanner.next().charAt(0));
    System.out.print("Second number:");
    secondNumber = scanner.nextInt();
  }

  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    calculator.calculateResult();
  }

  public void calculateResult() {
    System.out.print("Result:");
    switch (operation) {
      case ADDITION -> {
        System.out.println(firstNumber + secondNumber);
        break;
      }
      case SUBSTRACTION -> {
        System.out.println(firstNumber - secondNumber);
        break;
      }
      case MULTIPLY -> {
        System.out.println(firstNumber * secondNumber);
        break;
      }
      case DIVIDE -> {
        if (secondNumber == 0) {
          System.out.println("The second number cannot be equal to zero");
        } else {
          System.out.println(firstNumber / secondNumber);
        }
        break;
      }
      case UNKNOWN -> {
        System.out.println("The operation type you entered did not match with (+)(-)(/)(*)");
        break;
      }
      default -> {
        break;
      }
    }
  }
}
