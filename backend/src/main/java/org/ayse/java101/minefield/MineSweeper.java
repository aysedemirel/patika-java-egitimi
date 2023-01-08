package org.ayse.java101.minefield;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

  private final int row;
  private final int column;
  private final Scanner scanner;
  private int success = 0;
  private char[][] gameMatrix;
  private Map<Integer, Integer> mineIndex;

  public MineSweeper() {
    scanner = new Scanner(System.in);
    System.out.println("Welcome to the minefield game....");
    System.out.print("Row: ");
    row = scanner.nextInt();
    System.out.print("Column: ");
    column = scanner.nextInt();
    if (row * column > 0) {
      success = row * column;
      fullMatrix();
      startGame();
    } else {
      System.out.println("Exit....");
    }
  }

  public static void main(String[] args) {
    new MineSweeper();
  }

  private void startGame() {

    int rowIndex = -1;
    int columnIndex = -1;
    boolean isFinish = false;
    while (!isFinish) {
      boolean isBoundFalse = true;
      while (isBoundFalse) {
        System.out.print("Enter row index:");
        rowIndex = scanner.nextInt();
        System.out.print("Enter column index:");
        columnIndex = scanner.nextInt();
        isBoundFalse =
            (rowIndex >= row || rowIndex < 0) || (columnIndex >= column || columnIndex < 0);
        if (isBoundFalse) {
          System.out.println("Again....");
        }
      }
      if (gameMatrix[rowIndex][columnIndex] == '*') {
        isFinish = true;
        System.out.println("BOOOMMM!!!");
        break;
      }
      int gain = 0;
      if (columnIndex < (gameMatrix[0].length - 1)) {
        gain += gameMatrix[rowIndex][columnIndex + 1] == '*' ? 1 : 0;
      }
      if (columnIndex > 0) {
        gain += gameMatrix[rowIndex][columnIndex - 1] == '*' ? 1 : 0;
      }
      if (rowIndex > 0) {
        gain += gameMatrix[rowIndex - 1][columnIndex] == '*' ? 1 : 0;
      }
      if (rowIndex < (gameMatrix.length - 1)) {
        gain += gameMatrix[rowIndex + 1][columnIndex] == '*' ? 1 : 0;
      }
      gameMatrix[rowIndex][columnIndex] = Character.forDigit(gain, 10);
      success--;
      if (success == 0) {
        isFinish = true;
        System.out.println("CONGRATULATIONS!!!!");
      }
      printMatrix();
    }
  }

  private void fullMatrix() {
    gameMatrix = new char[row][column];
    int len = row * column;
    int randomCount = len / 4;
    mineIndex = new HashMap<>();
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        gameMatrix[i][j] = '-';
      }
    }

    while (randomCount != 0) {
      Random random = new Random();
      int randomRow = random.nextInt(0, row);
      int randomColumn = random.nextInt(0, column);
      mineIndex.put(randomRow, randomColumn);
      gameMatrix[randomRow][randomColumn] = '*';
      randomCount--;
      success--;
    }
  }

  private void printMatrix() {
    System.out.println("===========================");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        System.out.print(gameMatrix[i][j]);
      }
      System.out.print("\n");
    }
  }
}
