package org.ayse.java102.collectionmap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

  public static void main(String[] args) {
    // Comparator çift sayılara öncelik veriyor
    PriorityQueue<Integer> pq = new PriorityQueue<>(20,
        new Comparator<Integer>() {
          public int compare(Integer i, Integer j) {
            int result = i % 2 - j % 2;
            if (result == 0) {
              result = i - j;
            }
            return result;
          }
        });
    // ters sırada sayıları kuyruğa ekle
    for (int i = 0; i < 20; i++) {
      pq.offer(20 - i);
    }
    // öğeleri Comparator'un sırayla yazdır
    for (int i = 0; i < 20; i++) {
      System.out.print("\t" + pq.poll());
    }
  }
}
