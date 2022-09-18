package org.ayse.java101.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamExample {

  public static void main(String[] args) {
    Stream<Integer> stream = Stream.of(1, 2, 3, 4);
    //works fine
    Stream<Integer> stream2 = Stream.of(1, 2, 3, 4);
    //Compile time error, Type mismatch: cannot convert from Stream<int[]> to Stream<Integer>
    // Stream<Integer> stream1 = Stream.of(new int[]{1, 2, 3, 4});

    List<Integer> myList = new ArrayList<>();
    for (int i = 0; i < 100; i++) {
      myList.add(i);
    }

    //sequential stream
    Stream<Integer> sequentialStream = myList.stream();

    //parallel stream
    Stream<Integer> parallelStream = myList.parallelStream();

    Stream<String> stream3 = Stream.generate(() -> {
      return "abc";
    });
    Stream<String> stream4 = Stream.iterate("abc", (i) -> i);

    LongStream is = Arrays.stream(new long[]{1, 2, 3, 4});
    IntStream is2 = "abc".chars();

    //
    // Converting Java Stream to Collection or Array
    //
    Stream<Integer> intStream = Stream.of(1, 2, 3, 4);
    List<Integer> intList = intStream.collect(Collectors.toList());
    System.out.println(intList); //prints [1, 2, 3, 4]

    intStream = Stream.of(1, 2, 3, 4); //stream is closed, so we need to create it again
    Map<Integer, Integer> intMap = intStream.collect(Collectors.toMap(i -> i, i -> i + 10));
    System.out.println(intMap); //prints {1=11, 2=12, 3=13, 4=14}

    Integer[] intArray = intStream.toArray(Integer[]::new);
    System.out.println(Arrays.toString(intArray)); //prints [1, 2, 3, 4]

    //
    // Java Stream Intermediate Operations
    //
    Stream<Integer> highNums = sequentialStream.filter(
        p -> p > 90); //filter numbers greater than 90
    System.out.print("High Nums greater than 90=");
    highNums.forEach(p -> System.out.print(p + " "));
    //prints "High Nums greater than 90=91 92 93 94 95 96 97 98 99 "

    Stream<String> names = Stream.of("aBc", "d", "ef");
    System.out.println(names.map(s -> {
      return s.toUpperCase();
    }).collect(Collectors.toList()));
    //prints [ABC, D, EF]

    Stream<String> names2 = Stream.of("aBc", "d", "ef", "123456");
    List<String> reverseSorted = names2.sorted(Comparator.reverseOrder())
        .collect(Collectors.toList());
    System.out.println(reverseSorted); // [ef, d, aBc, 123456]

    Stream<String> names3 = Stream.of("aBc", "d", "ef", "123456");
    List<String> naturalSorted = names3.sorted().collect(Collectors.toList());
    System.out.println(naturalSorted); //[123456, aBc, d, ef]

    Stream<List<String>> namesOriginalList = Stream.of(
        Arrays.asList("Pankaj"),
        Arrays.asList("David", "Lisa"),
        Arrays.asList("Amit"));
//flat the stream from List<String> to String stream
    Stream<String> flatStream = namesOriginalList
        .flatMap(strList -> strList.stream());

    flatStream.forEach(System.out::println);

    //
    // Java Stream Terminal Operations
    //

    Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);

    Optional<Integer> intOptional = numbers.reduce((i, j) -> {
      return i * j;
    });
    if (intOptional.isPresent()) {
      System.out.println("Multiplication = " + intOptional.get()); //120
    }

    Stream<Integer> numbers1 = Stream.of(1, 2, 3, 4, 5);
    System.out.println("Number of elements in stream=" + numbers1.count()); //5

    Stream<Integer> numbers2 = Stream.of(1, 2, 3, 4, 5);
    numbers2.forEach(i -> System.out.print(i + ",")); //1,2,3,4,5,

    Stream<Integer> numbers3 = Stream.of(1, 2, 3, 4, 5);
    System.out.println("Stream contains 4? " + numbers3.anyMatch(i -> i == 4));
//Stream contains 4? true

    Stream<Integer> numbers4 = Stream.of(1, 2, 3, 4, 5);
    System.out.println(
        "Stream contains all elements less than 10? " + numbers4.allMatch(i -> i < 10));
//Stream contains all elements less than 10? true

    Stream<Integer> numbers5 = Stream.of(1, 2, 3, 4, 5);
    System.out.println("Stream doesn't contain 10? " + numbers5.noneMatch(i -> i == 10));
//Stream doesn't contain 10? true

    Stream<String> names4 = Stream.of("Pankaj", "Amit", "David", "Lisa");
    Optional<String> firstNameWithD = names4.filter(i -> i.startsWith("D")).findFirst();
    if (firstNameWithD.isPresent()) {
      System.out.println("First Name starting with D=" + firstNameWithD.get()); //David
    }


  }
}
