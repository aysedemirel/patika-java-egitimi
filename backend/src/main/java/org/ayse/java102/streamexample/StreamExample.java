package org.ayse.java102.streamexample;

import java.util.ArrayList;
import java.util.Comparator;

public class StreamExample {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(25);
    list.add(12);
    list.add(3);
    list.add(89);
    list.add(25);
    list.add(44);
    list.add(100);
    list.add(7);
    list.add(63);

    list.forEach(i -> System.out.print(i + ", "));
    System.out.println("\n------------");
    list.stream().filter(no -> no > 20).forEach(i -> System.out.print(i + "-"));
    System.out.println("\n---");
    System.out.println(list.stream().filter(no -> no > 20).distinct().count());
    System.out.println("------------");
    list.stream().filter(no -> no > 20).distinct().sorted(Comparator.reverseOrder())
        .forEach(i -> System.out.print(i + ", "));
    System.out.println("\n------------");
    list.stream().filter(no -> no % 2 == 0).limit(5).forEach(i -> System.out.print(i + ", "));
    System.out.println("\n------------");
    list.stream().filter(no -> no % 2 == 0).skip(1).forEach(i -> System.out.print(i + ", "));
    System.out.println("\n------------");
    System.out.println(list.stream().anyMatch(no -> no % 2 == 0));
    System.out.println(list.stream().allMatch(no -> no % 2 == 0));
    System.out.println(list.stream().noneMatch(no -> no % 2 == 0));
    System.out.println("------------");
    list.stream().map(no -> no * 2).forEach(i -> System.out.print(i + ", "));
  }

}
