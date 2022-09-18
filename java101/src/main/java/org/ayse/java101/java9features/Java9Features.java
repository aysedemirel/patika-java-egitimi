package org.ayse.java101.java9features;

import java.util.List;

interface Card {

  private static void displayCardDetails() {
    // Method implementation goes here.
    System.out.println("displayCardDetails");
  }

  private Long createCardID() {
    // Method implementation goes here.
    System.out.println("createCardID");
    return 0L;
  }
}

public class Java9Features {

  public static void main(String[] args) {
    List immutableList = List.of();
    List immutableListWithValue = List.of("one", "two", "three");
  }

}
