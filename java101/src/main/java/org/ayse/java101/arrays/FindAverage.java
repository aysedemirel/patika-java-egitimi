package org.ayse.java101.arrays;

import java.util.Arrays;

public class FindAverage {

  public FindAverage() {
    // find average, find harmonic average
  }

  public static void main(String[] args) {
    int[] numbers = {2, 3, 5, 7, 60};
    System.out.println(Arrays.toString(numbers));
    FindAverage findAverage = new FindAverage();
    System.out.println("AVERAGE: " + findAverage.findAverage(numbers));
    System.out.println("HARMONIC AVERAGE: " + findAverage.findHarmonicAverage(numbers));
  }

  public double findAverage(int[] numbers) {
    double result = 0;
    if (numbers.length != 0) {
      double sum = 0;
      for (int number : numbers) {
        sum += number;
      }
      result = sum / numbers.length;
    }
    return result;
  }

  public double findHarmonicAverage(int[] numbers) {
    double result = 0;
    if (numbers.length != 0) {
      double sum = 0;
      for (int number : numbers) {
        sum += (1.0 / number);
      }
      result = (numbers.length / sum);
    }
    return result;
  }
}
