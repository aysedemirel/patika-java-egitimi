package org.ayse.java101.arrays;

public class DrawLetter {

  public DrawLetter() {
    // drawA, drawB
  }

  public static void main(String[] args) {
    DrawLetter drawLetter = new DrawLetter();
    drawLetter.drawA();
    System.out.println("==================");
    drawLetter.drawB();
  }


  public void drawB() {
    String[][] letter = new String[7][4];

    for (int i = 0; i < letter.length; i++) {
      for (int j = 0; j < letter[i].length; j++) {
        if (i == 0 || i == 3 || i == 6) {
          letter[i][j] = " * ";
        } else if (j == 0 || j == 3) {
          letter[i][j] = " * ";
        } else {
          letter[i][j] = "   ";
        }
      }
    }
    draw(letter);
  }

  public void drawA() {
    String[][] letter = new String[6][4];

    for (int i = 0; i < letter.length; i++) {
      for (int j = 0; j < letter[i].length; j++) {
        if (i == 0 || i == 2) {
          letter[i][j] = " * ";
        } else if (j == 0 || j == 3) {
          letter[i][j] = " * ";
        } else {
          letter[i][j] = "   ";
        }
      }
    }
    draw(letter);
  }

  private void draw(String[][] letter) {
    for (String[] row : letter) {
      for (String col : row) {
        System.out.print(col);
      }
      System.out.println();
    }
  }
}
