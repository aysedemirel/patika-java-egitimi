package org.ayse.java101.arrays;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

public class FindMinMax {

  public FindMinMax() {
    // find min, find max
  }

  public static void main(String[] args) {
    FindMinMax findMinMax = new FindMinMax();
    int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
    System.out.println(Arrays.toString(list));
    System.out.println("Min: " + findMinMax.getMin(list));
    System.out.println("Max: " + findMinMax.getMax(list));
    System.out.println("VALUE: " + 5);
    System.out.println("Close min: " + findMinMax.getClosestMin(list, 5));
    System.out.println("Close max: " + findMinMax.getClosestMax(list, 5));
  }

  public int getClosestMin(int[] arr, int value) {
    int len = arr.length;
    int res = arr[0];
    for (int i = 1; i < len; i++) {
      if (Math.abs(value - res) >
          Math.abs(value - arr[i])) {
        res = arr[i];
      }
    }
    return res;
  }

  public int getClosestMax(int[] arr, int value) {
    int len = arr.length;
    int res = arr[0];
    for (int i = 1; i < len; i++) {
      if (value < arr[i] && Math.abs(value - res) >
          Math.abs(value - arr[i])) {
        res = arr[i];
      }
    }
    return res;
  }

  public int getMax(int @NotNull [] numbers) {
    int max = numbers[0];
    for (int num : numbers) {
      if (num > max) {
        max = num;
      }
    }
    return max;
  }

  public int getMin(int[] numbers) {
    int min = numbers[0];
    for (int num : numbers) {
      if (num < min) {
        min = num;
      }
    }
    return min;
  }

}
