package org.ayse.java101.arrays;

import java.util.Arrays;
import java.util.Objects;

/**
 * Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan program
 */
public class FrequencyElements {

  public FrequencyElements() {
    // print frequency
  }

  public static void main(String[] args) {
    FrequencyElements frequencyElements = new FrequencyElements();
    Integer[] numbers = {10, 20, 20, 10, 10, 20, 5, 20};
    frequencyElements.printFrequency(numbers);
  }

  public void printFrequency(Integer[] numbers) {
    boolean[] visited = new boolean[numbers.length];
    Arrays.fill(visited, false);
    for (int i = 0; i < numbers.length; i++) {
      if (visited[i]) {
        continue;
      }
      int count = 1;
      for (int j = i + 1; j < numbers.length; j++) {
        if (Objects.equals(numbers[i], numbers[j])) {
          visited[j] = true;
          count++;
        }
      }
      System.out.println(numbers[i] + " -> " + count);
    }
  }
}
