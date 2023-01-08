package org.ayse.java101.arrays;

import java.util.Arrays;

/**
 * Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer
 * değiştirmesi demektir. Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin transpozudur
 * (devriğidir). Bu aşamada kxn’lik bir matrisin transpozu (devriği) nxk’lik bir matris olur.
 * Örneğin bir A matrisimiz olsun. Bu A matrisinin transpozu (devriği), A^T (A üzeri T) ile
 * gösterilir.
 * <p>
 * Örneğin aşağıdaki 2x3’lik A matrisinin transpozu (devriği), 2x3’lük bir A^T matrisidir.
 */
public class MatrisTranspoze {

  public MatrisTranspoze() {
    // Matris :
    //2    3    4
    //5    6    4
    //Transpoze :
    //2    5
    //3    6
    //4    4
  }

  public static void main(String[] args) {
    MatrisTranspoze matrisTranspoze = new MatrisTranspoze();
    int[][] numbers = {
        {2, 3, 4},
        {5, 6, 4}
    };
    System.out.println("MATRIS: ");
    matrisTranspoze.printMatris(numbers);
    System.out.println("TRANSPOZE: ");
    matrisTranspoze.printMatris(matrisTranspoze.getTranspoze(numbers));

    System.out.println("================");

    int[][] arr = {
        {1, 2, 3},
        {4, 5, 6}
    };
    System.out.println("MATRIS: ");
    matrisTranspoze.printMatris(arr);
    System.out.println("TRANSPOZE: ");
    matrisTranspoze.printMatris(matrisTranspoze.getTranspoze(arr));
  }

  public void printMatris(int[][] numbers) {
    for (int[] row : numbers) {
      System.out.println(Arrays.toString(row));
    }
  }

  public int[][] getTranspoze(int[][] numbers) {
    int[][] transpoze = new int[numbers[0].length][numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      int[] row = numbers[i];
      for (int j = 0; j < row.length; j++) {
        transpoze[j][i] = row[j];
      }
    }
    return transpoze;
  }
}
