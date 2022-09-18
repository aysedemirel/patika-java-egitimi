package org.ayse.java101.java8features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

@FunctionalInterface
interface Matematics {

  void operation(int a, int b);
}

public class FunctionalInterfaceExample {

  public static void main(String[] args) {
    Matematics sum = (a, b) -> System.out.println("Sum: " + (a + b));
    sum.operation(10, 6);
    Runnable r;

    Matematics minus = (int a, int b) -> System.out.println("Minus: " + (a - b));
    minus.operation(10, 6);

    Matematics multiply = (int a, int b) -> System.out.println("Multiply: " + (a * b));
    multiply.operation(10, 6);

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    System.out.println(Arrays.toString(numbers.toArray()));
    //sum of all numbers
    System.out.println(sumWithCondition(numbers, n -> true));
//sum of all even numbers
    System.out.println(sumWithCondition(numbers, i -> i % 2 == 0));
//sum of all numbers greater than 5
    System.out.println(sumWithCondition(numbers, i -> i > 5));

    System.out.println(findSquareOfMaxOdd(numbers));
  }


  private static boolean isPrime(int number) {
    //Traditional approach
    /*if (number < 2) {
      return false;
    }
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;*/

    //Declarative approach
    IntPredicate isDivisible = index -> number % index == 0;
    return number > 1
        && IntStream.range(2, number).noneMatch(
        isDivisible);
  }

  public static int sumWithCondition(List<Integer> numbers, Predicate<Integer> predicate) {
    return numbers.parallelStream()
        .filter(predicate)
        .mapToInt(i -> i)
        .sum();
  }

  public static int findSquareOfMaxOdd(List<Integer> numbers) {
    return numbers.stream()
        .filter(FunctionalInterfaceExample::isOdd)    //Predicate is functional interface and
        .filter(
            FunctionalInterfaceExample::isGreaterThan3)  // we are using lambdas to initialize it
        .filter(FunctionalInterfaceExample::isLessThan11)  // rather than anonymous inner classes
        .max(Comparator.naturalOrder())
        .map(i -> i * i)
        .get();
  }

  public static boolean isOdd(int i) {
    return i % 2 != 0;
  }

  public static boolean isGreaterThan3(int i) {
    return i > 3;
  }

  public static boolean isLessThan11(int i) {
    return i < 11;
  }
}
