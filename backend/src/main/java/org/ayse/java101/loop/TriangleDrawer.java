package org.ayse.java101.loop;

import java.util.Scanner;

/**
 * draw a triangle
 */
public class TriangleDrawer {

  private final int row;

  public TriangleDrawer() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Row: ");
    row = scanner.nextInt();
  }

  public static void main(String[] args) {
    TriangleDrawer triangleDrawer = new TriangleDrawer();
    System.out.println("Triangle: ");
    triangleDrawer.drawTriangle();
    System.out.println("Diamond: ");
    triangleDrawer.drawDiamond();
  }

  public void drawTriangle() {
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < (row - i); j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= (2 * i + 1); j++) {
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }

  public void drawDiamond() {
    drawTriangle();
    for (int i = (row - 2); i >= 0; i--) {
      for (int j = (row - i); j >= 1; j--) {
        System.out.print(" ");
      }
      for (int j = 1; j <= (2 * i + 1); j++) {
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }
}
