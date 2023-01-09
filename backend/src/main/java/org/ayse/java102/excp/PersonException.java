package org.ayse.java102.excp;

public class PersonException extends Exception {

  int age;

  public PersonException(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Wrong age: " + age;
  }
}
